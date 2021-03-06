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
 * Linked to RefMan.CatsReferral business object (ID: 1004100035).
 */
public class CatsReferralForRequestServiceVo extends ims.RefMan.vo.CatsReferralRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CatsReferralForRequestServiceVo()
	{
	}
	public CatsReferralForRequestServiceVo(Integer id, int version)
	{
		super(id, version);
	}
	public CatsReferralForRequestServiceVo(ims.RefMan.vo.beans.CatsReferralForRequestServiceVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo();
		if(bean.getRTTClockImpacts() != null)
		{
			this.rttclockimpacts = new ims.pathways.vo.PathwaysRTTClockImpactRefVoCollection();
			for(int rttclockimpacts_i = 0; rttclockimpacts_i < bean.getRTTClockImpacts().length; rttclockimpacts_i++)
			{
				this.rttclockimpacts.add(new ims.pathways.vo.PathwaysRTTClockImpactRefVo(new Integer(bean.getRTTClockImpacts()[rttclockimpacts_i].getId()), bean.getRTTClockImpacts()[rttclockimpacts_i].getVersion()));
			}
		}
		if(bean.getLinkedReferrals() != null)
		{
			this.linkedreferrals = new ims.RefMan.vo.LinkedCatsReferralRefVoCollection();
			for(int linkedreferrals_i = 0; linkedreferrals_i < bean.getLinkedReferrals().length; linkedreferrals_i++)
			{
				this.linkedreferrals.add(new ims.RefMan.vo.LinkedCatsReferralRefVo(new Integer(bean.getLinkedReferrals()[linkedreferrals_i].getId()), bean.getLinkedReferrals()[linkedreferrals_i].getVersion()));
			}
		}
		this.statushistory = ims.RefMan.vo.CatsReferralStatusVoCollection.buildFromBeanCollection(bean.getStatusHistory());
		this.carecontext = bean.getCareContext() == null ? null : bean.getCareContext().buildVo();
		this.urgency = bean.getUrgency() == null ? null : ims.RefMan.vo.lookups.ReferralUrgency.buildLookup(bean.getUrgency());
		this.rttclockimpact = bean.getRTTClockImpact();
		this.creatingappointment = bean.getCreatingAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getCreatingAppointment().getId()), bean.getCreatingAppointment().getVersion());
		this.contract = bean.getContract() == null ? null : bean.getContract().buildVo();
		this.pathwayid = bean.getPathwayID();
		this.journey = bean.getJourney() == null ? null : new ims.pathways.vo.PatientPathwayJourneyRefVo(new Integer(bean.getJourney().getId()), bean.getJourney().getVersion());
		this.referraltransfer = bean.getReferralTransfer() == null ? null : bean.getReferralTransfer().buildVo();
		this.iscab = bean.getIsCAB();
		this.dos = bean.getDOS() == null ? null : bean.getDOS().buildVo();
		this.consupgradedate = bean.getConsUpgradeDate() == null ? null : bean.getConsUpgradeDate().buildDate();
		this.cancertype = bean.getCancerType() == null ? null : ims.RefMan.vo.lookups.CancerType.buildLookup(bean.getCancerType());
		this.currentrttstatus = bean.getCurrentRTTStatus() == null ? null : bean.getCurrentRTTStatus().buildVo();
		this.isemergencyreferral = bean.getIsEmergencyReferral();
		this.episodeofcare = bean.getEpisodeOfCare() == null ? null : bean.getEpisodeOfCare().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.CatsReferralForRequestServiceVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo(map);
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo(map);
		if(bean.getRTTClockImpacts() != null)
		{
			this.rttclockimpacts = new ims.pathways.vo.PathwaysRTTClockImpactRefVoCollection();
			for(int rttclockimpacts_i = 0; rttclockimpacts_i < bean.getRTTClockImpacts().length; rttclockimpacts_i++)
			{
				this.rttclockimpacts.add(new ims.pathways.vo.PathwaysRTTClockImpactRefVo(new Integer(bean.getRTTClockImpacts()[rttclockimpacts_i].getId()), bean.getRTTClockImpacts()[rttclockimpacts_i].getVersion()));
			}
		}
		if(bean.getLinkedReferrals() != null)
		{
			this.linkedreferrals = new ims.RefMan.vo.LinkedCatsReferralRefVoCollection();
			for(int linkedreferrals_i = 0; linkedreferrals_i < bean.getLinkedReferrals().length; linkedreferrals_i++)
			{
				this.linkedreferrals.add(new ims.RefMan.vo.LinkedCatsReferralRefVo(new Integer(bean.getLinkedReferrals()[linkedreferrals_i].getId()), bean.getLinkedReferrals()[linkedreferrals_i].getVersion()));
			}
		}
		this.statushistory = ims.RefMan.vo.CatsReferralStatusVoCollection.buildFromBeanCollection(bean.getStatusHistory());
		this.carecontext = bean.getCareContext() == null ? null : bean.getCareContext().buildVo(map);
		this.urgency = bean.getUrgency() == null ? null : ims.RefMan.vo.lookups.ReferralUrgency.buildLookup(bean.getUrgency());
		this.rttclockimpact = bean.getRTTClockImpact();
		this.creatingappointment = bean.getCreatingAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getCreatingAppointment().getId()), bean.getCreatingAppointment().getVersion());
		this.contract = bean.getContract() == null ? null : bean.getContract().buildVo(map);
		this.pathwayid = bean.getPathwayID();
		this.journey = bean.getJourney() == null ? null : new ims.pathways.vo.PatientPathwayJourneyRefVo(new Integer(bean.getJourney().getId()), bean.getJourney().getVersion());
		this.referraltransfer = bean.getReferralTransfer() == null ? null : bean.getReferralTransfer().buildVo(map);
		this.iscab = bean.getIsCAB();
		this.dos = bean.getDOS() == null ? null : bean.getDOS().buildVo(map);
		this.consupgradedate = bean.getConsUpgradeDate() == null ? null : bean.getConsUpgradeDate().buildDate();
		this.cancertype = bean.getCancerType() == null ? null : ims.RefMan.vo.lookups.CancerType.buildLookup(bean.getCancerType());
		this.currentrttstatus = bean.getCurrentRTTStatus() == null ? null : bean.getCurrentRTTStatus().buildVo(map);
		this.isemergencyreferral = bean.getIsEmergencyReferral();
		this.episodeofcare = bean.getEpisodeOfCare() == null ? null : bean.getEpisodeOfCare().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.CatsReferralForRequestServiceVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.CatsReferralForRequestServiceVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.CatsReferralForRequestServiceVoBean();
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
		if(fieldName.equals("REFERRALDETAILS"))
			return getReferralDetails();
		if(fieldName.equals("CURRENTSTATUS"))
			return getCurrentStatus();
		if(fieldName.equals("RTTCLOCKIMPACTS"))
			return getRTTClockImpacts();
		if(fieldName.equals("LINKEDREFERRALS"))
			return getLinkedReferrals();
		if(fieldName.equals("STATUSHISTORY"))
			return getStatusHistory();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("URGENCY"))
			return getUrgency();
		if(fieldName.equals("RTTCLOCKIMPACT"))
			return getRTTClockImpact();
		if(fieldName.equals("CREATINGAPPOINTMENT"))
			return getCreatingAppointment();
		if(fieldName.equals("CONTRACT"))
			return getContract();
		if(fieldName.equals("PATHWAYID"))
			return getPathwayID();
		if(fieldName.equals("JOURNEY"))
			return getJourney();
		if(fieldName.equals("REFERRALTRANSFER"))
			return getReferralTransfer();
		if(fieldName.equals("ISCAB"))
			return getIsCAB();
		if(fieldName.equals("DOS"))
			return getDOS();
		if(fieldName.equals("CONSUPGRADEDATE"))
			return getConsUpgradeDate();
		if(fieldName.equals("CANCERTYPE"))
			return getCancerType();
		if(fieldName.equals("CURRENTRTTSTATUS"))
			return getCurrentRTTStatus();
		if(fieldName.equals("ISEMERGENCYREFERRAL"))
			return getIsEmergencyReferral();
		if(fieldName.equals("EPISODEOFCARE"))
			return getEpisodeOfCare();
		return super.getFieldValueByFieldName(fieldName);
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
	public boolean getReferralDetailsIsNotNull()
	{
		return this.referraldetails != null;
	}
	public ims.clinical.vo.ReferralLeterDetailsForCatsRefVo getReferralDetails()
	{
		return this.referraldetails;
	}
	public void setReferralDetails(ims.clinical.vo.ReferralLeterDetailsForCatsRefVo value)
	{
		this.isValidated = false;
		this.referraldetails = value;
	}
	public boolean getCurrentStatusIsNotNull()
	{
		return this.currentstatus != null;
	}
	public ims.RefMan.vo.CatsReferralStatusVo getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.RefMan.vo.CatsReferralStatusVo value)
	{
		this.isValidated = false;
		this.currentstatus = value;
	}
	public boolean getRTTClockImpactsIsNotNull()
	{
		return this.rttclockimpacts != null;
	}
	public ims.pathways.vo.PathwaysRTTClockImpactRefVoCollection getRTTClockImpacts()
	{
		return this.rttclockimpacts;
	}
	public void setRTTClockImpacts(ims.pathways.vo.PathwaysRTTClockImpactRefVoCollection value)
	{
		this.isValidated = false;
		this.rttclockimpacts = value;
	}
	public boolean getLinkedReferralsIsNotNull()
	{
		return this.linkedreferrals != null;
	}
	public ims.RefMan.vo.LinkedCatsReferralRefVoCollection getLinkedReferrals()
	{
		return this.linkedreferrals;
	}
	public void setLinkedReferrals(ims.RefMan.vo.LinkedCatsReferralRefVoCollection value)
	{
		this.isValidated = false;
		this.linkedreferrals = value;
	}
	public boolean getStatusHistoryIsNotNull()
	{
		return this.statushistory != null;
	}
	public ims.RefMan.vo.CatsReferralStatusVoCollection getStatusHistory()
	{
		return this.statushistory;
	}
	public void setStatusHistory(ims.RefMan.vo.CatsReferralStatusVoCollection value)
	{
		this.isValidated = false;
		this.statushistory = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.RefMan.vo.CareContextForRequestServiceShortVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.RefMan.vo.CareContextForRequestServiceShortVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
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
	public boolean getRTTClockImpactIsNotNull()
	{
		return this.rttclockimpact != null;
	}
	public Boolean getRTTClockImpact()
	{
		return this.rttclockimpact;
	}
	public void setRTTClockImpact(Boolean value)
	{
		this.isValidated = false;
		this.rttclockimpact = value;
	}
	public boolean getCreatingAppointmentIsNotNull()
	{
		return this.creatingappointment != null;
	}
	public ims.scheduling.vo.Booking_AppointmentRefVo getCreatingAppointment()
	{
		return this.creatingappointment;
	}
	public void setCreatingAppointment(ims.scheduling.vo.Booking_AppointmentRefVo value)
	{
		this.isValidated = false;
		this.creatingappointment = value;
	}
	public boolean getContractIsNotNull()
	{
		return this.contract != null;
	}
	public ims.RefMan.vo.ContractConfigForReferralDetailsComponentVo getContract()
	{
		return this.contract;
	}
	public void setContract(ims.RefMan.vo.ContractConfigForReferralDetailsComponentVo value)
	{
		this.isValidated = false;
		this.contract = value;
	}
	public boolean getPathwayIDIsNotNull()
	{
		return this.pathwayid != null;
	}
	public String getPathwayID()
	{
		return this.pathwayid;
	}
	public static int getPathwayIDMaxLength()
	{
		return 20;
	}
	public void setPathwayID(String value)
	{
		this.isValidated = false;
		this.pathwayid = value;
	}
	public boolean getJourneyIsNotNull()
	{
		return this.journey != null;
	}
	public ims.pathways.vo.PatientPathwayJourneyRefVo getJourney()
	{
		return this.journey;
	}
	public void setJourney(ims.pathways.vo.PatientPathwayJourneyRefVo value)
	{
		this.isValidated = false;
		this.journey = value;
	}
	public boolean getReferralTransferIsNotNull()
	{
		return this.referraltransfer != null;
	}
	public ims.RefMan.vo.ReferralTransferVo getReferralTransfer()
	{
		return this.referraltransfer;
	}
	public void setReferralTransfer(ims.RefMan.vo.ReferralTransferVo value)
	{
		this.isValidated = false;
		this.referraltransfer = value;
	}
	public boolean getIsCABIsNotNull()
	{
		return this.iscab != null;
	}
	public Boolean getIsCAB()
	{
		return this.iscab;
	}
	public void setIsCAB(Boolean value)
	{
		this.isValidated = false;
		this.iscab = value;
	}
	public boolean getDOSIsNotNull()
	{
		return this.dos != null;
	}
	public ims.scheduling.vo.DirectoryOfServiceForCatsReferralWizardVo getDOS()
	{
		return this.dos;
	}
	public void setDOS(ims.scheduling.vo.DirectoryOfServiceForCatsReferralWizardVo value)
	{
		this.isValidated = false;
		this.dos = value;
	}
	public boolean getConsUpgradeDateIsNotNull()
	{
		return this.consupgradedate != null;
	}
	public ims.framework.utils.Date getConsUpgradeDate()
	{
		return this.consupgradedate;
	}
	public void setConsUpgradeDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.consupgradedate = value;
	}
	public boolean getCancerTypeIsNotNull()
	{
		return this.cancertype != null;
	}
	public ims.RefMan.vo.lookups.CancerType getCancerType()
	{
		return this.cancertype;
	}
	public void setCancerType(ims.RefMan.vo.lookups.CancerType value)
	{
		this.isValidated = false;
		this.cancertype = value;
	}
	public boolean getCurrentRTTStatusIsNotNull()
	{
		return this.currentrttstatus != null;
	}
	public ims.pathways.vo.PathwayRTTStatusVo getCurrentRTTStatus()
	{
		return this.currentrttstatus;
	}
	public void setCurrentRTTStatus(ims.pathways.vo.PathwayRTTStatusVo value)
	{
		this.isValidated = false;
		this.currentrttstatus = value;
	}
	public boolean getIsEmergencyReferralIsNotNull()
	{
		return this.isemergencyreferral != null;
	}
	public Boolean getIsEmergencyReferral()
	{
		return this.isemergencyreferral;
	}
	public void setIsEmergencyReferral(Boolean value)
	{
		this.isValidated = false;
		this.isemergencyreferral = value;
	}
	public boolean getEpisodeOfCareIsNotNull()
	{
		return this.episodeofcare != null;
	}
	public ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo value)
	{
		this.isValidated = false;
		this.episodeofcare = value;
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
		if(this.referraldetails != null)
		{
			if(!this.referraldetails.isValidated())
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
		if(this.statushistory != null)
		{
			if(!this.statushistory.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.carecontext != null)
		{
			if(!this.carecontext.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.contract != null)
		{
			if(!this.contract.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.referraltransfer != null)
		{
			if(!this.referraltransfer.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.currentrttstatus != null)
		{
			if(!this.currentrttstatus.isValidated())
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.referraldetails != null)
		{
			String[] listOfOtherErrors = this.referraldetails.validate();
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
		if(this.statushistory != null)
		{
			String[] listOfOtherErrors = this.statushistory.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
		if(this.contract != null)
		{
			String[] listOfOtherErrors = this.contract.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.pathwayid != null)
			if(this.pathwayid.length() > 20)
				listOfErrors.add("The length of the field [pathwayid] in the value object [ims.RefMan.vo.CatsReferralForRequestServiceVo] is too big. It should be less or equal to 20");
		if(this.referraltransfer != null)
		{
			String[] listOfOtherErrors = this.referraltransfer.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.currentrttstatus != null)
		{
			String[] listOfOtherErrors = this.currentrttstatus.validate();
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
	
		CatsReferralForRequestServiceVo clone = new CatsReferralForRequestServiceVo(this.id, this.version);
		
		clone.patient = this.patient;
		if(this.referraldetails == null)
			clone.referraldetails = null;
		else
			clone.referraldetails = (ims.clinical.vo.ReferralLeterDetailsForCatsRefVo)this.referraldetails.clone();
		if(this.currentstatus == null)
			clone.currentstatus = null;
		else
			clone.currentstatus = (ims.RefMan.vo.CatsReferralStatusVo)this.currentstatus.clone();
		clone.rttclockimpacts = this.rttclockimpacts;
		clone.linkedreferrals = this.linkedreferrals;
		if(this.statushistory == null)
			clone.statushistory = null;
		else
			clone.statushistory = (ims.RefMan.vo.CatsReferralStatusVoCollection)this.statushistory.clone();
		if(this.carecontext == null)
			clone.carecontext = null;
		else
			clone.carecontext = (ims.RefMan.vo.CareContextForRequestServiceShortVo)this.carecontext.clone();
		if(this.urgency == null)
			clone.urgency = null;
		else
			clone.urgency = (ims.RefMan.vo.lookups.ReferralUrgency)this.urgency.clone();
		clone.rttclockimpact = this.rttclockimpact;
		clone.creatingappointment = this.creatingappointment;
		if(this.contract == null)
			clone.contract = null;
		else
			clone.contract = (ims.RefMan.vo.ContractConfigForReferralDetailsComponentVo)this.contract.clone();
		clone.pathwayid = this.pathwayid;
		clone.journey = this.journey;
		if(this.referraltransfer == null)
			clone.referraltransfer = null;
		else
			clone.referraltransfer = (ims.RefMan.vo.ReferralTransferVo)this.referraltransfer.clone();
		clone.iscab = this.iscab;
		if(this.dos == null)
			clone.dos = null;
		else
			clone.dos = (ims.scheduling.vo.DirectoryOfServiceForCatsReferralWizardVo)this.dos.clone();
		if(this.consupgradedate == null)
			clone.consupgradedate = null;
		else
			clone.consupgradedate = (ims.framework.utils.Date)this.consupgradedate.clone();
		if(this.cancertype == null)
			clone.cancertype = null;
		else
			clone.cancertype = (ims.RefMan.vo.lookups.CancerType)this.cancertype.clone();
		if(this.currentrttstatus == null)
			clone.currentrttstatus = null;
		else
			clone.currentrttstatus = (ims.pathways.vo.PathwayRTTStatusVo)this.currentrttstatus.clone();
		clone.isemergencyreferral = this.isemergencyreferral;
		if(this.episodeofcare == null)
			clone.episodeofcare = null;
		else
			clone.episodeofcare = (ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo)this.episodeofcare.clone();
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
		if (!(CatsReferralForRequestServiceVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CatsReferralForRequestServiceVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((CatsReferralForRequestServiceVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((CatsReferralForRequestServiceVo)obj).getBoId());
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
		if(this.referraldetails != null)
			count++;
		if(this.currentstatus != null)
			count++;
		if(this.rttclockimpacts != null)
			count++;
		if(this.linkedreferrals != null)
			count++;
		if(this.statushistory != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.urgency != null)
			count++;
		if(this.rttclockimpact != null)
			count++;
		if(this.creatingappointment != null)
			count++;
		if(this.contract != null)
			count++;
		if(this.pathwayid != null)
			count++;
		if(this.journey != null)
			count++;
		if(this.referraltransfer != null)
			count++;
		if(this.iscab != null)
			count++;
		if(this.dos != null)
			count++;
		if(this.consupgradedate != null)
			count++;
		if(this.cancertype != null)
			count++;
		if(this.currentrttstatus != null)
			count++;
		if(this.isemergencyreferral != null)
			count++;
		if(this.episodeofcare != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 21;
	}
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.clinical.vo.ReferralLeterDetailsForCatsRefVo referraldetails;
	protected ims.RefMan.vo.CatsReferralStatusVo currentstatus;
	protected ims.pathways.vo.PathwaysRTTClockImpactRefVoCollection rttclockimpacts;
	protected ims.RefMan.vo.LinkedCatsReferralRefVoCollection linkedreferrals;
	protected ims.RefMan.vo.CatsReferralStatusVoCollection statushistory;
	protected ims.RefMan.vo.CareContextForRequestServiceShortVo carecontext;
	protected ims.RefMan.vo.lookups.ReferralUrgency urgency;
	protected Boolean rttclockimpact;
	protected ims.scheduling.vo.Booking_AppointmentRefVo creatingappointment;
	protected ims.RefMan.vo.ContractConfigForReferralDetailsComponentVo contract;
	protected String pathwayid;
	protected ims.pathways.vo.PatientPathwayJourneyRefVo journey;
	protected ims.RefMan.vo.ReferralTransferVo referraltransfer;
	protected Boolean iscab;
	protected ims.scheduling.vo.DirectoryOfServiceForCatsReferralWizardVo dos;
	protected ims.framework.utils.Date consupgradedate;
	protected ims.RefMan.vo.lookups.CancerType cancertype;
	protected ims.pathways.vo.PathwayRTTStatusVo currentrttstatus;
	protected Boolean isemergencyreferral;
	protected ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo episodeofcare;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
