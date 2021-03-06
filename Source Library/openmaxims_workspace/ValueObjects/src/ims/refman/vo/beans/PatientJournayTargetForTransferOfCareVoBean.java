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

package ims.RefMan.vo.beans;

public class PatientJournayTargetForTransferOfCareVoBean extends ims.vo.ValueObjectBean
{
	public PatientJournayTargetForTransferOfCareVoBean()
	{
	}
	public PatientJournayTargetForTransferOfCareVoBean(ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pathwaytarget = vo.getPathwayTarget() == null ? null : new ims.vo.RefVoBean(vo.getPathwayTarget().getBoId(), vo.getPathwayTarget().getBoVersion());
		this.weeknumber = vo.getWeekNumber();
		this.targetdate = vo.getTargetDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTargetDate().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.pathways.vo.beans.JourneyTargetStatusVoBean)vo.getCurrentStatus().getBean();
		this.statushistory = vo.getStatusHistory() == null ? null : vo.getStatusHistory().getBeanCollection();
		this.journeyclock = vo.getJourneyClock() == null ? null : (ims.RefMan.vo.beans.PathwayClockForTransferOfCareVoBean)vo.getJourneyClock().getBean();
		this.achieveddate = vo.getAchievedDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAchievedDate().getBean();
		this.scheduleddate = vo.getScheduledDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getScheduledDate().getBean();
		this.cancelleddate = vo.getCancelledDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCancelledDate().getBean();
		this.hascancelledevents = vo.getHasCancelledEvents();
		this.events = vo.getEvents() == null ? null : vo.getEvents().getBeanCollection();
		this.pathwayjourney = vo.getPathwayJourney() == null ? null : new ims.vo.RefVoBean(vo.getPathwayJourney().getBoId(), vo.getPathwayJourney().getBoVersion());
		this.achievedvariance = vo.getAchievedVariance();
		this.targetcalfromdate = vo.getTargetCalFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTargetCalFromDate().getBean();
		this.readjustments = vo.getReadjustments() == null ? null : vo.getReadjustments().getBeanCollection();
		this.hasreadjustments = vo.getHasReadjustments();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pathwaytarget = vo.getPathwayTarget() == null ? null : new ims.vo.RefVoBean(vo.getPathwayTarget().getBoId(), vo.getPathwayTarget().getBoVersion());
		this.weeknumber = vo.getWeekNumber();
		this.targetdate = vo.getTargetDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTargetDate().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.pathways.vo.beans.JourneyTargetStatusVoBean)vo.getCurrentStatus().getBean(map);
		this.statushistory = vo.getStatusHistory() == null ? null : vo.getStatusHistory().getBeanCollection();
		this.journeyclock = vo.getJourneyClock() == null ? null : (ims.RefMan.vo.beans.PathwayClockForTransferOfCareVoBean)vo.getJourneyClock().getBean(map);
		this.achieveddate = vo.getAchievedDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAchievedDate().getBean();
		this.scheduleddate = vo.getScheduledDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getScheduledDate().getBean();
		this.cancelleddate = vo.getCancelledDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCancelledDate().getBean();
		this.hascancelledevents = vo.getHasCancelledEvents();
		this.events = vo.getEvents() == null ? null : vo.getEvents().getBeanCollection();
		this.pathwayjourney = vo.getPathwayJourney() == null ? null : new ims.vo.RefVoBean(vo.getPathwayJourney().getBoId(), vo.getPathwayJourney().getBoVersion());
		this.achievedvariance = vo.getAchievedVariance();
		this.targetcalfromdate = vo.getTargetCalFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTargetCalFromDate().getBean();
		this.readjustments = vo.getReadjustments() == null ? null : vo.getReadjustments().getBeanCollection();
		this.hasreadjustments = vo.getHasReadjustments();
	}

	public ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo();
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
	public ims.vo.RefVoBean getPathwayTarget()
	{
		return this.pathwaytarget;
	}
	public void setPathwayTarget(ims.vo.RefVoBean value)
	{
		this.pathwaytarget = value;
	}
	public Integer getWeekNumber()
	{
		return this.weeknumber;
	}
	public void setWeekNumber(Integer value)
	{
		this.weeknumber = value;
	}
	public ims.framework.utils.beans.DateBean getTargetDate()
	{
		return this.targetdate;
	}
	public void setTargetDate(ims.framework.utils.beans.DateBean value)
	{
		this.targetdate = value;
	}
	public ims.pathways.vo.beans.JourneyTargetStatusVoBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.pathways.vo.beans.JourneyTargetStatusVoBean value)
	{
		this.currentstatus = value;
	}
	public ims.pathways.vo.beans.JourneyTargetStatusVoBean[] getStatusHistory()
	{
		return this.statushistory;
	}
	public void setStatusHistory(ims.pathways.vo.beans.JourneyTargetStatusVoBean[] value)
	{
		this.statushistory = value;
	}
	public ims.RefMan.vo.beans.PathwayClockForTransferOfCareVoBean getJourneyClock()
	{
		return this.journeyclock;
	}
	public void setJourneyClock(ims.RefMan.vo.beans.PathwayClockForTransferOfCareVoBean value)
	{
		this.journeyclock = value;
	}
	public ims.framework.utils.beans.DateTimeBean getAchievedDate()
	{
		return this.achieveddate;
	}
	public void setAchievedDate(ims.framework.utils.beans.DateTimeBean value)
	{
		this.achieveddate = value;
	}
	public ims.framework.utils.beans.DateBean getScheduledDate()
	{
		return this.scheduleddate;
	}
	public void setScheduledDate(ims.framework.utils.beans.DateBean value)
	{
		this.scheduleddate = value;
	}
	public ims.framework.utils.beans.DateBean getCancelledDate()
	{
		return this.cancelleddate;
	}
	public void setCancelledDate(ims.framework.utils.beans.DateBean value)
	{
		this.cancelleddate = value;
	}
	public Boolean getHasCancelledEvents()
	{
		return this.hascancelledevents;
	}
	public void setHasCancelledEvents(Boolean value)
	{
		this.hascancelledevents = value;
	}
	public ims.RefMan.vo.beans.PatientEventForTransferOfCareVoBean[] getEvents()
	{
		return this.events;
	}
	public void setEvents(ims.RefMan.vo.beans.PatientEventForTransferOfCareVoBean[] value)
	{
		this.events = value;
	}
	public ims.vo.RefVoBean getPathwayJourney()
	{
		return this.pathwayjourney;
	}
	public void setPathwayJourney(ims.vo.RefVoBean value)
	{
		this.pathwayjourney = value;
	}
	public Integer getAchievedVariance()
	{
		return this.achievedvariance;
	}
	public void setAchievedVariance(Integer value)
	{
		this.achievedvariance = value;
	}
	public ims.framework.utils.beans.DateBean getTargetCalFromDate()
	{
		return this.targetcalfromdate;
	}
	public void setTargetCalFromDate(ims.framework.utils.beans.DateBean value)
	{
		this.targetcalfromdate = value;
	}
	public ims.pathways.vo.beans.TargetReadjustmentVoBean[] getReadjustments()
	{
		return this.readjustments;
	}
	public void setReadjustments(ims.pathways.vo.beans.TargetReadjustmentVoBean[] value)
	{
		this.readjustments = value;
	}
	public Boolean getHasReadjustments()
	{
		return this.hasreadjustments;
	}
	public void setHasReadjustments(Boolean value)
	{
		this.hasreadjustments = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean pathwaytarget;
	private Integer weeknumber;
	private ims.framework.utils.beans.DateBean targetdate;
	private ims.pathways.vo.beans.JourneyTargetStatusVoBean currentstatus;
	private ims.pathways.vo.beans.JourneyTargetStatusVoBean[] statushistory;
	private ims.RefMan.vo.beans.PathwayClockForTransferOfCareVoBean journeyclock;
	private ims.framework.utils.beans.DateTimeBean achieveddate;
	private ims.framework.utils.beans.DateBean scheduleddate;
	private ims.framework.utils.beans.DateBean cancelleddate;
	private Boolean hascancelledevents;
	private ims.RefMan.vo.beans.PatientEventForTransferOfCareVoBean[] events;
	private ims.vo.RefVoBean pathwayjourney;
	private Integer achievedvariance;
	private ims.framework.utils.beans.DateBean targetcalfromdate;
	private ims.pathways.vo.beans.TargetReadjustmentVoBean[] readjustments;
	private Boolean hasreadjustments;
}
