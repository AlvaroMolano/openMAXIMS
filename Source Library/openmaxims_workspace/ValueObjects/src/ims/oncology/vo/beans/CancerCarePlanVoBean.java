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

package ims.oncology.vo.beans;

public class CancerCarePlanVoBean extends ims.vo.ValueObjectBean
{
	public CancerCarePlanVoBean()
	{
	}
	public CancerCarePlanVoBean(ims.oncology.vo.CancerCarePlanVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean();
		this.carecontext = vo.getCareContext() == null ? null : (ims.core.vo.beans.CareContextShortVoBean)vo.getCareContext().getBean();
		this.careplandate = vo.getCarePlanDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCarePlanDate().getBean();
		this.consultantincharge = vo.getConsultantInCharge() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getConsultantInCharge().getBean();
		this.careplanintent = vo.getCarePlanIntent() == null ? null : (ims.vo.LookupInstanceBean)vo.getCarePlanIntent().getBean();
		this.recurrenceindicator = vo.getRecurrenceIndicator() == null ? null : (ims.vo.LookupInstanceBean)vo.getRecurrenceIndicator().getBean();
		this.iscurrent = vo.getIsCurrent();
		this.mdtmeeting = vo.getMdtMeeting() == null ? null : (ims.oncology.vo.beans.CancerMDTMeetingVoBean)vo.getMdtMeeting().getBean();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.careplannotes = vo.getCarePlanNotes();
		this.treatmentmodalities = vo.getTreatmentModalities() == null ? null : vo.getTreatmentModalities().getBeanCollection();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentStatus().getBean();
		this.agreeddate = vo.getAgreedDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getAgreedDate().getBean();
		this.reasonpatientplandiffmdt = vo.getReasonPatientPlanDiffMDT();
		this.noanticancertxreason = vo.getNoAntiCancerTxReason() == null ? null : vo.getNoAntiCancerTxReason().getBeanCollection();
		this.hasassociatedmdtmeeting = vo.getHasAssociatedMDTMeeting();
		this.reasonforrevision = vo.getReasonForRevision();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.oncology.vo.CancerCarePlanVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean(map);
		this.carecontext = vo.getCareContext() == null ? null : (ims.core.vo.beans.CareContextShortVoBean)vo.getCareContext().getBean(map);
		this.careplandate = vo.getCarePlanDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCarePlanDate().getBean();
		this.consultantincharge = vo.getConsultantInCharge() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getConsultantInCharge().getBean(map);
		this.careplanintent = vo.getCarePlanIntent() == null ? null : (ims.vo.LookupInstanceBean)vo.getCarePlanIntent().getBean();
		this.recurrenceindicator = vo.getRecurrenceIndicator() == null ? null : (ims.vo.LookupInstanceBean)vo.getRecurrenceIndicator().getBean();
		this.iscurrent = vo.getIsCurrent();
		this.mdtmeeting = vo.getMdtMeeting() == null ? null : (ims.oncology.vo.beans.CancerMDTMeetingVoBean)vo.getMdtMeeting().getBean(map);
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.careplannotes = vo.getCarePlanNotes();
		this.treatmentmodalities = vo.getTreatmentModalities() == null ? null : vo.getTreatmentModalities().getBeanCollection();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentStatus().getBean();
		this.agreeddate = vo.getAgreedDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getAgreedDate().getBean();
		this.reasonpatientplandiffmdt = vo.getReasonPatientPlanDiffMDT();
		this.noanticancertxreason = vo.getNoAntiCancerTxReason() == null ? null : vo.getNoAntiCancerTxReason().getBeanCollection();
		this.hasassociatedmdtmeeting = vo.getHasAssociatedMDTMeeting();
		this.reasonforrevision = vo.getReasonForRevision();
	}

	public ims.oncology.vo.CancerCarePlanVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.oncology.vo.CancerCarePlanVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.oncology.vo.CancerCarePlanVo vo = null;
		if(map != null)
			vo = (ims.oncology.vo.CancerCarePlanVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.oncology.vo.CancerCarePlanVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.core.vo.beans.ClinicalContactShortVoBean getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.vo.beans.ClinicalContactShortVoBean value)
	{
		this.clinicalcontact = value;
	}
	public ims.core.vo.beans.CareContextShortVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.vo.beans.CareContextShortVoBean value)
	{
		this.carecontext = value;
	}
	public ims.framework.utils.beans.DateBean getCarePlanDate()
	{
		return this.careplandate;
	}
	public void setCarePlanDate(ims.framework.utils.beans.DateBean value)
	{
		this.careplandate = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getConsultantInCharge()
	{
		return this.consultantincharge;
	}
	public void setConsultantInCharge(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.consultantincharge = value;
	}
	public ims.vo.LookupInstanceBean getCarePlanIntent()
	{
		return this.careplanintent;
	}
	public void setCarePlanIntent(ims.vo.LookupInstanceBean value)
	{
		this.careplanintent = value;
	}
	public ims.vo.LookupInstanceBean getRecurrenceIndicator()
	{
		return this.recurrenceindicator;
	}
	public void setRecurrenceIndicator(ims.vo.LookupInstanceBean value)
	{
		this.recurrenceindicator = value;
	}
	public Boolean getIsCurrent()
	{
		return this.iscurrent;
	}
	public void setIsCurrent(Boolean value)
	{
		this.iscurrent = value;
	}
	public ims.oncology.vo.beans.CancerMDTMeetingVoBean getMdtMeeting()
	{
		return this.mdtmeeting;
	}
	public void setMdtMeeting(ims.oncology.vo.beans.CancerMDTMeetingVoBean value)
	{
		this.mdtmeeting = value;
	}
	public ims.vo.RefVoBean getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.vo.RefVoBean value)
	{
		this.episodeofcare = value;
	}
	public String getCarePlanNotes()
	{
		return this.careplannotes;
	}
	public void setCarePlanNotes(String value)
	{
		this.careplannotes = value;
	}
	public ims.oncology.vo.beans.TreatmentModalitiesVoBean[] getTreatmentModalities()
	{
		return this.treatmentmodalities;
	}
	public void setTreatmentModalities(ims.oncology.vo.beans.TreatmentModalitiesVoBean[] value)
	{
		this.treatmentmodalities = value;
	}
	public ims.vo.LookupInstanceBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.vo.LookupInstanceBean value)
	{
		this.currentstatus = value;
	}
	public ims.framework.utils.beans.DateBean getAgreedDate()
	{
		return this.agreeddate;
	}
	public void setAgreedDate(ims.framework.utils.beans.DateBean value)
	{
		this.agreeddate = value;
	}
	public String getReasonPatientPlanDiffMDT()
	{
		return this.reasonpatientplandiffmdt;
	}
	public void setReasonPatientPlanDiffMDT(String value)
	{
		this.reasonpatientplandiffmdt = value;
	}
	public java.util.Collection getNoAntiCancerTxReason()
	{
		return this.noanticancertxreason;
	}
	public void setNoAntiCancerTxReason(java.util.Collection value)
	{
		this.noanticancertxreason = value;
	}
	public void addNoAntiCancerTxReason(java.util.Collection value)
	{
		if(this.noanticancertxreason == null)
			this.noanticancertxreason = new java.util.ArrayList();
		this.noanticancertxreason.add(value);
	}
	public Boolean getHasAssociatedMDTMeeting()
	{
		return this.hasassociatedmdtmeeting;
	}
	public void setHasAssociatedMDTMeeting(Boolean value)
	{
		this.hasassociatedmdtmeeting = value;
	}
	public String getReasonForRevision()
	{
		return this.reasonforrevision;
	}
	public void setReasonForRevision(String value)
	{
		this.reasonforrevision = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.ClinicalContactShortVoBean clinicalcontact;
	private ims.core.vo.beans.CareContextShortVoBean carecontext;
	private ims.framework.utils.beans.DateBean careplandate;
	private ims.core.vo.beans.HcpLiteVoBean consultantincharge;
	private ims.vo.LookupInstanceBean careplanintent;
	private ims.vo.LookupInstanceBean recurrenceindicator;
	private Boolean iscurrent;
	private ims.oncology.vo.beans.CancerMDTMeetingVoBean mdtmeeting;
	private ims.vo.RefVoBean episodeofcare;
	private String careplannotes;
	private ims.oncology.vo.beans.TreatmentModalitiesVoBean[] treatmentmodalities;
	private ims.vo.LookupInstanceBean currentstatus;
	private ims.framework.utils.beans.DateBean agreeddate;
	private String reasonpatientplandiffmdt;
	private java.util.Collection noanticancertxreason;
	private Boolean hasassociatedmdtmeeting;
	private String reasonforrevision;
}
