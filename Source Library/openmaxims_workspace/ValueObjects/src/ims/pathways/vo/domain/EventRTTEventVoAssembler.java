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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class EventRTTEventVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.EventRTTEventVo copy(ims.pathways.vo.EventRTTEventVo valueObjectDest, ims.pathways.vo.EventRTTEventVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EventRTTEvent(valueObjectSrc.getID_EventRTTEvent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Event
		valueObjectDest.setEvent(valueObjectSrc.getEvent());
		// RTTEvent
		valueObjectDest.setRTTEvent(valueObjectSrc.getRTTEvent());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// ActivatedBy
		valueObjectDest.setActivatedBy(valueObjectSrc.getActivatedBy());
		// ActivatedDateTime
		valueObjectDest.setActivatedDateTime(valueObjectSrc.getActivatedDateTime());
		// InactivatedBy
		valueObjectDest.setInactivatedBy(valueObjectSrc.getInactivatedBy());
		// InactivatedDateTime
		valueObjectDest.setInactivatedDateTime(valueObjectSrc.getInactivatedDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEventRTTEventVoCollectionFromEventRTTEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.EventRTTEvent objects.
	 */
	public static ims.pathways.vo.EventRTTEventVoCollection createEventRTTEventVoCollectionFromEventRTTEvent(java.util.Set domainObjectSet)	
	{
		return createEventRTTEventVoCollectionFromEventRTTEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.EventRTTEvent objects.
	 */
	public static ims.pathways.vo.EventRTTEventVoCollection createEventRTTEventVoCollectionFromEventRTTEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.EventRTTEventVoCollection voList = new ims.pathways.vo.EventRTTEventVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.configuration.domain.objects.EventRTTEvent domainObject = (ims.pathways.configuration.domain.objects.EventRTTEvent) iterator.next();
			ims.pathways.vo.EventRTTEventVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.EventRTTEvent objects.
	 */
	public static ims.pathways.vo.EventRTTEventVoCollection createEventRTTEventVoCollectionFromEventRTTEvent(java.util.List domainObjectList) 
	{
		return createEventRTTEventVoCollectionFromEventRTTEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.EventRTTEvent objects.
	 */
	public static ims.pathways.vo.EventRTTEventVoCollection createEventRTTEventVoCollectionFromEventRTTEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.EventRTTEventVoCollection voList = new ims.pathways.vo.EventRTTEventVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.configuration.domain.objects.EventRTTEvent domainObject = (ims.pathways.configuration.domain.objects.EventRTTEvent) domainObjectList.get(i);
			ims.pathways.vo.EventRTTEventVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.pathways.configuration.domain.objects.EventRTTEvent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEventRTTEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventRTTEventVoCollection voCollection) 
	 {
	 	return extractEventRTTEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEventRTTEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventRTTEventVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.EventRTTEventVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.EventRTTEvent domainObject = EventRTTEventVoAssembler.extractEventRTTEvent(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.pathways.configuration.domain.objects.EventRTTEvent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEventRTTEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventRTTEventVoCollection voCollection) 
	 {
	 	return extractEventRTTEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEventRTTEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventRTTEventVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.EventRTTEventVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.EventRTTEvent domainObject = EventRTTEventVoAssembler.extractEventRTTEvent(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.pathways.configuration.domain.objects.EventRTTEvent object.
	 * @param domainObject ims.pathways.configuration.domain.objects.EventRTTEvent
	 */
	 public static ims.pathways.vo.EventRTTEventVo create(ims.pathways.configuration.domain.objects.EventRTTEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.configuration.domain.objects.EventRTTEvent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.EventRTTEventVo create(DomainObjectMap map, ims.pathways.configuration.domain.objects.EventRTTEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.EventRTTEventVo valueObject = (ims.pathways.vo.EventRTTEventVo) map.getValueObject(domainObject, ims.pathways.vo.EventRTTEventVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.EventRTTEventVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.configuration.domain.objects.EventRTTEvent
	 */
	 public static ims.pathways.vo.EventRTTEventVo insert(ims.pathways.vo.EventRTTEventVo valueObject, ims.pathways.configuration.domain.objects.EventRTTEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.configuration.domain.objects.EventRTTEvent
	 */
	 public static ims.pathways.vo.EventRTTEventVo insert(DomainObjectMap map, ims.pathways.vo.EventRTTEventVo valueObject, ims.pathways.configuration.domain.objects.EventRTTEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EventRTTEvent(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// Event
		valueObject.setEvent(ims.pathways.vo.domain.EventVoAssembler.create(map, domainObject.getEvent()) );
		// RTTEvent
		valueObject.setRTTEvent(ims.pathways.vo.domain.RTTEventVoAssembler.create(map, domainObject.getRTTEvent()) );
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup3 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// ActivatedBy
		valueObject.setActivatedBy(ims.admin.vo.domain.AppUserShortVoAssembler.create(map, domainObject.getActivatedBy()) );
		// ActivatedDateTime
		java.util.Date ActivatedDateTime = domainObject.getActivatedDateTime();
		if ( null != ActivatedDateTime ) 
		{
			valueObject.setActivatedDateTime(new ims.framework.utils.DateTime(ActivatedDateTime) );
		}
		// InactivatedBy
		valueObject.setInactivatedBy(ims.admin.vo.domain.AppUserShortVoAssembler.create(map, domainObject.getInactivatedBy()) );
		// InactivatedDateTime
		java.util.Date InactivatedDateTime = domainObject.getInactivatedDateTime();
		if ( null != InactivatedDateTime ) 
		{
			valueObject.setInactivatedDateTime(new ims.framework.utils.DateTime(InactivatedDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.configuration.domain.objects.EventRTTEvent extractEventRTTEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventRTTEventVo valueObject) 
	{
		return 	extractEventRTTEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.configuration.domain.objects.EventRTTEvent extractEventRTTEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventRTTEventVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EventRTTEvent();
		ims.pathways.configuration.domain.objects.EventRTTEvent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.configuration.domain.objects.EventRTTEvent)domMap.get(valueObject);
			}
			// ims.pathways.vo.EventRTTEventVo ID_EventRTTEvent field is unknown
			domainObject = new ims.pathways.configuration.domain.objects.EventRTTEvent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EventRTTEvent());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.configuration.domain.objects.EventRTTEvent)domMap.get(key);
			}
			domainObject = (ims.pathways.configuration.domain.objects.EventRTTEvent) domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.EventRTTEvent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EventRTTEvent());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.configuration.domain.objects.Event value1 = null;
		if ( null != valueObject.getEvent() ) 
		{
			if (valueObject.getEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getEvent()) != null)
				{
					value1 = (ims.pathways.configuration.domain.objects.Event)domMap.get(valueObject.getEvent());
				}
			}
			else
			{
				value1 = (ims.pathways.configuration.domain.objects.Event)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Event.class, valueObject.getEvent().getBoId());
			}
		}
		domainObject.setEvent(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.configuration.domain.objects.RTTEvent value2 = null;
		if ( null != valueObject.getRTTEvent() ) 
		{
			if (valueObject.getRTTEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getRTTEvent()) != null)
				{
					value2 = (ims.pathways.configuration.domain.objects.RTTEvent)domMap.get(valueObject.getRTTEvent());
				}
			}
			else
			{
				value2 = (ims.pathways.configuration.domain.objects.RTTEvent)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.RTTEvent.class, valueObject.getRTTEvent().getBoId());
			}
		}
		domainObject.setRTTEvent(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.AppUser value4 = null;
		if ( null != valueObject.getActivatedBy() ) 
		{
			if (valueObject.getActivatedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivatedBy()) != null)
				{
					value4 = (ims.core.configuration.domain.objects.AppUser)domMap.get(valueObject.getActivatedBy());
				}
			}
			else
			{
				value4 = (ims.core.configuration.domain.objects.AppUser)domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppUser.class, valueObject.getActivatedBy().getBoId());
			}
		}
		domainObject.setActivatedBy(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getActivatedDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setActivatedDateTime(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.AppUser value6 = null;
		if ( null != valueObject.getInactivatedBy() ) 
		{
			if (valueObject.getInactivatedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getInactivatedBy()) != null)
				{
					value6 = (ims.core.configuration.domain.objects.AppUser)domMap.get(valueObject.getInactivatedBy());
				}
			}
			else
			{
				value6 = (ims.core.configuration.domain.objects.AppUser)domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppUser.class, valueObject.getInactivatedBy().getBoId());
			}
		}
		domainObject.setInactivatedBy(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getInactivatedDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setInactivatedDateTime(value7);

		return domainObject;
	}

}
