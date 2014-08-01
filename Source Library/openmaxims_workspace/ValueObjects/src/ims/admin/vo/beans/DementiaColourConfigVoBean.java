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

package ims.admin.vo.beans;

public class DementiaColourConfigVoBean extends ims.vo.ValueObjectBean
{
	public DementiaColourConfigVoBean()
	{
	}
	public DementiaColourConfigVoBean(ims.admin.vo.DementiaColourConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.fromhours = vo.getFromHours();
		this.tohours = vo.getToHours();
		this.worklistentrycolour = vo.getWorklistEntryColour() == null ? null : (ims.framework.utils.beans.ColorBean)vo.getWorklistEntryColour().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.DementiaColourConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.fromhours = vo.getFromHours();
		this.tohours = vo.getToHours();
		this.worklistentrycolour = vo.getWorklistEntryColour() == null ? null : (ims.framework.utils.beans.ColorBean)vo.getWorklistEntryColour().getBean();
	}

	public ims.admin.vo.DementiaColourConfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.admin.vo.DementiaColourConfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.DementiaColourConfigVo vo = null;
		if(map != null)
			vo = (ims.admin.vo.DementiaColourConfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.admin.vo.DementiaColourConfigVo();
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
	public Integer getFromHours()
	{
		return this.fromhours;
	}
	public void setFromHours(Integer value)
	{
		this.fromhours = value;
	}
	public Integer getToHours()
	{
		return this.tohours;
	}
	public void setToHours(Integer value)
	{
		this.tohours = value;
	}
	public ims.framework.utils.beans.ColorBean getWorklistEntryColour()
	{
		return this.worklistentrycolour;
	}
	public void setWorklistEntryColour(ims.framework.utils.beans.ColorBean value)
	{
		this.worklistentrycolour = value;
	}

	private Integer id;
	private int version;
	private Integer fromhours;
	private Integer tohours;
	private ims.framework.utils.beans.ColorBean worklistentrycolour;
}