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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.71 build 3574.28766)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;
// Test
import ims.RefMan.domain.base.impl.BaseAllocatedTaskDialogImpl;
import ims.RefMan.vo.WorkAllocationVoCollection;
import ims.RefMan.vo.domain.WorkAllocationVoAssembler;
import ims.domain.DomainFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AllocatedTaskDialogImpl extends BaseAllocatedTaskDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ims.RefMan.vo.WorkAllocationVo getAllocatedTask(ims.RefMan.vo.CatsReferralRefVo referrRefVo)
	{
		if(referrRefVo != null)
		{
			DomainFactory factory = getDomainFactory();
			StringBuffer hql = new StringBuffer(" from WorkAllocation wa where "); 
			ArrayList<String> markers = new ArrayList<String>();
			ArrayList<Serializable> values = new ArrayList<Serializable>();
		
			hql.append(" wa.catsReferral.id = :cats");
			markers.add("cats");
			values.add(referrRefVo.getID_CatsReferral());
			hql.append(" and wa.completedDateTime = null");
			hql.append(" and wa.unallocatedDate = null");

			hql.append(" and wa.isRIE is null");	

			List list = factory.find(hql.toString(), markers,values);
			if(list != null && list.size() > 0)
			{ 
				WorkAllocationVoCollection voColl = WorkAllocationVoAssembler.createWorkAllocationVoCollectionFromWorkAllocation(list);
				if(voColl != null && voColl.size() > 0)
					return voColl.get(0);
			}
		}
		return null;	
	}
}
