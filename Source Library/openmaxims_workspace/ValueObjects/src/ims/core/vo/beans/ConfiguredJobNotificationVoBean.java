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

package ims.core.vo.beans;

public class ConfiguredJobNotificationVoBean extends ims.vo.ValueObjectBean
{
	public ConfiguredJobNotificationVoBean()
	{
	}
	public ConfiguredJobNotificationVoBean(ims.core.vo.ConfiguredJobNotificationVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.user = vo.getUser() == null ? null : (ims.admin.vo.beans.AppUserShortVoBean)vo.getUser().getBean();
		this.delivery = vo.getDelivery() == null ? null : vo.getDelivery().getBeanCollection();
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		this.usermessage = vo.getUserMessage();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.ConfiguredJobNotificationVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.user = vo.getUser() == null ? null : (ims.admin.vo.beans.AppUserShortVoBean)vo.getUser().getBean(map);
		this.delivery = vo.getDelivery() == null ? null : vo.getDelivery().getBeanCollection();
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		this.usermessage = vo.getUserMessage();
	}

	public ims.core.vo.ConfiguredJobNotificationVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.ConfiguredJobNotificationVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.ConfiguredJobNotificationVo vo = null;
		if(map != null)
			vo = (ims.core.vo.ConfiguredJobNotificationVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.ConfiguredJobNotificationVo();
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
	public ims.admin.vo.beans.AppUserShortVoBean getUser()
	{
		return this.user;
	}
	public void setUser(ims.admin.vo.beans.AppUserShortVoBean value)
	{
		this.user = value;
	}
	public java.util.Collection getDelivery()
	{
		return this.delivery;
	}
	public void setDelivery(java.util.Collection value)
	{
		this.delivery = value;
	}
	public void addDelivery(java.util.Collection value)
	{
		if(this.delivery == null)
			this.delivery = new java.util.ArrayList();
		this.delivery.add(value);
	}
	public ims.vo.LookupInstanceBean getPriority()
	{
		return this.priority;
	}
	public void setPriority(ims.vo.LookupInstanceBean value)
	{
		this.priority = value;
	}
	public String getUserMessage()
	{
		return this.usermessage;
	}
	public void setUserMessage(String value)
	{
		this.usermessage = value;
	}

	private Integer id;
	private int version;
	private ims.admin.vo.beans.AppUserShortVoBean user;
	private java.util.Collection delivery;
	private ims.vo.LookupInstanceBean priority;
	private String usermessage;
}
