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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.scheduling.vo;

/**
 * Linked to Scheduling.Sch_Session business object (ID: 1055100010).
 */
public class SessionTheatreVo extends ims.scheduling.vo.Sch_SessionRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SessionTheatreVo()
	{
	}
	public SessionTheatreVo(Integer id, int version)
	{
		super(id, version);
	}
	public SessionTheatreVo(ims.scheduling.vo.beans.SessionTheatreVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.sessiondate = bean.getSessionDate() == null ? null : bean.getSessionDate().buildDate();
		this.starttm = bean.getStartTm() == null ? null : bean.getStartTm().buildTime();
		this.endtm = bean.getEndTm() == null ? null : bean.getEndTm().buildTime();
		this.remainingtime = bean.getRemainingTime();
		this.schlocation = bean.getSchLocation() == null ? null : bean.getSchLocation().buildVo();
		this.istheatresession = bean.getIsTheatreSession();
		this.listowners = ims.scheduling.vo.Session_ListOwnerVoCollection.buildFromBeanCollection(bean.getListOwners());
		this.theatretype = bean.getTheatreType() == null ? null : ims.scheduling.vo.lookups.TheatreType.buildLookup(bean.getTheatreType());
		this.theatreproceduresremaining = bean.getTheatreProceduresRemaining() == null ? null : bean.getTheatreProceduresRemaining().buildVo();
		this.theatreslots = ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection.buildFromBeanCollection(bean.getTheatreSlots());
		this.parentchildslots = ims.scheduling.vo.SessionParentChildSlotVoCollection.buildFromBeanCollection(bean.getParentChildSlots());
		this.anaesthetictype = ims.clinical.vo.lookups.AnaestheticTypeCollection.buildFromBeanCollection(bean.getAnaestheticType());
		this.service = bean.getService() == null ? null : new ims.core.clinical.vo.ServiceRefVo(new Integer(bean.getService().getId()), bean.getService().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.SessionTheatreVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.sessiondate = bean.getSessionDate() == null ? null : bean.getSessionDate().buildDate();
		this.starttm = bean.getStartTm() == null ? null : bean.getStartTm().buildTime();
		this.endtm = bean.getEndTm() == null ? null : bean.getEndTm().buildTime();
		this.remainingtime = bean.getRemainingTime();
		this.schlocation = bean.getSchLocation() == null ? null : bean.getSchLocation().buildVo(map);
		this.istheatresession = bean.getIsTheatreSession();
		this.listowners = ims.scheduling.vo.Session_ListOwnerVoCollection.buildFromBeanCollection(bean.getListOwners());
		this.theatretype = bean.getTheatreType() == null ? null : ims.scheduling.vo.lookups.TheatreType.buildLookup(bean.getTheatreType());
		this.theatreproceduresremaining = bean.getTheatreProceduresRemaining() == null ? null : bean.getTheatreProceduresRemaining().buildVo(map);
		this.theatreslots = ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection.buildFromBeanCollection(bean.getTheatreSlots());
		this.parentchildslots = ims.scheduling.vo.SessionParentChildSlotVoCollection.buildFromBeanCollection(bean.getParentChildSlots());
		this.anaesthetictype = ims.clinical.vo.lookups.AnaestheticTypeCollection.buildFromBeanCollection(bean.getAnaestheticType());
		this.service = bean.getService() == null ? null : new ims.core.clinical.vo.ServiceRefVo(new Integer(bean.getService().getId()), bean.getService().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.SessionTheatreVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.SessionTheatreVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.SessionTheatreVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("NAME"))
			return getName();
		if(fieldName.equals("SESSIONDATE"))
			return getSessionDate();
		if(fieldName.equals("STARTTM"))
			return getStartTm();
		if(fieldName.equals("ENDTM"))
			return getEndTm();
		if(fieldName.equals("REMAININGTIME"))
			return getRemainingTime();
		if(fieldName.equals("SCHLOCATION"))
			return getSchLocation();
		if(fieldName.equals("ISTHEATRESESSION"))
			return getIsTheatreSession();
		if(fieldName.equals("LISTOWNERS"))
			return getListOwners();
		if(fieldName.equals("THEATRETYPE"))
			return getTheatreType();
		if(fieldName.equals("THEATREPROCEDURESREMAINING"))
			return getTheatreProceduresRemaining();
		if(fieldName.equals("THEATRESLOTS"))
			return getTheatreSlots();
		if(fieldName.equals("PARENTCHILDSLOTS"))
			return getParentChildSlots();
		if(fieldName.equals("ANAESTHETICTYPE"))
			return getAnaestheticType();
		if(fieldName.equals("SERVICE"))
			return getService();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getNameIsNotNull()
	{
		return this.name != null;
	}
	public String getName()
	{
		return this.name;
	}
	public static int getNameMaxLength()
	{
		return 100;
	}
	public void setName(String value)
	{
		this.isValidated = false;
		this.name = value;
	}
	public boolean getSessionDateIsNotNull()
	{
		return this.sessiondate != null;
	}
	public ims.framework.utils.Date getSessionDate()
	{
		return this.sessiondate;
	}
	public void setSessionDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.sessiondate = value;
	}
	public boolean getStartTmIsNotNull()
	{
		return this.starttm != null;
	}
	public ims.framework.utils.Time getStartTm()
	{
		return this.starttm;
	}
	public void setStartTm(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.starttm = value;
	}
	public boolean getEndTmIsNotNull()
	{
		return this.endtm != null;
	}
	public ims.framework.utils.Time getEndTm()
	{
		return this.endtm;
	}
	public void setEndTm(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.endtm = value;
	}
	public boolean getRemainingTimeIsNotNull()
	{
		return this.remainingtime != null;
	}
	public Integer getRemainingTime()
	{
		return this.remainingtime;
	}
	public void setRemainingTime(Integer value)
	{
		this.isValidated = false;
		this.remainingtime = value;
	}
	public boolean getSchLocationIsNotNull()
	{
		return this.schlocation != null;
	}
	public ims.core.vo.LocationLiteVo getSchLocation()
	{
		return this.schlocation;
	}
	public void setSchLocation(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.schlocation = value;
	}
	public boolean getIsTheatreSessionIsNotNull()
	{
		return this.istheatresession != null;
	}
	public Boolean getIsTheatreSession()
	{
		return this.istheatresession;
	}
	public void setIsTheatreSession(Boolean value)
	{
		this.isValidated = false;
		this.istheatresession = value;
	}
	public boolean getListOwnersIsNotNull()
	{
		return this.listowners != null;
	}
	public ims.scheduling.vo.Session_ListOwnerVoCollection getListOwners()
	{
		return this.listowners;
	}
	public void setListOwners(ims.scheduling.vo.Session_ListOwnerVoCollection value)
	{
		this.isValidated = false;
		this.listowners = value;
	}
	public boolean getTheatreTypeIsNotNull()
	{
		return this.theatretype != null;
	}
	public ims.scheduling.vo.lookups.TheatreType getTheatreType()
	{
		return this.theatretype;
	}
	public void setTheatreType(ims.scheduling.vo.lookups.TheatreType value)
	{
		this.isValidated = false;
		this.theatretype = value;
	}
	public boolean getTheatreProceduresRemainingIsNotNull()
	{
		return this.theatreproceduresremaining != null;
	}
	public ims.scheduling.vo.SessionTheatreProceduresRemainingVo getTheatreProceduresRemaining()
	{
		return this.theatreproceduresremaining;
	}
	public void setTheatreProceduresRemaining(ims.scheduling.vo.SessionTheatreProceduresRemainingVo value)
	{
		this.isValidated = false;
		this.theatreproceduresremaining = value;
	}
	public boolean getTheatreSlotsIsNotNull()
	{
		return this.theatreslots != null;
	}
	public ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection getTheatreSlots()
	{
		return this.theatreslots;
	}
	public void setTheatreSlots(ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection value)
	{
		this.isValidated = false;
		this.theatreslots = value;
	}
	public boolean getParentChildSlotsIsNotNull()
	{
		return this.parentchildslots != null;
	}
	public ims.scheduling.vo.SessionParentChildSlotVoCollection getParentChildSlots()
	{
		return this.parentchildslots;
	}
	public void setParentChildSlots(ims.scheduling.vo.SessionParentChildSlotVoCollection value)
	{
		this.isValidated = false;
		this.parentchildslots = value;
	}
	public boolean getAnaestheticTypeIsNotNull()
	{
		return this.anaesthetictype != null;
	}
	public ims.clinical.vo.lookups.AnaestheticTypeCollection getAnaestheticType()
	{
		return this.anaesthetictype;
	}
	public void setAnaestheticType(ims.clinical.vo.lookups.AnaestheticTypeCollection value)
	{
		this.isValidated = false;
		this.anaesthetictype = value;
	}
	public boolean getServiceIsNotNull()
	{
		return this.service != null;
	}
	public ims.core.clinical.vo.ServiceRefVo getService()
	{
		return this.service;
	}
	public void setService(ims.core.clinical.vo.ServiceRefVo value)
	{
		this.isValidated = false;
		this.service = value;
	}
	/**
	* calculateChildSlots
	*/
	/**
	 * using the parent slot and the session and the duration required the child slots to be also 'booked' will be calculated for this parentslot
	 * @param session
	 * @param parentChildSlot
	 * @return
	 */
	public SessionParentChildSlotRefVoCollection calculateChildSlots(SessionParentChildSlotVo parentSlot, Integer apptDuration)
	{
		if (parentSlot == null)
			throw new ims.framework.exceptions.CodingRuntimeException("parentSlot cannot be null in method calculateChildSlots");
		if (apptDuration == null)
			throw new ims.framework.exceptions.CodingRuntimeException("apptDuration cannot be null in method calculateChildSlots");
		
		int duration = apptDuration;
		
		SessionParentChildSlotRefVoCollection voCollChildSlots = new SessionParentChildSlotRefVoCollection();
		boolean startPointReached = false;
		if(this.getParentChildSlotsIsNotNull())
		{
			this.getParentChildSlots().sort(ims.framework.enumerations.SortOrder.ASCENDING);
			for(SessionParentChildSlotVo voSlot : this.getParentChildSlots())
			{
				if(startPointReached && duration >0)
				{
					if(voSlot.getStatusIsNotNull() && voSlot.getStatus().equals(ims.scheduling.vo.lookups.Status_Reason.SLOTOPENED))
					{
						duration-= voSlot.getDuration();
						voCollChildSlots.add(voSlot);
					}
					else
						return null;
				}
				else if(parentSlot.equals(voSlot)) //starting point
				{
					duration -= parentSlot.getDuration();
					startPointReached = true;
				}
			}
		}
			
		return voCollChildSlots;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.theatreproceduresremaining != null)
		{
			if(!this.theatreproceduresremaining.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.parentchildslots != null)
		{
			if(!this.parentchildslots.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.name != null)
			if(this.name.length() > 100)
				listOfErrors.add("The length of the field [name] in the value object [ims.scheduling.vo.SessionTheatreVo] is too big. It should be less or equal to 100");
		if(this.theatreproceduresremaining != null)
		{
			String[] listOfOtherErrors = this.theatreproceduresremaining.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.parentchildslots != null)
		{
			String[] listOfOtherErrors = this.parentchildslots.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		SessionTheatreVo clone = new SessionTheatreVo(this.id, this.version);
		
		clone.name = this.name;
		if(this.sessiondate == null)
			clone.sessiondate = null;
		else
			clone.sessiondate = (ims.framework.utils.Date)this.sessiondate.clone();
		if(this.starttm == null)
			clone.starttm = null;
		else
			clone.starttm = (ims.framework.utils.Time)this.starttm.clone();
		if(this.endtm == null)
			clone.endtm = null;
		else
			clone.endtm = (ims.framework.utils.Time)this.endtm.clone();
		clone.remainingtime = this.remainingtime;
		if(this.schlocation == null)
			clone.schlocation = null;
		else
			clone.schlocation = (ims.core.vo.LocationLiteVo)this.schlocation.clone();
		clone.istheatresession = this.istheatresession;
		if(this.listowners == null)
			clone.listowners = null;
		else
			clone.listowners = (ims.scheduling.vo.Session_ListOwnerVoCollection)this.listowners.clone();
		if(this.theatretype == null)
			clone.theatretype = null;
		else
			clone.theatretype = (ims.scheduling.vo.lookups.TheatreType)this.theatretype.clone();
		if(this.theatreproceduresremaining == null)
			clone.theatreproceduresremaining = null;
		else
			clone.theatreproceduresremaining = (ims.scheduling.vo.SessionTheatreProceduresRemainingVo)this.theatreproceduresremaining.clone();
		if(this.theatreslots == null)
			clone.theatreslots = null;
		else
			clone.theatreslots = (ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection)this.theatreslots.clone();
		if(this.parentchildslots == null)
			clone.parentchildslots = null;
		else
			clone.parentchildslots = (ims.scheduling.vo.SessionParentChildSlotVoCollection)this.parentchildslots.clone();
		if(this.anaesthetictype == null)
			clone.anaesthetictype = null;
		else
			clone.anaesthetictype = (ims.clinical.vo.lookups.AnaestheticTypeCollection)this.anaesthetictype.clone();
		clone.service = this.service;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(SessionTheatreVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SessionTheatreVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		SessionTheatreVo compareObj = (SessionTheatreVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSessionDate() == null && compareObj.getSessionDate() != null)
				return -1;
			if(this.getSessionDate() != null && compareObj.getSessionDate() == null)
				return 1;
			if(this.getSessionDate() != null && compareObj.getSessionDate() != null)
				retVal = this.getSessionDate().compareTo(compareObj.getSessionDate());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.name != null)
			count++;
		if(this.sessiondate != null)
			count++;
		if(this.starttm != null)
			count++;
		if(this.endtm != null)
			count++;
		if(this.remainingtime != null)
			count++;
		if(this.schlocation != null)
			count++;
		if(this.istheatresession != null)
			count++;
		if(this.listowners != null)
			count++;
		if(this.theatretype != null)
			count++;
		if(this.theatreproceduresremaining != null)
			count++;
		if(this.theatreslots != null)
			count++;
		if(this.parentchildslots != null)
			count++;
		if(this.anaesthetictype != null)
			count++;
		if(this.service != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 14;
	}
	protected String name;
	protected ims.framework.utils.Date sessiondate;
	protected ims.framework.utils.Time starttm;
	protected ims.framework.utils.Time endtm;
	protected Integer remainingtime;
	protected ims.core.vo.LocationLiteVo schlocation;
	protected Boolean istheatresession;
	protected ims.scheduling.vo.Session_ListOwnerVoCollection listowners;
	protected ims.scheduling.vo.lookups.TheatreType theatretype;
	protected ims.scheduling.vo.SessionTheatreProceduresRemainingVo theatreproceduresremaining;
	protected ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection theatreslots;
	protected ims.scheduling.vo.SessionParentChildSlotVoCollection parentchildslots;
	protected ims.clinical.vo.lookups.AnaestheticTypeCollection anaesthetictype;
	protected ims.core.clinical.vo.ServiceRefVo service;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
