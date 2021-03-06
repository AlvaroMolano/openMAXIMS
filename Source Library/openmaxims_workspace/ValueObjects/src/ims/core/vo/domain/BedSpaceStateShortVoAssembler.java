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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class BedSpaceStateShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.BedSpaceStateShortVo copy(ims.core.vo.BedSpaceStateShortVo valueObjectDest, ims.core.vo.BedSpaceStateShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_BedSpaceState(valueObjectSrc.getID_BedSpaceState());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// BedSpace
		valueObjectDest.setBedSpace(valueObjectSrc.getBedSpace());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// Bay
		valueObjectDest.setBay(valueObjectSrc.getBay());
		// CurrentBedStatus
		valueObjectDest.setCurrentBedStatus(valueObjectSrc.getCurrentBedStatus());
		// InpatientEpisode
		valueObjectDest.setInpatientEpisode(valueObjectSrc.getInpatientEpisode());
		// isMaternity
		valueObjectDest.setIsMaternity(valueObjectSrc.getIsMaternity());
		// NoOfInfants
		valueObjectDest.setNoOfInfants(valueObjectSrc.getNoOfInfants());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBedSpaceStateShortVoCollectionFromBedSpaceState(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.BedSpaceState objects.
	 */
	public static ims.core.vo.BedSpaceStateShortVoCollection createBedSpaceStateShortVoCollectionFromBedSpaceState(java.util.Set domainObjectSet)	
	{
		return createBedSpaceStateShortVoCollectionFromBedSpaceState(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.BedSpaceState objects.
	 */
	public static ims.core.vo.BedSpaceStateShortVoCollection createBedSpaceStateShortVoCollectionFromBedSpaceState(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.BedSpaceStateShortVoCollection voList = new ims.core.vo.BedSpaceStateShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.BedSpaceState domainObject = (ims.core.admin.pas.domain.objects.BedSpaceState) iterator.next();
			ims.core.vo.BedSpaceStateShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.BedSpaceState objects.
	 */
	public static ims.core.vo.BedSpaceStateShortVoCollection createBedSpaceStateShortVoCollectionFromBedSpaceState(java.util.List domainObjectList) 
	{
		return createBedSpaceStateShortVoCollectionFromBedSpaceState(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.BedSpaceState objects.
	 */
	public static ims.core.vo.BedSpaceStateShortVoCollection createBedSpaceStateShortVoCollectionFromBedSpaceState(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.BedSpaceStateShortVoCollection voList = new ims.core.vo.BedSpaceStateShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.BedSpaceState domainObject = (ims.core.admin.pas.domain.objects.BedSpaceState) domainObjectList.get(i);
			ims.core.vo.BedSpaceStateShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.BedSpaceState set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBedSpaceStateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateShortVoCollection voCollection) 
	 {
	 	return extractBedSpaceStateSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBedSpaceStateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.BedSpaceStateShortVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.BedSpaceState domainObject = BedSpaceStateShortVoAssembler.extractBedSpaceState(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.BedSpaceState list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBedSpaceStateList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateShortVoCollection voCollection) 
	 {
	 	return extractBedSpaceStateList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBedSpaceStateList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.BedSpaceStateShortVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.BedSpaceState domainObject = BedSpaceStateShortVoAssembler.extractBedSpaceState(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.BedSpaceState object.
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceState
	 */
	 public static ims.core.vo.BedSpaceStateShortVo create(ims.core.admin.pas.domain.objects.BedSpaceState domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.BedSpaceState object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.BedSpaceStateShortVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.BedSpaceState domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.BedSpaceStateShortVo valueObject = (ims.core.vo.BedSpaceStateShortVo) map.getValueObject(domainObject, ims.core.vo.BedSpaceStateShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.BedSpaceStateShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceState
	 */
	 public static ims.core.vo.BedSpaceStateShortVo insert(ims.core.vo.BedSpaceStateShortVo valueObject, ims.core.admin.pas.domain.objects.BedSpaceState domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceState
	 */
	 public static ims.core.vo.BedSpaceStateShortVo insert(DomainObjectMap map, ims.core.vo.BedSpaceStateShortVo valueObject, ims.core.admin.pas.domain.objects.BedSpaceState domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_BedSpaceState(domainObject.getId());
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
			
		// BedSpace
		valueObject.setBedSpace(ims.core.vo.domain.BedSpaceVoAssembler.create(map, domainObject.getBedSpace()) );
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// Bay
		valueObject.setBay(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getBay()) );
		// CurrentBedStatus
		valueObject.setCurrentBedStatus(ims.core.vo.domain.BedSpaceStateStatusLiteVoAssembler.create(map, domainObject.getCurrentBedStatus()) );
		// InpatientEpisode
		valueObject.setInpatientEpisode(ims.core.vo.domain.InpatientEpisodeShortVoAssembler.create(map, domainObject.getInpatientEpisode()) );
		// isMaternity
		valueObject.setIsMaternity( domainObject.isIsMaternity() );
		// NoOfInfants
		valueObject.setNoOfInfants(domainObject.getNoOfInfants());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.BedSpaceState extractBedSpaceState(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateShortVo valueObject) 
	{
		return 	extractBedSpaceState(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.BedSpaceState extractBedSpaceState(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_BedSpaceState();
		ims.core.admin.pas.domain.objects.BedSpaceState domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.BedSpaceState)domMap.get(valueObject);
			}
			// ims.core.vo.BedSpaceStateShortVo ID_BedSpaceState field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.BedSpaceState();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_BedSpaceState());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.BedSpaceState)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.BedSpaceState) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.BedSpaceState.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_BedSpaceState());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.layout.domain.objects.BedSpace value1 = null;
		if ( null != valueObject.getBedSpace() ) 
		{
			if (valueObject.getBedSpace().getBoId() == null)
			{
				if (domMap.get(valueObject.getBedSpace()) != null)
				{
					value1 = (ims.core.layout.domain.objects.BedSpace)domMap.get(valueObject.getBedSpace());
				}
			}
			else
			{
				value1 = (ims.core.layout.domain.objects.BedSpace)domainFactory.getDomainObject(ims.core.layout.domain.objects.BedSpace.class, valueObject.getBedSpace().getBoId());
			}
		}
		domainObject.setBedSpace(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getBay() ) 
		{
			if (valueObject.getBay().getBoId() == null)
			{
				if (domMap.get(valueObject.getBay()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getBay());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getBay().getBoId());
			}
		}
		domainObject.setBay(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.BedSpaceStateStatus value4 = null;
		if ( null != valueObject.getCurrentBedStatus() ) 
		{
			if (valueObject.getCurrentBedStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentBedStatus()) != null)
				{
					value4 = (ims.core.admin.pas.domain.objects.BedSpaceStateStatus)domMap.get(valueObject.getCurrentBedStatus());
				}
			}
			else
			{
				value4 = (ims.core.admin.pas.domain.objects.BedSpaceStateStatus)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.BedSpaceStateStatus.class, valueObject.getCurrentBedStatus().getBoId());
			}
		}
		domainObject.setCurrentBedStatus(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.InpatientEpisode value5 = null;
		if ( null != valueObject.getInpatientEpisode() ) 
		{
			if (valueObject.getInpatientEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getInpatientEpisode()) != null)
				{
					value5 = (ims.core.admin.pas.domain.objects.InpatientEpisode)domMap.get(valueObject.getInpatientEpisode());
				}
			}
			else
			{
				value5 = (ims.core.admin.pas.domain.objects.InpatientEpisode)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.InpatientEpisode.class, valueObject.getInpatientEpisode().getBoId());
			}
		}
		domainObject.setInpatientEpisode(value5);
		domainObject.setIsMaternity(valueObject.getIsMaternity());
		domainObject.setNoOfInfants(valueObject.getNoOfInfants());

		return domainObject;
	}

}
