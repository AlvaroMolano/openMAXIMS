//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.71 build 3618.29606)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.catsreportcomponent;

import java.util.ArrayList;
import java.util.List;

import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.CatsReportNoteVo;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.FormMode;
import ims.framework.utils.DateTime;
import ims.scheduling.vo.SessionVo;
import ims.scheduling.vo.TheatreProcedureLiteVo;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormModeChanged()
	{
		if (form.getMode().equals(FormMode.VIEW))
		{			
			form.getGlobalContext().RefMan.setIsComponentInEditMode(FormMode.VIEW);
		}
		else if (form.getMode().equals(FormMode.EDIT))
		{
			form.ccAuthoring().initializeComponent();
			form.getGlobalContext().RefMan.setIsComponentInEditMode(FormMode.EDIT);
		}
		updateControlState();
		form.fireCustomControlValueChanged();
	}
	private void updateControlState() 
	{
		boolean isViewMode = form.getMode().equals(FormMode.VIEW);
		boolean isReadOnlyMode = form.getLocalContext().getDisplayReadOnlyIsNotNull() ? form.getLocalContext().getDisplayReadOnly() : false;
		if (isViewMode) 
		{
			form.btnEdit().setVisible(isViewMode && !isReadOnlyMode);
		}		
	}
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(save())
			open();
	}
	
	private String[] getUIValidation()
	{
		List<String> errors = new ArrayList<String>();
				
		if (form.ccAuthoring().getValue() == null ||
				(form.ccAuthoring().getValue() != null &&
						(!form.ccAuthoring().getValue().getAuthoringHcpIsNotNull() ||
								!form.ccAuthoring().getValue().getAuthoringDateTimeIsNotNull())))
		{
			errors.add("AuthoringInformation is mandatory!");
		}		
		
		return errors.size()>0 ? errors.toArray(new String[0]) : null;
	}
	
	private boolean save() 
	{
		CatsReportNoteVo note = form.getLocalContext().getSelectedCatsReportNote();
		
		if(note == null)
			note = new CatsReportNoteVo();
		
		
		
		note = populateDataFromScreen(note);
					
		String [] errors = note.validate(getUIValidation());
		if (errors != null)
		{
			engine.showErrors(errors);
			return false;
		}

		try 
		{
			form.getLocalContext().setSelectedCatsReportNote(domain.saveCatsReportNote(note));
		} 		 
		catch (StaleObjectException e) 
		{
			engine.showMessage(e.getMessage());
			return false;
		}
		
		return true;
	}
	private CatsReportNoteVo populateDataFromScreen(CatsReportNoteVo note) 
	{
		if(note == null)
			note = new CatsReportNoteVo();
		
		note.setID_CatsReportNote(null);
		note.setCatsReferral(form.getGlobalContext().RefMan.getCatsReferral());
		note.setAuthoringInformation(form.ccAuthoring().getValue());
		
		AuthoringInformationVo authoring = new AuthoringInformationVo();
		authoring.setAuthoringDateTime(new DateTime());
		HcpLiteVo hcpVo = new HcpLiteVo();
		hcpVo.setID_Hcp(engine.getLoggedInUser().getHcpId());
		hcpVo.setMos(domain.getMosUser() != null ? (MemberOfStaffLiteVo) domain.getMosUser() : null);
		authoring.setAuthoringHcp(hcpVo);
		note.setRecordingInformation(authoring);
		
		note.setFinalNote(form.richTextCatsReport().getValue());
		
		return note;
	}
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.VIEW);
		open(); 
	}
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);					
	}
	/**
	* initialize
	*/
	public void initialize(Boolean displayReadOnly, CatsReportNoteVo value)
	{
		form.getLocalContext().setDisplayReadOnly(displayReadOnly);
		
		if (value != null && value.getCatsReferralIsNotNull()) 
		{
			populateScreenFromData(value);	
			form.ccAuthoring().setValue(value.getAuthoringInformation());
			form.setMode(FormMode.VIEW);
			return;
		}
		
		initializeScreen();
	}
	private void initializeScreen() 
	{
		form.ccAuthoring().initializeComponent();
		form.setMode(FormMode.VIEW);
		
		open();		
	}
	
	private void open() 
	{	
		CatsReferralRefVo currentCatsReferral = form.getGlobalContext().RefMan.getCatsReferral();
		CatsReportNoteVo note = domain.getCatsReportNote(currentCatsReferral);
		form.getLocalContext().setSelectedCatsReportNote(note);
		form.richTextCatsReport().setValue(null);
		populateScreenFromData(note);		
		form.setMode(FormMode.VIEW);
	}
	
	private void populateScreenFromData(CatsReportNoteVo value) 
	{
		if(value == null)
			return;
		
		form.ccAuthoring().setValue(value.getAuthoringInformation());
		form.richTextCatsReport().setValue(value.getFinalNote());
	}
}
