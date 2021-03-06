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

public class FormLookupVoBean extends ims.vo.ValueObjectBean
{
	public FormLookupVoBean()
	{
	}
	public FormLookupVoBean(ims.admin.vo.FormLookupVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.lookuptype = vo.getLookupType() == null ? null : (ims.vo.LookupTypeBean)vo.getLookupType().getBean();
		this.defaultinstance = vo.getDefaultInstance() == null ? null : (ims.vo.LookupInstanceBean)vo.getDefaultInstance().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.FormLookupVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.lookuptype = vo.getLookupType() == null ? null : (ims.vo.LookupTypeBean)vo.getLookupType().getBean();
		this.defaultinstance = vo.getDefaultInstance() == null ? null : (ims.vo.LookupInstanceBean)vo.getDefaultInstance().getBean();
	}

	public ims.admin.vo.FormLookupVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.admin.vo.FormLookupVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.FormLookupVo vo = null;
		if(map != null)
			vo = (ims.admin.vo.FormLookupVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.admin.vo.FormLookupVo();
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
	public ims.vo.LookupTypeBean getLookupType()
	{
		return this.lookuptype;
	}
	public void setLookupType(ims.vo.LookupTypeBean value)
	{
		this.lookuptype = value;
	}
	public ims.vo.LookupInstanceBean getDefaultInstance()
	{
		return this.defaultinstance;
	}
	public void setDefaultInstance(ims.vo.LookupInstanceBean value)
	{
		this.defaultinstance = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupTypeBean lookuptype;
	private ims.vo.LookupInstanceBean defaultinstance;
}
