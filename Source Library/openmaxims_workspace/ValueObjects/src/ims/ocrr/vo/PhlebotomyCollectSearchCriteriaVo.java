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


public class PhlebotomyCollectSearchCriteriaVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PhlebotomyCollectSearchCriteriaVo()
	{
	}
	public PhlebotomyCollectSearchCriteriaVo(ims.ocrr.vo.beans.PhlebotomyCollectSearchCriteriaVoBean bean)
	{
		this.date = bean.getDate() == null ? null : bean.getDate().buildDate();
		this.collectionround = bean.getCollectionRound() == null ? null : bean.getCollectionRound().buildVo();
		this.searchtype = bean.getSearchType();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.PhlebotomyCollectSearchCriteriaVoBean bean)
	{
		this.date = bean.getDate() == null ? null : bean.getDate().buildDate();
		this.collectionround = bean.getCollectionRound() == null ? null : bean.getCollectionRound().buildVo(map);
		this.searchtype = bean.getSearchType();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.PhlebotomyCollectSearchCriteriaVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.PhlebotomyCollectSearchCriteriaVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.PhlebotomyCollectSearchCriteriaVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getDateIsNotNull()
	{
		return this.date != null;
	}
	public ims.framework.utils.Date getDate()
	{
		return this.date;
	}
	public void setDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.date = value;
	}
	public boolean getCollectionRoundIsNotNull()
	{
		return this.collectionround != null;
	}
	public ims.ocrr.vo.PhlebotomyRoundShortVo getCollectionRound()
	{
		return this.collectionround;
	}
	public void setCollectionRound(ims.ocrr.vo.PhlebotomyRoundShortVo value)
	{
		this.isValidated = false;
		this.collectionround = value;
	}
	public boolean getSearchTypeIsNotNull()
	{
		return this.searchtype != null;
	}
	public Integer getSearchType()
	{
		return this.searchtype;
	}
	public void setSearchType(Integer value)
	{
		this.isValidated = false;
		this.searchtype = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PhlebotomyCollectSearchCriteriaVo clone = new PhlebotomyCollectSearchCriteriaVo();
		
		if(this.date == null)
			clone.date = null;
		else
			clone.date = (ims.framework.utils.Date)this.date.clone();
		if(this.collectionround == null)
			clone.collectionround = null;
		else
			clone.collectionround = (ims.ocrr.vo.PhlebotomyRoundShortVo)this.collectionround.clone();
		clone.searchtype = this.searchtype;
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
		if (!(PhlebotomyCollectSearchCriteriaVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PhlebotomyCollectSearchCriteriaVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		PhlebotomyCollectSearchCriteriaVo compareObj = (PhlebotomyCollectSearchCriteriaVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getCollectionRound() == null && compareObj.getCollectionRound() != null)
				return -1;
			if(this.getCollectionRound() != null && compareObj.getCollectionRound() == null)
				return 1;
			if(this.getCollectionRound() != null && compareObj.getCollectionRound() != null)
				retVal = this.getCollectionRound().compareTo(compareObj.getCollectionRound());
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
		if(this.date != null)
			count++;
		if(this.collectionround != null)
			count++;
		if(this.searchtype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.framework.utils.Date date;
	protected ims.ocrr.vo.PhlebotomyRoundShortVo collectionround;
	protected Integer searchtype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
