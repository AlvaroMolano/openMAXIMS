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

public class DischargedEpisodeForVTERiskAssessmentWorklistVoBean extends ims.vo.ValueObjectBean
{
	public DischargedEpisodeForVTERiskAssessmentWorklistVoBean()
	{
	}
	public DischargedEpisodeForVTERiskAssessmentWorklistVoBean(ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PASEventForVTERiskAssessmentVoBean)vo.getPasEvent().getBean();
		this.wardstays = vo.getWardStays() == null ? null : vo.getWardStays().getBeanCollection();
		this.vteassessmentstatus = vo.getVTEAssessmentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getVTEAssessmentStatus().getBean();
		this.admissiondetail = vo.getAdmissionDetail() == null ? null : (ims.core.vo.beans.AdmissionDetailForVTERiskAssessmentVoBean)vo.getAdmissionDetail().getBean();
		this.vteriskassessment = vo.getVTERiskAssessment() == null ? null : new ims.vo.RefVoBean(vo.getVTERiskAssessment().getBoId(), vo.getVTERiskAssessment().getBoVersion());
		this.vteassessmentstatusreason = vo.getVTEAssessmentStatusReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getVTEAssessmentStatusReason().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PASEventForVTERiskAssessmentVoBean)vo.getPasEvent().getBean(map);
		this.wardstays = vo.getWardStays() == null ? null : vo.getWardStays().getBeanCollection();
		this.vteassessmentstatus = vo.getVTEAssessmentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getVTEAssessmentStatus().getBean();
		this.admissiondetail = vo.getAdmissionDetail() == null ? null : (ims.core.vo.beans.AdmissionDetailForVTERiskAssessmentVoBean)vo.getAdmissionDetail().getBean(map);
		this.vteriskassessment = vo.getVTERiskAssessment() == null ? null : new ims.vo.RefVoBean(vo.getVTERiskAssessment().getBoId(), vo.getVTERiskAssessment().getBoVersion());
		this.vteassessmentstatusreason = vo.getVTEAssessmentStatusReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getVTEAssessmentStatusReason().getBean();
	}

	public ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo vo = null;
		if(map != null)
			vo = (ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo();
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
	public ims.core.vo.beans.PASEventForVTERiskAssessmentVoBean getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.vo.beans.PASEventForVTERiskAssessmentVoBean value)
	{
		this.pasevent = value;
	}
	public ims.core.vo.beans.WardStayVoBean[] getWardStays()
	{
		return this.wardstays;
	}
	public void setWardStays(ims.core.vo.beans.WardStayVoBean[] value)
	{
		this.wardstays = value;
	}
	public ims.vo.LookupInstanceBean getVTEAssessmentStatus()
	{
		return this.vteassessmentstatus;
	}
	public void setVTEAssessmentStatus(ims.vo.LookupInstanceBean value)
	{
		this.vteassessmentstatus = value;
	}
	public ims.core.vo.beans.AdmissionDetailForVTERiskAssessmentVoBean getAdmissionDetail()
	{
		return this.admissiondetail;
	}
	public void setAdmissionDetail(ims.core.vo.beans.AdmissionDetailForVTERiskAssessmentVoBean value)
	{
		this.admissiondetail = value;
	}
	public ims.vo.RefVoBean getVTERiskAssessment()
	{
		return this.vteriskassessment;
	}
	public void setVTERiskAssessment(ims.vo.RefVoBean value)
	{
		this.vteriskassessment = value;
	}
	public ims.vo.LookupInstanceBean getVTEAssessmentStatusReason()
	{
		return this.vteassessmentstatusreason;
	}
	public void setVTEAssessmentStatusReason(ims.vo.LookupInstanceBean value)
	{
		this.vteassessmentstatusreason = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PASEventForVTERiskAssessmentVoBean pasevent;
	private ims.core.vo.beans.WardStayVoBean[] wardstays;
	private ims.vo.LookupInstanceBean vteassessmentstatus;
	private ims.core.vo.beans.AdmissionDetailForVTERiskAssessmentVoBean admissiondetail;
	private ims.vo.RefVoBean vteriskassessment;
	private ims.vo.LookupInstanceBean vteassessmentstatusreason;
}
