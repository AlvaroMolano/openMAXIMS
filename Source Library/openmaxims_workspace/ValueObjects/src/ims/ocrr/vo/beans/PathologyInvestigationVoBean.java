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

package ims.ocrr.vo.beans;

public class PathologyInvestigationVoBean extends ims.vo.ValueObjectBean
{
	public PathologyInvestigationVoBean()
	{
	}
	public PathologyInvestigationVoBean(ims.ocrr.vo.PathologyInvestigationVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.investigationindex = vo.getInvestigationIndex() == null ? null : (ims.ocrr.vo.beans.PathologyInvestigationIndexVoBean)vo.getInvestigationIndex().getBean();
		this.providerservice = vo.getProviderService() == null ? null : (ims.ocrr.vo.beans.PathologyProviderServiceVoBean)vo.getProviderService().getBean();
		this.type = vo.getType() == null ? null : (ims.vo.LookupInstanceBean)vo.getType().getBean();
		this.eventtype = vo.getEventType() == null ? null : (ims.vo.LookupInstanceBean)vo.getEventType().getBean();
		this.pathinvdetails = vo.getPathInvDetails() == null ? null : (ims.ocrr.vo.beans.PathInvDetailsForNewResultInvestigationVoBean)vo.getPathInvDetails().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.PathologyInvestigationVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.investigationindex = vo.getInvestigationIndex() == null ? null : (ims.ocrr.vo.beans.PathologyInvestigationIndexVoBean)vo.getInvestigationIndex().getBean(map);
		this.providerservice = vo.getProviderService() == null ? null : (ims.ocrr.vo.beans.PathologyProviderServiceVoBean)vo.getProviderService().getBean(map);
		this.type = vo.getType() == null ? null : (ims.vo.LookupInstanceBean)vo.getType().getBean();
		this.eventtype = vo.getEventType() == null ? null : (ims.vo.LookupInstanceBean)vo.getEventType().getBean();
		this.pathinvdetails = vo.getPathInvDetails() == null ? null : (ims.ocrr.vo.beans.PathInvDetailsForNewResultInvestigationVoBean)vo.getPathInvDetails().getBean(map);
	}

	public ims.ocrr.vo.PathologyInvestigationVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.PathologyInvestigationVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.PathologyInvestigationVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.PathologyInvestigationVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.PathologyInvestigationVo();
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
	public ims.ocrr.vo.beans.PathologyInvestigationIndexVoBean getInvestigationIndex()
	{
		return this.investigationindex;
	}
	public void setInvestigationIndex(ims.ocrr.vo.beans.PathologyInvestigationIndexVoBean value)
	{
		this.investigationindex = value;
	}
	public ims.ocrr.vo.beans.PathologyProviderServiceVoBean getProviderService()
	{
		return this.providerservice;
	}
	public void setProviderService(ims.ocrr.vo.beans.PathologyProviderServiceVoBean value)
	{
		this.providerservice = value;
	}
	public ims.vo.LookupInstanceBean getType()
	{
		return this.type;
	}
	public void setType(ims.vo.LookupInstanceBean value)
	{
		this.type = value;
	}
	public ims.vo.LookupInstanceBean getEventType()
	{
		return this.eventtype;
	}
	public void setEventType(ims.vo.LookupInstanceBean value)
	{
		this.eventtype = value;
	}
	public ims.ocrr.vo.beans.PathInvDetailsForNewResultInvestigationVoBean getPathInvDetails()
	{
		return this.pathinvdetails;
	}
	public void setPathInvDetails(ims.ocrr.vo.beans.PathInvDetailsForNewResultInvestigationVoBean value)
	{
		this.pathinvdetails = value;
	}

	private Integer id;
	private int version;
	private ims.ocrr.vo.beans.PathologyInvestigationIndexVoBean investigationindex;
	private ims.ocrr.vo.beans.PathologyProviderServiceVoBean providerservice;
	private ims.vo.LookupInstanceBean type;
	private ims.vo.LookupInstanceBean eventtype;
	private ims.ocrr.vo.beans.PathInvDetailsForNewResultInvestigationVoBean pathinvdetails;
}
