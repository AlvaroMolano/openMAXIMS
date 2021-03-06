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

package ims.ocrr.vo;

/**
 * Linked to OCRR.OrderingResults.OrderSpecimen business object (ID: 1070100010).
 */
public class OrderSpecimenLiteVo extends ims.ocrr.orderingresults.vo.OrderSpecimenRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public OrderSpecimenLiteVo()
	{
	}
	public OrderSpecimenLiteVo(Integer id, int version)
	{
		super(id, version);
	}
	public OrderSpecimenLiteVo(ims.ocrr.vo.beans.OrderSpecimenLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.specimensource = bean.getSpecimenSource() == null ? null : ims.ocrr.vo.lookups.SpecimenType.buildLookup(bean.getSpecimenSource());
		this.sitecd = bean.getSiteCd() == null ? null : ims.ocrr.vo.lookups.SpecimenSite.buildLookup(bean.getSiteCd());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.OrderSpecimenLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.specimensource = bean.getSpecimenSource() == null ? null : ims.ocrr.vo.lookups.SpecimenType.buildLookup(bean.getSpecimenSource());
		this.sitecd = bean.getSiteCd() == null ? null : ims.ocrr.vo.lookups.SpecimenSite.buildLookup(bean.getSiteCd());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.OrderSpecimenLiteVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.OrderSpecimenLiteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.OrderSpecimenLiteVoBean();
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
		if(fieldName.equals("SPECIMENSOURCE"))
			return getSpecimenSource();
		if(fieldName.equals("SITECD"))
			return getSiteCd();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSpecimenSourceIsNotNull()
	{
		return this.specimensource != null;
	}
	public ims.ocrr.vo.lookups.SpecimenType getSpecimenSource()
	{
		return this.specimensource;
	}
	public void setSpecimenSource(ims.ocrr.vo.lookups.SpecimenType value)
	{
		this.isValidated = false;
		this.specimensource = value;
	}
	public boolean getSiteCdIsNotNull()
	{
		return this.sitecd != null;
	}
	public ims.ocrr.vo.lookups.SpecimenSite getSiteCd()
	{
		return this.sitecd;
	}
	public void setSiteCd(ims.ocrr.vo.lookups.SpecimenSite value)
	{
		this.isValidated = false;
		this.sitecd = value;
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
		if(this.specimensource == null)
			listOfErrors.add("SpecimenSource is mandatory");
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
	
		OrderSpecimenLiteVo clone = new OrderSpecimenLiteVo(this.id, this.version);
		
		if(this.specimensource == null)
			clone.specimensource = null;
		else
			clone.specimensource = (ims.ocrr.vo.lookups.SpecimenType)this.specimensource.clone();
		if(this.sitecd == null)
			clone.sitecd = null;
		else
			clone.sitecd = (ims.ocrr.vo.lookups.SpecimenSite)this.sitecd.clone();
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
		if (!(OrderSpecimenLiteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A OrderSpecimenLiteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((OrderSpecimenLiteVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((OrderSpecimenLiteVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.specimensource != null)
			count++;
		if(this.sitecd != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.ocrr.vo.lookups.SpecimenType specimensource;
	protected ims.ocrr.vo.lookups.SpecimenSite sitecd;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
