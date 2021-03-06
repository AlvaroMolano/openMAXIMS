// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain;

// Generated from form domain impl
public interface BookTheatreSlotDetailDialog extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* saveBooking
	*/
	public ims.scheduling.vo.Sch_BookingTheatreVo saveTheatreBooking(ims.scheduling.vo.Sch_BookingTheatreVo booking, ims.RefMan.vo.CatsReferralRefVo catsReferral, ims.scheduling.vo.SessionParentChildSlotRefVoCollection voCollChildSlots, ims.scheduling.vo.SessionParentChildSlotVo voSessParentChildSlot, ims.scheduling.vo.lookups.TheatreType theatreType, ims.RefMan.vo.ReferralERODForBookTheatreVo regerralEROD, ims.RefMan.vo.PatientElectiveListVo patientElectiveListToSave) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* getBookingTheatreAppointment
	*/
	public ims.scheduling.vo.BookingAppointmentTheatreVo getBookingTheatreAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appt);

	// Generated from form domain interface definition
	/**
	* getPatientICP
	*/
	public ims.icp.vo.PatientICPFullVo getPatientICP(ims.core.admin.vo.CareContextRefVo careContext);

	// Generated from form domain interface definition
	/**
	* savePatientICP
	*/
	public ims.icp.vo.PatientICPFullVo savePatientICP(ims.icp.vo.PatientICPFullVo icp) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public Boolean hasTheatreEROD(ims.RefMan.vo.CatsReferralRefVo catsReferral);

	// Generated from form domain interface definition
	public ims.RefMan.vo.ReferralERODVo getReferralERODByAppointment(ims.scheduling.vo.Booking_AppointmentRefVo apptRef);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CatsReferralForNewElectivListEntryVo getCatsReferral(ims.RefMan.vo.CatsReferralRefVo catsReferralRef);

	// Generated from form domain interface definition
	public ims.core.vo.LocationLiteVoCollection listWardsForCurrentLocation(ims.framework.interfaces.ILocation location);

	// Generated from form domain interface definition
	public ims.RefMan.vo.PatientElectiveListVoCollection getPatientElectiveList(ims.core.patient.vo.PatientRefVo patientRef, ims.RefMan.vo.CatsReferralRefVo catsRef, ims.core.clinical.vo.ServiceRefVo serviceRef, ims.core.clinical.vo.ProcedureRefVo procedureRef, String listIdHcp, ims.RefMan.vo.CatsReferralForNewElectivListEntryVo catsReferralWithPathwayClock, Boolean nonDiagnosticELE);

	// Generated from form domain interface definition
	public ims.core.vo.HcpMinVo getHCPMin(ims.core.resource.people.vo.HcpRefVo hcpRef);

	// Generated from form domain interface definition
	public ims.core.vo.HcpLiteVo getHCPLiteVo(ims.core.resource.people.vo.HcpRefVo hcpRef);

	// Generated from form domain interface definition
	public ims.RefMan.vo.PatientElectiveListVo getPatientElectiveListsOnFormOpen(ims.RefMan.vo.CatsReferralRefVo catsRef, ims.core.clinical.vo.ServiceRefVo serviceRef, String listIdHcp, Boolean nonDiagnosticELE, ims.RefMan.vo.CatsReferralForNewElectivListEntryVo getPatientElectiveList);

	// Generated from form domain interface definition
	public ims.admin.vo.ElectiveListConfigurationVoCollection getElectiveListConfigurationOnFormOpen(ims.core.clinical.vo.ServiceRefVo serviceRef, ims.core.resource.place.vo.LocationRefVo locationRef, String listIdHcp);

	// Generated from form domain interface definition
	public ims.core.vo.LocationLiteVo getParentHospitalLocation(ims.core.vo.LocationLiteVo wardLoc);
}
