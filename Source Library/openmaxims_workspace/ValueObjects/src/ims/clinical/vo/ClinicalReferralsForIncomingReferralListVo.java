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

package ims.clinical.vo;

/**
 * Linked to clinical.ClinicalReferrals business object (ID: 1072100112).
 */
public class ClinicalReferralsForIncomingReferralListVo extends ims.clinical.vo.ClinicalReferralsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ClinicalReferralsForIncomingReferralListVo()
	{
	}
	public ClinicalReferralsForIncomingReferralListVo(Integer id, int version)
	{
		super(id, version);
	}
	public ClinicalReferralsForIncomingReferralListVo(ims.clinical.vo.beans.ClinicalReferralsForIncomingReferralListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
		this.referraltype = bean.getReferralType() == null ? null : ims.clinical.vo.lookups.ClinicalReferralType.buildLookup(bean.getReferralType());
		this.currentreferralstatus = bean.getCurrentReferralStatus() == null ? null : bean.getCurrentReferralStatus().buildVo();
		this.referringhcp = bean.getReferringHCP() == null ? null : bean.getReferringHCP().buildVo();
		this.refertoservice = bean.getReferToService() == null ? null : bean.getReferToService().buildVo();
		this.refertohcp = bean.getReferToHCP() == null ? null : bean.getReferToHCP().buildVo();
		this.urgentreferral = bean.getUrgentReferral();
		this.datedecisiontorefer = bean.getDateDecisionToRefer() == null ? null : bean.getDateDecisionToRefer().buildDate();
		this.referraltypetext = bean.getReferralTypeText();
		this.requiresauthorisation = bean.getRequiresAuthorisation();
		if(bean.getReferralDocument() != null)
		{
			this.referraldocument = new ims.core.documents.vo.PatientDocumentRefVoCollection();
			for(int referraldocument_i = 0; referraldocument_i < bean.getReferralDocument().length; referraldocument_i++)
			{
				this.referraldocument.add(new ims.core.documents.vo.PatientDocumentRefVo(new Integer(bean.getReferralDocument()[referraldocument_i].getId()), bean.getReferralDocument()[referraldocument_i].getVersion()));
			}
		}
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.ClinicalReferralsForIncomingReferralListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
		this.referraltype = bean.getReferralType() == null ? null : ims.clinical.vo.lookups.ClinicalReferralType.buildLookup(bean.getReferralType());
		this.currentreferralstatus = bean.getCurrentReferralStatus() == null ? null : bean.getCurrentReferralStatus().buildVo(map);
		this.referringhcp = bean.getReferringHCP() == null ? null : bean.getReferringHCP().buildVo(map);
		this.refertoservice = bean.getReferToService() == null ? null : bean.getReferToService().buildVo(map);
		this.refertohcp = bean.getReferToHCP() == null ? null : bean.getReferToHCP().buildVo(map);
		this.urgentreferral = bean.getUrgentReferral();
		this.datedecisiontorefer = bean.getDateDecisionToRefer() == null ? null : bean.getDateDecisionToRefer().buildDate();
		this.referraltypetext = bean.getReferralTypeText();
		this.requiresauthorisation = bean.getRequiresAuthorisation();
		if(bean.getReferralDocument() != null)
		{
			this.referraldocument = new ims.core.documents.vo.PatientDocumentRefVoCollection();
			for(int referraldocument_i = 0; referraldocument_i < bean.getReferralDocument().length; referraldocument_i++)
			{
				this.referraldocument.add(new ims.core.documents.vo.PatientDocumentRefVo(new Integer(bean.getReferralDocument()[referraldocument_i].getId()), bean.getReferralDocument()[referraldocument_i].getVersion()));
			}
		}
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.ClinicalReferralsForIncomingReferralListVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.ClinicalReferralsForIncomingReferralListVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.ClinicalReferralsForIncomingReferralListVoBean();
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
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("REFERRALTYPE"))
			return getReferralType();
		if(fieldName.equals("CURRENTREFERRALSTATUS"))
			return getCurrentReferralStatus();
		if(fieldName.equals("REFERRINGHCP"))
			return getReferringHCP();
		if(fieldName.equals("REFERTOSERVICE"))
			return getReferToService();
		if(fieldName.equals("REFERTOHCP"))
			return getReferToHCP();
		if(fieldName.equals("URGENTREFERRAL"))
			return getUrgentReferral();
		if(fieldName.equals("DATEDECISIONTOREFER"))
			return getDateDecisionToRefer();
		if(fieldName.equals("REFERRALTYPETEXT"))
			return getReferralTypeText();
		if(fieldName.equals("REQUIRESAUTHORISATION"))
			return getRequiresAuthorisation();
		if(fieldName.equals("REFERRALDOCUMENT"))
			return getReferralDocument();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.clinical.vo.PatientForIncomingReferralListVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.clinical.vo.PatientForIncomingReferralListVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getReferralTypeIsNotNull()
	{
		return this.referraltype != null;
	}
	public ims.clinical.vo.lookups.ClinicalReferralType getReferralType()
	{
		return this.referraltype;
	}
	public void setReferralType(ims.clinical.vo.lookups.ClinicalReferralType value)
	{
		this.isValidated = false;
		this.referraltype = value;
	}
	public boolean getCurrentReferralStatusIsNotNull()
	{
		return this.currentreferralstatus != null;
	}
	public ims.clinical.vo.ClinicalReferralStatusForIncomingReferralListVo getCurrentReferralStatus()
	{
		return this.currentreferralstatus;
	}
	public void setCurrentReferralStatus(ims.clinical.vo.ClinicalReferralStatusForIncomingReferralListVo value)
	{
		this.isValidated = false;
		this.currentreferralstatus = value;
	}
	public boolean getReferringHCPIsNotNull()
	{
		return this.referringhcp != null;
	}
	public ims.core.vo.HcpLiteVo getReferringHCP()
	{
		return this.referringhcp;
	}
	public void setReferringHCP(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.referringhcp = value;
	}
	public boolean getReferToServiceIsNotNull()
	{
		return this.refertoservice != null;
	}
	public ims.clinical.vo.ServiceConfigIntReferralForIncomingListVo getReferToService()
	{
		return this.refertoservice;
	}
	public void setReferToService(ims.clinical.vo.ServiceConfigIntReferralForIncomingListVo value)
	{
		this.isValidated = false;
		this.refertoservice = value;
	}
	public boolean getReferToHCPIsNotNull()
	{
		return this.refertohcp != null;
	}
	public ims.core.vo.HcpLiteVo getReferToHCP()
	{
		return this.refertohcp;
	}
	public void setReferToHCP(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.refertohcp = value;
	}
	public boolean getUrgentReferralIsNotNull()
	{
		return this.urgentreferral != null;
	}
	public Boolean getUrgentReferral()
	{
		return this.urgentreferral;
	}
	public void setUrgentReferral(Boolean value)
	{
		this.isValidated = false;
		this.urgentreferral = value;
	}
	public boolean getDateDecisionToReferIsNotNull()
	{
		return this.datedecisiontorefer != null;
	}
	public ims.framework.utils.Date getDateDecisionToRefer()
	{
		return this.datedecisiontorefer;
	}
	public void setDateDecisionToRefer(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.datedecisiontorefer = value;
	}
	public boolean getReferralTypeTextIsNotNull()
	{
		return this.referraltypetext != null;
	}
	public String getReferralTypeText()
	{
		return this.referraltypetext;
	}
	public static int getReferralTypeTextMaxLength()
	{
		return 255;
	}
	public void setReferralTypeText(String value)
	{
		this.isValidated = false;
		this.referraltypetext = value;
	}
	public boolean getRequiresAuthorisationIsNotNull()
	{
		return this.requiresauthorisation != null;
	}
	public Boolean getRequiresAuthorisation()
	{
		return this.requiresauthorisation;
	}
	public void setRequiresAuthorisation(Boolean value)
	{
		this.isValidated = false;
		this.requiresauthorisation = value;
	}
	public boolean getReferralDocumentIsNotNull()
	{
		return this.referraldocument != null;
	}
	public ims.core.documents.vo.PatientDocumentRefVoCollection getReferralDocument()
	{
		return this.referraldocument;
	}
	public void setReferralDocument(ims.core.documents.vo.PatientDocumentRefVoCollection value)
	{
		this.isValidated = false;
		this.referraldocument = value;
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.referraltype == null)
			listOfErrors.add("ReferralType is mandatory");
		if(this.currentreferralstatus == null)
			listOfErrors.add("CurrentReferralStatus is mandatory");
		if(this.referringhcp == null)
			listOfErrors.add("ReferringHCP is mandatory");
		if(this.refertoservice == null)
			listOfErrors.add("ReferToService is mandatory");
		if(this.datedecisiontorefer == null)
			listOfErrors.add("DateDecisionToRefer is mandatory");
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
	
		ClinicalReferralsForIncomingReferralListVo clone = new ClinicalReferralsForIncomingReferralListVo(this.id, this.version);
		
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.clinical.vo.PatientForIncomingReferralListVo)this.patient.clone();
		if(this.referraltype == null)
			clone.referraltype = null;
		else
			clone.referraltype = (ims.clinical.vo.lookups.ClinicalReferralType)this.referraltype.clone();
		if(this.currentreferralstatus == null)
			clone.currentreferralstatus = null;
		else
			clone.currentreferralstatus = (ims.clinical.vo.ClinicalReferralStatusForIncomingReferralListVo)this.currentreferralstatus.clone();
		if(this.referringhcp == null)
			clone.referringhcp = null;
		else
			clone.referringhcp = (ims.core.vo.HcpLiteVo)this.referringhcp.clone();
		if(this.refertoservice == null)
			clone.refertoservice = null;
		else
			clone.refertoservice = (ims.clinical.vo.ServiceConfigIntReferralForIncomingListVo)this.refertoservice.clone();
		if(this.refertohcp == null)
			clone.refertohcp = null;
		else
			clone.refertohcp = (ims.core.vo.HcpLiteVo)this.refertohcp.clone();
		clone.urgentreferral = this.urgentreferral;
		if(this.datedecisiontorefer == null)
			clone.datedecisiontorefer = null;
		else
			clone.datedecisiontorefer = (ims.framework.utils.Date)this.datedecisiontorefer.clone();
		clone.referraltypetext = this.referraltypetext;
		clone.requiresauthorisation = this.requiresauthorisation;
		clone.referraldocument = this.referraldocument;
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
		if (!(ClinicalReferralsForIncomingReferralListVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ClinicalReferralsForIncomingReferralListVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		ClinicalReferralsForIncomingReferralListVo compareObj = (ClinicalReferralsForIncomingReferralListVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getReferralTypeText() == null && compareObj.getReferralTypeText() != null)
				return -1;
			if(this.getReferralTypeText() != null && compareObj.getReferralTypeText() == null)
				return 1;
			if(this.getReferralTypeText() != null && compareObj.getReferralTypeText() != null)
			{
				if(caseInsensitive)
					retVal = this.getReferralTypeText().toLowerCase().compareTo(compareObj.getReferralTypeText().toLowerCase());
				else
					retVal = this.getReferralTypeText().compareTo(compareObj.getReferralTypeText());
			}
		}
		if (retVal == 0)
		{
			if(this.getUrgentReferral() == null && compareObj.getUrgentReferral() != null)
				return -1;
			if(this.getUrgentReferral() != null && compareObj.getUrgentReferral() == null)
				return 1;
			if(this.getUrgentReferral() != null && compareObj.getUrgentReferral() != null)
				retVal = this.getUrgentReferral().compareTo(compareObj.getUrgentReferral());
		}
		if (retVal == 0)
		{
			if(this.getDateDecisionToRefer() == null && compareObj.getDateDecisionToRefer() != null)
				return -1;
			if(this.getDateDecisionToRefer() != null && compareObj.getDateDecisionToRefer() == null)
				return 1;
			if(this.getDateDecisionToRefer() != null && compareObj.getDateDecisionToRefer() != null)
				retVal = this.getDateDecisionToRefer().compareTo(compareObj.getDateDecisionToRefer());
		}
		if (retVal == 0)
		{
			if(this.getPatient() == null && compareObj.getPatient() != null)
				return -1;
			if(this.getPatient() != null && compareObj.getPatient() == null)
				return 1;
			if(this.getPatient() != null && compareObj.getPatient() != null)
				retVal = this.getPatient().compareTo(compareObj.getPatient());
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
		if(this.patient != null)
			count++;
		if(this.referraltype != null)
			count++;
		if(this.currentreferralstatus != null)
			count++;
		if(this.referringhcp != null)
			count++;
		if(this.refertoservice != null)
			count++;
		if(this.refertohcp != null)
			count++;
		if(this.urgentreferral != null)
			count++;
		if(this.datedecisiontorefer != null)
			count++;
		if(this.referraltypetext != null)
			count++;
		if(this.requiresauthorisation != null)
			count++;
		if(this.referraldocument != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 11;
	}
	protected ims.clinical.vo.PatientForIncomingReferralListVo patient;
	protected ims.clinical.vo.lookups.ClinicalReferralType referraltype;
	protected ims.clinical.vo.ClinicalReferralStatusForIncomingReferralListVo currentreferralstatus;
	protected ims.core.vo.HcpLiteVo referringhcp;
	protected ims.clinical.vo.ServiceConfigIntReferralForIncomingListVo refertoservice;
	protected ims.core.vo.HcpLiteVo refertohcp;
	protected Boolean urgentreferral;
	protected ims.framework.utils.Date datedecisiontorefer;
	protected String referraltypetext;
	protected Boolean requiresauthorisation;
	protected ims.core.documents.vo.PatientDocumentRefVoCollection referraldocument;
	private boolean isValidated = false;
	private boolean isBusy = false;
}