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

package ims.core.vo;

/**
 * Linked to core.clinical.Procedure business object (ID: 1003100019).
 */
public class ProcedureLiteVo extends ims.core.clinical.vo.ProcedureRefVo implements ims.vo.ImsCloneable, Comparable, ims.vo.interfaces.IGenericItem
{
	private static final long serialVersionUID = 1L;

	public ProcedureLiteVo()
	{
	}
	public ProcedureLiteVo(Integer id, int version)
	{
		super(id, version);
	}
	public ProcedureLiteVo(ims.core.vo.beans.ProcedureLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.procedurename = bean.getProcedureName();
		this.isactive = bean.getIsActive();
		this.procedurestatus = bean.getProcedureStatus() == null ? null : ims.core.vo.lookups.ProcedureStatus.buildLookup(bean.getProcedureStatus());
		this.durationinmins = bean.getDurationInMins();
		this.tcilagtime = bean.getTCILagTime();
		this.los = bean.getLOS();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.ProcedureLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.procedurename = bean.getProcedureName();
		this.isactive = bean.getIsActive();
		this.procedurestatus = bean.getProcedureStatus() == null ? null : ims.core.vo.lookups.ProcedureStatus.buildLookup(bean.getProcedureStatus());
		this.durationinmins = bean.getDurationInMins();
		this.tcilagtime = bean.getTCILagTime();
		this.los = bean.getLOS();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.ProcedureLiteVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.ProcedureLiteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.ProcedureLiteVoBean();
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
		if(fieldName.equals("PROCEDURENAME"))
			return getProcedureName();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		if(fieldName.equals("PROCEDURESTATUS"))
			return getProcedureStatus();
		if(fieldName.equals("DURATIONINMINS"))
			return getDurationInMins();
		if(fieldName.equals("TCILAGTIME"))
			return getTCILagTime();
		if(fieldName.equals("LOS"))
			return getLOS();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getProcedureNameIsNotNull()
	{
		return this.procedurename != null;
	}
	public String getProcedureName()
	{
		return this.procedurename;
	}
	public static int getProcedureNameMaxLength()
	{
		return 255;
	}
	public void setProcedureName(String value)
	{
		this.isValidated = false;
		this.procedurename = value;
	}
	public boolean getIsActiveIsNotNull()
	{
		return this.isactive != null;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isValidated = false;
		this.isactive = value;
	}
	public boolean getProcedureStatusIsNotNull()
	{
		return this.procedurestatus != null;
	}
	public ims.core.vo.lookups.ProcedureStatus getProcedureStatus()
	{
		return this.procedurestatus;
	}
	public void setProcedureStatus(ims.core.vo.lookups.ProcedureStatus value)
	{
		this.isValidated = false;
		this.procedurestatus = value;
	}
	public boolean getDurationInMinsIsNotNull()
	{
		return this.durationinmins != null;
	}
	public Integer getDurationInMins()
	{
		return this.durationinmins;
	}
	public void setDurationInMins(Integer value)
	{
		this.isValidated = false;
		this.durationinmins = value;
	}
	public boolean getTCILagTimeIsNotNull()
	{
		return this.tcilagtime != null;
	}
	public Integer getTCILagTime()
	{
		return this.tcilagtime;
	}
	public void setTCILagTime(Integer value)
	{
		this.isValidated = false;
		this.tcilagtime = value;
	}
	public boolean getLOSIsNotNull()
	{
		return this.los != null;
	}
	public Integer getLOS()
	{
		return this.los;
	}
	public void setLOS(Integer value)
	{
		this.isValidated = false;
		this.los = value;
	}
	/**
	* IGenericItem Interface Methods
	*/
	public Integer getIGenericItemInfoID()
	{
		return super.getID_Procedure();
	}
		
	public String getIGenericItemInfoName()
	{
		return this.getProcedureName();
	}
		
	public Boolean getIGenericItemInfoIsActive()
	{
		return this.getIsActive();
	}
		
	public void setIGenericItemName(String name)
	{
		this.setProcedureName(name);
	}
		
	public void setIGenericItemIsActive(Boolean active)
	{
		this.setIsActive(active);
	}
	/**
	* toString
	*/
	public String toString() 
	{
		return this.procedurename;
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
		if(this.procedurename == null || this.procedurename.length() == 0)
			listOfErrors.add("ProcedureName is mandatory");
		else if(this.procedurename.length() > 255)
			listOfErrors.add("The length of the field [procedurename] in the value object [ims.core.vo.ProcedureLiteVo] is too big. It should be less or equal to 255");
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
	
		ProcedureLiteVo clone = new ProcedureLiteVo(this.id, this.version);
		
		clone.procedurename = this.procedurename;
		clone.isactive = this.isactive;
		if(this.procedurestatus == null)
			clone.procedurestatus = null;
		else
			clone.procedurestatus = (ims.core.vo.lookups.ProcedureStatus)this.procedurestatus.clone();
		clone.durationinmins = this.durationinmins;
		clone.tcilagtime = this.tcilagtime;
		clone.los = this.los;
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
		if (!(ProcedureLiteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ProcedureLiteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		ProcedureLiteVo compareObj = (ProcedureLiteVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getProcedureName() == null && compareObj.getProcedureName() != null)
				return -1;
			if(this.getProcedureName() != null && compareObj.getProcedureName() == null)
				return 1;
			if(this.getProcedureName() != null && compareObj.getProcedureName() != null)
			{
				if(caseInsensitive)
					retVal = this.getProcedureName().toLowerCase().compareTo(compareObj.getProcedureName().toLowerCase());
				else
					retVal = this.getProcedureName().compareTo(compareObj.getProcedureName());
			}
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
		if(this.procedurename != null)
			count++;
		if(this.isactive != null)
			count++;
		if(this.procedurestatus != null)
			count++;
		if(this.durationinmins != null)
			count++;
		if(this.tcilagtime != null)
			count++;
		if(this.los != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected String procedurename;
	protected Boolean isactive;
	protected ims.core.vo.lookups.ProcedureStatus procedurestatus;
	protected Integer durationinmins;
	protected Integer tcilagtime;
	protected Integer los;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
