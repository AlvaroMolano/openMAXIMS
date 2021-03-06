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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 5256.13787)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;


import ims.admin.domain.OrganisationAndLocation;
import ims.admin.domain.impl.OrganisationAndLocationImpl;
import ims.RefMan.domain.base.impl.BaseElectiveListAddLaterDialogImpl;
import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.domain.objects.PatientElectiveList;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.ElectiveListConfigurationWLVoCollection;
import ims.RefMan.vo.PatientElectiveListAddLaterVo;
import ims.RefMan.vo.domain.CatsReferralforElectiveListDetailsVoAssembler;
import ims.RefMan.vo.domain.ElectiveListConfigurationWLVoAssembler;
import ims.RefMan.vo.domain.PatientElectiveListAddLaterVoAssembler;
import ims.RefMan.vo.lookups.ElectiveAdmissionType;
import ims.clinical.domain.ClinicalCoding;
import ims.clinical.domain.impl.ClinicalCodingImpl;
import ims.core.clinical.vo.ServiceRefVo;
import ims.core.patient.domain.objects.Patient;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.domain.objects.Hcp;
import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.people.vo.MemberOfStaffRefVo;
import ims.core.resource.place.vo.LocationRefVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.HcpLiteVoCollection;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.PatientShort;
import ims.core.vo.ProcedureLiteVoCollection;
import ims.core.vo.ProcedureVoCollection;
import ims.core.vo.domain.HcpLiteVoAssembler;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.domain.PatientShortAssembler;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.MedicGrade;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.lookups.LookupInstance;
import ims.emergency.vo.lookups.ElectiveListReason;
import ims.framework.FormName;
import ims.framework.exceptions.CodingRuntimeException;
import ims.pathways.configuration.domain.objects.RTTStatusPoint;
import ims.pathways.domain.objects.PathwayClock;
import ims.pathways.domain.objects.PathwayRTTStatus;
import ims.pathways.domain.objects.PathwaysRTTClockImpact;
import ims.pathways.domain.objects.PatientPathwayJourney;
import ims.pathways.domain.objects.RTTStatusEventMap;
import ims.pathways.vo.lookups.RTTClockImpactSource;
import ims.pathways.vo.lookups.RTTClockState;
import ims.scheduling.domain.objects.Booking_Appointment;
import ims.scheduling.helper.IPatientElectiveList;
import ims.scheduling.vo.AppointmentOutcomeActionVo;
import ims.scheduling.vo.BookingAppointmentOutcomeVo;
import ims.scheduling.vo.Booking_AppointmentRefVo;
import ims.scheduling.vo.domain.BookingAppointmentOutcomeVoAssembler;
import ims.scheduling.vo.lookups.AppointmentAction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class ElectiveListAddLaterDialogImpl extends BaseElectiveListAddLaterDialogImpl implements IPatientElectiveList
{
	private static final long serialVersionUID = 1L;
	
	
	private static final Integer SUBSEQUENT_ACTIVITI_DURING_REFERRAL_TREATMENT_PERIOD	= 20;
	private static final Integer START_OF_FIRST_DEFINITIVE_TREATMENT					= 30;
	private static final Integer START_OF_ACTIVE_MONITORING_BY_PATIENT					= 31;
	private static final Integer START_OF_ACTIVE_MONITORING_BY_CARE_PROFESIONAL			= 32;
	private static final Integer AFTER_TREATMENT_FIRST_TREATMENT_OCCURED				= 90;
	private static final Integer ACTIVE_MONITORING_CARE_ACTIVITY_DURING_MONITORING		= 91;


	
	public ims.RefMan.vo.PatientElectiveListAddLaterVo getPatientElectiveList(ims.RefMan.vo.PatientElectiveListRefVo electiveListRef)
	{
		if(electiveListRef == null)
			throw new CodingRuntimeException("Cannot get PatientElectiveList on null Specimen on null electiveListRef.");
		
		return PatientElectiveListAddLaterVoAssembler.create((PatientElectiveList) getDomainFactory().getDomainObject(PatientElectiveList.class, electiveListRef.getID_PatientElectiveList()));
	
	}

	public ims.RefMan.vo.PatientElectiveListAddLaterVo saveRecord(ims.RefMan.vo.PatientElectiveListAddLaterVo record) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if (record == null)
		{
			throw new CodingRuntimeException("Cannot save null PatientElectiveListAddLaterVo");
		}
		
		boolean firstSave = record.getID_PatientElectiveList() == null;
		
		RTTClockImpactSource source = getClockImpactSource(record);
		
		
		DomainFactory factory = getDomainFactory();
		
		PatientElectiveList domainPatElectiveList = PatientElectiveListAddLaterVoAssembler.extractPatientElectiveList(factory, record);
		
		factory.save(domainPatElectiveList);
		
		
		// Set RTT Status to 20 & record RTT Clock Impact process
		if (firstSave && Boolean.TRUE.equals(domainPatElectiveList.getReferral().isRTTClockImpact()) && domainPatElectiveList.getReferral().getJourney() != null)
		{
			// WDEV-23646 - Ensure the correct event Date Time is used when creating a new RTT Status
			// Adding a record to elective list, the authoring datetime (date on list) should be used
			Date eventDateTime = record.getDateOnList().getDate();
			updateRTTStatus(domainPatElectiveList.getReferral(), source, eventDateTime);
		}
		
		return PatientElectiveListAddLaterVoAssembler.create(domainPatElectiveList);
	}


	
	private RTTClockImpactSource getClockImpactSource(PatientElectiveListAddLaterVo record)
	{
		if (record == null)
			throw new CodingRuntimeException("Cannot determine the source of impact.");
		
		
		if (ElectiveAdmissionType.BOOKED_TYPE12.equals(record.getElectiveAdmissionType()) || ElectiveAdmissionType.ELECTIVE_TYPE11.equals(record.getElectiveAdmissionType()))
		{
			if (ElectiveListReason.TREATMENT.equals(record.getElectiveListReason()))
				return RTTClockImpactSource.ADD_WAITING_LIST_TREATMENT;
				
			if (ElectiveListReason.DIAGNOSTIC.equals(record.getElectiveListReason()))
				return RTTClockImpactSource.ADD_WAITING_LIST_DIAGNOSTIC;
		}
		else if (ElectiveAdmissionType.PLANNED_TYPE13.equals(record.getElectiveAdmissionType()))
		{
			if (ElectiveListReason.TREATMENT.equals(record.getElectiveListReason()))
				return RTTClockImpactSource.ADD_PLANNED_SURVEILLANCE_LIST_TREATMENT;
				
			if (ElectiveListReason.DIAGNOSTIC.equals(record.getElectiveListReason()))
				return RTTClockImpactSource.ADD_PLANNED_SURVEILLANCE_LIST_DIAGNOSTIC;
		}
		
		throw new CodingRuntimeException("Cannot determine the source of impact.");
	}

	
	// WDEV-23646 - Ensure the correct event Date Time is used when creating a new RTT Status
	private void updateRTTStatus(CatsReferral referral, RTTClockImpactSource source, Date eventDateTime) throws StaleObjectException
	{
		if (Boolean.FALSE.equals(referral.isRTTClockImpact()) || referral.getJourney().getCurrentClock() == null) //WDEV-23206
			return;
		
		if (referral.getJourney() == null)
			throw new CodingRuntimeException("Referral should have had a Journey created at this point.");
		
		PathwayClock initialClock = referral.getJourney().getCurrentClock();
		PathwayClock finalClock = referral.getJourney().getCurrentClock();
		
		PathwayRTTStatus initialStatus = referral.getJourney().getCurrentClock().getCurrentRTTStatus();

		// Determine status point to be used
		Integer newStatusPoint = getNewStatusPointToCreate(initialStatus);

		PathwayRTTStatus finalStatus = createNewRTTStatus(newStatusPoint, eventDateTime);
		
		referral.setCurrentRTTStatus(finalStatus);
		referral.getJourney().getCurrentClock().setCurrentRTTStatus(finalStatus);
		referral.getJourney().getCurrentClock().getRTTStatusHistory().add(finalStatus);
		
		// Create the RTT Clock Impact
		PathwaysRTTClockImpact clockImpact = createRTTClockImpactRecord(initialClock, finalClock, initialStatus, finalStatus, null, referral.getJourney(), source);
		
		referral.getRTTClockImpacts().add(clockImpact);
		
		getDomainFactory().save(referral);
	}

	
	private Integer getNewStatusPointToCreate(PathwayRTTStatus initialStatus)
	{
		if (initialStatus == null || initialStatus.getRTTStatus() == null)
			return SUBSEQUENT_ACTIVITI_DURING_REFERRAL_TREATMENT_PERIOD;
		
		if (START_OF_FIRST_DEFINITIVE_TREATMENT.equals(initialStatus.getRTTStatus().getNationalCode()) 
				|| AFTER_TREATMENT_FIRST_TREATMENT_OCCURED.equals(initialStatus.getRTTStatus().getNationalCode()))
			return AFTER_TREATMENT_FIRST_TREATMENT_OCCURED;
		
		if (START_OF_ACTIVE_MONITORING_BY_PATIENT.equals(initialStatus.getRTTStatus().getNationalCode())
				|| START_OF_ACTIVE_MONITORING_BY_CARE_PROFESIONAL.equals(initialStatus.getRTTStatus().getNationalCode())
				|| ACTIVE_MONITORING_CARE_ACTIVITY_DURING_MONITORING.equals(initialStatus.getRTTStatus().getNationalCode()))
			return ACTIVE_MONITORING_CARE_ACTIVITY_DURING_MONITORING;

		return SUBSEQUENT_ACTIVITI_DURING_REFERRAL_TREATMENT_PERIOD;
	}

	// WDEV-23646 - Ensure the correct event Date Time is used when creating a new RTT Status
	private PathwayRTTStatus createNewRTTStatus(Integer nationalCode, Date eventDateTime)
	{
		if (nationalCode == null)
			return null;
		
		PathwayRTTStatus status = new PathwayRTTStatus();
		status.setRTTStatus(getRTTStatusPoint(nationalCode));
		status.setStatusDateTime(eventDateTime);
		
		Object mos = getMosUser();
		if (mos instanceof MemberOfStaffLiteVo)
		{
			status.setStatusBy((MemberOfStaff) getDomainFactory().getDomainObject(MemberOfStaff.class, ((MemberOfStaffLiteVo) mos).getID_MemberOfStaff()));
		}

		return status;
	}

	
	private RTTStatusPoint getRTTStatusPoint(Integer nationalCode)
	{
		if (nationalCode == null)
			return null;
		
		String query = "SELECT statusPoint FROM RTTStatusPoint AS statusPoint WHERE statusPoint.nationalCode = :NAT_CODE";
		
		return (RTTStatusPoint) getDomainFactory().findFirst(query, "NAT_CODE", nationalCode);
	}

	private PathwaysRTTClockImpact createRTTClockImpactRecord(PathwayClock initialClock, PathwayClock finalClock, PathwayRTTStatus initialStatus, PathwayRTTStatus finalStatus,
																RTTStatusEventMap eventMap, PatientPathwayJourney journey, RTTClockImpactSource source)
	{
		PathwaysRTTClockImpact clockImpact = new PathwaysRTTClockImpact();
		
		clockImpact.setInitialClock(initialClock);
		clockImpact.setFinalClock(finalClock);
		clockImpact.setInitialRTTStatus(initialStatus);
		clockImpact.setFinalRTTStatus(finalStatus);
		
		clockImpact.setOutcomeEvent(eventMap);
		clockImpact.setJourney(journey);
		clockImpact.setSource(getDomLookup(source));
		
		clockImpact.setInitialClockState(getClockState(initialClock));
		clockImpact.setFinalClockState(getClockState(finalClock));
		
		
		clockImpact.setClockStarted(Boolean.FALSE);
		clockImpact.setClockStopped(Boolean.FALSE);
		
		//  Case 1 - If there was not clock initially and one clock was created
		if (initialClock == null && finalClock != null)
		{
			// New clock has a start date - mark the Clock Impact
			if (finalClock.getStartDate() != null)
				clockImpact.setClockStarted(Boolean.TRUE);
			
			if (finalClock.getStopDate() != null)
				clockImpact.setClockStopped(Boolean.TRUE);
		}
		
		// Case 2 - If there was a clock initially and there is no clock now
		if (initialClock != null && finalClock == null)
		{
			clockImpact.setClockStopped(Boolean.TRUE);
		}
		
		// Case 3 - If there was an initial clock and a clock is present now
		if (initialClock != null && finalClock != null)
		{
			// Case 3.1 - Initial and current clock are the same one
			if (initialClock.getId() == finalClock.getId())
			{
				if (initialClock.getStopDate() == null && finalClock.getStopDate() != null)
					clockImpact.setClockStopped(Boolean.TRUE);
				
				if (initialClock.getStopDate() != null && finalClock.getStopDate() == null)
					clockImpact.setClockStarted(Boolean.TRUE);
				
				if (initialClock.getStartDate() == null && finalClock.getStartDate() != null)
					clockImpact.setClockStarted(Boolean.TRUE);
			}
			
			// Case 3.2 - Initial and current clock are not ehe same one
			if (initialClock.getId() != finalClock.getId())
			{
				if (initialClock.getStopDate() == null)
					clockImpact.setClockStopped(Boolean.TRUE);
				
				if (finalClock.getStartDate() != null)
					clockImpact.setClockStarted(Boolean.TRUE);
				
				if (finalClock.getStopDate() != null)
					clockImpact.setClockStopped(Boolean.TRUE);
			}
			
		}

		return clockImpact;
	}


	private LookupInstance getClockState(PathwayClock clock)
	{
		if (clock == null)
			return getDomLookup(RTTClockState.NOT_PRESENT);
		
		if (clock.getStopDate() != null)
			return getDomLookup(RTTClockState.STOPPED);

		return getDomLookup(RTTClockState.STARTED);
	}

	
	public ims.RefMan.vo.CatsReferralforElectiveListDetailsVo getReferralDetails(ims.RefMan.vo.CatsReferralRefVo referralRef)
	{
		if(referralRef == null)
			throw new CodingRuntimeException("Cannot get Referral on null Ref");
		
		return CatsReferralforElectiveListDetailsVoAssembler.create((CatsReferral) getDomainFactory().getDomainObject(CatsReferral.class, referralRef.getID_CatsReferral()));
	
	}

	public ProcedureLiteVoCollection listProcedures(String name) throws DomainInterfaceException
	{
		ClinicalCoding impl = (ClinicalCoding) getDomainImpl(ClinicalCodingImpl.class);
		return impl.listProcLiteVo(name);
	}

	//wdev-19666
	public LocationLiteVoCollection getActiveHospitals(MemberOfStaffRefVo mos)
	{
		if (mos == null || !mos.getID_MemberOfStaffIsNotNull())
			return null;

		StringBuilder query = new StringBuilder();
		query.append("select location from MemberOfStaff as mos left join mos.locations as hcpLocation left join hcpLocation.location as location ");
		query.append(" where location.type = :LocType and location.isActive = :isActive and location.isVirtual = :isVirtual and mos.id = :mosID");
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		paramNames.add("LocType");
		paramValues.add(getDomLookup(LocationType.HOSP));

		paramNames.add("isActive");
		paramValues.add(Boolean.TRUE);

		paramNames.add("isVirtual");
		paramValues.add(Boolean.FALSE);

		paramNames.add("mosID");
		paramValues.add(mos.getID_MemberOfStaff());

		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(getDomainFactory().find(query.toString(), paramNames, paramValues));
	
	}

	
	//wdev-20561
	public LocationLiteVoCollection listWardsForHospital(LocationRefVo hospital, String value)
	{
		
		OrganisationAndLocation orgLoc = (OrganisationAndLocation) getDomainImpl(OrganisationAndLocationImpl.class);
		return orgLoc.listActiveWardsForHospitalByNameLite(hospital, value);
	}
	//wdev-20561

	public PatientShort getPatientShort(PatientRefVo patRef)
	{
		if (patRef == null || patRef.getID_Patient() == null)
			return null;
		
		return PatientShortAssembler.create((Patient) getDomainFactory().getDomainObject(Patient.class, patRef.getID_Patient()));
	}
	//wdev-20561

	public ProcedureVoCollection listSurgicalProcedures(String name, Specialty specialty, Boolean allProceduresORHotlist) throws DomainInterfaceException
	{
		ClinicalCoding impl = (ClinicalCoding) getDomainImpl(ClinicalCodingImpl.class);
		return impl.listProcedureVo(name, Boolean.FALSE, Boolean.FALSE, null,specialty, allProceduresORHotlist);	//wdev-21151
	}
	
	//wdev-20561

	public ProcedureVoCollection listMedicalProcedures(String name, Specialty specialty, Boolean allProceduresORHotlist) throws DomainInterfaceException
	{
		ClinicalCoding impl = (ClinicalCoding) getDomainImpl(ClinicalCodingImpl.class);
		return impl.listProcedureVo(name, Boolean.TRUE, null, null,specialty, allProceduresORHotlist);				//wdev-21151
	}
	//wdev-20561

	public ProcedureVoCollection listEndoscopyProcedures(String name,Specialty specialty, Boolean allProceduresORHotlist) throws DomainInterfaceException
	{
		ClinicalCoding impl = (ClinicalCoding) getDomainImpl(ClinicalCodingImpl.class);
		return impl.listProcedureVo(name,null, Boolean.TRUE, null,specialty, allProceduresORHotlist);				//wdev-21151
	}

	public ElectiveListConfigurationWLVoCollection getElectiveListConfigByService(String filter, Integer serviceId, HcpRefVo hcpRef) throws DomainInterfaceException
	{
		return getElectiveListConfigByService(filter, serviceId, hcpRef, null);
	}
	
	//WDEV-23222
	public ElectiveListConfigurationWLVoCollection getElectiveListConfigByService(String filter, Integer serviceId, HcpRefVo hcpRef, Boolean isDefaultHCP) throws DomainInterfaceException
	{
		DomainFactory factory = getDomainFactory();

		StringBuffer hqlConditions = new StringBuffer();
		
		
		StringBuffer hql = new StringBuffer("select wLC from ElectiveListConfiguration as wLC left join wLC.hCPs as e2_1 left join e2_1.hCP as h1_1");
		
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();

		String andStr = "";

		if( filter != null)
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" UPPER(wLC.waitingListName) like :WaitingListName ");
			markers.add("WaitingListName");
			values.add(filter.toUpperCase()+"%");
			andStr = " and ";
		}
		
		if( serviceId != null)
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" wLC.service.id = :Service ");
			markers.add("Service");
			values.add(serviceId);
			andStr = " and ";
		}
		if( hcpRef != null )
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" h1_1.id = :Hcp ");
			markers.add("Hcp");
			values.add(hcpRef.getID_Hcp());
			andStr = " and ";
			
			if (isDefaultHCP!=null) //WDEV-23222
			{
				hqlConditions.append(andStr);
				hqlConditions.append(" e2_1.defaultForHCP = 1 ");
				andStr = " and ";
			}
		}
		
    		hqlConditions.append(andStr);
    		hqlConditions.append(" wLC.isActive = :isActive ");
    		markers.add("isActive");
    		values.add(Boolean.TRUE);
    		andStr = " and ";
		
		if (hqlConditions.length() > 0)
		{
			hqlConditions.insert(0, " where (");
			hqlConditions.append(" ) ");
		}

		List<?> list = factory.find((hql.toString() + hqlConditions.toString() + "order by UPPER(wLC.waitingListName) asc ").toString(), markers, values);

		if (list == null || list.size() == 0)
			return null;

		return ElectiveListConfigurationWLVoAssembler.createElectiveListConfigurationWLVoCollectionFromElectiveListConfiguration(list);
		
	}

	public Boolean isLoggedInUserForService(HcpRefVo hcpRef, ServiceRefVo serviceRef)
	{
		if( hcpRef == null || serviceRef == null)
			return null;
			
		/*CatsReferral doCatsReferral = (CatsReferral) getDomainFactory().getDomainObject(CatsReferral.class, catsReferralRef.getID_CatsReferral());*/
		StringBuilder query = new StringBuilder("SELECT h1_1 FROM ");
		query.append(" Hcp as h1_1 left join h1_1.serviceFunction as h2_1 left join h2_1.service as s1_1 ");
		query.append(" WHERE( h1_1.id = :HcpM and h2_1.service.id =:serviceM ) ");
				
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		paramNames.add("HcpM");		paramValues.add(hcpRef.getID_Hcp());
		paramNames.add("serviceM");		paramValues.add(serviceRef.getID_Service());
		
		
		List hcps = getDomainFactory().find(query.toString(), paramNames, paramValues);
		
		if( hcps != null && hcps.size() > 0)
		{
			
			HcpLiteVoCollection coll = HcpLiteVoAssembler.createHcpLiteVoCollectionFromHcp(hcps);
			if( coll != null && coll.size() > 0)
				return true;
			
		}
		return false;
	}

	//WDEV-21037
	public PatientElectiveListAddLaterVo saveSuitableForTelephonePreAssessment(PatientElectiveListAddLaterVo patientElectiveList) throws StaleObjectException
	{
		if (patientElectiveList == null)
		{
			throw new CodingRuntimeException("Cannot save null PatientElectiveListVo");
		}

		DomainFactory factory = getDomainFactory();
		
		PatientElectiveList domainPatElectiveList = PatientElectiveListAddLaterVoAssembler.extractPatientElectiveList(factory, patientElectiveList);
		
		factory.save(domainPatElectiveList);
		return PatientElectiveListAddLaterVoAssembler.create(domainPatElectiveList);
	}

	public Boolean isLoggedInUserMedicByHcpAndService(HcpRefVo hCpRef, ServiceRefVo serviceRef)
	{
		if( hCpRef == null || serviceRef == null)
			return false;
		
		StringBuilder query = new StringBuilder("select distinct m1_1 from Medic as m1_1 left join m1_1.serviceFunction as h1_1 left join h1_1.service as s1_1 where(m1_1.id = :hcpId and s1_1.id = :serviceId and m1_1.isHCPaResponsibleHCP = 1)");
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		paramNames.add("hcpId");		paramValues.add(hCpRef.getID_Hcp());
		paramNames.add("serviceId");		paramValues.add(serviceRef.getID_Service());
		
		
		List hcps = getDomainFactory().find(query.toString(), paramNames, paramValues);
		
		if( hcps != null && hcps.size() > 0)
		{
			
			HcpLiteVoCollection coll = HcpLiteVoAssembler.createHcpLiteVoCollectionFromHcp(hcps);
			if( coll != null && coll.size() > 0)
				return true;
			
		}
		return false; 

		
		
	}

	public HcpLiteVoCollection getMedicsByServices(ServiceRefVo serviceRef, String name, MedicGrade medicgrade)
	{
		if(name == null || (name != null && name.length() == 0))
			return null;
			//throw new DomainRuntimeException("Can not search on null name.");
		
		StringBuffer hqlConditions = new StringBuffer();

		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		String andStr = "";

		String hql = "select medic from Medic as medic left join medic.serviceFunction as h1_1 left join h1_1.service as s1_1 where medic.isActive = 1 and (medic.mos.name.upperSurname like :hcpSname or medic.mos.name.upperForename like :hcpFname)";
		markers.add("hcpSname");
		values.add(name.toUpperCase() + "%");
		markers.add("hcpFname");
		values.add(name.toUpperCase() + "%");
		andStr = " and ";
		
		if (medicgrade != null)
		{
			hqlConditions.append(andStr+ " medic.grade.id =:idMedicGrade");
			markers.add("idMedicGrade");
			values.add(getDomLookup(medicgrade).getId());
			andStr = " and ";
		}
		if( serviceRef != null )
		{
			hqlConditions.append(andStr + " s1_1.id =:idService");
			markers.add("idService");
			values.add(serviceRef.getID_Service());
			andStr = " and ";
		}
		
		/*if( medicType != null)
		{
			hqlConditions.append(andStr + " medic.medicType.id =:idMedicType");
			markers.add("idMedicType");
			values.add(getDomLookup(medicType).getId());
			andStr = " and ";
		}*/
		
		
		hqlConditions.append(" and medic.isHCPaResponsibleHCP = :isRespHcp");
		markers.add("isRespHcp");
		values.add(Boolean.TRUE);
		
		
		DomainFactory factory = getDomainFactory();
		List<?> list = factory.find((hql + hqlConditions.toString() + " order by medic.mos.name.upperSurname , medic.mos.name.upperForename asc").toString(), markers, values,400);
		 
		if (list != null && list.size() > 0)
			return HcpLiteVoAssembler.createHcpLiteVoCollectionFromHcp(list);
			
			
		return null;
	}
	//wdev-21151

	public PatientElectiveListAddLaterVo saveAndMarkAsRie(PatientElectiveListAddLaterVo record, FormName formName, Integer patId, Integer contactId, Integer careContextId, String comment) throws StaleObjectException, UniqueKeyViolationException
	{
		if (record == null)
		{
			throw new CodingRuntimeException("Cannot save null PatientElectiveListVo");
		}

		DomainFactory factory = getDomainFactory();
		
		Booking_AppointmentRefVo tempRefVo = record.getCreatingAppointment();
		record.setCreatingAppointment(null);
		record.setAppointmentOutcomeAction(null);
		PatientElectiveList domainPatElectiveList = PatientElectiveListAddLaterVoAssembler.extractPatientElectiveList(factory, record);
		
		factory.save(domainPatElectiveList);
		
		if( tempRefVo != null )
		{
			BookingAppointmentOutcomeVo tempVo = getBookingAppointmentOutcomeVo(tempRefVo);
			if( tempVo != null )
			{
				
				if( tempVo != null || tempVo.getOutcomeActions() != null)
				{
					
    				boolean removeApptaction = false;
    				AppointmentOutcomeActionVo  tempAction = null;
        			for( int i = tempVo.getOutcomeActions().size() - 1; i >= 0; i--)
        			{
        				AppointmentOutcomeActionVo action = tempVo.getOutcomeActions().get(i);
        		
        				if( ElectiveAdmissionType.PLANNED_TYPE13.equals(record.getElectiveAdmissionType()))
        				{
            				if( action.getAppointmentAction().equals(AppointmentAction.PLANNED_LIST_ACTION))
            				{
            					
            						//tempAction = action;
            						tempVo.getOutcomeActions().remove(action);
            						removeApptaction = true;
            						break;
            						
            					
            				}
        				}
        				else if( ElectiveAdmissionType.BOOKED_TYPE12.equals(record.getElectiveAdmissionType()))
        				{
        					if( action.getAppointmentAction().equals(AppointmentAction.WAITING_LIST_ACTION) )
            				{
            					
            						
        							//tempAction = action;
            						tempVo.getOutcomeActions().remove(action);
            						removeApptaction = true;
            						break;
            						
            					
            				}
        				}
        				else if( ElectiveAdmissionType.ELECTIVE_TYPE11.equals(record.getElectiveAdmissionType()))
        				{
        					if( action.getAppointmentAction().equals(AppointmentAction.WAITING_LIST_ACTION) )
            				{
            					
        						
        							tempAction = action;
            						tempVo.getOutcomeActions().remove(action);
            						removeApptaction = true;
            						break;
            						
            					
            				}
        				}
        			}
        			
        			if( removeApptaction == true)
        			{
        				
        				//factory.markAsRie(AppointmentOutcomeAction.class, tempAction.getID_AppointmentOutcomeAction(), null, record.getPatient().getID_Patient(), null, null, "RIE Patient Elective List.");
        				tempVo.validate();
        				Booking_Appointment doAppt = BookingAppointmentOutcomeVoAssembler.extractBooking_Appointment(factory, tempVo);
        				
        				factory.save(doAppt);
        			
        			}
				}
			
			}
		}
		
		markAsRie(record,formName,patId,contactId,careContextId,comment);
				
		return null;
	}
	
	private BookingAppointmentOutcomeVo getBookingAppointmentOutcomeVo(Booking_AppointmentRefVo refVo)
	{
		if( refVo == null )
			return null;
		
		return BookingAppointmentOutcomeVoAssembler.create((Booking_Appointment) getDomainFactory().getDomainObject(Booking_Appointment.class, refVo.getID_Booking_Appointment()));
		
	}

	//wdev-22465
	public HcpLiteVo getHCPLiteFromReferral(CatsReferralRefVo referralRef)
	{
		
		if( referralRef == null)
			throw new CodingRuntimeException("Cannot get Referral on null Ref");
	
		
	/*	StringBuilder query = new StringBuilder();
		query.append("select h1_1.id	from CatsReferral as c1_1 left join c1_1.referralDetails as r1_1 left join r1_1.consultant as h1_1 ");
		query.append(" where (c1_1.id =  :ReferralID) ");
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		paramNames.add("ReferralID");
		paramValues.add(referralRef.getID_CatsReferral());

		DomainFactory factory = getDomainFactory();
		List<?> hcp = factory.find(query.toString(), paramNames, paramValues);
		
		if( hcp != null && hcp.size() > 0)
		{
			return HcpLiteVoAssembler.create((Hcp) hcp.get(0));
		}*/
			
		
		
		
		
		
			

		
		CatsReferral doCatsReferral = (CatsReferral) getDomainFactory().getDomainObject(CatsReferral.class, referralRef.getID_CatsReferral());
		if( doCatsReferral != null )
		{
			return HcpLiteVoAssembler.create(doCatsReferral.getReferralDetails().getConsultant());
		}
		

		return null;
	}
	//wdev-22465
	public HcpLiteVo getHcpLiteFromMedic(HcpRefVo hcpRef)
	{
		if( hcpRef == null)
			return null;
		
		Hcp doHcp = (Hcp) getDomainFactory().getDomainObject(Hcp.class, hcpRef.getID_Hcp());
		
		return HcpLiteVoAssembler.create(doHcp);
	}
	
	
}
