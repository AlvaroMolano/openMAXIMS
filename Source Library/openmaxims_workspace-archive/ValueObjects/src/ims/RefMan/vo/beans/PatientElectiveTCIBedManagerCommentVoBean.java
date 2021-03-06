// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class PatientElectiveTCIBedManagerCommentVoBean extends ims.vo.ValueObjectBean
{
	public PatientElectiveTCIBedManagerCommentVoBean()
	{
	}
	public PatientElectiveTCIBedManagerCommentVoBean(ims.RefMan.vo.PatientElectiveTCIBedManagerCommentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.bedmanagercomment = vo.getBedManagerComment();
		this.tcidate = vo.getTCIDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTCIDate().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.PatientElectiveTCIBedManagerCommentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.bedmanagercomment = vo.getBedManagerComment();
		this.tcidate = vo.getTCIDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTCIDate().getBean();
	}

	public ims.RefMan.vo.PatientElectiveTCIBedManagerCommentVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.PatientElectiveTCIBedManagerCommentVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.PatientElectiveTCIBedManagerCommentVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.PatientElectiveTCIBedManagerCommentVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.PatientElectiveTCIBedManagerCommentVo();
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
	public String getBedManagerComment()
	{
		return this.bedmanagercomment;
	}
	public void setBedManagerComment(String value)
	{
		this.bedmanagercomment = value;
	}
	public ims.framework.utils.beans.DateBean getTCIDate()
	{
		return this.tcidate;
	}
	public void setTCIDate(ims.framework.utils.beans.DateBean value)
	{
		this.tcidate = value;
	}

	private Integer id;
	private int version;
	private String bedmanagercomment;
	private ims.framework.utils.beans.DateBean tcidate;
}
