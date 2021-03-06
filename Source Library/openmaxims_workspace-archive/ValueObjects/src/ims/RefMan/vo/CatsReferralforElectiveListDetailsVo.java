// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

/**
 * Linked to RefMan.CatsReferral business object (ID: 1004100035).
 */
public class CatsReferralforElectiveListDetailsVo extends ims.RefMan.vo.CatsReferralRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CatsReferralforElectiveListDetailsVo()
	{
	}
	public CatsReferralforElectiveListDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public CatsReferralforElectiveListDetailsVo(ims.RefMan.vo.beans.CatsReferralforElectiveListDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo();
		this.carecontext = bean.getCareContext() == null ? null : bean.getCareContext().buildVo();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.isfitforsurgery = bean.getIsFitForSurgery();
		this.urgency = bean.getUrgency() == null ? null : ims.RefMan.vo.lookups.ReferralUrgency.buildLookup(bean.getUrgency());
		this.journey = bean.getJourney() == null ? null : bean.getJourney().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.CatsReferralforElectiveListDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo(map);
		this.carecontext = bean.getCareContext() == null ? null : bean.getCareContext().buildVo(map);
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.isfitforsurgery = bean.getIsFitForSurgery();
		this.urgency = bean.getUrgency() == null ? null : ims.RefMan.vo.lookups.ReferralUrgency.buildLookup(bean.getUrgency());
		this.journey = bean.getJourney() == null ? null : bean.getJourney().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.CatsReferralforElectiveListDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.CatsReferralforElectiveListDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.CatsReferralforElectiveListDetailsVoBean();
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
		if(fieldName.equals("REFERRALDETAILS"))
			return getReferralDetails();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("ISFITFORSURGERY"))
			return getIsFitForSurgery();
		if(fieldName.equals("URGENCY"))
			return getUrgency();
		if(fieldName.equals("JOURNEY"))
			return getJourney();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getReferralDetailsIsNotNull()
	{
		return this.referraldetails != null;
	}
	public ims.RefMan.vo.ReferralLetterDetailsForElectiveListDetailsVo getReferralDetails()
	{
		return this.referraldetails;
	}
	public void setReferralDetails(ims.RefMan.vo.ReferralLetterDetailsForElectiveListDetailsVo value)
	{
		this.isValidated = false;
		this.referraldetails = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.vo.CareContextMinVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.vo.CareContextMinVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getIsFitForSurgeryIsNotNull()
	{
		return this.isfitforsurgery != null;
	}
	public Boolean getIsFitForSurgery()
	{
		return this.isfitforsurgery;
	}
	public void setIsFitForSurgery(Boolean value)
	{
		this.isValidated = false;
		this.isfitforsurgery = value;
	}
	public boolean getUrgencyIsNotNull()
	{
		return this.urgency != null;
	}
	public ims.RefMan.vo.lookups.ReferralUrgency getUrgency()
	{
		return this.urgency;
	}
	public void setUrgency(ims.RefMan.vo.lookups.ReferralUrgency value)
	{
		this.isValidated = false;
		this.urgency = value;
	}
	public boolean getJourneyIsNotNull()
	{
		return this.journey != null;
	}
	public ims.RefMan.vo.PatientPathwayJourneyForERODVo getJourney()
	{
		return this.journey;
	}
	public void setJourney(ims.RefMan.vo.PatientPathwayJourneyForERODVo value)
	{
		this.isValidated = false;
		this.journey = value;
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
		if(this.carecontext != null)
		{
			if(!this.carecontext.isValidated())
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
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.carecontext != null)
		{
			String[] listOfOtherErrors = this.carecontext.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
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
	
		CatsReferralforElectiveListDetailsVo clone = new CatsReferralforElectiveListDetailsVo(this.id, this.version);
		
		if(this.referraldetails == null)
			clone.referraldetails = null;
		else
			clone.referraldetails = (ims.RefMan.vo.ReferralLetterDetailsForElectiveListDetailsVo)this.referraldetails.clone();
		if(this.carecontext == null)
			clone.carecontext = null;
		else
			clone.carecontext = (ims.core.vo.CareContextMinVo)this.carecontext.clone();
		clone.patient = this.patient;
		clone.isfitforsurgery = this.isfitforsurgery;
		if(this.urgency == null)
			clone.urgency = null;
		else
			clone.urgency = (ims.RefMan.vo.lookups.ReferralUrgency)this.urgency.clone();
		if(this.journey == null)
			clone.journey = null;
		else
			clone.journey = (ims.RefMan.vo.PatientPathwayJourneyForERODVo)this.journey.clone();
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
		if (!(CatsReferralforElectiveListDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CatsReferralforElectiveListDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((CatsReferralforElectiveListDetailsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((CatsReferralforElectiveListDetailsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.referraldetails != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.patient != null)
			count++;
		if(this.isfitforsurgery != null)
			count++;
		if(this.urgency != null)
			count++;
		if(this.journey != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.RefMan.vo.ReferralLetterDetailsForElectiveListDetailsVo referraldetails;
	protected ims.core.vo.CareContextMinVo carecontext;
	protected ims.core.patient.vo.PatientRefVo patient;
	protected Boolean isfitforsurgery;
	protected ims.RefMan.vo.lookups.ReferralUrgency urgency;
	protected ims.RefMan.vo.PatientPathwayJourneyForERODVo journey;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
