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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.hl7.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Richard Reynolds
 */
public class ifWardMessageQueueVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.hl7.vo.ifWardMessageQueueVo copy(ims.hl7.vo.ifWardMessageQueueVo valueObjectDest, ims.hl7.vo.ifWardMessageQueueVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Location(valueObjectSrc.getID_Location());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// parentLocation
		valueObjectDest.setParentLocation(valueObjectSrc.getParentLocation());
		// CodeMappings
		valueObjectDest.setCodeMappings(valueObjectSrc.getCodeMappings());
		// systemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createifWardMessageQueueVoCollectionFromLocation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.hl7.vo.ifWardMessageQueueVoCollection createifWardMessageQueueVoCollectionFromLocation(java.util.Set domainObjectSet)	
	{
		return createifWardMessageQueueVoCollectionFromLocation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.hl7.vo.ifWardMessageQueueVoCollection createifWardMessageQueueVoCollectionFromLocation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.hl7.vo.ifWardMessageQueueVoCollection voList = new ims.hl7.vo.ifWardMessageQueueVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.Location domainObject = (ims.core.resource.place.domain.objects.Location) iterator.next();
			ims.hl7.vo.ifWardMessageQueueVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.hl7.vo.ifWardMessageQueueVoCollection createifWardMessageQueueVoCollectionFromLocation(java.util.List domainObjectList) 
	{
		return createifWardMessageQueueVoCollectionFromLocation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.hl7.vo.ifWardMessageQueueVoCollection createifWardMessageQueueVoCollectionFromLocation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.hl7.vo.ifWardMessageQueueVoCollection voList = new ims.hl7.vo.ifWardMessageQueueVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.Location domainObject = (ims.core.resource.place.domain.objects.Location) domainObjectList.get(i);
			ims.hl7.vo.ifWardMessageQueueVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.Location set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLocationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifWardMessageQueueVoCollection voCollection) 
	 {
	 	return extractLocationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLocationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifWardMessageQueueVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.hl7.vo.ifWardMessageQueueVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Location domainObject = ifWardMessageQueueVoAssembler.extractLocation(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.Location list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLocationList(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifWardMessageQueueVoCollection voCollection) 
	 {
	 	return extractLocationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLocationList(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifWardMessageQueueVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.hl7.vo.ifWardMessageQueueVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Location domainObject = ifWardMessageQueueVoAssembler.extractLocation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.Location object.
	 * @param domainObject ims.core.resource.place.domain.objects.Location
	 */
	 public static ims.hl7.vo.ifWardMessageQueueVo create(ims.core.resource.place.domain.objects.Location domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.Location object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.hl7.vo.ifWardMessageQueueVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.Location domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.hl7.vo.ifWardMessageQueueVo valueObject = (ims.hl7.vo.ifWardMessageQueueVo) map.getValueObject(domainObject, ims.hl7.vo.ifWardMessageQueueVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.hl7.vo.ifWardMessageQueueVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.Location
	 */
	 public static ims.hl7.vo.ifWardMessageQueueVo insert(ims.hl7.vo.ifWardMessageQueueVo valueObject, ims.core.resource.place.domain.objects.Location domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.Location
	 */
	 public static ims.hl7.vo.ifWardMessageQueueVo insert(DomainObjectMap map, ims.hl7.vo.ifWardMessageQueueVo valueObject, ims.core.resource.place.domain.objects.Location domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Location(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// Address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
		// Type
		ims.domain.lookups.LookupInstance instance3 = domainObject.getType();
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

			ims.core.vo.lookups.LocationType voLookup3 = new ims.core.vo.lookups.LocationType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.LocationType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.LocationType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setType(voLookup3);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// parentLocation
		valueObject.setParentLocation(ims.core.vo.domain.LocShortMappingsVoAssembler.create(map, domainObject.getParentLocation()) );
		// CodeMappings
		valueObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getCodeMappings()) );
		// systemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.Location extractLocation(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifWardMessageQueueVo valueObject) 
	{
		return 	extractLocation(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.Location extractLocation(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifWardMessageQueueVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Location();
		ims.core.resource.place.domain.objects.Location domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject);
			}
			// ims.hl7.vo.ifWardMessageQueueVo ID_Location field is unknown
			domainObject = new ims.core.resource.place.domain.objects.Location();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Location());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.Location)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.Location) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Location());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value3);
		domainObject.setIsActive(valueObject.getIsActive());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getParentLocation() ) 
		{
			if (valueObject.getParentLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getParentLocation()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getParentLocation());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getParentLocation().getBoId());
			}
		}
		domainObject.setParentLocation(value5);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.TaxonomyMapRefVoCollection refCollection6 = new ims.core.clinical.vo.TaxonomyMapRefVoCollection();
		if (valueObject.getCodeMappings() != null)
		{
			for (int i6=0; i6<valueObject.getCodeMappings().size(); i6++)
			{
				ims.core.clinical.vo.TaxonomyMapRefVo ref6 = (ims.core.clinical.vo.TaxonomyMapRefVo)valueObject.getCodeMappings().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.List domainCodeMappings6 = domainObject.getCodeMappings();
		if (domainCodeMappings6 == null)
		{
			domainCodeMappings6 = new java.util.ArrayList();
		}
		for(int i=0; i < size6; i++) 
		{
			ims.core.clinical.vo.TaxonomyMapRefVo vo = refCollection6.get(i);			
			ims.core.clinical.domain.objects.TaxonomyMap dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.TaxonomyMap)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.TaxonomyMap)domainFactory.getDomainObject( ims.core.clinical.domain.objects.TaxonomyMap.class, vo.getBoId());
				}
			}

			int domIdx = domainCodeMappings6.indexOf(dom);
			if (domIdx == -1)
			{
				domainCodeMappings6.add(i, dom);
			}
			else if (i != domIdx && i < domainCodeMappings6.size())
			{
				Object tmp = domainCodeMappings6.get(i);
				domainCodeMappings6.set(i, domainCodeMappings6.get(domIdx));
				domainCodeMappings6.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i6 = domainCodeMappings6.size();
		while (i6 > size6)
		{
			domainCodeMappings6.remove(i6-1);
			i6 = domainCodeMappings6.size();
		}
		
		domainObject.setCodeMappings(domainCodeMappings6);		

		return domainObject;
	}

}
