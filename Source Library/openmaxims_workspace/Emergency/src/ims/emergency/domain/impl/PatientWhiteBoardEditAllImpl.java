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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 5196.25869)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.emergency.domain.impl;

import ims.core.admin.vo.CareContextRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.place.vo.LocationRefVo;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.DomainFactory;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.configuration.vo.TrackingAreaRefVo;
import ims.emergency.domain.ClinicianAssessmentWorklist;
import ims.emergency.domain.base.impl.BasePatientWhiteBoardEditAllImpl;
import ims.emergency.domain.objects.PatientWhiteboardRecord;
import ims.emergency.vo.PatientWhiteboardRecordVo;
import ims.emergency.vo.PatientWhiteboardRecordVoCollection;
import ims.emergency.vo.TrackingAreaShortVo;
import ims.emergency.vo.TrackingForWhiteBoardVoCollection;
import ims.emergency.vo.WhiteBoardConfigVo;
import ims.emergency.vo.domain.PatientWhiteboardRecordVoAssembler;
import ims.emergency.vo.domain.TrackingAreaShortVoAssembler;
import ims.emergency.vo.domain.TrackingForWhiteBoardVoAssembler;
import ims.emergency.vo.domain.WhiteBoardConfigVoAssembler;
import ims.emergency.vo.lookups.TrackingStatus;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.ILocation;

import java.util.ArrayList;
import java.util.List;

public class PatientWhiteBoardEditAllImpl extends BasePatientWhiteBoardEditAllImpl
{

	private static final long serialVersionUID = 1L;

	public ims.emergency.vo.TrackingAreaShortVoCollection listTrackingAreas(LocationRefVo edLoc)
	{
		if (edLoc == null || edLoc.getID_Location() == null)
			return null;		
		DomainFactory factory = getDomainFactory();
		String query = "select ta   from TrackingConfiguration as trc left join trc.areas as ta where ta.eDLocation.id = :EDLocationId and ta.status.id = :ActiveStatus and ta.isRegistrationArea = 0 order by index(ta)";//order by upper(ta.areaDisplayName)";
		List<?> list = factory.find(query, new String[] {"EDLocationId", "ActiveStatus"}, new Object[] {edLoc.getID_Location(), PreActiveActiveInactiveStatus.ACTIVE.getID()});
		
		if( list != null && list.size() > 0)
			return TrackingAreaShortVoAssembler.createTrackingAreaShortVoCollectionFromTrackingArea(list);
		
		
		return null;
	}
	
	public ims.core.vo.PatientShort getPatientShort(ims.core.patient.vo.PatientRefVo patientRef)
	{
		if (patientRef == null)
			return null;
		ClinicianAssessmentWorklist  emergImpl = (ClinicianAssessmentWorklist) getDomainImpl(ClinicianAssessmentWorklistImpl.class);
		return emergImpl.getPatientShort(patientRef);
	}

	public ims.core.vo.CareContextShortVo getCareContextShort(ims.core.admin.vo.CareContextRefVo careContextRef)
	{
		// TODO: Add your code here and change the return value.
		return null;
	}

	public TrackingForWhiteBoardVoCollection listTrackingPatients(TrackingAreaShortVo trackingArea, TrackingStatus trackingStatus, ILocation edLoc)
	{
		
		DomainFactory factory = getDomainFactory();
		
		StringBuilder hqlJoins = new StringBuilder("select tr from Tracking as tr left join tr.patient as p left join tr.attendance as att left join tr.currentArea as ta");
		StringBuilder hqlConditions = new StringBuilder();
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		String and = "";
		
		if( trackingArea != null )
		{
			if (trackingArea.getIsOverallViewIsNotNull() && trackingArea.getIsOverallView().equals(true))
    		{
				hqlConditions.append(and);
				hqlConditions.append(" ta.id is not null ");
				and = " and ";
    			
    		}
    		else
    		{
    			hqlConditions.append(and);
    			hqlConditions.append(" ta.id = :TrackingAreaId ");
    			paramNames.add("TrackingAreaId");
    			paramValues.add(trackingArea.getID_TrackingArea());
    			and = " and ";
    		}
		}
		
		if( edLoc != null)
		{
			hqlJoins.append(" left join tr.eDLocation as loc ");
			
			hqlConditions.append(and);
			hqlConditions.append(" loc.id = :locId ");
			paramNames.add("locId");
			paramValues.add(edLoc.getID());
			and = " and ";
		}
		else
		{
			if( trackingArea != null )
			{
				hqlJoins.append(" left join tr.eDLocation as loc ");
				
				hqlConditions.append(and);
				hqlConditions.append(" loc.id = :locId ");
				paramNames.add("locId");
				paramValues.add(trackingArea.getEDLocation().getID_Location());
				and = " and ";
			}
		}
		
		if( trackingStatus != null)
		{
						
			hqlJoins.append(" left join tr.currentStatus as cs left join cs.status as s ");
			
			hqlConditions.append(and);
			hqlConditions.append(" s.id = :statusId ");
			paramNames.add("statusId");
			paramValues.add(trackingStatus.getID());
			and = " and ";
		}
		
		if (hqlConditions.length()>0)
		{
			hqlConditions.insert(0, " where ");
		}
		
		List<?> patients = factory.find((hqlJoins.append( hqlConditions)).toString(), paramNames, paramValues);
		
		if( patients != null && patients.size() > 0 )
		{
			return TrackingForWhiteBoardVoAssembler.createTrackingForWhiteBoardVoCollectionFromTracking(patients);
		}
		
		return null;
	}

	public WhiteBoardConfigVo getEDWhiteBoardConfigByArea(TrackingAreaRefVo trackingAreaRef)
	{
		if(trackingAreaRef==null)
			throw new CodingRuntimeException("Cannot get EDWhiteBoardConfig value on null AreaID.");
		
		StringBuffer hql = new StringBuffer();
		hql.append("select whiteBoardCfg from WhiteBoardConfig as whiteBoardCfg ");
		hql.append("where whiteBoardCfg.currentArea.id = :areaID  and (whiteBoardCfg.isRIE is null or whiteBoardCfg.isRIE=0) ");
		
		DomainFactory factory = getDomainFactory();
		List<?> list = factory.find(hql.toString(), new String[] {"areaID"}, new Object[] {trackingAreaRef.getID_TrackingArea()});
		
		if (list!=null && list.size()>0)
		{
			return WhiteBoardConfigVoAssembler.createWhiteBoardConfigVoCollectionFromWhiteBoardConfig(list).get(0);
		}
		return null;
	}

	public PatientWhiteboardRecordVo getPatientWhiteBoardRecordByPatientAndCareContext(PatientRefVo patRef, CareContextRefVo careContextRef)
	{
		
		DomainFactory factory = getDomainFactory();
		
		StringBuilder hqlJoins = new StringBuilder("select p1_1 from PatientWhiteboardRecord as p1_1 left join p1_1.patient as p2_1 left join p1_1.attendance as c1_1");
		StringBuilder hqlConditions = new StringBuilder();
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		String and = "";
		
		if( patRef != null )
		{
			
    			hqlConditions.append(and);
    			hqlConditions.append(" p2_1.id = :patId ");
    			paramNames.add("patId");
    			paramValues.add(patRef.getID_Patient());
    			and = " and ";
    		
		}
			
		if( careContextRef != null)
		{
						
			hqlConditions.append(and);
			hqlConditions.append(" c1_1.id = :contextId ");
			paramNames.add("contextId");
			paramValues.add(careContextRef.getID_CareContext());
			and = " and ";
		}
		
		if (hqlConditions.length()>0)
		{
			hqlConditions.insert(0, " where ");
		}
		
		List<?> patients = factory.find((hqlJoins.append( hqlConditions)).toString(), paramNames, paramValues);
		
		if( patients != null && patients.size() > 0 )
		{
			PatientWhiteboardRecordVoCollection tempColl = PatientWhiteboardRecordVoAssembler.createPatientWhiteboardRecordVoCollectionFromPatientWhiteboardRecord(patients);
			if( tempColl != null && tempColl.size() > 0)
				return tempColl.get(0);
			
		}
		
		return null;
	}

	public void save(PatientWhiteboardRecordVoCollection recordColl) throws StaleObjectException, ForeignKeyViolationException
	{
		if( recordColl == null )
			return ;
		
		DomainFactory factory = getDomainFactory();
		
		for(int i = 0; i < recordColl.size();i++)
		{
			PatientWhiteboardRecord doPatientWhiteboardRecord = PatientWhiteboardRecordVoAssembler.extractPatientWhiteboardRecord(factory, recordColl.get(i));
			if( doPatientWhiteboardRecord != null )
			{
				factory.save(doPatientWhiteboardRecord);
			}
		}
		
	}

	


	
}
