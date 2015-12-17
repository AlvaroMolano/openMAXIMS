//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.emergency.vo.beans;

public class StatusWorkflowConfigVoBean extends ims.vo.ValueObjectBean
{
	public StatusWorkflowConfigVoBean()
	{
	}
	public StatusWorkflowConfigVoBean(ims.emergency.vo.StatusWorkflowConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.workflowstatus = vo.getWorkflowStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getWorkflowStatus().getBean();
		this.createsclinicaldischarge = vo.getCreatesClinicalDischarge();
		this.requirespreadmission = vo.getRequiresPreAdmission();
		this.recordeddeparture = vo.getRecordEDDeparture();
		this.departurecontinuetodisplay = vo.getDepartureContinueToDisplay();
		this.departureseperatecontextrecord = vo.getDepartureSeperateContextRecord();
		this.departureoutcomedefault = vo.getDepartureOutcomeDefault() == null ? null : (ims.vo.LookupInstanceBean)vo.getDepartureOutcomeDefault().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.StatusWorkflowConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.workflowstatus = vo.getWorkflowStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getWorkflowStatus().getBean();
		this.createsclinicaldischarge = vo.getCreatesClinicalDischarge();
		this.requirespreadmission = vo.getRequiresPreAdmission();
		this.recordeddeparture = vo.getRecordEDDeparture();
		this.departurecontinuetodisplay = vo.getDepartureContinueToDisplay();
		this.departureseperatecontextrecord = vo.getDepartureSeperateContextRecord();
		this.departureoutcomedefault = vo.getDepartureOutcomeDefault() == null ? null : (ims.vo.LookupInstanceBean)vo.getDepartureOutcomeDefault().getBean();
	}

	public ims.emergency.vo.StatusWorkflowConfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.StatusWorkflowConfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.StatusWorkflowConfigVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.StatusWorkflowConfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.StatusWorkflowConfigVo();
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
	public ims.vo.LookupInstanceBean getWorkflowStatus()
	{
		return this.workflowstatus;
	}
	public void setWorkflowStatus(ims.vo.LookupInstanceBean value)
	{
		this.workflowstatus = value;
	}
	public Boolean getCreatesClinicalDischarge()
	{
		return this.createsclinicaldischarge;
	}
	public void setCreatesClinicalDischarge(Boolean value)
	{
		this.createsclinicaldischarge = value;
	}
	public Boolean getRequiresPreAdmission()
	{
		return this.requirespreadmission;
	}
	public void setRequiresPreAdmission(Boolean value)
	{
		this.requirespreadmission = value;
	}
	public Boolean getRecordEDDeparture()
	{
		return this.recordeddeparture;
	}
	public void setRecordEDDeparture(Boolean value)
	{
		this.recordeddeparture = value;
	}
	public Boolean getDepartureContinueToDisplay()
	{
		return this.departurecontinuetodisplay;
	}
	public void setDepartureContinueToDisplay(Boolean value)
	{
		this.departurecontinuetodisplay = value;
	}
	public Boolean getDepartureSeperateContextRecord()
	{
		return this.departureseperatecontextrecord;
	}
	public void setDepartureSeperateContextRecord(Boolean value)
	{
		this.departureseperatecontextrecord = value;
	}
	public ims.vo.LookupInstanceBean getDepartureOutcomeDefault()
	{
		return this.departureoutcomedefault;
	}
	public void setDepartureOutcomeDefault(ims.vo.LookupInstanceBean value)
	{
		this.departureoutcomedefault = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean workflowstatus;
	private Boolean createsclinicaldischarge;
	private Boolean requirespreadmission;
	private Boolean recordeddeparture;
	private Boolean departurecontinuetodisplay;
	private Boolean departureseperatecontextrecord;
	private ims.vo.LookupInstanceBean departureoutcomedefault;
}