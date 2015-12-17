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

public class SearchCriteriaForPatientCodingListVoBean extends ims.vo.ValueObjectBean
{
	public SearchCriteriaForPatientCodingListVoBean()
	{
	}
	public SearchCriteriaForPatientCodingListVoBean(ims.RefMan.vo.SearchCriteriaForPatientCodingListVo vo)
	{
		this.datefrom = vo.getDateFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateFrom().getBean();
		this.dateto = vo.getDateTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateTo().getBean();
		this.inprogress = vo.getInProgress();
		this.uncoded = vo.getUncoded();
		this.forreview = vo.getForReview();
		this.coded = vo.getCoded();
		this.awaitinghistology = vo.getAwaitingHistology();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.SearchCriteriaForPatientCodingListVo vo)
	{
		this.datefrom = vo.getDateFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateFrom().getBean();
		this.dateto = vo.getDateTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateTo().getBean();
		this.inprogress = vo.getInProgress();
		this.uncoded = vo.getUncoded();
		this.forreview = vo.getForReview();
		this.coded = vo.getCoded();
		this.awaitinghistology = vo.getAwaitingHistology();
	}

	public ims.RefMan.vo.SearchCriteriaForPatientCodingListVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.SearchCriteriaForPatientCodingListVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.SearchCriteriaForPatientCodingListVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.SearchCriteriaForPatientCodingListVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.SearchCriteriaForPatientCodingListVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.framework.utils.beans.DateBean getDateFrom()
	{
		return this.datefrom;
	}
	public void setDateFrom(ims.framework.utils.beans.DateBean value)
	{
		this.datefrom = value;
	}
	public ims.framework.utils.beans.DateBean getDateTo()
	{
		return this.dateto;
	}
	public void setDateTo(ims.framework.utils.beans.DateBean value)
	{
		this.dateto = value;
	}
	public Boolean getInProgress()
	{
		return this.inprogress;
	}
	public void setInProgress(Boolean value)
	{
		this.inprogress = value;
	}
	public Boolean getUncoded()
	{
		return this.uncoded;
	}
	public void setUncoded(Boolean value)
	{
		this.uncoded = value;
	}
	public Boolean getForReview()
	{
		return this.forreview;
	}
	public void setForReview(Boolean value)
	{
		this.forreview = value;
	}
	public Boolean getCoded()
	{
		return this.coded;
	}
	public void setCoded(Boolean value)
	{
		this.coded = value;
	}
	public Boolean getAwaitingHistology()
	{
		return this.awaitinghistology;
	}
	public void setAwaitingHistology(Boolean value)
	{
		this.awaitinghistology = value;
	}

	private ims.framework.utils.beans.DateBean datefrom;
	private ims.framework.utils.beans.DateBean dateto;
	private Boolean inprogress;
	private Boolean uncoded;
	private Boolean forreview;
	private Boolean coded;
	private Boolean awaitinghistology;
}