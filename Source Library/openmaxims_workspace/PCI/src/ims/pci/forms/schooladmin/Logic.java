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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.71 build 3594.20535)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.pci.forms.schooladmin;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.SchoolShortVo;
import ims.core.vo.SchoolShortVoCollection;
import ims.core.vo.SchoolVo;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.Control;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	
	private void open() 
	{
		clearScreen();						// Clear the screen on open - added as a fix
		search(false);						// WDEV-12526
		form.setMode(FormMode.VIEW);
	}

	/**
	 * WDEV-12526
	 * Function used to search for records matching search criteria 
	 * @param showNoFoundMessage - if <b>true</b> then display "No results found" message
	 */
	private void search(boolean showNoFoundMessage) 
	{
		form.grdSchool().getRows().clear();
		clearScreen(); //WDEV-18187
		
		if(form.getLocalContext().getCanSearchIsNotNull() && form.getLocalContext().getCanSearch())
		{
			if(canSearch())
			{
				SchoolShortVoCollection listSchools = domain.list(form.txtSchoolSearch().getValue(), form.qmbSectorSearch().getValue());
				
				if (showNoFoundMessage && (listSchools == null || listSchools.size() == 0))
				{
					engine.showMessage("No results found to match search criteria.");
				}
				
				populateGrid(listSchools);
				
				if(form.grdSchool().getValue() != null)
				{
					populateScreenFromData(domain.get(form.grdSchool().getValue()));
				}
			}
		}
		
		updateControlsState();
	}

	private void populateScreenFromData(SchoolVo schoolVo) 
	{
		clearScreen();
		
		if(schoolVo == null)
			return;
			
		form.ctnDetails().txtSchool().setValue(schoolVo.getSchoolNameIsNotNull() ? schoolVo.getSchoolName() : null);
		form.ctnDetails().txtLocation().setValue(schoolVo.getLocationIsNotNull() ? schoolVo.getLocation() : null);
		form.ctnDetails().txtPhone().setValue(schoolVo.getPhoneNumberIsNotNull() ? schoolVo.getPhoneNumber() : null);
		
		form.ctnDetails().chkActive().setValue(Boolean.TRUE.equals(schoolVo.getIsActive()));			// WDEV - 12502 - Get value for isActive
		
		form.ctnDetails().customControlMap().setValue(schoolVo.getExternalMappingsIsNotNull() ? schoolVo.getExternalMappings() : null);
		
		if(schoolVo.getSectorIsNotNull())
		{
			form.ctnDetails().qmbSector().newRow(schoolVo.getSector(), schoolVo.getSector().getName());
			form.ctnDetails().qmbSector().setValue(schoolVo.getSector());
		}
	}

	private void populateGrid(SchoolShortVoCollection listSchools) 
	{
		if(listSchools == null)
			return;
		
		for(int i=0; i<listSchools.size(); i++)
		{
			if(listSchools.get(i) != null)
			{
				GenForm.grdSchoolRow newRow = form.grdSchool().getRows().newRow(form.getLocalContext().getLastRecordIsNotNull() && listSchools.get(i).equals(form.getLocalContext().getLastRecord()));
				
				newRow.setColSchool(listSchools.get(i).getSchoolName());
				newRow.setColSector(listSchools.get(i).getSector() != null ? listSchools.get(i).getSector().getName() : null);
				newRow.setColLocation(listSchools.get(i).getLocation());
				newRow.setColPhone(listSchools.get(i).getPhoneNumber());
				newRow.setColActive(listSchools.get(i).getIsActive());//WDEV-12949
				newRow.setValue(listSchools.get(i));
			}
		}
	}

	private boolean canSearch() 
	{
		if(form.txtSchoolSearch().getValue() == null && form.qmbSectorSearch().getValue() == null)
		{
			engine.showMessage("Please enter at least one search criteria.");
			form.getLocalContext().setCanSearch(false);
			return false;
		}
		
		return true;
	}

	private void initialize() 
	{
		form.ctnDetails().customControlMap().initialize();
	}

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
	}
	
	private void updateControlsState() 
	{
		form.ctnDetails().setCollapsed(!((form.grdSchool().getValue() != null && form.getMode().equals(FormMode.VIEW)) || form.getMode().equals(FormMode.EDIT)));
		form.ctnDetails().customControlMap().setComponentMode(form.getMode());
		
		if(form.getMode() == FormMode.VIEW)
		{
			form.btnEdit().setVisible(form.grdSchool().getValue() != null);
			form.btnEdit().setEnabled(form.grdSchool().getValue() != null);
		}
		
		form.getContextMenus().PCI.getSchoolMenuADDItem().setVisible(form.getMode().equals(FormMode.VIEW));
		form.getContextMenus().PCI.getSchoolMenuEDITItem().setVisible(form.getMode().equals(FormMode.VIEW) && form.grdSchool().getValue() instanceof SchoolShortVo);
	}

	@Override
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		newInstance();
	}
	
	private void newInstance() 
	{
		//form.getLocalContext().setLastRecord(new SchoolVo());
		form.getLocalContext().setLastRecord(null);//WDEV-14198
		form.grdSchool().setValue(null);
		form.setMode(FormMode.EDIT);
		clearScreen();
		
		
		// WDEV - 12502 - Default to active when creating a new record
		form.ctnDetails().chkActive().setValue(Boolean.TRUE);
	}

	private void clearScreen() 
	{
		form.ctnDetails().txtSchool().setValue(null);
		form.ctnDetails().txtLocation().setValue(null);
		form.ctnDetails().txtPhone().setValue(null);
		form.ctnDetails().qmbSector().setValue(null);
		form.ctnDetails().chkActive().setValue(null);			// WDEV - 12502 - Also clear the isActive control added
		form.ctnDetails().customControlMap().clear();
	}

	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		updateInstance();
	}
	
	private void updateInstance() 
	{
		form.setMode(FormMode.EDIT);
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(save())
			open();
	}
	
	private boolean save() 
	{
		SchoolVo record = populateDataFromScreen(form.getLocalContext().getLastRecord());
		
		String[] errors = form.ctnDetails().customControlMap().validate();
		errors = record.validate(errors);
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		try 
		{
			form.getLocalContext().setLastRecord(domain.save(record));
		} 
		catch (DomainInterfaceException e) 
		{
			engine.showMessage(e.getMessage());
			return false;
		} 
		catch (StaleObjectException e) 
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		} 
		catch (UniqueKeyViolationException e) 
		{
			engine.showMessage(e.getMessage());
			return false;
		}
		
		return true;
	}

	private SchoolVo populateDataFromScreen(SchoolVo lastRecord) 
	{
		if(lastRecord == null)
			lastRecord = new SchoolVo();
		
		lastRecord.setSchoolName(form.ctnDetails().txtSchool().getValue());
		if(form.ctnDetails().txtSchool().getValue() != null && form.ctnDetails().txtSchool().getValue().trim().length() > 0)
		{
			lastRecord.setUpperCaseName(form.ctnDetails().txtSchool().getValue().toUpperCase());
		}
		lastRecord.setLocation(form.ctnDetails().txtLocation().getValue());
		lastRecord.setPhoneNumber(form.ctnDetails().txtPhone().getValue());
		lastRecord.setExternalMappings(form.ctnDetails().customControlMap().getValueNoWarnings());
		lastRecord.setSector(form.ctnDetails().qmbSector().getValue());
		lastRecord.setIsActive(form.ctnDetails().chkActive().getValue());		// WDEV - 12502 - Set value for isActive new control
		
		return lastRecord;
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		cancelInstance();
	}
	
	private void cancelInstance() 
	{
		if(form.getLocalContext().getLastRecord() != null && form.getLocalContext().getLastRecord().countFieldsWithValue() == 0)
		{
			form.getLocalContext().setLastRecord(null);
		}
		
		open();
	}

	@Override
	protected void onQmbSectorSearchTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException
	{
		listSearchSectors(value);
	}
	
	private void listSearchSectors(String value) 
	{
		if (value == null || value.length() < 3)
		{
			engine.showMessage("Please enter at least 3 characters for search criteria");
			return;
		}

		LocationLiteVoCollection coll = null;
		
		// WDEV-12668 - Update 'listSectors' method to list back only active records / all records depending on parameter
		coll = domain.listSectors(value, true); 
		
		form.qmbSectorSearch().setValue(null);
		form.qmbSectorSearch().clear();
		if (coll != null)
		{
			for (int i = 0; i < coll.size(); i++)
			{
				LocationLiteVo vo = coll.get(i);
				form.qmbSectorSearch().newRow(vo, vo.getName());
			}
		}

		if (coll == null || coll.size() > 0)					// Check for null added
		{
			form.qmbSectorSearch().showOpened();
		}
	}

	private void listSectors(String value) 
	{
		if (value == null || value.length() < 3)
		{
			engine.showMessage("Please enter at least 3 characters for search criteria");
			return;
		}

		LocationLiteVoCollection coll = null;
		
		// WDEV-12668 - Update 'listSectors' method to list back only active records / all records depending on parameter
		coll = domain.listSectors(value, false); 
		
		form.ctnDetails().qmbSector().setValue(null);
		form.ctnDetails().qmbSector().clear();
		if (coll != null)
		{
			for (int i = 0; i < coll.size(); i++)
			{
				LocationLiteVo vo = coll.get(i);
				form.ctnDetails().qmbSector().newRow(vo, vo.getName());
			}
		}

		if (coll == null || coll.size() > 0)					// Check for null added
		{
			form.ctnDetails().qmbSector().showOpened();
		}
	}

	@Override
	protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearSearch();
		clearScreen();			// Also clear the screen - added
		
		// WDEV-12526 - Update controls & context menu state
		updateControlsState();
	}
	
	private void clearSearch() 
	{
		form.txtSchoolSearch().setValue(null);
		form.qmbSectorSearch().setValue(null);
		form.grdSchool().getRows().clear();
		form.getLocalContext().setLastRecord(null);
		form.getLocalContext().setCanSearch(false);
	}

	@Override
	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setCanSearch(true);
		form.getLocalContext().setLastRecord(null);
		search(true);									// WDEV-12526
	}

	protected void onGrdSchoolSelectionChanged() throws PresentationLogicException 
	{
		getSelectedInstance();
	}

	private void getSelectedInstance() 
	{
		if(form.grdSchool().getValue() instanceof SchoolShortVo)
		{
			SchoolVo selectedSchool = domain.get(form.grdSchool().getValue());
			form.getLocalContext().setLastRecord(selectedSchool);
			populateScreenFromData(selectedSchool);
		}
		
		updateControlsState();
	}

	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException 
	{
		switch(menuItemID)
		{
			case ims.pci.forms.schooladmin.GenForm.ContextMenus.PCINamespace.SchoolMenu.ADD:
				newInstance();
				break;
			case ims.pci.forms.schooladmin.GenForm.ContextMenus.PCINamespace.SchoolMenu.EDIT:
				updateInstance();
				break;
		}
	}

	@Override
	protected void onQmbSectorTextSubmited(String value) throws PresentationLogicException 
	{
		listSectors(value);
	}
}
