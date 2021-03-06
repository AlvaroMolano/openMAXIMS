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

package ims.scheduling.vo.beans;

public class PendingEmergencyTheatreVoBean extends ims.vo.ValueObjectBean
{
	public PendingEmergencyTheatreVoBean()
	{
	}
	public PendingEmergencyTheatreVoBean(ims.scheduling.vo.PendingEmergencyTheatreVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentStatus().getBean();
		this.wasinpatientwhenaddedtolist = vo.getWasInpatientWhenAddedToList();
		this.responsiblehcp = vo.getResponsibleHCP() == null ? null : (ims.core.vo.beans.HcpBean)vo.getResponsibleHCP().getBean();
		this.urgencycategory = vo.getUrgencyCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getUrgencyCategory().getBean();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean();
		this.primaryprocedure = vo.getPrimaryProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getPrimaryProcedure().getBean();
		this.proclaterality = vo.getProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getProcLaterality().getBean();
		this.secondaryprocedure = vo.getSecondaryProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getSecondaryProcedure().getBean();
		this.secondaryproclaterality = vo.getSecondaryProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getSecondaryProcLaterality().getBean();
		this.proceduredetails = vo.getProcedureDetails();
		this.isendoscopyprocedure = vo.getIsEndoscopyProcedure();
		this.surgerytimemins = vo.getSurgeryTimeMins();
		this.theatretype = vo.getTheatreType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTheatreType().getBean();
		this.currentlocationofpatient = vo.getCurrentLocationOfPatient() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentLocationOfPatient().getBean();
		this.expectedhospital = vo.getExpectedHospital() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getExpectedHospital().getBean();
		this.expectedward = vo.getExpectedWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getExpectedWard().getBean();
		this.expecteddatetime = vo.getExpectedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getExpectedDateTime().getBean();
		this.theatreappointmentbooked = vo.getTheatreAppointmentBooked() == null ? null : new ims.vo.RefVoBean(vo.getTheatreAppointmentBooked().getBoId(), vo.getTheatreAppointmentBooked().getBoVersion());
		this.removedby = vo.getRemovedBy() == null ? null : new ims.vo.RefVoBean(vo.getRemovedBy().getBoId(), vo.getRemovedBy().getBoVersion());
		this.removalreason = vo.getRemovalReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getRemovalReason().getBean();
		this.removaldatetime = vo.getRemovalDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRemovalDateTime().getBean();
		this.isendoscopysecondprocedure = vo.getIsEndoscopySecondProcedure();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.PendingEmergencyTheatreVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentStatus().getBean();
		this.wasinpatientwhenaddedtolist = vo.getWasInpatientWhenAddedToList();
		this.responsiblehcp = vo.getResponsibleHCP() == null ? null : (ims.core.vo.beans.HcpBean)vo.getResponsibleHCP().getBean(map);
		this.urgencycategory = vo.getUrgencyCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getUrgencyCategory().getBean();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean(map);
		this.primaryprocedure = vo.getPrimaryProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getPrimaryProcedure().getBean(map);
		this.proclaterality = vo.getProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getProcLaterality().getBean();
		this.secondaryprocedure = vo.getSecondaryProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getSecondaryProcedure().getBean(map);
		this.secondaryproclaterality = vo.getSecondaryProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getSecondaryProcLaterality().getBean();
		this.proceduredetails = vo.getProcedureDetails();
		this.isendoscopyprocedure = vo.getIsEndoscopyProcedure();
		this.surgerytimemins = vo.getSurgeryTimeMins();
		this.theatretype = vo.getTheatreType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTheatreType().getBean();
		this.currentlocationofpatient = vo.getCurrentLocationOfPatient() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentLocationOfPatient().getBean();
		this.expectedhospital = vo.getExpectedHospital() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getExpectedHospital().getBean(map);
		this.expectedward = vo.getExpectedWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getExpectedWard().getBean(map);
		this.expecteddatetime = vo.getExpectedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getExpectedDateTime().getBean();
		this.theatreappointmentbooked = vo.getTheatreAppointmentBooked() == null ? null : new ims.vo.RefVoBean(vo.getTheatreAppointmentBooked().getBoId(), vo.getTheatreAppointmentBooked().getBoVersion());
		this.removedby = vo.getRemovedBy() == null ? null : new ims.vo.RefVoBean(vo.getRemovedBy().getBoId(), vo.getRemovedBy().getBoVersion());
		this.removalreason = vo.getRemovalReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getRemovalReason().getBean();
		this.removaldatetime = vo.getRemovalDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRemovalDateTime().getBean();
		this.isendoscopysecondprocedure = vo.getIsEndoscopySecondProcedure();
	}

	public ims.scheduling.vo.PendingEmergencyTheatreVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.PendingEmergencyTheatreVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.PendingEmergencyTheatreVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.PendingEmergencyTheatreVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.PendingEmergencyTheatreVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.vo.RefVoBean getCatsReferral()
	{
		return this.catsreferral;
	}
	public void setCatsReferral(ims.vo.RefVoBean value)
	{
		this.catsreferral = value;
	}
	public ims.vo.LookupInstanceBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.vo.LookupInstanceBean value)
	{
		this.currentstatus = value;
	}
	public Boolean getWasInpatientWhenAddedToList()
	{
		return this.wasinpatientwhenaddedtolist;
	}
	public void setWasInpatientWhenAddedToList(Boolean value)
	{
		this.wasinpatientwhenaddedtolist = value;
	}
	public ims.core.vo.beans.HcpBean getResponsibleHCP()
	{
		return this.responsiblehcp;
	}
	public void setResponsibleHCP(ims.core.vo.beans.HcpBean value)
	{
		this.responsiblehcp = value;
	}
	public ims.vo.LookupInstanceBean getUrgencyCategory()
	{
		return this.urgencycategory;
	}
	public void setUrgencyCategory(ims.vo.LookupInstanceBean value)
	{
		this.urgencycategory = value;
	}
	public ims.core.vo.beans.ServiceLiteVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.beans.ServiceLiteVoBean value)
	{
		this.service = value;
	}
	public ims.core.vo.beans.ProcedureLiteVoBean getPrimaryProcedure()
	{
		return this.primaryprocedure;
	}
	public void setPrimaryProcedure(ims.core.vo.beans.ProcedureLiteVoBean value)
	{
		this.primaryprocedure = value;
	}
	public ims.vo.LookupInstanceBean getProcLaterality()
	{
		return this.proclaterality;
	}
	public void setProcLaterality(ims.vo.LookupInstanceBean value)
	{
		this.proclaterality = value;
	}
	public ims.core.vo.beans.ProcedureLiteVoBean getSecondaryProcedure()
	{
		return this.secondaryprocedure;
	}
	public void setSecondaryProcedure(ims.core.vo.beans.ProcedureLiteVoBean value)
	{
		this.secondaryprocedure = value;
	}
	public ims.vo.LookupInstanceBean getSecondaryProcLaterality()
	{
		return this.secondaryproclaterality;
	}
	public void setSecondaryProcLaterality(ims.vo.LookupInstanceBean value)
	{
		this.secondaryproclaterality = value;
	}
	public String getProcedureDetails()
	{
		return this.proceduredetails;
	}
	public void setProcedureDetails(String value)
	{
		this.proceduredetails = value;
	}
	public Boolean getIsEndoscopyProcedure()
	{
		return this.isendoscopyprocedure;
	}
	public void setIsEndoscopyProcedure(Boolean value)
	{
		this.isendoscopyprocedure = value;
	}
	public Integer getSurgeryTimeMins()
	{
		return this.surgerytimemins;
	}
	public void setSurgeryTimeMins(Integer value)
	{
		this.surgerytimemins = value;
	}
	public ims.vo.LookupInstanceBean getTheatreType()
	{
		return this.theatretype;
	}
	public void setTheatreType(ims.vo.LookupInstanceBean value)
	{
		this.theatretype = value;
	}
	public ims.vo.LookupInstanceBean getCurrentLocationOfPatient()
	{
		return this.currentlocationofpatient;
	}
	public void setCurrentLocationOfPatient(ims.vo.LookupInstanceBean value)
	{
		this.currentlocationofpatient = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getExpectedHospital()
	{
		return this.expectedhospital;
	}
	public void setExpectedHospital(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.expectedhospital = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getExpectedWard()
	{
		return this.expectedward;
	}
	public void setExpectedWard(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.expectedward = value;
	}
	public ims.framework.utils.beans.DateTimeBean getExpectedDateTime()
	{
		return this.expecteddatetime;
	}
	public void setExpectedDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.expecteddatetime = value;
	}
	public ims.vo.RefVoBean getTheatreAppointmentBooked()
	{
		return this.theatreappointmentbooked;
	}
	public void setTheatreAppointmentBooked(ims.vo.RefVoBean value)
	{
		this.theatreappointmentbooked = value;
	}
	public ims.vo.RefVoBean getRemovedBy()
	{
		return this.removedby;
	}
	public void setRemovedBy(ims.vo.RefVoBean value)
	{
		this.removedby = value;
	}
	public ims.vo.LookupInstanceBean getRemovalReason()
	{
		return this.removalreason;
	}
	public void setRemovalReason(ims.vo.LookupInstanceBean value)
	{
		this.removalreason = value;
	}
	public ims.framework.utils.beans.DateTimeBean getRemovalDateTime()
	{
		return this.removaldatetime;
	}
	public void setRemovalDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.removaldatetime = value;
	}
	public Boolean getIsEndoscopySecondProcedure()
	{
		return this.isendoscopysecondprocedure;
	}
	public void setIsEndoscopySecondProcedure(Boolean value)
	{
		this.isendoscopysecondprocedure = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean patient;
	private ims.vo.RefVoBean catsreferral;
	private ims.vo.LookupInstanceBean currentstatus;
	private Boolean wasinpatientwhenaddedtolist;
	private ims.core.vo.beans.HcpBean responsiblehcp;
	private ims.vo.LookupInstanceBean urgencycategory;
	private ims.core.vo.beans.ServiceLiteVoBean service;
	private ims.core.vo.beans.ProcedureLiteVoBean primaryprocedure;
	private ims.vo.LookupInstanceBean proclaterality;
	private ims.core.vo.beans.ProcedureLiteVoBean secondaryprocedure;
	private ims.vo.LookupInstanceBean secondaryproclaterality;
	private String proceduredetails;
	private Boolean isendoscopyprocedure;
	private Integer surgerytimemins;
	private ims.vo.LookupInstanceBean theatretype;
	private ims.vo.LookupInstanceBean currentlocationofpatient;
	private ims.core.vo.beans.LocationLiteVoBean expectedhospital;
	private ims.core.vo.beans.LocationLiteVoBean expectedward;
	private ims.framework.utils.beans.DateTimeBean expecteddatetime;
	private ims.vo.RefVoBean theatreappointmentbooked;
	private ims.vo.RefVoBean removedby;
	private ims.vo.LookupInstanceBean removalreason;
	private ims.framework.utils.beans.DateTimeBean removaldatetime;
	private Boolean isendoscopysecondprocedure;
}
