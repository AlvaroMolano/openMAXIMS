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

package ims.pci.vo;

/**
 * Linked to PCI.ClientScheduleStage business object (ID: 1091100008).
 */
public class ClientScheduleStageVo extends ims.pci.vo.ClientScheduleStageRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ClientScheduleStageVo()
	{
	}
	public ClientScheduleStageVo(Integer id, int version)
	{
		super(id, version);
	}
	public ClientScheduleStageVo(ims.pci.vo.beans.ClientScheduleStageVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.stage = bean.getStage() == null ? null : bean.getStage().buildVo();
		this.vaccines = ims.pci.vo.ClientScheduleStageVaccineVoCollection.buildFromBeanCollection(bean.getVaccines());
		this.isdeleted = bean.getIsDeleted();
		this.campaignstartdate = bean.getCampaignStartDate() == null ? null : bean.getCampaignStartDate().buildDate();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.pci.vo.beans.ClientScheduleStageVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.stage = bean.getStage() == null ? null : bean.getStage().buildVo(map);
		this.vaccines = ims.pci.vo.ClientScheduleStageVaccineVoCollection.buildFromBeanCollection(bean.getVaccines());
		this.isdeleted = bean.getIsDeleted();
		this.campaignstartdate = bean.getCampaignStartDate() == null ? null : bean.getCampaignStartDate().buildDate();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.pci.vo.beans.ClientScheduleStageVoBean bean = null;
		if(map != null)
			bean = (ims.pci.vo.beans.ClientScheduleStageVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.pci.vo.beans.ClientScheduleStageVoBean();
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
		if(fieldName.equals("STAGE"))
			return getStage();
		if(fieldName.equals("VACCINES"))
			return getVaccines();
		if(fieldName.equals("ISDELETED"))
			return getIsDeleted();
		if(fieldName.equals("CAMPAIGNSTARTDATE"))
			return getCampaignStartDate();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getStageIsNotNull()
	{
		return this.stage != null;
	}
	public ims.pci.vo.StageConfigurationVo getStage()
	{
		return this.stage;
	}
	public void setStage(ims.pci.vo.StageConfigurationVo value)
	{
		this.isValidated = false;
		this.stage = value;
	}
	public boolean getVaccinesIsNotNull()
	{
		return this.vaccines != null;
	}
	public ims.pci.vo.ClientScheduleStageVaccineVoCollection getVaccines()
	{
		return this.vaccines;
	}
	public void setVaccines(ims.pci.vo.ClientScheduleStageVaccineVoCollection value)
	{
		this.isValidated = false;
		this.vaccines = value;
	}
	public boolean getIsDeletedIsNotNull()
	{
		return this.isdeleted != null;
	}
	public Boolean getIsDeleted()
	{
		return this.isdeleted;
	}
	public void setIsDeleted(Boolean value)
	{
		this.isValidated = false;
		this.isdeleted = value;
	}
	public boolean getCampaignStartDateIsNotNull()
	{
		return this.campaignstartdate != null;
	}
	public ims.framework.utils.Date getCampaignStartDate()
	{
		return this.campaignstartdate;
	}
	public void setCampaignStartDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.campaignstartdate = value;
	}
	/**
	* public void updateStageDeleteStatus()
	*/
	public void updateStageDeleteStatus()
	{
		this.isdeleted = true;
	
		if (this.vaccines == null || this.vaccines.size() == 0)
			return;
	
		for (int i = 0; i < this.vaccines.size(); i++)
		{
			if (this.vaccines.get(i) == null)
				continue;
	
			if (!Boolean.TRUE.equals(this.vaccines.get(i).isdeleted))
				this.isdeleted = false;
		}
	}
	
	/**
	* public Integer getInterval()
	*/
	public Integer getInterval()
	{
		if (this.vaccines == null || this.vaccines.size() == 0)
			return null;
			
		for (int i = 0; i < this.vaccines.size(); i++)
		{
			if (this.vaccines.get(i) == null || this.vaccines.get(i).stagevaccine == null)
				continue;
				
			if(Boolean.TRUE.equals(this.vaccines.get(i).stagevaccine.driver))
			{
				return this.vaccines.get(i).stagevaccine.intervalmonths;
			}
		}
			
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
		if(this.stage != null)
		{
			if(!this.stage.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.vaccines != null)
		{
			if(!this.vaccines.isValidated())
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
		if(this.stage == null)
			listOfErrors.add("Stage is mandatory");
		if(this.stage != null)
		{
			String[] listOfOtherErrors = this.stage.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.vaccines == null || this.vaccines.size() == 0)
			listOfErrors.add("Vaccines are mandatory");
		if(this.vaccines != null)
		{
			String[] listOfOtherErrors = this.vaccines.validate();
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
	
		ClientScheduleStageVo clone = new ClientScheduleStageVo(this.id, this.version);
		
		if(this.stage == null)
			clone.stage = null;
		else
			clone.stage = (ims.pci.vo.StageConfigurationVo)this.stage.clone();
		if(this.vaccines == null)
			clone.vaccines = null;
		else
			clone.vaccines = (ims.pci.vo.ClientScheduleStageVaccineVoCollection)this.vaccines.clone();
		clone.isdeleted = this.isdeleted;
		if(this.campaignstartdate == null)
			clone.campaignstartdate = null;
		else
			clone.campaignstartdate = (ims.framework.utils.Date)this.campaignstartdate.clone();
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
		if (!(ClientScheduleStageVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ClientScheduleStageVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		ClientScheduleStageVo compareObj = (ClientScheduleStageVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getStage() == null && compareObj.getStage() != null)
				return -1;
			if(this.getStage() != null && compareObj.getStage() == null)
				return 1;
			if(this.getStage() != null && compareObj.getStage() != null)
				retVal = this.getStage().compareTo(compareObj.getStage());
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
		if(this.stage != null)
			count++;
		if(this.vaccines != null)
			count++;
		if(this.isdeleted != null)
			count++;
		if(this.campaignstartdate != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.pci.vo.StageConfigurationVo stage;
	protected ims.pci.vo.ClientScheduleStageVaccineVoCollection vaccines;
	protected Boolean isdeleted;
	protected ims.framework.utils.Date campaignstartdate;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
