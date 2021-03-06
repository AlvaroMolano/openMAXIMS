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

package ims.oncology.vo;

/**
 * Linked to core.clinical.PatientDiagnosis business object (ID: 1003100016).
 */
public class PatientDiagnosisForPrimaryTumourVo extends ims.core.clinical.vo.PatientDiagnosisRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientDiagnosisForPrimaryTumourVo()
	{
	}
	public PatientDiagnosisForPrimaryTumourVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientDiagnosisForPrimaryTumourVo(ims.oncology.vo.beans.PatientDiagnosisForPrimaryTumourVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.diagnosisdescription = bean.getDiagnosisDescription();
		this.diagnoseddate = bean.getDiagnosedDate() == null ? null : bean.getDiagnosedDate().buildPartialDate();
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo();
		this.basisofdiagnosis = ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection.buildFromBeanCollection(bean.getBasisofDiagnosis());
		this.diaglaterality = bean.getDiagLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getDiagLaterality());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.oncology.vo.beans.PatientDiagnosisForPrimaryTumourVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.diagnosisdescription = bean.getDiagnosisDescription();
		this.diagnoseddate = bean.getDiagnosedDate() == null ? null : bean.getDiagnosedDate().buildPartialDate();
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo(map);
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo(map);
		this.basisofdiagnosis = ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection.buildFromBeanCollection(bean.getBasisofDiagnosis());
		this.diaglaterality = bean.getDiagLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getDiagLaterality());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.oncology.vo.beans.PatientDiagnosisForPrimaryTumourVoBean bean = null;
		if(map != null)
			bean = (ims.oncology.vo.beans.PatientDiagnosisForPrimaryTumourVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.oncology.vo.beans.PatientDiagnosisForPrimaryTumourVoBean();
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
		if(fieldName.equals("DIAGNOSISDESCRIPTION"))
			return getDiagnosisDescription();
		if(fieldName.equals("DIAGNOSEDDATE"))
			return getDiagnosedDate();
		if(fieldName.equals("AUTHORINGINFO"))
			return getAuthoringInfo();
		if(fieldName.equals("CURRENTSTATUS"))
			return getCurrentStatus();
		if(fieldName.equals("BASISOFDIAGNOSIS"))
			return getBasisofDiagnosis();
		if(fieldName.equals("DIAGLATERALITY"))
			return getDiagLaterality();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getDiagnosisDescriptionIsNotNull()
	{
		return this.diagnosisdescription != null;
	}
	public String getDiagnosisDescription()
	{
		return this.diagnosisdescription;
	}
	public static int getDiagnosisDescriptionMaxLength()
	{
		return 255;
	}
	public void setDiagnosisDescription(String value)
	{
		this.isValidated = false;
		this.diagnosisdescription = value;
	}
	public boolean getDiagnosedDateIsNotNull()
	{
		return this.diagnoseddate != null;
	}
	public ims.framework.utils.PartialDate getDiagnosedDate()
	{
		return this.diagnoseddate;
	}
	public void setDiagnosedDate(ims.framework.utils.PartialDate value)
	{
		this.isValidated = false;
		this.diagnoseddate = value;
	}
	public boolean getAuthoringInfoIsNotNull()
	{
		return this.authoringinfo != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInfo()
	{
		return this.authoringinfo;
	}
	public void setAuthoringInfo(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinfo = value;
	}
	public boolean getCurrentStatusIsNotNull()
	{
		return this.currentstatus != null;
	}
	public ims.clinical.vo.PatientDiagnosisStatusVo getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.clinical.vo.PatientDiagnosisStatusVo value)
	{
		this.isValidated = false;
		this.currentstatus = value;
	}
	public boolean getBasisofDiagnosisIsNotNull()
	{
		return this.basisofdiagnosis != null;
	}
	public ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection getBasisofDiagnosis()
	{
		return this.basisofdiagnosis;
	}
	public void setBasisofDiagnosis(ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection value)
	{
		this.isValidated = false;
		this.basisofdiagnosis = value;
	}
	public boolean getDiagLateralityIsNotNull()
	{
		return this.diaglaterality != null;
	}
	public ims.core.vo.lookups.LateralityLRB getDiagLaterality()
	{
		return this.diaglaterality;
	}
	public void setDiagLaterality(ims.core.vo.lookups.LateralityLRB value)
	{
		this.isValidated = false;
		this.diaglaterality = value;
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
		if(this.authoringinfo != null)
		{
			if(!this.authoringinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.currentstatus != null)
		{
			if(!this.currentstatus.isValidated())
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
		if(this.diagnosisdescription == null || this.diagnosisdescription.length() == 0)
			listOfErrors.add("DiagnosisDescription is mandatory");
		else if(this.diagnosisdescription.length() > 255)
			listOfErrors.add("The length of the field [diagnosisdescription] in the value object [ims.oncology.vo.PatientDiagnosisForPrimaryTumourVo] is too big. It should be less or equal to 255");
		if(this.authoringinfo != null)
		{
			String[] listOfOtherErrors = this.authoringinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.currentstatus != null)
		{
			String[] listOfOtherErrors = this.currentstatus.validate();
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
	
		PatientDiagnosisForPrimaryTumourVo clone = new PatientDiagnosisForPrimaryTumourVo(this.id, this.version);
		
		clone.diagnosisdescription = this.diagnosisdescription;
		if(this.diagnoseddate == null)
			clone.diagnoseddate = null;
		else
			clone.diagnoseddate = (ims.framework.utils.PartialDate)this.diagnoseddate.clone();
		if(this.authoringinfo == null)
			clone.authoringinfo = null;
		else
			clone.authoringinfo = (ims.core.vo.AuthoringInformationVo)this.authoringinfo.clone();
		if(this.currentstatus == null)
			clone.currentstatus = null;
		else
			clone.currentstatus = (ims.clinical.vo.PatientDiagnosisStatusVo)this.currentstatus.clone();
		if(this.basisofdiagnosis == null)
			clone.basisofdiagnosis = null;
		else
			clone.basisofdiagnosis = (ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection)this.basisofdiagnosis.clone();
		if(this.diaglaterality == null)
			clone.diaglaterality = null;
		else
			clone.diaglaterality = (ims.core.vo.lookups.LateralityLRB)this.diaglaterality.clone();
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
		if (!(PatientDiagnosisForPrimaryTumourVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientDiagnosisForPrimaryTumourVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientDiagnosisForPrimaryTumourVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientDiagnosisForPrimaryTumourVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.diagnosisdescription != null)
			count++;
		if(this.diagnoseddate != null)
			count++;
		if(this.authoringinfo != null)
			count++;
		if(this.currentstatus != null)
			count++;
		if(this.basisofdiagnosis != null)
			count++;
		if(this.diaglaterality != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected String diagnosisdescription;
	protected ims.framework.utils.PartialDate diagnoseddate;
	protected ims.core.vo.AuthoringInformationVo authoringinfo;
	protected ims.clinical.vo.PatientDiagnosisStatusVo currentstatus;
	protected ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection basisofdiagnosis;
	protected ims.core.vo.lookups.LateralityLRB diaglaterality;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
