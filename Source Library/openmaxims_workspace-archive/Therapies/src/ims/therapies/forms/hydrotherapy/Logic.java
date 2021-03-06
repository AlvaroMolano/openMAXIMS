//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Charlotte Murphy using IMS Development Environment (version 1.42 build 2196.26417)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.therapies.forms.hydrotherapy;

import ims.core.vo.CareContextShortVo;
import ims.core.vo.ClinicalContactShortVo;
import ims.core.vo.Hcp;
import ims.core.vo.HcpCollection;
import ims.core.vo.HcpFilter;
import ims.core.vo.PersonName;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.framework.utils.DateTime;
import ims.spinalinjuries.vo.lookups.HydrotherapyEquipment;
import ims.spinalinjuries.vo.lookups.HydrotherapyEquipmentCollection;
import ims.spinalinjuries.vo.lookups.HydrotherapyModalities;
import ims.spinalinjuries.vo.lookups.HydrotherapyModalitiesCollection;
import ims.spinalinjuries.vo.lookups.LookupHelper;
import ims.therapies.vo.HydrotherapyShortVoCollection;
import ims.therapies.vo.HydrotherapyVo;

public class Logic extends BaseLogic
{
	protected void onFormOpen() throws ims.framework.exceptions.FormOpenException
	{
		open();
	}
	private void open()
	{
		form.setMode(FormMode.VIEW);
		fillRecordBrowser(domain.listHydroForCareContext(form.getGlobalContext().Core.getCurrentCareContext()));
	}
	private void prePopulateGrids()
	{
		prePopulateGrdEquipment();
		prePopulateGrdModalities();
	}
	private void prePopulateGrdEquipment()
	{
		GenForm.grdEquipmentRow row = null;
		form.grdEquipment().getRows().clear();
		HydrotherapyEquipmentCollection equipCol = LookupHelper.getHydrotherapyEquipment(domain.getLookupService());
		
		for (int i = 0; i < equipCol.size(); i++)
		{
			HydrotherapyEquipment equip = equipCol.get(i);
			row = form.grdEquipment().getRows().newRow();
			row.setValue(equip);
			row.setColEquipment(equip.getText());
		}	
	}
	private void prePopulateGrdModalities()
	{
		GenForm.grdModalitiesRow row = null;
		form.grdModalities().getRows().clear();
		HydrotherapyModalitiesCollection modCol = LookupHelper.getHydrotherapyModalities(domain.getLookupService());
		
		for (int i = 0; i < modCol.size(); i++)
		{
			HydrotherapyModalities mod = modCol.get(i);
			row = form.grdModalities().getRows().newRow();
			row.setValue(mod);
			row.setColModlities(mod.getText());
		}
	}
	private void populateScreen(HydrotherapyVo voHydroTherapy)
	{
		form.qmbAuthoringCP().newRow(voHydroTherapy.getAuthoringCP(), voHydroTherapy.getAuthoringCP().toString());
		form.qmbAuthoringCP().setValue(voHydroTherapy.getAuthoringCP());
		form.dtimAuthoring().setValue(voHydroTherapy.getAuthoringDateTime());
		form.cmbAssistance().setValue(voHydroTherapy.getLevelOfAssistance());
		form.cmbTransferIn().setValue(voHydroTherapy.getTransferIn());
		form.cmbTransferOut().setValue(voHydroTherapy.getTransferOut());
		form.txtComments().setValue(voHydroTherapy.getComment());
		
		if(voHydroTherapy.getEquipment() != null)
			populateEquipGrid(voHydroTherapy.getEquipment());
		
		if(voHydroTherapy.getModalities() != null)
			populateModalGrid(voHydroTherapy.getModalities());
	}
	
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
		form.btnUpdate().setVisible(false);
		form.btnNew().setVisible(false);
		
		form.dtimAuthoring().setValue(new DateTime());
		loadHcps();
		
		form.getLocalContext().setvoHydroTherapy(null);
	}
	private void loadHcps()
	{
		form.qmbAuthoringCP().clear();

		Hcp voHcp = (Hcp) domain.getHcpUser();
		if(voHcp != null)
		{
			form.qmbAuthoringCP().newRow(voHcp, voHcp.toString());
			form.qmbAuthoringCP().setValue(voHcp);
		}
	}
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		HydrotherapyVo voHydro = null;
		HydrotherapyEquipmentCollection equipColl = new HydrotherapyEquipmentCollection();
		HydrotherapyModalitiesCollection modColl = new HydrotherapyModalitiesCollection();
		
		if(form.getLocalContext().getvoHydroTherapy() == null)
			voHydro = new HydrotherapyVo();
		else
			voHydro = form.getLocalContext().getvoHydroTherapy();	
		
		voHydro.setAuthoringCP(form.qmbAuthoringCP().getValue());
		voHydro.setAuthoringDateTime(form.dtimAuthoring().getValue());
		if(form.getGlobalContext().Core.getCurrentClinicalContactIsNotNull())
			voHydro.setClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact());
		
		//WDEV-2856
		voHydro.setLevelOfAssistance(form.cmbAssistance().getValue());
		voHydro.setTransferIn(form.cmbTransferIn().getValue());
		voHydro.setTransferOut(form.cmbTransferOut().getValue());
		voHydro.setComment(form.txtComments().getValue());
	
		for(int x=0; x<form.grdEquipment().getRows().size(); x++)
		{
			GenForm.grdEquipmentRow rowEquip = form.grdEquipment().getRows().get(x);
			if(rowEquip.getColSelect())
				equipColl.add(rowEquip.getValue());	
		}
		voHydro.setEquipment(equipColl);

		for(int z=0; z<form.grdModalities().getRows().size(); z++)
		{
			GenForm.grdModalitiesRow rowMod = form.grdModalities().getRows().get(z);
			if(rowMod.getColSelect())
				modColl.add(rowMod.getValue());
		}
		voHydro.setModalities(modColl);
		
		String[] errors = voHydro.validate();
		if (errors != null)
		{
			engine.showErrors("Validation Errors", errors);
			return;
		}
		
		try
		{
			domain.saveHydroTherapy(voHydro);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return;
		}
		catch (UniqueKeyViolationException e)
		{
			engine.showMessage("A Hydrotherapy record already exists. " + e.getMessage());
			open();
			return;
		}
		catch(DomainRuntimeException e)
		{
			engine.showMessage(e.getMessage());
			open();
			return;
		}
		
		form.setMode(FormMode.VIEW);
		open();
	}
	
	private void populateModalGrid(HydrotherapyModalitiesCollection modColl)
	{
		GenForm.grdModalitiesRow mRow;
		for (int i=0; i<modColl.size(); i++)
		{
			HydrotherapyModalities modal = modColl.get(i);
			mRow = form.grdModalities().getRowByValue(modal);
			if (mRow != null)
				mRow.setColSelect(true);
			else
			{
				mRow = form.grdModalities().getRows().newRow();
				mRow.setValue(modal);
				mRow.setColModlities(modal.getText());	
				mRow.setColSelect(true);	
			}
		}
	}
	private void populateEquipGrid(HydrotherapyEquipmentCollection equipColl)
	{
		GenForm.grdEquipmentRow cRow;
		for (int i=0; i<equipColl.size(); i++)
		{
			HydrotherapyEquipment equip = equipColl.get(i);
			cRow = form.grdEquipment().getRowByValue(equip);
			if (cRow != null)
				cRow.setColSelect(true);
			else
			{
				cRow = form.grdEquipment().getRows().newRow();
				cRow.setValue(equip);
				cRow.setColEquipment(equip.getText());	
				cRow.setColSelect(true);	
			}
		}
	}
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	private void clearControls()
	{
		form.qmbAuthoringCP().setValue(null);
		form.dtimAuthoring().setValue(null);
		form.cmbAssistance().setValue(null);
		form.cmbTransferIn().setValue(null);
		form.cmbTransferOut().setValue(null);
		form.txtComments().setValue(null);	
	}
	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
		form.btnUpdate().setVisible(false);
		form.btnNew().setVisible(false);
	}
	protected void onQmbAuthoringCPTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException
	{
		form.qmbAuthoringCP().clear();
		HcpFilter filter = new HcpFilter();
		PersonName name = new PersonName();
		name.setSurname(value);
		filter.setQueryName(name);
		
		HcpCollection coll = domain.listHCPs(filter);
		for (int i = 0; i < coll.size(); i++)
		{
			Hcp med = coll.get(i);
			form.qmbAuthoringCP().newRow(med, med.toString());			
		}
		if (coll.size() == 1)
		{
			form.qmbAuthoringCP().setValue(coll.get(0));
		}
		else if (coll.size() > 1)
		{
			form.qmbAuthoringCP().showOpened();		
		}		
	}
	
	private void fillRecordBrowser(HydrotherapyShortVoCollection voHydroColl)
	{
		form.recbrHydro().clear();
		boolean selectedClinicalContactFound = false;
		CareContextShortVo voSelectedCareContext = form.getGlobalContext().Core.getCurrentCareContext();
		ClinicalContactShortVo voSelectedClinicalContact = form.getGlobalContext().Core.getCurrentClinicalContact();
		
		form.recbrHydro().newRow(voSelectedCareContext, voSelectedCareContext.getRecordBrowserText());
		
		if(voHydroColl != null)
		{
			for(int i = 0 ; i < voHydroColl.size() ; i++)
			{
				ClinicalContactShortVo voClinicalContact = voHydroColl.get(i).getClinicalContact();
				if(voSelectedClinicalContact != null && voClinicalContact.getID_ClinicalContact().equals(voSelectedClinicalContact.getID_ClinicalContact()))
				{
					selectedClinicalContactFound = true;
					form.recbrHydro().newRow(voClinicalContact, "\t\t\t\tClinical Contact: " + voClinicalContact.getStartDateTime().toString() + " - " + voClinicalContact.getSeenBy().toString(), Color.Green);
					form.recbrHydro().setValue(voClinicalContact);
				}
				else
				{
					form.recbrHydro().newRow(voClinicalContact, "\t\t\t\tClinical Contact: " + voClinicalContact.getStartDateTime().toString() + " - " + voClinicalContact.getSeenBy().toString());
				}
			}
		}
		
		if(!selectedClinicalContactFound && voSelectedClinicalContact != null)
		{
			form.recbrHydro().newRow(voSelectedClinicalContact, "\t\t\t\tClinical Contact: " + voSelectedClinicalContact.getStartDateTime().toString() + " - " + voSelectedClinicalContact.getSeenBy().toString(), Color.Green);
			form.recbrHydro().setValue(voSelectedClinicalContact);
		}
		browseRecord();
	}

	private void browseRecord()
	{
		clearControls();
		clearGrids();
		
		prePopulateGrids();
		updateBrowseInformation();
		
		if(form.recbrHydro().getValue() instanceof ClinicalContactShortVo)
		{
			ClinicalContactShortVo voClinicalContact = (ClinicalContactShortVo) form.recbrHydro().getValue();
			form.getLocalContext().setvoHydroTherapy(domain.getHydroTherapy(voClinicalContact, engine.isRIEMode()));
			if(form.getLocalContext().getvoHydroTherapyIsNotNull())
				populateScreen(form.getLocalContext().getvoHydroTherapy());
		}
		isRecordEditable();
	}
	private void updateBrowseInformation()
	{
		form.lblBrowserStatus().setValue(form.recbrHydro().getRecordState("Assessment", "Assessments"));
	}
	private void clearGrids() 
	{
		form.grdEquipment().getRows().clear();
		form.grdModalities().getRows().clear();
	}
	private void isRecordEditable()
	{
		boolean isEditable = false;
		ClinicalContactShortVo voSelectedClinicalContact = form.getGlobalContext().Core.getCurrentClinicalContact();
		
		if(voSelectedClinicalContact != null)
		{
			if(form.recbrHydro().getValue() instanceof ClinicalContactShortVo)
			{
				ClinicalContactShortVo voContact = (ClinicalContactShortVo) form.recbrHydro().getValue();
				if(voContact.getID_ClinicalContact().equals(voSelectedClinicalContact.getID_ClinicalContact()))
					isEditable = true;
			}
		}
		
		form.btnNew().setVisible(isEditable);
		form.btnUpdate().setVisible(isEditable);
		
		if(isEditable)
		{
			if(form.getLocalContext().getvoHydroTherapyIsNotNull())
			{
				form.btnNew().setEnabled(false);
				form.btnNew().setVisible(false);
				form.btnUpdate().setEnabled(true);
				form.btnUpdate().setVisible(true);
			}
			else
			{
				form.btnNew().setEnabled(true);
				form.btnNew().setVisible(true);
				form.btnUpdate().setEnabled(false);
				form.btnUpdate().setVisible(false);
			}
		}
		

	}

	protected void onRecbrHydroValueChanged() throws PresentationLogicException 
	{
		browseRecord();
	}

}
