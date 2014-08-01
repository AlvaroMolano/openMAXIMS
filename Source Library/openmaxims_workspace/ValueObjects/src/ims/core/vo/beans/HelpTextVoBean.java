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

package ims.core.vo.beans;

public class HelpTextVoBean extends ims.vo.ValueObjectBean
{
	public HelpTextVoBean()
	{
	}
	public HelpTextVoBean(ims.core.vo.HelpTextVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.textcategory = vo.getTextCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getTextCategory().getBean();
		this.helptext = vo.getHelpText();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.HelpTextVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.textcategory = vo.getTextCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getTextCategory().getBean();
		this.helptext = vo.getHelpText();
	}

	public ims.core.vo.HelpTextVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.HelpTextVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.HelpTextVo vo = null;
		if(map != null)
			vo = (ims.core.vo.HelpTextVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.HelpTextVo();
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
	public ims.vo.LookupInstanceBean getTextCategory()
	{
		return this.textcategory;
	}
	public void setTextCategory(ims.vo.LookupInstanceBean value)
	{
		this.textcategory = value;
	}
	public String getHelpText()
	{
		return this.helptext;
	}
	public void setHelpText(String value)
	{
		this.helptext = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean textcategory;
	private String helptext;
}