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

package ims.RefMan.vo;

/**
 * Linked to RefMan.PatientElectiveList business object (ID: 1014100020).
 */
public class PatientElectiveListForPreAssessmentWorklistVo extends ims.RefMan.vo.PatientElectiveListRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientElectiveListForPreAssessmentWorklistVo()
	{
	}
	public PatientElectiveListForPreAssessmentWorklistVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientElectiveListForPreAssessmentWorklistVo(ims.RefMan.vo.beans.PatientElectiveListForPreAssessmentWorklistVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
		this.referral = bean.getReferral() == null ? null : bean.getReferral().buildVo();
		this.primaryprocedure = bean.getPrimaryProcedure() == null ? null : bean.getPrimaryProcedure().buildVo();
		this.otherprocedures = ims.core.vo.ProcedureNameVoCollection.buildFromBeanCollection(bean.getOtherProcedures());
		this.preassessmentoutcome = bean.getPreAssessmentOutcome() == null ? null : bean.getPreAssessmentOutcome().buildVo();
		this.secondaryprocedure = bean.getSecondaryProcedure() == null ? null : bean.getSecondaryProcedure().buildVo();
		this.preassessmentrequired = bean.getPreAssessmentRequired();
		this.issuitablefortelephoneassessment = bean.getIsSuitableForTelephoneAssessment();
		this.preassessmentappointment = bean.getPreAssessmentAppointment() == null ? null : bean.getPreAssessmentAppointment().buildVo();
		this.electiveadmissiontype = bean.getElectiveAdmissionType() == null ? null : ims.RefMan.vo.lookups.ElectiveAdmissionType.buildLookup(bean.getElectiveAdmissionType());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.PatientElectiveListForPreAssessmentWorklistVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
		this.referral = bean.getReferral() == null ? null : bean.getReferral().buildVo(map);
		this.primaryprocedure = bean.getPrimaryProcedure() == null ? null : bean.getPrimaryProcedure().buildVo(map);
		this.otherprocedures = ims.core.vo.ProcedureNameVoCollection.buildFromBeanCollection(bean.getOtherProcedures());
		this.preassessmentoutcome = bean.getPreAssessmentOutcome() == null ? null : bean.getPreAssessmentOutcome().buildVo(map);
		this.secondaryprocedure = bean.getSecondaryProcedure() == null ? null : bean.getSecondaryProcedure().buildVo(map);
		this.preassessmentrequired = bean.getPreAssessmentRequired();
		this.issuitablefortelephoneassessment = bean.getIsSuitableForTelephoneAssessment();
		this.preassessmentappointment = bean.getPreAssessmentAppointment() == null ? null : bean.getPreAssessmentAppointment().buildVo(map);
		this.electiveadmissiontype = bean.getElectiveAdmissionType() == null ? null : ims.RefMan.vo.lookups.ElectiveAdmissionType.buildLookup(bean.getElectiveAdmissionType());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.PatientElectiveListForPreAssessmentWorklistVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.PatientElectiveListForPreAssessmentWorklistVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.PatientElectiveListForPreAssessmentWorklistVoBean();
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
		if(fieldName.equals("REFERRAL"))
			return getReferral();
		if(fieldName.equals("PRIMARYPROCEDURE"))
			return getPrimaryProcedure();
		if(fieldName.equals("OTHERPROCEDURES"))
			return getOtherProcedures();
		if(fieldName.equals("PREASSESSMENTOUTCOME"))
			return getPreAssessmentOutcome();
		if(fieldName.equals("SECONDARYPROCEDURE"))
			return getSecondaryProcedure();
		if(fieldName.equals("PREASSESSMENTREQUIRED"))
			return getPreAssessmentRequired();
		if(fieldName.equals("ISSUITABLEFORTELEPHONEASSESSMENT"))
			return getIsSuitableForTelephoneAssessment();
		if(fieldName.equals("PREASSESSMENTAPPOINTMENT"))
			return getPreAssessmentAppointment();
		if(fieldName.equals("ELECTIVEADMISSIONTYPE"))
			return getElectiveAdmissionType();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.vo.PatientLite_IdentifiersVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.PatientLite_IdentifiersVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getReferralIsNotNull()
	{
		return this.referral != null;
	}
	public ims.RefMan.vo.CatsRefForPreassessmentWorklistVo getReferral()
	{
		return this.referral;
	}
	public void setReferral(ims.RefMan.vo.CatsRefForPreassessmentWorklistVo value)
	{
		this.isValidated = false;
		this.referral = value;
	}
	public boolean getPrimaryProcedureIsNotNull()
	{
		return this.primaryprocedure != null;
	}
	public ims.core.vo.ProcedureNameVo getPrimaryProcedure()
	{
		return this.primaryprocedure;
	}
	public void setPrimaryProcedure(ims.core.vo.ProcedureNameVo value)
	{
		this.isValidated = false;
		this.primaryprocedure = value;
	}
	public boolean getOtherProceduresIsNotNull()
	{
		return this.otherprocedures != null;
	}
	public ims.core.vo.ProcedureNameVoCollection getOtherProcedures()
	{
		return this.otherprocedures;
	}
	public void setOtherProcedures(ims.core.vo.ProcedureNameVoCollection value)
	{
		this.isValidated = false;
		this.otherprocedures = value;
	}
	public boolean getPreAssessmentOutcomeIsNotNull()
	{
		return this.preassessmentoutcome != null;
	}
	public ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo getPreAssessmentOutcome()
	{
		return this.preassessmentoutcome;
	}
	public void setPreAssessmentOutcome(ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo value)
	{
		this.isValidated = false;
		this.preassessmentoutcome = value;
	}
	public boolean getSecondaryProcedureIsNotNull()
	{
		return this.secondaryprocedure != null;
	}
	public ims.core.vo.ProcedureNameVo getSecondaryProcedure()
	{
		return this.secondaryprocedure;
	}
	public void setSecondaryProcedure(ims.core.vo.ProcedureNameVo value)
	{
		this.isValidated = false;
		this.secondaryprocedure = value;
	}
	public boolean getPreAssessmentRequiredIsNotNull()
	{
		return this.preassessmentrequired != null;
	}
	public Boolean getPreAssessmentRequired()
	{
		return this.preassessmentrequired;
	}
	public void setPreAssessmentRequired(Boolean value)
	{
		this.isValidated = false;
		this.preassessmentrequired = value;
	}
	public boolean getIsSuitableForTelephoneAssessmentIsNotNull()
	{
		return this.issuitablefortelephoneassessment != null;
	}
	public Boolean getIsSuitableForTelephoneAssessment()
	{
		return this.issuitablefortelephoneassessment;
	}
	public void setIsSuitableForTelephoneAssessment(Boolean value)
	{
		this.isValidated = false;
		this.issuitablefortelephoneassessment = value;
	}
	public boolean getPreAssessmentAppointmentIsNotNull()
	{
		return this.preassessmentappointment != null;
	}
	public ims.RefMan.vo.BookAppointmentForPreAssessmentWorklistVo getPreAssessmentAppointment()
	{
		return this.preassessmentappointment;
	}
	public void setPreAssessmentAppointment(ims.RefMan.vo.BookAppointmentForPreAssessmentWorklistVo value)
	{
		this.isValidated = false;
		this.preassessmentappointment = value;
	}
	public boolean getElectiveAdmissionTypeIsNotNull()
	{
		return this.electiveadmissiontype != null;
	}
	public ims.RefMan.vo.lookups.ElectiveAdmissionType getElectiveAdmissionType()
	{
		return this.electiveadmissiontype;
	}
	public void setElectiveAdmissionType(ims.RefMan.vo.lookups.ElectiveAdmissionType value)
	{
		this.isValidated = false;
		this.electiveadmissiontype = value;
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
		if(this.referral == null)
			listOfErrors.add("Referral is mandatory");
		if(this.electiveadmissiontype == null)
			listOfErrors.add("ElectiveAdmissionType is mandatory");
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
	
		PatientElectiveListForPreAssessmentWorklistVo clone = new PatientElectiveListForPreAssessmentWorklistVo(this.id, this.version);
		
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.core.vo.PatientLite_IdentifiersVo)this.patient.clone();
		if(this.referral == null)
			clone.referral = null;
		else
			clone.referral = (ims.RefMan.vo.CatsRefForPreassessmentWorklistVo)this.referral.clone();
		if(this.primaryprocedure == null)
			clone.primaryprocedure = null;
		else
			clone.primaryprocedure = (ims.core.vo.ProcedureNameVo)this.primaryprocedure.clone();
		if(this.otherprocedures == null)
			clone.otherprocedures = null;
		else
			clone.otherprocedures = (ims.core.vo.ProcedureNameVoCollection)this.otherprocedures.clone();
		if(this.preassessmentoutcome == null)
			clone.preassessmentoutcome = null;
		else
			clone.preassessmentoutcome = (ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo)this.preassessmentoutcome.clone();
		if(this.secondaryprocedure == null)
			clone.secondaryprocedure = null;
		else
			clone.secondaryprocedure = (ims.core.vo.ProcedureNameVo)this.secondaryprocedure.clone();
		clone.preassessmentrequired = this.preassessmentrequired;
		clone.issuitablefortelephoneassessment = this.issuitablefortelephoneassessment;
		if(this.preassessmentappointment == null)
			clone.preassessmentappointment = null;
		else
			clone.preassessmentappointment = (ims.RefMan.vo.BookAppointmentForPreAssessmentWorklistVo)this.preassessmentappointment.clone();
		if(this.electiveadmissiontype == null)
			clone.electiveadmissiontype = null;
		else
			clone.electiveadmissiontype = (ims.RefMan.vo.lookups.ElectiveAdmissionType)this.electiveadmissiontype.clone();
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
		if (!(PatientElectiveListForPreAssessmentWorklistVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientElectiveListForPreAssessmentWorklistVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientElectiveListForPreAssessmentWorklistVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientElectiveListForPreAssessmentWorklistVo)obj).getBoId());
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
		if(this.referral != null)
			count++;
		if(this.primaryprocedure != null)
			count++;
		if(this.otherprocedures != null)
			count++;
		if(this.preassessmentoutcome != null)
			count++;
		if(this.secondaryprocedure != null)
			count++;
		if(this.preassessmentrequired != null)
			count++;
		if(this.issuitablefortelephoneassessment != null)
			count++;
		if(this.preassessmentappointment != null)
			count++;
		if(this.electiveadmissiontype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 10;
	}
	protected ims.core.vo.PatientLite_IdentifiersVo patient;
	protected ims.RefMan.vo.CatsRefForPreassessmentWorklistVo referral;
	protected ims.core.vo.ProcedureNameVo primaryprocedure;
	protected ims.core.vo.ProcedureNameVoCollection otherprocedures;
	protected ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo preassessmentoutcome;
	protected ims.core.vo.ProcedureNameVo secondaryprocedure;
	protected Boolean preassessmentrequired;
	protected Boolean issuitablefortelephoneassessment;
	protected ims.RefMan.vo.BookAppointmentForPreAssessmentWorklistVo preassessmentappointment;
	protected ims.RefMan.vo.lookups.ElectiveAdmissionType electiveadmissiontype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
