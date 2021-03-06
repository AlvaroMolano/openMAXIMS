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

package ims.nursing.vo;

/**
 * Linked to nursing.assessment tools.MUST business object (ID: 1016100016).
 */
public class MUSTVo extends ims.nursing.assessmenttools.vo.MUSTRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public MUSTVo()
	{
	}
	public MUSTVo(Integer id, int version)
	{
		super(id, version);
	}
	public MUSTVo(ims.nursing.vo.beans.MUSTVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.clinicalcontact = bean.getClinicalContact() == null ? null : new ims.core.admin.vo.ClinicalContactRefVo(new Integer(bean.getClinicalContact().getId()), bean.getClinicalContact().getVersion());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.previoushealthyweight = bean.getPreviousHealthyWeight();
		this.acutelyill = bean.getAcutelyIll();
		this.actiontaken = bean.getActionTaken();
		this.weightlossreason = bean.getWeightLossReason();
		this.management = bean.getManagement() == null ? null : ims.nursing.vo.lookups.MUSTManagement.buildLookup(bean.getManagement());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.vitalsign = bean.getVitalSign() == null ? null : bean.getVitalSign().buildVo();
		this.bmiscore = bean.getBMIScore();
		this.uwlscore = bean.getUWLScore();
		this.adescore = bean.getADEScore();
		this.ormscore = bean.getORMScore();
		this.metrics = bean.getMetrics() == null ? null : bean.getMetrics().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.beans.MUSTVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.clinicalcontact = bean.getClinicalContact() == null ? null : new ims.core.admin.vo.ClinicalContactRefVo(new Integer(bean.getClinicalContact().getId()), bean.getClinicalContact().getVersion());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.previoushealthyweight = bean.getPreviousHealthyWeight();
		this.acutelyill = bean.getAcutelyIll();
		this.actiontaken = bean.getActionTaken();
		this.weightlossreason = bean.getWeightLossReason();
		this.management = bean.getManagement() == null ? null : ims.nursing.vo.lookups.MUSTManagement.buildLookup(bean.getManagement());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.vitalsign = bean.getVitalSign() == null ? null : bean.getVitalSign().buildVo(map);
		this.bmiscore = bean.getBMIScore();
		this.uwlscore = bean.getUWLScore();
		this.adescore = bean.getADEScore();
		this.ormscore = bean.getORMScore();
		this.metrics = bean.getMetrics() == null ? null : bean.getMetrics().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.beans.MUSTVoBean bean = null;
		if(map != null)
			bean = (ims.nursing.vo.beans.MUSTVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.nursing.vo.beans.MUSTVoBean();
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
		if(fieldName.equals("CLINICALCONTACT"))
			return getClinicalContact();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("PREVIOUSHEALTHYWEIGHT"))
			return getPreviousHealthyWeight();
		if(fieldName.equals("ACUTELYILL"))
			return getAcutelyIll();
		if(fieldName.equals("ACTIONTAKEN"))
			return getActionTaken();
		if(fieldName.equals("WEIGHTLOSSREASON"))
			return getWeightLossReason();
		if(fieldName.equals("MANAGEMENT"))
			return getManagement();
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("VITALSIGN"))
			return getVitalSign();
		if(fieldName.equals("BMISCORE"))
			return getBMIScore();
		if(fieldName.equals("UWLSCORE"))
			return getUWLScore();
		if(fieldName.equals("ADESCORE"))
			return getADEScore();
		if(fieldName.equals("ORMSCORE"))
			return getORMScore();
		if(fieldName.equals("METRICS"))
			return getMetrics();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getClinicalContactIsNotNull()
	{
		return this.clinicalcontact != null;
	}
	public ims.core.admin.vo.ClinicalContactRefVo getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.admin.vo.ClinicalContactRefVo value)
	{
		this.isValidated = false;
		this.clinicalcontact = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getPreviousHealthyWeightIsNotNull()
	{
		return this.previoushealthyweight != null;
	}
	public Float getPreviousHealthyWeight()
	{
		return this.previoushealthyweight;
	}
	public void setPreviousHealthyWeight(Float value)
	{
		this.isValidated = false;
		this.previoushealthyweight = value;
	}
	public boolean getAcutelyIllIsNotNull()
	{
		return this.acutelyill != null;
	}
	public Boolean getAcutelyIll()
	{
		return this.acutelyill;
	}
	public void setAcutelyIll(Boolean value)
	{
		this.isValidated = false;
		this.acutelyill = value;
	}
	public boolean getActionTakenIsNotNull()
	{
		return this.actiontaken != null;
	}
	public String getActionTaken()
	{
		return this.actiontaken;
	}
	public static int getActionTakenMaxLength()
	{
		return 255;
	}
	public void setActionTaken(String value)
	{
		this.isValidated = false;
		this.actiontaken = value;
	}
	public boolean getWeightLossReasonIsNotNull()
	{
		return this.weightlossreason != null;
	}
	public String getWeightLossReason()
	{
		return this.weightlossreason;
	}
	public static int getWeightLossReasonMaxLength()
	{
		return 255;
	}
	public void setWeightLossReason(String value)
	{
		this.isValidated = false;
		this.weightlossreason = value;
	}
	public boolean getManagementIsNotNull()
	{
		return this.management != null;
	}
	public ims.nursing.vo.lookups.MUSTManagement getManagement()
	{
		return this.management;
	}
	public void setManagement(ims.nursing.vo.lookups.MUSTManagement value)
	{
		this.isValidated = false;
		this.management = value;
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
	}
	public boolean getVitalSignIsNotNull()
	{
		return this.vitalsign != null;
	}
	public ims.core.vo.VitalSignsVo getVitalSign()
	{
		return this.vitalsign;
	}
	public void setVitalSign(ims.core.vo.VitalSignsVo value)
	{
		this.isValidated = false;
		this.vitalsign = value;
	}
	public boolean getBMIScoreIsNotNull()
	{
		return this.bmiscore != null;
	}
	public Integer getBMIScore()
	{
		return this.bmiscore;
	}
	public void setBMIScore(Integer value)
	{
		this.isValidated = false;
		this.bmiscore = value;
	}
	public boolean getUWLScoreIsNotNull()
	{
		return this.uwlscore != null;
	}
	public Integer getUWLScore()
	{
		return this.uwlscore;
	}
	public void setUWLScore(Integer value)
	{
		this.isValidated = false;
		this.uwlscore = value;
	}
	public boolean getADEScoreIsNotNull()
	{
		return this.adescore != null;
	}
	public Integer getADEScore()
	{
		return this.adescore;
	}
	public void setADEScore(Integer value)
	{
		this.isValidated = false;
		this.adescore = value;
	}
	public boolean getORMScoreIsNotNull()
	{
		return this.ormscore != null;
	}
	public Integer getORMScore()
	{
		return this.ormscore;
	}
	public void setORMScore(Integer value)
	{
		this.isValidated = false;
		this.ormscore = value;
	}
	public boolean getMetricsIsNotNull()
	{
		return this.metrics != null;
	}
	public ims.core.vo.VSMetrics getMetrics()
	{
		return this.metrics;
	}
	public void setMetrics(ims.core.vo.VSMetrics value)
	{
		this.isValidated = false;
		this.metrics = value;
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
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.vitalsign != null)
		{
			if(!this.vitalsign.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.metrics != null)
		{
			if(!this.metrics.isValidated())
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
		if(this.previoushealthyweight == null)
			listOfErrors.add("Previous Healthy Weight is mandatory");
		if(this.acutelyill == null)
			listOfErrors.add("Acutely Ill is mandatory");
		if(this.actiontaken != null)
			if(this.actiontaken.length() > 255)
				listOfErrors.add("The length of the field [actiontaken] in the value object [ims.nursing.vo.MUSTVo] is too big. It should be less or equal to 255");
		if(this.weightlossreason != null)
			if(this.weightlossreason.length() > 255)
				listOfErrors.add("The length of the field [weightlossreason] in the value object [ims.nursing.vo.MUSTVo] is too big. It should be less or equal to 255");
		if(this.authoringinformation == null)
			listOfErrors.add("Authoring HCP and Authoring Date/Time are mandatory");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.vitalsign != null)
		{
			String[] listOfOtherErrors = this.vitalsign.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.bmiscore == null)
			listOfErrors.add("BMI Score is mandatory");
		if(this.uwlscore == null)
			listOfErrors.add("UWL Score is mandatory");
		if(this.adescore == null)
			listOfErrors.add("ADE Score is mandatory");
		if(this.ormscore == null)
			listOfErrors.add("ORM Score is mandatory");
		if(this.metrics != null)
		{
			String[] listOfOtherErrors = this.metrics.validate();
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
	
		MUSTVo clone = new MUSTVo(this.id, this.version);
		
		clone.clinicalcontact = this.clinicalcontact;
		clone.carecontext = this.carecontext;
		clone.previoushealthyweight = this.previoushealthyweight;
		clone.acutelyill = this.acutelyill;
		clone.actiontaken = this.actiontaken;
		clone.weightlossreason = this.weightlossreason;
		if(this.management == null)
			clone.management = null;
		else
			clone.management = (ims.nursing.vo.lookups.MUSTManagement)this.management.clone();
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.vitalsign == null)
			clone.vitalsign = null;
		else
			clone.vitalsign = (ims.core.vo.VitalSignsVo)this.vitalsign.clone();
		clone.bmiscore = this.bmiscore;
		clone.uwlscore = this.uwlscore;
		clone.adescore = this.adescore;
		clone.ormscore = this.ormscore;
		if(this.metrics == null)
			clone.metrics = null;
		else
			clone.metrics = (ims.core.vo.VSMetrics)this.metrics.clone();
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
		if (!(MUSTVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A MUSTVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((MUSTVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((MUSTVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.clinicalcontact != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.previoushealthyweight != null)
			count++;
		if(this.acutelyill != null)
			count++;
		if(this.actiontaken != null)
			count++;
		if(this.weightlossreason != null)
			count++;
		if(this.management != null)
			count++;
		if(this.authoringinformation != null)
			count++;
		if(this.vitalsign != null)
			count++;
		if(this.bmiscore != null)
			count++;
		if(this.uwlscore != null)
			count++;
		if(this.adescore != null)
			count++;
		if(this.ormscore != null)
			count++;
		if(this.metrics != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 14;
	}
	protected ims.core.admin.vo.ClinicalContactRefVo clinicalcontact;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected Float previoushealthyweight;
	protected Boolean acutelyill;
	protected String actiontaken;
	protected String weightlossreason;
	protected ims.nursing.vo.lookups.MUSTManagement management;
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.core.vo.VitalSignsVo vitalsign;
	protected Integer bmiscore;
	protected Integer uwlscore;
	protected Integer adescore;
	protected Integer ormscore;
	protected ims.core.vo.VSMetrics metrics;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
