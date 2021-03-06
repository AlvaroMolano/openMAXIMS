// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain;

// Generated from form domain impl
public interface DayCaseAdmissionDialog extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.core.vo.LocShortMappingsVoCollection listActiveWardsForHospital(ims.core.resource.place.vo.LocationRefVo hospital);

	// Generated from form domain interface definition
	public ims.core.vo.CareContextShortVo admitPatient(ims.core.vo.PatientShort patVo, ims.core.vo.InpatientEpisodeVo episVo, ims.scheduling.vo.Booking_AppointmentRefVo bookingApptVoRef, ims.RefMan.vo.CatsReferralWizardVo voCats, ims.RefMan.vo.PatientElectiveListBedAdmissionVo electiveList, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection electiveListToBeCancelled) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* listActiveMedics
	*/
	public ims.core.vo.MedicLiteVoCollection listActiveMedics(String szName);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CatsReferralWizardVo getCatsReferralWizardVoForCareContext(ims.core.admin.vo.CareContextRefVo voCarecontext);

	// Generated from form domain interface definition
	/**
	* getCatsReferral
	*/
	public ims.RefMan.vo.CatsReferralWizardVo getCatsReferral(ims.scheduling.vo.Booking_AppointmentRefVo voBookingRefVo);

	// Generated from form domain interface definition
	/**
	* Function used to retrieve specialty associated to referral service. (Has to be retrieved based on Appointment - no other context information is available)
	*/
	public ims.core.vo.lookups.Specialty getReferralSpecialty(ims.scheduling.vo.Booking_AppointmentRefVo bookingAppointment);

	// Generated from form domain interface definition
	public ims.RefMan.vo.PatientElectiveListBedAdmissionVo getPatientElectiveListForAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appointment);

	// Generated from form domain interface definition
	public Boolean hasPatientElectiveListsToBeCancelled(ims.core.patient.vo.PatientRefVo patient, ims.RefMan.vo.PatientElectiveListRefVo patientElectiveList, ims.core.clinical.vo.ServiceRefVo service);

	// Generated from form domain interface definition
	public ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection getDifferentPatientElectiveListForService(ims.core.patient.vo.PatientRefVo patient, ims.RefMan.vo.PatientElectiveListRefVo electiveList, ims.core.clinical.vo.ServiceRefVo service);
}
