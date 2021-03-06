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
// This code was generated by Andrei Stefan Bondar using IMS Development Environment (version 1.80 build 4091.21781)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.hospitalatnightworklist;

import ims.clinical.forms.hospitalatnightworklist.GenForm.grdWorklistRow;
import ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo;
import ims.clinical.vo.HospitalAtNightPatientDetailListVo;
import ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection;
import ims.clinical.vo.HospitalAtNightWorklistSearchVo;
import ims.clinical.vo.PatientForHospitalAtNightVo;
import ims.clinical.vo.lookups.HospitalAtNightPatientStatus;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.LocSiteLiteVo;
import ims.core.vo.LocSiteLiteVoCollection;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.PatientShort;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.interfaces.ILocation;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.Time;

import java.util.ArrayList;
import java.util.Comparator;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	private static final int COL_AGE = 5;
	private static final int COL_TYPE_OF_REQUEST = 7;
	private static final int COL_REQUEST_DATE_TIME = 8;
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	
	public void initialize() throws ims.framework.exceptions.FormOpenException
	{
		super.initialize();
		
		form.chkNewAndActive().setValue(true);
		
		bindHospitalCombo();
		ILocation currentLocation = engine.getCurrentLocation();
		LocSiteLiteVo currentHospiptal = domain.getCurrentHospital(currentLocation);
		form.cmbHospital().setValue(currentHospiptal);
		setSearchCriteriaDates();
		
		bindWardCombo(currentHospiptal);
		if(currentLocation instanceof LocationLiteVo)
			form.cmbWard().setValue((LocationLiteVo) currentLocation);
		
		Object hcp = domain.getHcpLiteUser();
		if(hcp instanceof HcpLiteVo)
		{
			form.getLocalContext().setLoggedHCP((HcpLiteVo) hcp);
		}
	}
	
	private void setSearchCriteriaDates() 
	{
		if(form.cmbHospital().getValue() != null)
		{
			HospitalAtNightCutOverPointsConfigVo hospitalConfig = domain.getCurrentHospitalAtNightConfig(form.cmbHospital().getValue());
			
			//	WDEV-13968 - starts here
			Time startTime = hospitalConfig.getStartTime();
			Time endTime = hospitalConfig.getEndTime();
			Time currentTime = new Time();
			currentTime.setSecond(0);
			
			DateTime startDateTime = null;
			DateTime endDateTime = null;
			if(startTime.isGreaterOrEqualThan(endTime))
			{
				if(currentTime.isLessOrEqualThan(endTime))
				{
					startDateTime = new DateTime(new Date().addDay(-1), startTime);
					endDateTime = new DateTime(new Date(), endTime);
				}
				else
				{
					startDateTime = new DateTime(new Date(), startTime);
					endDateTime = new DateTime(new Date().addDay(1), endTime);
				}
			}
			else if(startTime.isLessThan(endTime))
			{
				if(currentTime.isLessOrEqualThan(endTime))
				{
					startDateTime = new DateTime(new Date(), startTime);
					endDateTime = new DateTime(new Date(), endTime);
				}
				else
				{
					startDateTime = new DateTime(new Date().addDay(1), startTime);
					endDateTime = new DateTime(new Date().addDay(1), endTime);
				}
			}
			
			form.dtimFrom().setValue(startDateTime);
			form.dtimTo().setValue(endDateTime);		
			//	WDEV-13968 - ends here
		}
	}

	private void bindHospitalCombo() 
	{
		form.cmbHospital().clear();
		LocSiteLiteVoCollection hospitals = domain.listHospitals();
		
		if(hospitals == null || hospitals.size() == 0)
			return;
		
		for(LocSiteLiteVo hospital : hospitals)
		{
			if(hospital == null)
				continue;
			
			form.cmbHospital().newRow(hospital, hospital.getName());
		}
	}

	@Override
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		switch (menuItemID)
		{
			case GenForm.ContextMenus.ClinicalNamespace.HospitalAtNightWorklist.EDIT:
				updateInstance();
				break;
				
			case GenForm.ContextMenus.ClinicalNamespace.HospitalAtNightWorklist.VIEW:
				viewInstance();
				break;							
		}		
	}
	
	private void viewInstance() 
	{
		if(form.grdWorklist().getValue() == null)//	WDEV-13968
			return;
		
		selectPatient();
		
		form.getGlobalContext().Clinical.setHospitalAtNightPatientDetails(form.grdWorklist().getValue());
		engine.open(form.getForms().Clinical.HospitalAtNightPatientDetail, new Object[] {FormMode.VIEW});
	}

	public void open() throws ims.framework.exceptions.PresentationLogicException
	{
		if(form.getGlobalContext().Clinical.getHospitalAtNightWorklistSearchCriteriaIsNotNull())
		{
			populateSearchCriteriaScreenFromData(form.getGlobalContext().Clinical.getHospitalAtNightWorklistSearchCriteria());
		}
		
		search();
		form.setMode(FormMode.VIEW);
	}
	
	private boolean search() 
	{
		if(isSearchCriteriaValid())
		{
			populateScreenFromData(domain.listHospitalAtNightPatientDetails(populateSearchCriteriaDataFromScreen()));
			
			if(form.grdWorklist().getRows().size() == 0)
				engine.showMessage("No records found.");
			
			return true;
		}
		
		return false;
	}

	private void populateScreenFromData(HospitalAtNightPatientDetailListVoCollection list) 
	{
		form.grdWorklist().getRows().clear();
		
		if(list == null || list.size() == 0)
			return;
		
		for(HospitalAtNightPatientDetailListVo record : list)
		{
			if(record == null)
				continue;
			
			addHospitalAtNightPatientDetailsRow(record);
		}
		
		form.grdWorklist().setValue(form.getLocalContext().getSelectedInstance());
	}

	private void addHospitalAtNightPatientDetailsRow(HospitalAtNightPatientDetailListVo record) 
	{
		if(record == null)
			return;
		
		grdWorklistRow row = form.grdWorklist().getRows().newRow();
		
		row.setColNHS(record.getPatient().getNhsn() != null ? record.getPatient().getNhsn().getValue() : null);
		row.setTooltipForColNHS(row.getColNHS());
		row.setColHospitalNo(record.getPatient().getHospnum() != null ? record.getPatient().getHospnum().getValue() : null);
		row.setTooltipForColHospitalNo(row.getColHospitalNo());
		row.setColSurname(record.getPatient().getName().getSurname());
		row.setTooltipForColSurname(row.getColSurname());
		row.setColForename(record.getPatient().getName().getForename());
		row.setTooltipForColForename(row.getColForename());
		row.setColSex(record.getPatient().getSex() != null ? record.getPatient().getSex().getText() : null);
		row.setTooltipForColSex(row.getColSex());
		
		Integer age = record.getPatient().getAge();
		if(age != null)
		{
			row.setColAge(record.getPatient().getAge().toString());
			row.setTooltipForColAge(row.getColAge());
		}
		
		row.setColWard(record.getWardWhenPlacedOnList() != null ? record.getWardWhenPlacedOnList().getName() : null);
		row.setTooltipForColWard(row.getColWard());
		
		//WDEV-18179
		row.setColRequest(record.getTypeOfRequest() != null ? record.getTypeOfRequest().getImage() : null);
		row.setTooltipForColRequest(record.getTypeOfRequest().getText());
		
		// WDEV-18179 
		if (record.getRequestingDateTime() != null)
			row.setColRequestDateTime(record.getRequestingDateTime().toString());
		row.setTooltipForColRequestDateTime(row.getColRequestDateTime());
		
		row.setColStatus(record.getCurrentStatus().getStatus().getText());
		row.setTooltipForColStatus(row.getColStatus());
		row.setColMEWS(record.getMEWS().getText());
		row.setTooltipForColMEWS(row.getColMEWS());
		
		row.setValue(record);
	}

	private HospitalAtNightWorklistSearchVo populateSearchCriteriaDataFromScreen() 
	{
		HospitalAtNightWorklistSearchVo criteria = new HospitalAtNightWorklistSearchVo();
		
		criteria.setSurname(form.txtSurname().getValue());
		criteria.setForename(form.txtForename().getValue());
		criteria.setNewOrActive(form.chkNewAndActive().getValue());
		criteria.setCompleted(form.chkComplete().getValue());
		criteria.setHospital(form.cmbHospital().getValue());
		criteria.setWard(form.cmbWard().getValue());
		criteria.setTypeOfRequest(form.cmbTypeOfRequest().getValue());
		criteria.setDateFrom(form.dtimFrom().getValue());
		criteria.setDateTo(form.dtimTo().getValue());
		
		return criteria;
	}

	private boolean isSearchCriteriaValid() 
	{
		ArrayList<String> uiErrors = new ArrayList<String>();
		
		DateTime dateFrom = form.dtimFrom().getValue();
		DateTime dateTo = form.dtimTo().getValue();
		
		if(dateFrom == null)
		{
			uiErrors.add("Date From is mandatory.");
		}
		
		if(dateTo == null)
		{
			uiErrors.add("Date To is mandatory.");
		}
		
		if (dateFrom != null && dateTo != null && dateTo.isLessThan(dateFrom))
		{
			uiErrors.add("'From' date cannot be later than 'To' date."); //WDEV-18762
		}
		
		if (uiErrors.size() > 0)
		{
			engine.showErrors(uiErrors.toArray(new String[uiErrors.size()]));
			return false;
		}
		
		return true;
	}

	private void populateSearchCriteriaScreenFromData(HospitalAtNightWorklistSearchVo criteria) 
	{
		clearScreen();
		
		if(criteria == null)
			return;
		
		form.txtSurname().setValue(criteria.getSurname());
		form.txtForename().setValue(criteria.getForename());
		form.chkNewAndActive().setValue(criteria.getNewOrActive());
		form.chkComplete().setValue(criteria.getCompleted());
		form.cmbHospital().setValue(criteria.getHospital());
		bindWardCombo(form.cmbHospital().getValue());
		form.cmbWard().setValue(criteria.getWard());
		form.cmbTypeOfRequest().setValue(criteria.getTypeOfRequest());
		form.dtimFrom().setValue(criteria.getDateFrom());
		form.dtimTo().setValue(criteria.getDateTo());;
	}

	private void clearScreen() 
	{
		form.txtSurname().setValue(null);
		form.txtForename().setValue(null);
		form.chkNewAndActive().setValue(null);
		form.chkComplete().setValue(null);
		form.cmbHospital().setValue(null);
		form.cmbWard().clear();
		form.cmbTypeOfRequest().setValue(null);
		form.dtimFrom().setValue(null);
		form.dtimTo().setValue(null);
		
		form.grdWorklist().getRows().clear();
	}

	public void updateControlsState()
	{	
		form.getContextMenus().Clinical.getHospitalAtNightWorklistEDITItem().setVisible(form.getLocalContext().getLoggedHCPIsNotNull() && FormMode.VIEW.equals(form.getMode()) && form.grdWorklist().getValue() != null && !HospitalAtNightPatientStatus.REMOVE_FROM_LIST.equals(form.grdWorklist().getValue().getCurrentStatus().getStatus()));
		form.getContextMenus().Clinical.getHospitalAtNightWorklistVIEWItem().setVisible(FormMode.VIEW.equals(form.getMode()) && form.grdWorklist().getValue() != null);
	}
	
	public void updateInstance() throws PresentationLogicException
	{
		if(form.grdWorklist().getValue() == null)//	WDEV-13968
			return;
		
		Boolean isSameStatus = domain.isSameStatus(form.grdWorklist().getValue(), form.grdWorklist().getValue().getCurrentStatus().getStatus());
		
		if(!isSameStatus)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return;
		}
		
		selectPatient();//	WDEV-13968
		
		form.getGlobalContext().Clinical.setHospitalAtNightPatientDetails(form.grdWorklist().getValue());
		if(HospitalAtNightPatientStatus.NEW.equals(form.grdWorklist().getValue().getCurrentStatus().getStatus()))//	WDEV-13968
		{
			engine.open(form.getForms().Clinical.HospitalAtNightPatientDetail, new Object[] {FormMode.EDIT});
		}
		else
		{
			engine.open(form.getForms().Clinical.HospitalAtNightPatientDetail, new Object[] {FormMode.VIEW});
		}
	}

	//	WDEV-13968
	private void selectPatient() 
	{
		if(form.grdWorklist().getValue() == null)
			return;
		
		PatientForHospitalAtNightVo patient = form.grdWorklist().getValue().getPatient();
		PatientShort patientShort = new PatientShort(patient.getID_Patient(), patient.getVersion_Patient());
		form.getGlobalContext().Core.setPatientShort(patientShort);
	}
	
	@Override
	protected void onGrdWorklistSelectionChanged() throws PresentationLogicException 
	{
		form.getLocalContext().setSelectedInstance(form.grdWorklist().getValue());
		updateControlsState();
	}

	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException 
	{
		form.getGlobalContext().Clinical.setHospitalAtNightPatientDetails(null);
		form.getGlobalContext().Core.setPatientShort(null);//WDEV-13968
		
		open();
	}

	@Override
	protected void onImbSearchClick() throws PresentationLogicException 
	{
		if(search())
		{
			form.getGlobalContext().Clinical.setHospitalAtNightWorklistSearchCriteria(populateSearchCriteriaDataFromScreen());
		}
		
		updateControlsState();
	}

	@Override
	protected void onImbClearClick() throws PresentationLogicException 
	{
		clearScreen();
		
		form.getGlobalContext().Clinical.setHospitalAtNightWorklistSearchCriteria(null);
		updateControlsState();
	}

	@Override
	protected void onCmbHospitalValueChanged() throws PresentationLogicException 
	{
		bindWardCombo(form.cmbHospital().getValue());
		
		setSearchCriteriaDates();
	}

	private void bindWardCombo(LocSiteLiteVo locSiteLite) 
	{
		form.cmbWard().clear();
		
		if(locSiteLite != null)
		{
			LocationLiteVoCollection wards = domain.listWards(locSiteLite);
			
			if(wards == null || wards.size() == 0)
				return;
			
			for(LocationLiteVo ward : wards)
			{
				if(ward == null)
					continue;
				
				form.cmbWard().newRow(ward, ward.getName());
			}
		}
	}

	@Override
	protected void onGrdWorklistGridHeaderClicked(int column) throws PresentationLogicException 
	{
		if(column == COL_AGE)
		{
			if (!SortOrder.ASCENDING.equals(form.getLocalContext().getAgeSortOrder()))
				form.getLocalContext().setAgeSortOrder(SortOrder.ASCENDING);
			else
				form.getLocalContext().setAgeSortOrder(SortOrder.DESCENDING);
			
			HospitalAtNightPatientDetailListVoCollection coll = form.grdWorklist().getValues();
			coll.sort(new AgeComparator(form.getLocalContext().getAgeSortOrder()));
			
			populateScreenFromData(coll);
		}
		if(column == COL_REQUEST_DATE_TIME)
		{
			if (!SortOrder.ASCENDING.equals(form.getLocalContext().getRequestDateTimeSortOrder()))
				form.getLocalContext().setRequestDateTimeSortOrder(SortOrder.ASCENDING);
			else
				form.getLocalContext().setRequestDateTimeSortOrder(SortOrder.DESCENDING);
			
			HospitalAtNightPatientDetailListVoCollection coll = form.grdWorklist().getValues();
			coll.sort(new RequestDateTimeComparator(form.getLocalContext().getRequestDateTimeSortOrder()));
			
			populateScreenFromData(coll);
		}
		if(column == COL_TYPE_OF_REQUEST)
		{
			if (!SortOrder.ASCENDING.equals(form.getLocalContext().getTypeOfRequestSortOrder()))
				form.getLocalContext().setTypeOfRequestSortOrder(SortOrder.ASCENDING);
			else
				form.getLocalContext().setTypeOfRequestSortOrder(SortOrder.DESCENDING);
			
			HospitalAtNightPatientDetailListVoCollection coll = form.grdWorklist().getValues();
			coll.sort(new TypeOfRequestComparator(form.getLocalContext().getTypeOfRequestSortOrder()));
			
			populateScreenFromData(coll);
		}
	}
	
	private static class AgeComparator implements Comparator<HospitalAtNightPatientDetailListVo>
	{
		private int direction = 1;
		
		public AgeComparator(SortOrder sortOrder)
		{
			if (SortOrder.ASCENDING.equals(sortOrder))
				this.direction = 1;
			else
				this.direction = -1;
		}

		public int compare(HospitalAtNightPatientDetailListVo o1, HospitalAtNightPatientDetailListVo o2)
		{
			if (o1.getPatient().getAgeIsNotNull() && o2.getPatient().getAgeIsNotNull())
				return o1.getPatient().getAge().compareTo(o2.getPatient().getAge()) * direction;
			
			if (o1.getPatient().getAgeIsNotNull() && !o2.getPatient().getAgeIsNotNull())
				return direction;
			
			if (o2.getPatient().getAgeIsNotNull() && !o1.getPatient().getAgeIsNotNull())
				return -1 * direction;

			return 0;
		}
	}
	
	private static class RequestDateTimeComparator implements Comparator<HospitalAtNightPatientDetailListVo>
	{
		private int direction = 1;
		
		public RequestDateTimeComparator(SortOrder sortOrder)
		{
			if (SortOrder.ASCENDING.equals(sortOrder))
				this.direction = 1;
			else
				this.direction = -1;
		}

		public int compare(HospitalAtNightPatientDetailListVo o1, HospitalAtNightPatientDetailListVo o2)
		{
			if (o1.getRequestingDateTimeIsNotNull() && o2.getRequestingDateTimeIsNotNull())
				return o1.getRequestingDateTime().compareTo(o2.getRequestingDateTime()) * direction;
			
			if (o1.getRequestingDateTimeIsNotNull() && !o2.getRequestingDateTimeIsNotNull())
				return direction;
			
			if (o2.getRequestingDateTimeIsNotNull() && !o1.getRequestingDateTimeIsNotNull())
				return -1 * direction;

			return 0;
		}
	}
	
	private static class TypeOfRequestComparator implements Comparator<HospitalAtNightPatientDetailListVo>
	{
		private int direction = 1;
		
		public TypeOfRequestComparator(SortOrder sortOrder)
		{
			if (SortOrder.ASCENDING.equals(sortOrder))
				this.direction = 1;
			else
				this.direction = -1;
		}

		public int compare(HospitalAtNightPatientDetailListVo o1, HospitalAtNightPatientDetailListVo o2)
		{
			if (o1.getTypeOfRequestIsNotNull() && o2.getTypeOfRequestIsNotNull())
				return o1.getTypeOfRequest().getText().compareToIgnoreCase(o2.getTypeOfRequest().getText()) * direction;
			
			if (o1.getTypeOfRequestIsNotNull() && !o2.getTypeOfRequestIsNotNull())
				return direction;
			
			if (o2.getTypeOfRequestIsNotNull() && !o1.getTypeOfRequestIsNotNull())
				return -1 * direction;

			return 0;
		}
	}

	@Override
	protected void onFormModeChanged() 
	{
		updateControlsState();
	}
}
