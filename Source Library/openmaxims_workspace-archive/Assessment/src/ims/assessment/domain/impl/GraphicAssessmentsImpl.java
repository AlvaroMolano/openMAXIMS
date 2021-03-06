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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.45 build 2389.16953)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.assessment.domain.impl;

import ims.assessment.configuration.domain.objects.GraphicAssessment;
import ims.assessment.domain.base.impl.BaseGraphicAssessmentsImpl;
import ims.assessment.vo.GraphicAssessmentShortVoCollection;
import ims.assessment.vo.GraphicAssessmentVo;
import ims.assessment.vo.domain.GraphicAssessmentShortVoAssembler;
import ims.assessment.vo.domain.GraphicAssessmentVoAssembler;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.UserDefinedAssessmentType;
import ims.core.vo.lookups.UserDefinedAssessmentTypeCollection;
import ims.domain.DomainFactory;
import java.util.ArrayList;
import java.util.List;


public class GraphicAssessmentsImpl extends BaseGraphicAssessmentsImpl
{
	public GraphicAssessmentShortVoCollection listAssessments(String name, ims.core.vo.lookups.PreActiveActiveInactiveStatus status, ims.core.vo.lookups.UserDefinedAssessmentType type)
	{
		UserDefinedAssessmentTypeCollection types = new UserDefinedAssessmentTypeCollection();
		if(type != null)
		{
			types = new UserDefinedAssessmentTypeCollection();
			types.add(type);
		}
			
		return listGraphicAssesssments(name, status, types);
	}
	private GraphicAssessmentShortVoCollection listGraphicAssesssments(String name, ims.core.vo.lookups.PreActiveActiveInactiveStatus status, UserDefinedAssessmentTypeCollection types)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from GraphicAssessment ga ");
		ArrayList names = new ArrayList();
		ArrayList values = new ArrayList();
		String clause = " where ";

		if (name != null)
		{
			hql.append(clause);
			hql.append(" upper(ga.name) like :name");
			names.add("name");
			values.add(name.toUpperCase());
			clause = " and ";
		}
		if (status != null)
		{
			hql.append(clause);
			hql.append(" ga.activeStatus = :status");
			names.add("status");
			values.add(getDomLookup(status));
			clause = " and ";
		}

		if (types != null)
		{
			int size = types.size();
			for (int i = 0; i < size; i++)
			{
				UserDefinedAssessmentType assType = types.get(i);
				// Check if " where " clause was added previously
				hql.append(clause);
				if (i == 0)
					hql.append(" (");

				hql.append("ga.assessmentType.id =:assessmentType" + Integer.toString(i));
				names.add("assessmentType" + i);
				values.add(new Integer(assType.getId()));

				if (i == (size - 1))
					hql.append(")");

				clause = " or ";
			}
			
			clause = " and ";
		}

		List list = factory.find(hql.toString(), names, values);

		return GraphicAssessmentShortVoAssembler.createGraphicAssessmentShortVoCollectionFromGraphicAssessment(list);
	}
	public ims.assessment.vo.GraphicAssessmentShortVoCollection listAssessments(String name, ims.core.vo.lookups.PreActiveActiveInactiveStatus status)
	{
		return listGraphicAssesssments(name, status, null);
	}

	public GraphicAssessmentVo getGraphicAssessment(Integer graphicAssessmentId)
	{
		if(graphicAssessmentId == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Cannot get GraphicAssessmentVo for null id");
		DomainFactory factory = getDomainFactory();
		GraphicAssessment doGraphicAssessment = (GraphicAssessment)factory.getDomainObject(GraphicAssessment.class, graphicAssessmentId);
		return GraphicAssessmentVoAssembler.create(doGraphicAssessment);
	}

	public GraphicAssessmentShortVoCollection listAssessments(String name)
	{
		return listAssessments(name, null);
	}
	public Integer countAssessmentByType(UserDefinedAssessmentType type)
	{
		DomainFactory factory = getDomainFactory();
		List list = factory.find("select count (g1_1.id) from GraphicAssessment as g1_1 where (g1_1.assessmentType.id = :TYPE and g1_1.activeStatus.id = :STATUS) and g1_1.isRIE is null", new String[] {"TYPE", "STATUS"}, new Object[] {new Integer(type.getID()), new Integer(PreActiveActiveInactiveStatus.ACTIVE.getID())});
		return (Integer) list.get(0);
	}
	public GraphicAssessmentShortVoCollection listAssessments(String name, PreActiveActiveInactiveStatus status, UserDefinedAssessmentTypeCollection types)
	{
		return listGraphicAssesssments(name, status, types);
	}
}
