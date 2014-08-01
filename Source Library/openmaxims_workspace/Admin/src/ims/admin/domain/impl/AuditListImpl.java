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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.21 build 41008.1030)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import ims.admin.domain.OrganisationAndLocation;
import ims.admin.vo.RecordedInErrorVo;
import ims.admin.vo.AppUserShortVoCollection;
import ims.admin.vo.domain.AppUserShortVoAssembler;
import ims.core.vo.AuditListFilterVo;
import ims.core.vo.AuditVo;
import ims.core.vo.AuditVoCollection;
import ims.core.vo.LocationLiteVoCollection;
import ims.configuration.AuditInformation;
import ims.configuration.ImportedObject;
import ims.configuration.RecordedInError;
import ims.domain.DomainFactory;
import ims.domain.DomainObject;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.SortOrder;
public class AuditListImpl extends DomainImpl implements ims.admin.domain.AuditList
{
	private static final long serialVersionUID = 1L;

	/**
	* List Audit Records based on the search criteria passed as parameters to the method
	*/
	public ims.core.vo.AuditVoCollection listAuditRecords(AuditListFilterVo filter)
	{
		DomainFactory factory = getDomainFactory();
		String hql = " from AuditInformation audit ";
		
		String andStr = " ";
		StringBuffer clause = new StringBuffer();
		
		ArrayList names = new ArrayList();
		ArrayList values = new ArrayList();
		
		if (filter.getUser() != null)
		{
	
			clause.append(andStr + " audit.auditUser = :username");
			names.add("username");
			values.add(filter.getUser());		
			andStr = " and ";
		}
		
		if (filter.getHostnameIsNotNull())
		{
			clause.append(andStr + " audit.auditHost = :hostname");
			names.add("hostname");
			values.add(filter.getHostname());		
			andStr = " and ";
		}
			
		
		if (filter.getAction() != null)
		{
			clause.append(andStr + " audit.auditAction = :action");
			names.add("action");
			values.add(filter.getAction());		
			andStr = " and ";
		}
	
		if (filter.getDateFrom() != null)
		{
			clause.append(andStr + " audit.auditDateTime >= :dateFrom" );
			names.add("dateFrom");
			values.add(filter.getDateFrom().getJavaDate());		
			andStr = " and ";
		}
		if (filter.getDateTo() != null)
		{
			clause.append(andStr + " audit.auditDateTime <= :dateTo" );
			names.add("dateTo");
			values.add(filter.getDateTo().getJavaDate());		
			andStr = " and ";
		}
		if (filter.getPatient() != null)
		{
			clause.append(andStr + " audit.patientId = :patient" );
			names.add("patient");
			values.add(filter.getPatient().getID_Patient());		
			andStr = " and ";
		}
		if (filter.getClinicalContactIsNotNull())
		{
			clause.append(andStr + " audit.contactId = :clinicalContact" );
			names.add("clinicalContact");
			values.add(filter.getClinicalContact().getID_ClinicalContact());		
			andStr = " and ";
		}
		
		if (filter.getCareContextIsNotNull())
		{
			clause.append(andStr + " audit.careContextId = :context");
			names.add("context");
			values.add(filter.getCareContext().getID_CareContext());
			andStr = " and ";
		}
		
		if (filter.getAuditLocationIsNotNull())
		{
			clause.append(andStr + " audit.auditUserLocation = :auditLocation");
			names.add("auditLocation");
			values.add(filter.getAuditLocation().getID_Location());
			andStr = " and ";
		}
		
		if (filter.getClassName() != null && !filter.getClassName().equals(""))
		{
			if (filter.getClassName().indexOf("?") >= 0)
			{
				clause.append(andStr + " audit.className like :class");
				values.add(filter.getClassName().replace('?', '%'));
			}
			else
			{
				clause.append(andStr + " audit.className = :class");
				values.add(filter.getClassName());
			}
			names.add("class");
			andStr = " and ";
			
			// Check to see if the classId was specified.
			// this is only taken into consideration alongside
			// the class
			if (filter.getClassIdIsNotNull())
			{
				clause.append(andStr + " audit.classIdentifier = :classId");
				values.add(filter.getClassId());
				names.add("classId");
			}
		}
		if (andStr.equals(" and "))
		{
			hql += " where ";
		}
		hql += clause.toString();
		
		String[] snames = new String[names.size()];
		names.toArray(snames);

		AuditVoCollection coll = new AuditVoCollection();
		List audits  = factory.find(hql, snames, values.toArray(),1000);
		for (int i=0; i<audits.size(); i++)
		{
			AuditInformation inf = (AuditInformation)audits.get(i);
			AuditVo vo = new AuditVo();
			vo.setAction(inf.getAuditAction());
			java.util.Date dateTime = inf.getAuditDateTime();
			if (  null != dateTime ) 
			{
				vo.setAuditDateTime(new ims.framework.utils.DateTime(dateTime));
			}

			vo.setAuditUser(inf.getAuditUser());
			vo.setClassIdentifier(inf.getClassIdentifier());
			vo.setClassName(inf.getClassName());
			vo.setClassName(inf.getClassName());
			vo.setHostName(inf.getAuditHost());
			vo.setDiffFields(inf.getDiffString());
			coll.add(vo);
		}
		return coll.sort(SortOrder.DESCENDING);
	}

	/**
	* List all app users for the combo
	*/
	public AppUserShortVoCollection listAppUsers(java.lang.String name)
	{
		StringBuilder query = new StringBuilder();
		query.append("from AppUser as user where user.username != 'imsadmin' ");
		
		if (name != null)
		{
			query.append(" and (UPPER(user.username) LIKE :NAME)");
			
			ArrayList<String> paramNames = new ArrayList<String>();
			paramNames.add("NAME");
			ArrayList<Object> paramValues = new ArrayList<Object>();
			paramValues.add("%" + name.toUpperCase() + "%");
			
			query.append(" order by user.username");
			
			return AppUserShortVoAssembler.createAppUserShortVoCollectionFromAppUser(getDomainFactory().find(query.toString(), paramNames, paramValues));
		}
		
		return AppUserShortVoAssembler.createAppUserShortVoCollectionFromAppUser(getDomainFactory().find(query.toString()));
	}
	
	public String[] listDomainClassNames()
	{
		List classes = listDomainClasses();
		if (classes == null || classes.size() == 0)
			return null;
		
		String[] classNames = new String[classes.size()];
		for (int i=0; i<classes.size(); i++)
		{
			classNames[i] =classes.get(i).toString();
		}
		
		return classNames;
	}

	public RecordedInErrorVo getRIEReason(Integer boClassId, String boClassName)
	{
		DomainFactory factory = getDomainFactory();
		String hql = " from RecordedInError r where r.boClassId = :classId and r.className = :className";
		List lst = factory.find(hql, new String[]{"classId", "className"}, new Object[]{boClassId, boClassName});
		if (lst != null && lst.size() > 0)
		{
			// Unique per classId and className, so should only be 1 record 
			RecordedInError rie = (RecordedInError) lst.get(0);
			RecordedInErrorVo vo = new RecordedInErrorVo();
			vo.setClassId(new Integer(rie.getBoClassId()));
			vo.setClassName(rie.getClassName());
			vo.setReason(rie.getComment());
			return vo;
		}
		return null;
	}

	public LocationLiteVoCollection listActiveLocations(String value)
	{
		OrganisationAndLocation impl = (OrganisationAndLocation) getDomainImpl(OrganisationAndLocationImpl.class);
		return impl.listActiveLocationsByName(value);
	}

	public String getObjectXML(String className, Integer objectId) throws StaleObjectException
	{
		DomainFactory factory = getDomainFactory();
		try
		{
			Class c = Class.forName(className);
			DomainObject obj = factory.getDomainObject(c, objectId);
			if (obj != null)
			{
				HashMap domMap = new HashMap(); 
				String xml =  obj.toXMLString(domMap);
				
				// Loop through DomMap, for all occurrences of ImportedObj, we will want to save it
				Iterator iter = domMap.values().iterator();
				while (iter.hasNext())
				{
					DomainObject importedObj = (DomainObject) iter.next();
					if (importedObj instanceof ImportedObject)
					{
						ImportedObject impObj = (ImportedObject)importedObj;
						factory.saveImport(impObj.getDomainObject(), impObj.getExternalSource(), impObj.getExternalId());
					}
				}
				
				return xml;
			}
			else
				return "";
		}
		catch (ClassNotFoundException e)
		{
			throw new DomainRuntimeException(e);
		}
	}
}