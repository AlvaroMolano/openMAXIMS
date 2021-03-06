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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 4892.20548)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.emergency.domain.impl;


import java.util.ArrayList;
import java.util.List;

import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.domain.EDPartialAdmissionDialog;
import ims.emergency.domain.base.impl.BaseTransferDialogImpl;
import ims.emergency.domain.objects.EDPartialAdmission;
import ims.emergency.domain.objects.EDTransfer;
import ims.emergency.domain.objects.ReferralToSpecTeam;
import ims.emergency.domain.objects.Tracking;
import ims.emergency.vo.EDPartialAdmissionVo;
import ims.emergency.vo.EDTransferVo;
import ims.emergency.vo.EDTransferVoCollection;
import ims.emergency.vo.ReferralToSpecialtyTeamVo;
import ims.emergency.vo.TrackingForTransferVo;
import ims.emergency.vo.TrackingRefVo;
import ims.emergency.vo.domain.EDPartialAdmissionVoAssembler;
import ims.emergency.vo.domain.EDTransferVoAssembler;
import ims.emergency.vo.domain.ReferralToSpecialtyTeamVoAssembler;
import ims.emergency.vo.domain.TrackingForTransferVoAssembler;
import ims.emergency.vo.domain.TrackingVoAssembler;
import ims.emergency.vo.lookups.AllocationStatus;
import ims.framework.exceptions.CodingRuntimeException;

public class TransferDialogImpl extends BaseTransferDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ims.emergency.vo.EDTransferVo saveEDTransfer(EDTransferVo record, TrackingForTransferVo trackingRecord, EDTransferVo previousRecord, ReferralToSpecialtyTeamVo referralToSpecialty) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if(record == null && trackingRecord == null)
			throw new CodingRuntimeException("Cannot save a null EDTransfer / Tracking / Partial Admission record.");
				
		DomainFactory factory = getDomainFactory();
		
		EDTransfer doEDTransfer = null;
		
		if (referralToSpecialty!=null)
		{
			ReferralToSpecTeam domainReferralToSpecialtyToBeSaved = ReferralToSpecialtyTeamVoAssembler.extractReferralToSpecTeam(factory, referralToSpecialty);
			factory.save(domainReferralToSpecialtyToBeSaved);	
			trackingRecord.setCurrentReferral(null);			
		
			Tracking doTracking = TrackingForTransferVoAssembler.extractTracking(factory, trackingRecord);
			factory.save(doTracking);
			trackingRecord = TrackingForTransferVoAssembler.create(doTracking);
			trackingRecord.validate();	
		}
		
		if (previousRecord != null)
		{
			EDTransfer prevRecord = EDTransferVoAssembler.extractEDTransfer(factory, previousRecord);
			prevRecord.setNotAccepted(true);
			factory.save(prevRecord);
		}
		if (trackingRecord != null )
		{
			if (!trackingRecord.isValidated())
				throw new DomainRuntimeException("TrackingForTransferVo Not Validated.");
			
			Tracking trackingForTransfer =TrackingForTransferVoAssembler.extractTracking(factory, trackingRecord);
			factory.save(trackingForTransfer);
			TrackingForTransferVo tracking = TrackingForTransferVoAssembler.create(trackingForTransfer);
			if(tracking != null)
				return tracking.getCurrentTransferRecord();
		}
		
		if (record != null )
		{
			if (!record.isValidated())
				throw new DomainRuntimeException("EDTransferVo Not Validated.");
			
			doEDTransfer = EDTransferVoAssembler.extractEDTransfer(factory, record);	
			factory.save(doEDTransfer);
			return EDTransferVoAssembler.create(doEDTransfer);
		}
		
		return null;
	}

	public ims.emergency.vo.EDTransferVo getEDTransferVo(ims.emergency.vo.EDTransferRefVo edTransferRef)
	{
		if(edTransferRef == null || edTransferRef.getID_EDTransfer() == null)
			throw new CodingRuntimeException("Cannnot get EDTransferRefVo for a null Id.");
		
		return EDTransferVoAssembler.create((EDTransfer) getDomainFactory().getDomainObject(EDTransfer.class, edTransferRef.getID_EDTransfer()));
	}

	public TrackingForTransferVo getCurrentTrackingRecord(TrackingRefVo trackingRef) 
	{
		if (trackingRef == null || trackingRef.getID_Tracking() == null)
		{
			throw new CodingRuntimeException("Cannot get TrackingAreaRefVo on null Id for Tracking ");
		}

		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer();
		hql.append("select tracking from Tracking as tracking where tracking.id = :trackingID ");

		List<?> list = factory.find(hql.toString(), new String[] { "trackingID" }, new Object[] { trackingRef.getID_Tracking() });
	
		if (list!=null && list.size()>0)
		{	
			return TrackingForTransferVoAssembler.create((Tracking) list.get(0));
		}

		return null;
	}

	public EDTransferVoCollection getAllTransfersForTheSelectedAttendance(Integer careContextID) 
	{
		DomainFactory factory = getDomainFactory();

		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();

		if (careContextID == null)
		{
			throw new CodingRuntimeException("CareContextID cannot be null");
		}
		StringBuffer hql = new StringBuffer();

		hql.append(" select transfers from EDTransfer as transfers left join transfers.attendance as contextID where contextID.id = :contextID order by transfers.systemInformation.creationDateTime desc"); 
		markers.add("contextID");
		values.add(careContextID);

		return EDTransferVoAssembler.createEDTransferVoCollectionFromEDTransfer(factory.find(hql.toString(), markers, values));
	}

	public EDTransferVo getUncompletedTransferByCareContext(Integer careContextID)
	{
		if (careContextID == null)
		{
			throw new CodingRuntimeException("Cannot get SeenByHCPVoCollection on null Id for CareContext ");
		}

		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer();
		hql.append("select transfers from EDTransfer as transfers where transfers.attendance.id = :attID and transfers.acceptedDateTime is null and (transfers.notAccepted is null  or transfers.notAccepted = 0) order by transfers.referredDateTime desc ");

		List<?> list = factory.find(hql.toString(), new String[] { "attID" }, new Object[] { careContextID });

		if (list!=null && list.size()>0)
			return EDTransferVoAssembler.create((EDTransfer) list.get(0));
		
		return null;
	}

	public EDPartialAdmissionVo getTrackingWithEDPartialAdmission(TrackingRefVo trackingRef)
	{
		if(trackingRef == null || trackingRef.getID_Tracking() == null)
			throw new CodingRuntimeException("Cannot get Tracking record on null Tracking Id.");
	
		DomainFactory factory = getDomainFactory();
		Tracking doTracking = (Tracking) factory.getDomainObject(Tracking.class, trackingRef.getID_Tracking());
		
		EDPartialAdmission currentPartialAdm = null;
		if (doTracking != null)
			currentPartialAdm = doTracking.getCurrentPartialAdmission();
		
		return EDPartialAdmissionVoAssembler.create(currentPartialAdm);
	}

	public EDPartialAdmissionVo cancelCurrentPartialAdmission(EDPartialAdmissionVo edPartialAdmissionVo,TrackingForTransferVo trackingRecord) throws StaleObjectException
	{
		DomainFactory factory = getDomainFactory();
		if( edPartialAdmissionVo != null )
		{
			edPartialAdmissionVo.setAllocatedStatus(AllocationStatus.CANCELLED_ADMISSION);
			EDPartialAdmission  doEDPartialAdmission = EDPartialAdmissionVoAssembler.extractEDPartialAdmission(factory, edPartialAdmissionVo);
			factory.save(doEDPartialAdmission);
						
			if (trackingRecord != null)
			{
				Tracking dotrackingRecord = TrackingForTransferVoAssembler.extractTracking(factory, trackingRecord);
				dotrackingRecord.setCurrentPartialAdmission(null);
				dotrackingRecord.setBedAvailability(null);			
				factory.save(dotrackingRecord);
				
				EDPartialAdmissionDialog dom = (EDPartialAdmissionDialog) getDomainImpl(EDPartialAdmissionDialogImpl.class);
				try
				{
					dom.triggerCancelPartialAdmission(trackingRecord.getAttendance(), edPartialAdmissionVo);
				}
				catch (DomainInterfaceException e)
				{
					e.printStackTrace();
				}
			}
			
			return EDPartialAdmissionVoAssembler.create(doEDPartialAdmission);
		}
		return null;
	}

	public EDTransferVo getCurrentTransferRecord(Integer careContextID)
	{
		if (careContextID == null)
		{
			throw new CodingRuntimeException("CareContextID cannot be null");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer();

		hql.append(" select currTracking from Tracking as currTracking left join currTracking.attendance as att left join att.careContext as carConrext where carConrext.id = :contextID"); 

		List<?> list = factory.find(hql.toString(), new String[] { "contextID" }, new Object[] { careContextID });
		
		Tracking currentTracking = null;
		if (list!=null && list.size()>0)
			currentTracking = (Tracking) list.get(0);
		
		Object currentTransfer = null;
		if (currentTracking!= null)
		{
			currentTransfer = currentTracking.getCurrentTransferRecord();
			return EDTransferVoAssembler.create((EDTransfer) currentTransfer);
		}
	
		return null;
	}

	public Boolean wasReferralToSpecialtyTeamSaved(ReferralToSpecialtyTeamVo refToSpecialty)
	{
		if (refToSpecialty == null)
		{
			throw new CodingRuntimeException("refToSpecialty cannot be null");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer();

		hql.append(" select rts from ReferralToSpecTeam as rts where rts.id = :rtsID"); 
		List<?> list = factory.find(hql.toString(), new String[] { "rtsID" }, new Object[] { refToSpecialty.getID_ReferralToSpecTeam() });
		
		ReferralToSpecTeam referralToSpecialty = null;
		if (list!=null && list.size()>0)
			referralToSpecialty = (ReferralToSpecTeam) list.get(0);
		
		if (referralToSpecialty != null && referralToSpecialty.getCompletionDateTime() != null)
		{
			return true;
		}
		
		return false;		
	}
}
