// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

/**
 * Linked to RefMan.TltContactTime business object (ID: 1096100022).
 */
public class TLTContactTimeVo extends ims.RefMan.vo.TltContactTimeRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TLTContactTimeVo()
	{
	}
	public TLTContactTimeVo(Integer id, int version)
	{
		super(id, version);
	}
	public TLTContactTimeVo(ims.RefMan.vo.beans.TLTContactTimeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.starttherapist = bean.getStartTherapist() == null ? null : bean.getStartTherapist().buildVo();
		this.startdatetime = bean.getStartDateTime() == null ? null : bean.getStartDateTime().buildDateTime();
		this.endtherapist = bean.getEndTherapist() == null ? null : bean.getEndTherapist().buildVo();
		this.enddatetime = bean.getEndDateTime() == null ? null : bean.getEndDateTime().buildDateTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.TLTContactTimeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.starttherapist = bean.getStartTherapist() == null ? null : bean.getStartTherapist().buildVo(map);
		this.startdatetime = bean.getStartDateTime() == null ? null : bean.getStartDateTime().buildDateTime();
		this.endtherapist = bean.getEndTherapist() == null ? null : bean.getEndTherapist().buildVo(map);
		this.enddatetime = bean.getEndDateTime() == null ? null : bean.getEndDateTime().buildDateTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.TLTContactTimeVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.TLTContactTimeVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.TLTContactTimeVoBean();
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
		if(fieldName.equals("STARTTHERAPIST"))
			return getStartTherapist();
		if(fieldName.equals("STARTDATETIME"))
			return getStartDateTime();
		if(fieldName.equals("ENDTHERAPIST"))
			return getEndTherapist();
		if(fieldName.equals("ENDDATETIME"))
			return getEndDateTime();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getStartTherapistIsNotNull()
	{
		return this.starttherapist != null;
	}
	public ims.core.vo.HcpLiteVo getStartTherapist()
	{
		return this.starttherapist;
	}
	public void setStartTherapist(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.starttherapist = value;
	}
	public boolean getStartDateTimeIsNotNull()
	{
		return this.startdatetime != null;
	}
	public ims.framework.utils.DateTime getStartDateTime()
	{
		return this.startdatetime;
	}
	public void setStartDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.startdatetime = value;
	}
	public boolean getEndTherapistIsNotNull()
	{
		return this.endtherapist != null;
	}
	public ims.core.vo.HcpLiteVo getEndTherapist()
	{
		return this.endtherapist;
	}
	public void setEndTherapist(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.endtherapist = value;
	}
	public boolean getEndDateTimeIsNotNull()
	{
		return this.enddatetime != null;
	}
	public ims.framework.utils.DateTime getEndDateTime()
	{
		return this.enddatetime;
	}
	public void setEndDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.enddatetime = value;
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
		if(this.starttherapist == null)
			listOfErrors.add("StartTherapist is mandatory");
		if(this.startdatetime == null)
			listOfErrors.add("StartDateTime is mandatory");
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
	
		TLTContactTimeVo clone = new TLTContactTimeVo(this.id, this.version);
		
		if(this.starttherapist == null)
			clone.starttherapist = null;
		else
			clone.starttherapist = (ims.core.vo.HcpLiteVo)this.starttherapist.clone();
		if(this.startdatetime == null)
			clone.startdatetime = null;
		else
			clone.startdatetime = (ims.framework.utils.DateTime)this.startdatetime.clone();
		if(this.endtherapist == null)
			clone.endtherapist = null;
		else
			clone.endtherapist = (ims.core.vo.HcpLiteVo)this.endtherapist.clone();
		if(this.enddatetime == null)
			clone.enddatetime = null;
		else
			clone.enddatetime = (ims.framework.utils.DateTime)this.enddatetime.clone();
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
		if (!(TLTContactTimeVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TLTContactTimeVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TLTContactTimeVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TLTContactTimeVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.starttherapist != null)
			count++;
		if(this.startdatetime != null)
			count++;
		if(this.endtherapist != null)
			count++;
		if(this.enddatetime != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.vo.HcpLiteVo starttherapist;
	protected ims.framework.utils.DateTime startdatetime;
	protected ims.core.vo.HcpLiteVo endtherapist;
	protected ims.framework.utils.DateTime enddatetime;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
