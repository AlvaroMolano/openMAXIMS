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

public class VSMetricsForPreassesOutcVoBean extends ims.vo.ValueObjectBean
{
	public VSMetricsForPreassesOutcVoBean()
	{
	}
	public VSMetricsForPreassesOutcVoBean(ims.RefMan.vo.VSMetricsForPreassesOutcVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.heightvalue = vo.getHeightValue();
		this.heightestimatedmeasured = vo.getHeightEstimatedMeasured();
		this.weightvalue = vo.getWeightValue();
		this.weightestimatedmeasured = vo.getWeightEstimatedMeasured();
		this.bmi = vo.getBMI();
		this.surfacearea = vo.getSurfaceArea();
		this.necksize = vo.getNeckSize();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.VSMetricsForPreassesOutcVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.heightvalue = vo.getHeightValue();
		this.heightestimatedmeasured = vo.getHeightEstimatedMeasured();
		this.weightvalue = vo.getWeightValue();
		this.weightestimatedmeasured = vo.getWeightEstimatedMeasured();
		this.bmi = vo.getBMI();
		this.surfacearea = vo.getSurfaceArea();
		this.necksize = vo.getNeckSize();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
	}

	public ims.RefMan.vo.VSMetricsForPreassesOutcVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.VSMetricsForPreassesOutcVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.VSMetricsForPreassesOutcVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.VSMetricsForPreassesOutcVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.VSMetricsForPreassesOutcVo();
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
	public Float getHeightValue()
	{
		return this.heightvalue;
	}
	public void setHeightValue(Float value)
	{
		this.heightvalue = value;
	}
	public Boolean getHeightEstimatedMeasured()
	{
		return this.heightestimatedmeasured;
	}
	public void setHeightEstimatedMeasured(Boolean value)
	{
		this.heightestimatedmeasured = value;
	}
	public Float getWeightValue()
	{
		return this.weightvalue;
	}
	public void setWeightValue(Float value)
	{
		this.weightvalue = value;
	}
	public Boolean getWeightEstimatedMeasured()
	{
		return this.weightestimatedmeasured;
	}
	public void setWeightEstimatedMeasured(Boolean value)
	{
		this.weightestimatedmeasured = value;
	}
	public Float getBMI()
	{
		return this.bmi;
	}
	public void setBMI(Float value)
	{
		this.bmi = value;
	}
	public Float getSurfaceArea()
	{
		return this.surfacearea;
	}
	public void setSurfaceArea(Float value)
	{
		this.surfacearea = value;
	}
	public Float getNeckSize()
	{
		return this.necksize;
	}
	public void setNeckSize(Float value)
	{
		this.necksize = value;
	}
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}

	private Integer id;
	private int version;
	private Float heightvalue;
	private Boolean heightestimatedmeasured;
	private Float weightvalue;
	private Boolean weightestimatedmeasured;
	private Float bmi;
	private Float surfacearea;
	private Float necksize;
	private ims.vo.RefVoBean patient;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
}
