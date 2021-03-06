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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.30 build 2033.26870)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.core.domain.impl;

import java.util.ArrayList;
import java.util.List;

import ims.core.clinical.domain.objects.QuestionInformation;
import ims.core.vo.QuestionInformationShortVoCollection;
import ims.core.vo.QuestionInformationVo;
import ims.core.vo.QuestionInformationVoCollection;
import ims.core.vo.domain.QuestionInformationShortVoAssembler;
import ims.core.vo.domain.QuestionInformationVoAssembler;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.QuestionClassification;
import ims.core.vo.lookups.QuestionClassificationCollection;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;

public class QuestionListImpl extends DomainImpl implements ims.core.domain.QuestionList, ims.domain.impl.Transactional
{
	public QuestionInformationShortVoCollection listQuestion(QuestionInformationVo filter) 
	{
		StringBuffer hql = new StringBuffer(" from QuestionInformation QI");
		DomainFactory factory = getDomainFactory();
		ArrayList names = new ArrayList(), values = new ArrayList();
		QuestionInformationShortVoCollection voColl = new QuestionInformationShortVoCollection();
		if(filter != null)
		{
			if(filter.getTextIsNotNull())
			{
				hql.append(" where upper(QI.text) like :qText ");
				names.add("qText");
				values.add("%" + filter.getText().toUpperCase() + "%");
			
				List qInfoList = factory.find(hql.toString(), names, values);
				return QuestionInformationShortVoAssembler.createQuestionInformationShortVoCollectionFromQuestionInformation(qInfoList);
			}
			if(filter.getClassificationIsNotNull() && filter.getClassification().size() > 0)
			{
				for(int i=0; i<filter.getClassification().size(); i++)
				{
					hql = new StringBuffer();
					hql.append("from QuestionInformation QI where :item in elements(QI.classification)");
					names.add("item");	
					values.add(getDomLookup(filter.getClassification().get(i)));
					List qInfoList = factory.find(hql.toString(), names, values);
					QuestionInformationVoCollection voQInfoColl = QuestionInformationVoAssembler.createQuestionInformationVoCollectionFromQuestionInformation(qInfoList);
					//Add the collection to the main one
					for(int j=0; voQInfoColl != null && j<voQInfoColl.size(); j++)
						voColl.add(voQInfoColl.get(j));
				}
				
				return voColl;
			}
		}
		return null;
	}

	public QuestionInformationShortVoCollection listQuestion(String text) 
	{
		StringBuffer hql = new StringBuffer(" from QuestionInformation QI");
		DomainFactory factory = getDomainFactory();
		if(text != null)
		{
			hql.append(" where upper(QI.text) like :qText ");
			List qInfoList = factory.find(hql.toString(), "qText", ("%" + text + "%"));
			return QuestionInformationShortVoAssembler.createQuestionInformationShortVoCollectionFromQuestionInformation(qInfoList);
		}
		return null;
	}

	public QuestionInformationShortVoCollection listQuestion(QuestionClassification classification) 
	{
		DomainFactory factory = getDomainFactory();
		if(classification != null)
		{
			String hql = "select distinct QI from QuestionInformation QI where :classItem in elements(QI.classification)";
			List qInfoList = factory.find(hql, "classItem", getDomLookup(classification));
			return QuestionInformationShortVoAssembler.createQuestionInformationShortVoCollectionFromQuestionInformation(qInfoList);
		}
		return null;
	}
	
	public QuestionInformationVo getQuestion(Integer idQuestion) 
	{
		DomainFactory factory = getDomainFactory();
		return QuestionInformationVoAssembler.create((QuestionInformation) factory.getDomainObject(QuestionInformation.class, idQuestion));
	}

	public QuestionInformationShortVoCollection listQuestion(QuestionClassification classification, String text, PreActiveActiveInactiveStatus status, Boolean isQuestion) 
	{ 
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select distinct QI from QuestionInformation QI ");
		ArrayList values = new ArrayList(), names = new ArrayList();
		boolean firstClause = true;

		if(isQuestion != null)
		{
			hql.append(firstClause?" where ":" and ");
			hql.append(" isQuestion = :isQuestion");
			names.add("isQuestion");
			values.add(isQuestion);
			firstClause = false;
		}
		if(text != null)
		{
			hql.append(firstClause?" where ":" and ");
			hql.append(" upper(QI.text) like :qText");
			names.add("qText");
			values.add("%" + text + "%");
			firstClause = false;
		}
		if(status != null)
		{
			hql.append(firstClause?" where ":" and ");
			hql.append(" QI.status = :statLkp");
			names.add("statLkp");
			values.add(getDomLookup(status));
			firstClause = false;
		}
		if(classification != null)
		{	
			hql.append(firstClause?" where ":" and ");
			hql.append(" :classItem in elements(QI.classification)");
			names.add("classItem");
			values.add(getDomLookup(classification));
			firstClause = false;
		}
		
		List qInfoList = factory.find(hql.toString(), names, values);
		return QuestionInformationShortVoAssembler.createQuestionInformationShortVoCollectionFromQuestionInformation(qInfoList);				
	}

	public Integer countQuestion(QuestionClassificationCollection classification, String text, PreActiveActiveInactiveStatus status, Boolean isQuestion) 
	{
		DomainFactory factory = getDomainFactory();
		QuestionClassification classItem;
		boolean hasClassification = classification != null && classification.size() > 0;
		boolean hasText = text != null && text.length() > 0;
		int count = 0;
		
		if(hasClassification)
		{
			for(int i=0; i<classification.size(); i++)
			{
				boolean firstClause = true;
				classItem = classification.get(i);
				StringBuffer hql = new StringBuffer();
				ArrayList names = new ArrayList(), values = new ArrayList();
				hql.append(" select QI.id, QI.isQuestion, QI.text, QI.status.id, count(QI.id) from QuestionInformation QI");
				if(isQuestion != null)
				{
					hql.append(firstClause?" where ":" and ");
					hql.append(" QI.isQuestion = :bVal");
					names.add("bVal");
					values.add(isQuestion);
					firstClause = false;
				}
				if(hasText)
				{
					hql.append(firstClause?" where ":" and ");
					hql.append("upper(QI.text) like :text");
					names.add("text");
					values.add("%" + text + "%");
					firstClause = false;
				}
				if(status != null)
				{
					hql.append(firstClause?" where ":" and ");
					hql.append(" QI.status.id = :statId");
					names.add("statId");
					values.add(new Integer(status.getId()));
					firstClause = false;
				}
				if(classification != null)
				{	
					hql.append(firstClause?" where ":" and ");
					hql.append(" :classItem in elements(QI.classification)");
					names.add("classItem");
					values.add(getDomLookup(classItem));
					firstClause = false;
				}
				
				hql.append(" group by QI.id, QI.isQuestion, QI.text, QI.status.id");
				
				List list = factory.find(hql.toString(), names, values);
				if(list != null)
					count +=list.size();
			}
		}
		else
		{
			StringBuffer hql = new StringBuffer();
			ArrayList names = new ArrayList(), values = new ArrayList();
			boolean firstClause = true;
			hql.append(" select QI.id, QI.isQuestion, QI.text, count(QI.id) from QuestionInformation QI");
			if(isQuestion != null)
			{
				hql.append(firstClause?" where ":" and ");
				hql.append(" QI.isQuestion = :bVal");
				names.add("bVal");
				values.add(isQuestion);
				firstClause = false;
			}
			if(hasText)
			{
				hql.append(firstClause?" where ":" and ");
				hql.append("upper(QI.text) like :text");
				names.add("text");
				values.add("%" + text + "%");
				firstClause = false;
			}
			hql.append(" group by QI.id, QI.text, QI.isQuestion");
			
			List list = factory.find(hql.toString(), names, values);
			if(list != null)
				count +=list.size();
		}
		
		return new Integer(count);
	}
}
