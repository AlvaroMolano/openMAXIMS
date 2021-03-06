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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 5256.13787)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import java.util.List;

import ims.core.admin.domain.objects.DemographicControlsConfig;
import ims.core.domain.base.impl.BaseDemographicsFormConfigImpl;
import ims.core.vo.DemographicControlsConfigVo;
import ims.core.vo.domain.DemographicControlsConfigVoAssembler;
import ims.domain.DomainFactory;
import ims.framework.exceptions.CodingRuntimeException;

public class DemographicsFormConfigImpl extends BaseDemographicsFormConfigImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.DemographicControlsConfigVoCollection getDemographicControlsConfig()
	{
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from DemographicControlsConfig");
		List<?> list = factory.find(hql.toString());
		if( list != null && list.size() > 0 )
			return DemographicControlsConfigVoAssembler.createDemographicControlsConfigVoCollectionFromDemographicControlsConfig(list);
		
		
		return null;
		
	}

	public void save(ims.core.vo.DemographicControlsConfigVoCollection recordColl) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if( recordColl == null || recordColl.size() == 0 )
			throw new CodingRuntimeException("DemographicControlsConfigVoCollection is null");
		
		DomainFactory factory = getDomainFactory();
		for(int i = 0 ; i < recordColl.size(); i++)
		{
			DemographicControlsConfigVo tempVo = recordColl.get(i);
			if( tempVo != null)
			{
				DemographicControlsConfig doDemographicControlsConfig = DemographicControlsConfigVoAssembler.extractDemographicControlsConfig(factory, tempVo);
				if( doDemographicControlsConfig != null)
					factory.save(doDemographicControlsConfig);
			}
		}
	}
}
