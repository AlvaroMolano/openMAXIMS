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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseReferralAppointmentDetailsComponentImpl extends DomainImpl implements ims.RefMan.domain.ReferralAppointmentDetailsComponent, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validategetBookingAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appt)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetServiceAndActivityByAppt(ims.scheduling.vo.Booking_AppointmentRefVo appt, Boolean isFlexible)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatecancelAppt(ims.scheduling.vo.Booking_AppointmentVo appt, ims.chooseandbook.vo.lookups.ActionRequestType requestType, String requestSource)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCatsReferral(ims.RefMan.vo.CatsReferralRefVo voCatsRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveCatsReferral(ims.RefMan.vo.CatsReferralVo record)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistSpecimenWorKlistItemsForCatsReferral(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
		if(catsReferral == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'catsReferral' of type 'ims.RefMan.vo.CatsReferralRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateupdateCatsReferralAdditionalInvStatus(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validateupdateCatsReferralAdditionalInvStatus(ims.RefMan.vo.CatsReferralRefVo catsReferral, ims.scheduling.vo.Booking_AppointmentRefVo appt)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveOrderInv(ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo voOrderInv)
	{
		if(voOrderInv == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'voOrderInv' of type 'ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatesaveOrdInvApptAndUpdateCatsReferral(ims.RefMan.vo.OrderInvApptListVo ordInvAppt, ims.RefMan.vo.CatsReferralRefVo catsRef)
	{
		if(ordInvAppt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'ordInvAppt' of type 'ims.RefMan.vo.OrderInvApptListVo' cannot be null.");
		if(catsRef == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'catsRef' of type 'ims.RefMan.vo.CatsReferralRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetTheatreServiceProcedureAndConsultant(ims.scheduling.vo.Booking_AppointmentRefVo appt)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetTheatreAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appt)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateupdateCatsReferralCancelStatus(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistAppointmentHistory(ims.scheduling.vo.Booking_AppointmentRefVo appointment)
	{
		if(appointment == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appointment' of type 'ims.scheduling.vo.Booking_AppointmentRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateisReferralICPCompleted(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validategetWaitingListForReferral(ims.RefMan.vo.CatsReferralRefVo referralRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatecancelTCI(ims.RefMan.vo.PatientElectiveListRefVo patientWaitingListRef, ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo tciOutcome, ims.scheduling.vo.Booking_AppointmentRefVo theatreApptThatIsNotCancelled)
	{
	}

	@SuppressWarnings("unused")
	public void validatecancelTCIAndReferralEROD(ims.RefMan.vo.CatsReferralRefVo catsReferral, ims.scheduling.vo.Booking_AppointmentRefVo apptRef,  ims.scheduling.vo.lookups.CancelAppointmentReason cancellationReason, String cancellationComments, Boolean isProviderCancellation, Boolean isPatientCancellation, Boolean cancelledForNonmedicalReason)
	{
	}

	@SuppressWarnings("unused")
	public void validatethereAreActivePatientElectiveListsForCurrentCatsReferral(ims.RefMan.vo.CatsReferralRefVo catsReferralVo)
	{
		if(catsReferralVo == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'catsReferralVo' of type 'ims.RefMan.vo.CatsReferralRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetCatsReferralStatus(ims.RefMan.vo.CatsReferralRefVo catsReferralRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetFutureAppointmentsForReferral(ims.RefMan.vo.CatsReferralRefVo referral)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveFutureAppointment(ims.scheduling.vo.FutureAppointmentDetailsVo futureAppointment)
	{
	}

	@SuppressWarnings("unused")
	public void validategetFutureAppointmentDetails(ims.scheduling.vo.FutureAppointmentDetailsRefVo futureAppt)
	{
	}

	@SuppressWarnings("unused")
	public void validategetServiceFunction(ims.core.clinical.vo.ServiceRefVo service, ims.core.vo.lookups.ServiceFunction function)
	{
	}

	@SuppressWarnings("unused")
	public void validategetElectiveListManagement(ims.RefMan.vo.PatientElectiveListRefVo electiveList)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistPendingEmergencyTheatreRecords(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPendingEmergencyTheatre(ims.scheduling.vo.PendingEmergencyTheatreRefVo pendingEmergencyTheatre)
	{
	}

	@SuppressWarnings("unused")
	public void validatesavePendingEmergencyTheatre(ims.scheduling.vo.PendingEmergencyTheatreVo pendingEmergencyTheatre)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveWaitingListCard(ims.RefMan.vo.PatientElectiveListAddLaterVo record)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatientElectiveListForAppt(ims.scheduling.vo.Booking_AppointmentRefVo appointment)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPendingEmergencyTheatreForAppt(ims.scheduling.vo.Booking_AppointmentRefVo appointment)
	{
	}

	@SuppressWarnings("unused")
	public void validateupdateLocalPatientWithPds(ims.core.vo.Patient lpiPatient, ims.core.vo.Patient pdsPatient, java.util.ArrayList errors, String samlXml, ims.framework.interfaces.IAppRole appRole, ims.core.vo.MissingMappingVoCollection missingMappings)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatient(ims.core.vo.PatientShort patient)
	{
	}

	@SuppressWarnings("unused")
	public void validateisAnyTimeRecordedAgainstCaseDetails(ims.scheduling.vo.Booking_AppointmentRefVo theatreApptRef)
	{
	}

	@SuppressWarnings("unused")
	public void validateupdateBookingComment(ims.scheduling.vo.Booking_AppointmentRefVo apptRefVo, String commentString)
	{
	}
}
