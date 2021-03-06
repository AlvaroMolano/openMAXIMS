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

package ims.emergency.vo;

/**
 * Linked to core.patient.Patient business object (ID: 1001100000).
 */
public class PatientWithNonHealthCoverLiteVo extends ims.core.patient.vo.PatientRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientWithNonHealthCoverLiteVo()
	{
	}
	public PatientWithNonHealthCoverLiteVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientWithNonHealthCoverLiteVo(ims.emergency.vo.beans.PatientWithNonHealthCoverLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.currentmedicalinsurance = bean.getCurrentMedicalInsurance() == null ? null : bean.getCurrentMedicalInsurance().buildVo();
		this.nationalhealthcover = bean.getNationalHealthCover() == null ? null : bean.getNationalHealthCover().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.PatientWithNonHealthCoverLiteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.currentmedicalinsurance = bean.getCurrentMedicalInsurance() == null ? null : bean.getCurrentMedicalInsurance().buildVo(map);
		this.nationalhealthcover = bean.getNationalHealthCover() == null ? null : bean.getNationalHealthCover().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.PatientWithNonHealthCoverLiteVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.PatientWithNonHealthCoverLiteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.PatientWithNonHealthCoverLiteVoBean();
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
		if(fieldName.equals("CURRENTMEDICALINSURANCE"))
			return getCurrentMedicalInsurance();
		if(fieldName.equals("NATIONALHEALTHCOVER"))
			return getNationalHealthCover();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCurrentMedicalInsuranceIsNotNull()
	{
		return this.currentmedicalinsurance != null;
	}
	public ims.core.vo.PatientMedicalInsuranceVo getCurrentMedicalInsurance()
	{
		return this.currentmedicalinsurance;
	}
	public void setCurrentMedicalInsurance(ims.core.vo.PatientMedicalInsuranceVo value)
	{
		this.isValidated = false;
		this.currentmedicalinsurance = value;
	}
	public boolean getNationalHealthCoverIsNotNull()
	{
		return this.nationalhealthcover != null;
	}
	public ims.core.vo.NationalHealthCoverVo getNationalHealthCover()
	{
		return this.nationalhealthcover;
	}
	public void setNationalHealthCover(ims.core.vo.NationalHealthCoverVo value)
	{
		this.isValidated = false;
		this.nationalhealthcover = value;
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
		if(this.currentmedicalinsurance != null)
		{
			if(!this.currentmedicalinsurance.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.nationalhealthcover != null)
		{
			if(!this.nationalhealthcover.isValidated())
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
		if(this.currentmedicalinsurance != null)
		{
			String[] listOfOtherErrors = this.currentmedicalinsurance.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.nationalhealthcover != null)
		{
			String[] listOfOtherErrors = this.nationalhealthcover.validate();
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
	
		PatientWithNonHealthCoverLiteVo clone = new PatientWithNonHealthCoverLiteVo(this.id, this.version);
		
		if(this.currentmedicalinsurance == null)
			clone.currentmedicalinsurance = null;
		else
			clone.currentmedicalinsurance = (ims.core.vo.PatientMedicalInsuranceVo)this.currentmedicalinsurance.clone();
		if(this.nationalhealthcover == null)
			clone.nationalhealthcover = null;
		else
			clone.nationalhealthcover = (ims.core.vo.NationalHealthCoverVo)this.nationalhealthcover.clone();
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
		if (!(PatientWithNonHealthCoverLiteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientWithNonHealthCoverLiteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientWithNonHealthCoverLiteVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientWithNonHealthCoverLiteVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.currentmedicalinsurance != null)
			count++;
		if(this.nationalhealthcover != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.core.vo.PatientMedicalInsuranceVo currentmedicalinsurance;
	protected ims.core.vo.NationalHealthCoverVo nationalhealthcover;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
