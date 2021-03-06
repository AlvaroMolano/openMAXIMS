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

public class VSVentilationChartVoBean extends ims.vo.ValueObjectBean
{
	public VSVentilationChartVoBean()
	{
	}
	public VSVentilationChartVoBean(ims.core.vo.VSVentilationChartVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.suction = vo.getSuction() == null ? null : (ims.vo.LookupInstanceBean)vo.getSuction().getBean();
		this.physio = vo.getPhysio() == null ? null : (ims.vo.LookupInstanceBean)vo.getPhysio().getBean();
		this.mode = vo.getMode() == null ? null : (ims.vo.LookupInstanceBean)vo.getMode().getBean();
		this.peakpressure = vo.getPeakPressure();
		this.peepcpap = vo.getPEEPCPAP();
		this.rate = vo.getRate();
		this.spontaneousmv = vo.getSpontaneousMV();
		this.cuff = vo.getCuff() == null ? null : (ims.vo.LookupInstanceBean)vo.getCuff().getBean();
		this.humidifiertemp = vo.getHumidifierTemp();
		this.probechange = vo.getProbeChange() == null ? null : (ims.vo.LookupInstanceBean)vo.getProbeChange().getBean();
		this.position = vo.getPosition() == null ? null : (ims.vo.LookupInstanceBean)vo.getPosition().getBean();
		this.painscale = vo.getPainScale() == null ? null : (ims.vo.LookupInstanceBean)vo.getPainScale().getBean();
		this.fluidbalanceinstance = vo.getFluidBalanceInstance() == null ? null : (ims.core.vo.beans.FluidBalanceInstanceVoBean)vo.getFluidBalanceInstance().getBean();
		this.dailyfluidbalance = vo.getDailyFluidBalance() == null ? null : (ims.core.vo.beans.DailyFluidBalanceVoBean)vo.getDailyFluidBalance().getBean();
		this.shiftdetails = vo.getShiftDetails() == null ? null : (ims.core.vo.beans.ShiftDetailsVoBean)vo.getShiftDetails().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.VSVentilationChartVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.suction = vo.getSuction() == null ? null : (ims.vo.LookupInstanceBean)vo.getSuction().getBean();
		this.physio = vo.getPhysio() == null ? null : (ims.vo.LookupInstanceBean)vo.getPhysio().getBean();
		this.mode = vo.getMode() == null ? null : (ims.vo.LookupInstanceBean)vo.getMode().getBean();
		this.peakpressure = vo.getPeakPressure();
		this.peepcpap = vo.getPEEPCPAP();
		this.rate = vo.getRate();
		this.spontaneousmv = vo.getSpontaneousMV();
		this.cuff = vo.getCuff() == null ? null : (ims.vo.LookupInstanceBean)vo.getCuff().getBean();
		this.humidifiertemp = vo.getHumidifierTemp();
		this.probechange = vo.getProbeChange() == null ? null : (ims.vo.LookupInstanceBean)vo.getProbeChange().getBean();
		this.position = vo.getPosition() == null ? null : (ims.vo.LookupInstanceBean)vo.getPosition().getBean();
		this.painscale = vo.getPainScale() == null ? null : (ims.vo.LookupInstanceBean)vo.getPainScale().getBean();
		this.fluidbalanceinstance = vo.getFluidBalanceInstance() == null ? null : (ims.core.vo.beans.FluidBalanceInstanceVoBean)vo.getFluidBalanceInstance().getBean(map);
		this.dailyfluidbalance = vo.getDailyFluidBalance() == null ? null : (ims.core.vo.beans.DailyFluidBalanceVoBean)vo.getDailyFluidBalance().getBean(map);
		this.shiftdetails = vo.getShiftDetails() == null ? null : (ims.core.vo.beans.ShiftDetailsVoBean)vo.getShiftDetails().getBean(map);
	}

	public ims.core.vo.VSVentilationChartVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.VSVentilationChartVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.VSVentilationChartVo vo = null;
		if(map != null)
			vo = (ims.core.vo.VSVentilationChartVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.VSVentilationChartVo();
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
	public ims.vo.LookupInstanceBean getSuction()
	{
		return this.suction;
	}
	public void setSuction(ims.vo.LookupInstanceBean value)
	{
		this.suction = value;
	}
	public ims.vo.LookupInstanceBean getPhysio()
	{
		return this.physio;
	}
	public void setPhysio(ims.vo.LookupInstanceBean value)
	{
		this.physio = value;
	}
	public ims.vo.LookupInstanceBean getMode()
	{
		return this.mode;
	}
	public void setMode(ims.vo.LookupInstanceBean value)
	{
		this.mode = value;
	}
	public Integer getPeakPressure()
	{
		return this.peakpressure;
	}
	public void setPeakPressure(Integer value)
	{
		this.peakpressure = value;
	}
	public String getPEEPCPAP()
	{
		return this.peepcpap;
	}
	public void setPEEPCPAP(String value)
	{
		this.peepcpap = value;
	}
	public Integer getRate()
	{
		return this.rate;
	}
	public void setRate(Integer value)
	{
		this.rate = value;
	}
	public Integer getSpontaneousMV()
	{
		return this.spontaneousmv;
	}
	public void setSpontaneousMV(Integer value)
	{
		this.spontaneousmv = value;
	}
	public ims.vo.LookupInstanceBean getCuff()
	{
		return this.cuff;
	}
	public void setCuff(ims.vo.LookupInstanceBean value)
	{
		this.cuff = value;
	}
	public Float getHumidifierTemp()
	{
		return this.humidifiertemp;
	}
	public void setHumidifierTemp(Float value)
	{
		this.humidifiertemp = value;
	}
	public ims.vo.LookupInstanceBean getProbeChange()
	{
		return this.probechange;
	}
	public void setProbeChange(ims.vo.LookupInstanceBean value)
	{
		this.probechange = value;
	}
	public ims.vo.LookupInstanceBean getPosition()
	{
		return this.position;
	}
	public void setPosition(ims.vo.LookupInstanceBean value)
	{
		this.position = value;
	}
	public ims.vo.LookupInstanceBean getPainScale()
	{
		return this.painscale;
	}
	public void setPainScale(ims.vo.LookupInstanceBean value)
	{
		this.painscale = value;
	}
	public ims.core.vo.beans.FluidBalanceInstanceVoBean getFluidBalanceInstance()
	{
		return this.fluidbalanceinstance;
	}
	public void setFluidBalanceInstance(ims.core.vo.beans.FluidBalanceInstanceVoBean value)
	{
		this.fluidbalanceinstance = value;
	}
	public ims.core.vo.beans.DailyFluidBalanceVoBean getDailyFluidBalance()
	{
		return this.dailyfluidbalance;
	}
	public void setDailyFluidBalance(ims.core.vo.beans.DailyFluidBalanceVoBean value)
	{
		this.dailyfluidbalance = value;
	}
	public ims.core.vo.beans.ShiftDetailsVoBean getShiftDetails()
	{
		return this.shiftdetails;
	}
	public void setShiftDetails(ims.core.vo.beans.ShiftDetailsVoBean value)
	{
		this.shiftdetails = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean suction;
	private ims.vo.LookupInstanceBean physio;
	private ims.vo.LookupInstanceBean mode;
	private Integer peakpressure;
	private String peepcpap;
	private Integer rate;
	private Integer spontaneousmv;
	private ims.vo.LookupInstanceBean cuff;
	private Float humidifiertemp;
	private ims.vo.LookupInstanceBean probechange;
	private ims.vo.LookupInstanceBean position;
	private ims.vo.LookupInstanceBean painscale;
	private ims.core.vo.beans.FluidBalanceInstanceVoBean fluidbalanceinstance;
	private ims.core.vo.beans.DailyFluidBalanceVoBean dailyfluidbalance;
	private ims.core.vo.beans.ShiftDetailsVoBean shiftdetails;
}
