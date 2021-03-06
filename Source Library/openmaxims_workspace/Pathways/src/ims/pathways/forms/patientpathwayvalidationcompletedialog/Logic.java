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
// This code was generated by Richard Reynolds using IMS Development Environment (version 1.80 build 5527.24259)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.

package ims.pathways.forms.patientpathwayvalidationcompletedialog;

import java.util.ArrayList;

import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.MemberOfStaffVo;
import ims.core.vo.RecordingUserInformationVo;
import ims.core.vo.enums.MosType;
import ims.framework.enumerations.DialogResult;
import ims.framework.utils.DateTime;
import ims.vo.interfaces.IMos;
import ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo;
import ims.pathways.vo.PatientPathwaysAwaitingValidationWorklistVo;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
	}
	
	private void updateControlsState()
	{

	}

	private void populateScreenFromData()
	{
		// TODO Auto-generated method stub
		
	}

	private void initialize()
	{
		form.ccMOS().initialize(MosType.ALL);
		form.ccMOS().isRequired(Boolean.TRUE);
		
		form.ccMOS().setValue((IMos) domain.getMosUser());
		form.dtimAuthoring().setValue(new DateTime());
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	@Override
	protected void onBtnOkClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (!validateUIRules())
		{
			return;
		}

		if (form.getGlobalContext().Pathways.getPatientPathwaysAwaitingValidationWorklistVo() != null)
		{
			form.getGlobalContext().Pathways.getPatientPathwaysAwaitingValidationWorklistVo().setValidationCompletedBy(domain.getMemberOfStaffVoFromImos((IMos) form.ccMOS().getValue()));
			form.getGlobalContext().Pathways.getPatientPathwaysAwaitingValidationWorklistVo().setValidationCompletedDT(form.dtimAuthoring().getValue());
		}
		
		engine.close(DialogResult.OK);
	}

	private boolean validateUIRules()
	{
		ArrayList<String> listOfErrors = new ArrayList<String>();

		if (form.ccMOS().getValue() == null)
		{
			listOfErrors.add("Authoring MOS is mandatory");
		}
			
		if (form.dtimAuthoring().getValue() == null)
		{
			listOfErrors.add("Authoring Date/Time is mandatory");
		}
		
		int errorCount = listOfErrors.size();
		String[] result = new String[errorCount];

		for (int x = 0; x < errorCount; x++)
			result[x] = (String) listOfErrors.get(x);

		if (result != null && result.length > 0)
		{
			engine.showErrors(result);
			return false;
		}

		return true;
	}



	private boolean save()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
