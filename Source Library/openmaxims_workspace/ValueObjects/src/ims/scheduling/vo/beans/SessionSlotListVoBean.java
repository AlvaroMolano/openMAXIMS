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

public class SessionSlotListVoBean extends ims.vo.ValueObjectBean
{
	public SessionSlotListVoBean()
	{
	}
	public SessionSlotListVoBean(ims.scheduling.vo.SessionSlotListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.starttm = vo.getStartTm() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTm().getBean();
		this.session = vo.getSession() == null ? null : (ims.scheduling.vo.beans.SessionListVoBean)vo.getSession().getBean();
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		this.comment = vo.getComment();
		this.activity = vo.getActivity() == null ? null : (ims.core.vo.beans.ActivityForSessionManagementVoBean)vo.getActivity().getBean();
		this.functions = vo.getFunctions() == null ? null : vo.getFunctions().getBeanCollection();
		this.directaccessslot = vo.getDirectAccessSlot() == null ? null : (ims.vo.LookupInstanceBean)vo.getDirectAccessSlot().getBean();
		this.duration = vo.getDuration();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.SessionSlotListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.starttm = vo.getStartTm() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTm().getBean();
		this.session = vo.getSession() == null ? null : (ims.scheduling.vo.beans.SessionListVoBean)vo.getSession().getBean(map);
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		this.comment = vo.getComment();
		this.activity = vo.getActivity() == null ? null : (ims.core.vo.beans.ActivityForSessionManagementVoBean)vo.getActivity().getBean(map);
		this.functions = vo.getFunctions() == null ? null : vo.getFunctions().getBeanCollection();
		this.directaccessslot = vo.getDirectAccessSlot() == null ? null : (ims.vo.LookupInstanceBean)vo.getDirectAccessSlot().getBean();
		this.duration = vo.getDuration();
	}

	public ims.scheduling.vo.SessionSlotListVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.SessionSlotListVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.SessionSlotListVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.SessionSlotListVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.SessionSlotListVo();
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
	public ims.framework.utils.beans.TimeBean getStartTm()
	{
		return this.starttm;
	}
	public void setStartTm(ims.framework.utils.beans.TimeBean value)
	{
		this.starttm = value;
	}
	public ims.scheduling.vo.beans.SessionListVoBean getSession()
	{
		return this.session;
	}
	public void setSession(ims.scheduling.vo.beans.SessionListVoBean value)
	{
		this.session = value;
	}
	public ims.vo.LookupInstanceBean getPriority()
	{
		return this.priority;
	}
	public void setPriority(ims.vo.LookupInstanceBean value)
	{
		this.priority = value;
	}
	public String getComment()
	{
		return this.comment;
	}
	public void setComment(String value)
	{
		this.comment = value;
	}
	public ims.core.vo.beans.ActivityForSessionManagementVoBean getActivity()
	{
		return this.activity;
	}
	public void setActivity(ims.core.vo.beans.ActivityForSessionManagementVoBean value)
	{
		this.activity = value;
	}
	public ims.core.vo.beans.ServiceFunctionLiteVoBean[] getFunctions()
	{
		return this.functions;
	}
	public void setFunctions(ims.core.vo.beans.ServiceFunctionLiteVoBean[] value)
	{
		this.functions = value;
	}
	public ims.vo.LookupInstanceBean getDirectAccessSlot()
	{
		return this.directaccessslot;
	}
	public void setDirectAccessSlot(ims.vo.LookupInstanceBean value)
	{
		this.directaccessslot = value;
	}
	public Integer getDuration()
	{
		return this.duration;
	}
	public void setDuration(Integer value)
	{
		this.duration = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.TimeBean starttm;
	private ims.scheduling.vo.beans.SessionListVoBean session;
	private ims.vo.LookupInstanceBean priority;
	private String comment;
	private ims.core.vo.beans.ActivityForSessionManagementVoBean activity;
	private ims.core.vo.beans.ServiceFunctionLiteVoBean[] functions;
	private ims.vo.LookupInstanceBean directaccessslot;
	private Integer duration;
}
