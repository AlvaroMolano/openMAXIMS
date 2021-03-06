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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.vo;

/**
 * Linked to core.vitals.VisualAcuity business object (ID: 1022100010).
 */
public class VSVisualAcuity extends ims.core.vitals.vo.VisualAcuityRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public VSVisualAcuity()
	{
	}
	public VSVisualAcuity(Integer id, int version)
	{
		super(id, version);
	}
	public VSVisualAcuity(ims.core.vo.beans.VSVisualAcuityBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.systemused = bean.getSystemUsed() == null ? null : ims.core.vo.lookups.VSVASystem.buildLookup(bean.getSystemUsed());
		this.leftvalue = bean.getLeftValue();
		this.rightvalue = bean.getRightValue();
		this.iscorrectedvalue = bean.getIsCorrectedValue();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.VSVisualAcuityBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.systemused = bean.getSystemUsed() == null ? null : ims.core.vo.lookups.VSVASystem.buildLookup(bean.getSystemUsed());
		this.leftvalue = bean.getLeftValue();
		this.rightvalue = bean.getRightValue();
		this.iscorrectedvalue = bean.getIsCorrectedValue();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.VSVisualAcuityBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.VSVisualAcuityBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.VSVisualAcuityBean();
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
		if(fieldName.equals("SYSTEMUSED"))
			return getSystemUsed();
		if(fieldName.equals("LEFTVALUE"))
			return getLeftValue();
		if(fieldName.equals("RIGHTVALUE"))
			return getRightValue();
		if(fieldName.equals("ISCORRECTEDVALUE"))
			return getIsCorrectedValue();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSystemUsedIsNotNull()
	{
		return this.systemused != null;
	}
	public ims.core.vo.lookups.VSVASystem getSystemUsed()
	{
		return this.systemused;
	}
	public void setSystemUsed(ims.core.vo.lookups.VSVASystem value)
	{
		this.isValidated = false;
		this.systemused = value;
	}
	public boolean getLeftValueIsNotNull()
	{
		return this.leftvalue != null;
	}
	public String getLeftValue()
	{
		return this.leftvalue;
	}
	public static int getLeftValueMaxLength()
	{
		return 255;
	}
	public void setLeftValue(String value)
	{
		this.isValidated = false;
		this.leftvalue = value;
	}
	public boolean getRightValueIsNotNull()
	{
		return this.rightvalue != null;
	}
	public String getRightValue()
	{
		return this.rightvalue;
	}
	public static int getRightValueMaxLength()
	{
		return 255;
	}
	public void setRightValue(String value)
	{
		this.isValidated = false;
		this.rightvalue = value;
	}
	public boolean getIsCorrectedValueIsNotNull()
	{
		return this.iscorrectedvalue != null;
	}
	public Boolean getIsCorrectedValue()
	{
		return this.iscorrectedvalue;
	}
	public void setIsCorrectedValue(Boolean value)
	{
		this.isValidated = false;
		this.iscorrectedvalue = value;
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
	
		VSVisualAcuity clone = new VSVisualAcuity(this.id, this.version);
		
		if(this.systemused == null)
			clone.systemused = null;
		else
			clone.systemused = (ims.core.vo.lookups.VSVASystem)this.systemused.clone();
		clone.leftvalue = this.leftvalue;
		clone.rightvalue = this.rightvalue;
		clone.iscorrectedvalue = this.iscorrectedvalue;
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
		if (!(VSVisualAcuity.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A VSVisualAcuity object cannot be compared an Object of type " + obj.getClass().getName());
		}
		VSVisualAcuity compareObj = (VSVisualAcuity)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_VisualAcuity() == null && compareObj.getID_VisualAcuity() != null)
				return -1;
			if(this.getID_VisualAcuity() != null && compareObj.getID_VisualAcuity() == null)
				return 1;
			if(this.getID_VisualAcuity() != null && compareObj.getID_VisualAcuity() != null)
				retVal = this.getID_VisualAcuity().compareTo(compareObj.getID_VisualAcuity());
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
		if(this.systemused != null)
			count++;
		if(this.leftvalue != null)
			count++;
		if(this.rightvalue != null)
			count++;
		if(this.iscorrectedvalue != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.vo.lookups.VSVASystem systemused;
	protected String leftvalue;
	protected String rightvalue;
	protected Boolean iscorrectedvalue;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
