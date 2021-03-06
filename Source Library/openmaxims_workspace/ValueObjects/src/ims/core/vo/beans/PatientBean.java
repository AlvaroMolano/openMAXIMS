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

package ims.core.vo.beans;

public class PatientBean extends ims.vo.ValueObjectBean
{
	public PatientBean()
	{
	}
	public PatientBean(ims.core.vo.Patient vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean();
		this.sex = vo.getSex() == null ? null : (ims.vo.LookupInstanceBean)vo.getSex().getBean();
		this.age = vo.getAge();
		this.agetext = vo.getAgeText();
		this.address = vo.getAddress() == null ? null : (ims.core.vo.beans.PersonAddressBean)vo.getAddress().getBean();
		this.dob = vo.getDob() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDob().getBean();
		this.dod = vo.getDod() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDod().getBean();
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean();
		this.religion = vo.getReligion() == null ? null : (ims.vo.LookupInstanceBean)vo.getReligion().getBean();
		this.hasallergies = vo.getHasAllergies();
		this.hasalerts = vo.getHasAlerts();
		this.identifiers = vo.getIdentifiers() == null ? null : vo.getIdentifiers().getBeanCollection();
		this.isactive = vo.getIsActive();
		this.associatedpatient = vo.getAssociatedPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getAssociatedPatient().getBean();
		this.commchannels = vo.getCommChannels() == null ? null : vo.getCommChannels().getBeanCollection();
		this.ethnicorigin = vo.getEthnicOrigin() == null ? null : (ims.vo.LookupInstanceBean)vo.getEthnicOrigin().getBean();
		this.maritalstatus = vo.getMaritalStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getMaritalStatus().getBean();
		this.scn = vo.getSCN();
		this.sourceofinformation = vo.getSourceOfInformation() == null ? null : (ims.vo.LookupInstanceBean)vo.getSourceOfInformation().getBean();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
		this.hasactivealerts = vo.getHasActiveAlerts();
		this.timeofdeath = vo.getTimeOfDeath() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeOfDeath().getBean();
		this.isquickregistrationpatient = vo.getIsQuickRegistrationPatient();
		this.ocsnotification = vo.getOCSNotification() == null ? null : (ims.core.vo.beans.PatientNotificationsFillerOnlyVoBean)vo.getOCSNotification().getBean();
		this.currentresponsibleconsultant = vo.getCurrentResponsibleConsultant() == null ? null : new ims.vo.RefVoBean(vo.getCurrentResponsibleConsultant().getBoId(), vo.getCurrentResponsibleConsultant().getBoVersion());
		this.dementiabreachdatetime = vo.getDementiaBreachDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDementiaBreachDateTime().getBean();
		this.dementiaworkliststatus = vo.getDementiaWorklistStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getDementiaWorklistStatus().getBean();
		this.mrnstatus = vo.getMRNStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getMRNStatus().getBean();
		this.hasscannedcasenotefolders = vo.getHasScannedCaseNoteFolders();
		this.isconfidential = vo.getIsConfidential();
		this.timeofbirth = vo.getTimeOfBirth() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeOfBirth().getBean();
		this.isselfadmitpatient = vo.getIsSelfAdmitPatient();
		this.patientcategory = vo.getPatientCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientCategory().getBean();
		this.pdspatientgp = vo.getPDSPatientGP() == null ? null : (ims.core.vo.beans.PDSPatientGPVoBean)vo.getPDSPatientGP().getBean();
		this.hasalertcategory1 = vo.getHasAlertCategory1();
		this.hasalertcategory2 = vo.getHasAlertCategory2();
		this.hasalertcategory3 = vo.getHasAlertCategory3();
		this.hasalertcategory4 = vo.getHasAlertCategory4();
		this.hasalertcategoryother = vo.getHasAlertCategoryOther();
		this.futureapptscancelonmarkdeceasedanswer = vo.getFutureApptsCancelOnMarkDeceasedAnswer();
		this.gp = vo.getGp() == null ? null : (ims.core.vo.beans.GpShortVoBean)vo.getGp().getBean();
		this.occupation = vo.getOccupation() == null ? null : (ims.vo.LookupInstanceBean)vo.getOccupation().getBean();
		this.language = vo.getLanguage() == null ? null : (ims.vo.LookupInstanceBean)vo.getLanguage().getBean();
		this.nok = vo.getNok() == null ? null : (ims.core.vo.beans.NextOfKinBean)vo.getNok().getBean();
		this.othernames = vo.getOtherNames() == null ? null : vo.getOtherNames().getBeanCollection();
		this.addresses = vo.getAddresses() == null ? null : vo.getAddresses().getBeanCollection();
		this.gpsurgery = vo.getGpSurgery() == null ? null : (ims.core.vo.beans.LocSiteShortVoBean)vo.getGpSurgery().getBean();
		this.patientalerts = vo.getPatientAlerts() == null ? null : vo.getPatientAlerts().getBeanCollection();
		this.clientparent = vo.getClientParent() == null ? null : new ims.vo.RefVoBean(vo.getClientParent().getBoId(), vo.getClientParent().getBoVersion());
		this.photo = vo.getPhoto() == null ? null : (ims.core.vo.beans.AppDBImageVoBean)vo.getPhoto().getBean();
		this.savealias = vo.getSaveAlias();
		this.cancelsd_appts = vo.getCancelSD_APPTS();
		this.homefolderlocation = vo.getHomeFolderLocation() == null ? null : (ims.vo.LookupInstanceBean)vo.getHomeFolderLocation().getBean();
		this.harccode = vo.getHARCCode();
		this.prefcommlanguage = vo.getPrefCommLanguage() == null ? null : (ims.vo.LookupInstanceBean)vo.getPrefCommLanguage().getBean();
		this.practice = vo.getPractice() == null ? null : (ims.core.vo.beans.OrganisationWithSitesVoBean)vo.getPractice().getBean();
		this.copypatientoncorrespondence = vo.getCopyPatientOnCorrespondence();
		this.copypatientoncorrespondencedate = vo.getCopyPatientOnCorrespondenceDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCopyPatientOnCorrespondenceDate().getBean();
		this.currentmedicalinsurance = vo.getCurrentMedicalInsurance() == null ? null : (ims.core.vo.beans.PatientMedicalInsuranceVoBean)vo.getCurrentMedicalInsurance().getBean();
		this.nationalhealthcover = vo.getNationalHealthCover() == null ? null : (ims.core.vo.beans.NationalHealthCoverVoBean)vo.getNationalHealthCover().getBean();
		this.alternativecontact = vo.getAlternativeContact() == null ? null : (ims.core.vo.beans.PatientContactPreferenceVoBean)vo.getAlternativeContact().getBean();
		this.healthboard = vo.getHealthBoard() == null ? null : (ims.vo.LookupInstanceBean)vo.getHealthBoard().getBean();
		this.supportnetworkfamily = vo.getSupportNetworkFamily() == null ? null : vo.getSupportNetworkFamily().getBeanCollection();
		this.pdsdeathnotificationstatus = vo.getPDSDeathNotificationStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getPDSDeathNotificationStatus().getBean();
		this.pdsinterpreterrequired = vo.getPDSInterpreterRequired();
		this.pdsrelatives = vo.getPDSrelatives() == null ? null : vo.getPDSrelatives().getBeanCollection();
		this.pdspatientupdate = vo.getPDSPatientUpdate() == null ? null : (ims.core.vo.beans.PDSPatientUpdateVoBean)vo.getPDSPatientUpdate().getBean();
		this.pdspatientgphistory = vo.getPDSPatientGPHistory() == null ? null : vo.getPDSPatientGPHistory().getBeanCollection();
		this.school = vo.getSchool() == null ? null : new ims.vo.RefVoBean(vo.getSchool().getBoId(), vo.getSchool().getBoVersion());
		this.overseasvisitor = vo.getOverseasVisitor();
		this.overseasclassification = vo.getOverseasClassification() == null ? null : (ims.vo.LookupInstanceBean)vo.getOverseasClassification().getBean();
		this.hasliveduk = vo.getHasLivedUK();
		this.decoupled = vo.getDecoupled();
		this.pdsdatelastchecked = vo.getPDSDateLastChecked() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPDSDateLastChecked().getBean();
		this.schoolorcollege = vo.getSchoolOrCollege() == null ? null : (ims.vo.LookupInstanceBean)vo.getSchoolOrCollege().getBean();
		this.ischildinpubliccare = vo.getIsChildInPublicCare();
		this.publiccareneed = vo.getPublicCareNeed() == null ? null : (ims.vo.LookupInstanceBean)vo.getPublicCareNeed().getBean();
		this.txtoccupation = vo.getTxtOccupation();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.Patient vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean(map);
		this.sex = vo.getSex() == null ? null : (ims.vo.LookupInstanceBean)vo.getSex().getBean();
		this.age = vo.getAge();
		this.agetext = vo.getAgeText();
		this.address = vo.getAddress() == null ? null : (ims.core.vo.beans.PersonAddressBean)vo.getAddress().getBean(map);
		this.dob = vo.getDob() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDob().getBean();
		this.dod = vo.getDod() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDod().getBean();
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean(map);
		this.religion = vo.getReligion() == null ? null : (ims.vo.LookupInstanceBean)vo.getReligion().getBean();
		this.hasallergies = vo.getHasAllergies();
		this.hasalerts = vo.getHasAlerts();
		this.identifiers = vo.getIdentifiers() == null ? null : vo.getIdentifiers().getBeanCollection();
		this.isactive = vo.getIsActive();
		this.associatedpatient = vo.getAssociatedPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getAssociatedPatient().getBean(map);
		this.commchannels = vo.getCommChannels() == null ? null : vo.getCommChannels().getBeanCollection();
		this.ethnicorigin = vo.getEthnicOrigin() == null ? null : (ims.vo.LookupInstanceBean)vo.getEthnicOrigin().getBean();
		this.maritalstatus = vo.getMaritalStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getMaritalStatus().getBean();
		this.scn = vo.getSCN();
		this.sourceofinformation = vo.getSourceOfInformation() == null ? null : (ims.vo.LookupInstanceBean)vo.getSourceOfInformation().getBean();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
		this.hasactivealerts = vo.getHasActiveAlerts();
		this.timeofdeath = vo.getTimeOfDeath() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeOfDeath().getBean();
		this.isquickregistrationpatient = vo.getIsQuickRegistrationPatient();
		this.ocsnotification = vo.getOCSNotification() == null ? null : (ims.core.vo.beans.PatientNotificationsFillerOnlyVoBean)vo.getOCSNotification().getBean(map);
		this.currentresponsibleconsultant = vo.getCurrentResponsibleConsultant() == null ? null : new ims.vo.RefVoBean(vo.getCurrentResponsibleConsultant().getBoId(), vo.getCurrentResponsibleConsultant().getBoVersion());
		this.dementiabreachdatetime = vo.getDementiaBreachDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDementiaBreachDateTime().getBean();
		this.dementiaworkliststatus = vo.getDementiaWorklistStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getDementiaWorklistStatus().getBean();
		this.mrnstatus = vo.getMRNStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getMRNStatus().getBean();
		this.hasscannedcasenotefolders = vo.getHasScannedCaseNoteFolders();
		this.isconfidential = vo.getIsConfidential();
		this.timeofbirth = vo.getTimeOfBirth() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeOfBirth().getBean();
		this.isselfadmitpatient = vo.getIsSelfAdmitPatient();
		this.patientcategory = vo.getPatientCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientCategory().getBean();
		this.pdspatientgp = vo.getPDSPatientGP() == null ? null : (ims.core.vo.beans.PDSPatientGPVoBean)vo.getPDSPatientGP().getBean(map);
		this.hasalertcategory1 = vo.getHasAlertCategory1();
		this.hasalertcategory2 = vo.getHasAlertCategory2();
		this.hasalertcategory3 = vo.getHasAlertCategory3();
		this.hasalertcategory4 = vo.getHasAlertCategory4();
		this.hasalertcategoryother = vo.getHasAlertCategoryOther();
		this.futureapptscancelonmarkdeceasedanswer = vo.getFutureApptsCancelOnMarkDeceasedAnswer();
		this.gp = vo.getGp() == null ? null : (ims.core.vo.beans.GpShortVoBean)vo.getGp().getBean(map);
		this.occupation = vo.getOccupation() == null ? null : (ims.vo.LookupInstanceBean)vo.getOccupation().getBean();
		this.language = vo.getLanguage() == null ? null : (ims.vo.LookupInstanceBean)vo.getLanguage().getBean();
		this.nok = vo.getNok() == null ? null : (ims.core.vo.beans.NextOfKinBean)vo.getNok().getBean(map);
		this.othernames = vo.getOtherNames() == null ? null : vo.getOtherNames().getBeanCollection();
		this.addresses = vo.getAddresses() == null ? null : vo.getAddresses().getBeanCollection();
		this.gpsurgery = vo.getGpSurgery() == null ? null : (ims.core.vo.beans.LocSiteShortVoBean)vo.getGpSurgery().getBean(map);
		this.patientalerts = vo.getPatientAlerts() == null ? null : vo.getPatientAlerts().getBeanCollection();
		this.clientparent = vo.getClientParent() == null ? null : new ims.vo.RefVoBean(vo.getClientParent().getBoId(), vo.getClientParent().getBoVersion());
		this.photo = vo.getPhoto() == null ? null : (ims.core.vo.beans.AppDBImageVoBean)vo.getPhoto().getBean(map);
		this.savealias = vo.getSaveAlias();
		this.cancelsd_appts = vo.getCancelSD_APPTS();
		this.homefolderlocation = vo.getHomeFolderLocation() == null ? null : (ims.vo.LookupInstanceBean)vo.getHomeFolderLocation().getBean();
		this.harccode = vo.getHARCCode();
		this.prefcommlanguage = vo.getPrefCommLanguage() == null ? null : (ims.vo.LookupInstanceBean)vo.getPrefCommLanguage().getBean();
		this.practice = vo.getPractice() == null ? null : (ims.core.vo.beans.OrganisationWithSitesVoBean)vo.getPractice().getBean(map);
		this.copypatientoncorrespondence = vo.getCopyPatientOnCorrespondence();
		this.copypatientoncorrespondencedate = vo.getCopyPatientOnCorrespondenceDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCopyPatientOnCorrespondenceDate().getBean();
		this.currentmedicalinsurance = vo.getCurrentMedicalInsurance() == null ? null : (ims.core.vo.beans.PatientMedicalInsuranceVoBean)vo.getCurrentMedicalInsurance().getBean(map);
		this.nationalhealthcover = vo.getNationalHealthCover() == null ? null : (ims.core.vo.beans.NationalHealthCoverVoBean)vo.getNationalHealthCover().getBean(map);
		this.alternativecontact = vo.getAlternativeContact() == null ? null : (ims.core.vo.beans.PatientContactPreferenceVoBean)vo.getAlternativeContact().getBean(map);
		this.healthboard = vo.getHealthBoard() == null ? null : (ims.vo.LookupInstanceBean)vo.getHealthBoard().getBean();
		this.supportnetworkfamily = vo.getSupportNetworkFamily() == null ? null : vo.getSupportNetworkFamily().getBeanCollection();
		this.pdsdeathnotificationstatus = vo.getPDSDeathNotificationStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getPDSDeathNotificationStatus().getBean();
		this.pdsinterpreterrequired = vo.getPDSInterpreterRequired();
		this.pdsrelatives = vo.getPDSrelatives() == null ? null : vo.getPDSrelatives().getBeanCollection();
		this.pdspatientupdate = vo.getPDSPatientUpdate() == null ? null : (ims.core.vo.beans.PDSPatientUpdateVoBean)vo.getPDSPatientUpdate().getBean(map);
		this.pdspatientgphistory = vo.getPDSPatientGPHistory() == null ? null : vo.getPDSPatientGPHistory().getBeanCollection();
		this.school = vo.getSchool() == null ? null : new ims.vo.RefVoBean(vo.getSchool().getBoId(), vo.getSchool().getBoVersion());
		this.overseasvisitor = vo.getOverseasVisitor();
		this.overseasclassification = vo.getOverseasClassification() == null ? null : (ims.vo.LookupInstanceBean)vo.getOverseasClassification().getBean();
		this.hasliveduk = vo.getHasLivedUK();
		this.decoupled = vo.getDecoupled();
		this.pdsdatelastchecked = vo.getPDSDateLastChecked() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPDSDateLastChecked().getBean();
		this.schoolorcollege = vo.getSchoolOrCollege() == null ? null : (ims.vo.LookupInstanceBean)vo.getSchoolOrCollege().getBean();
		this.ischildinpubliccare = vo.getIsChildInPublicCare();
		this.publiccareneed = vo.getPublicCareNeed() == null ? null : (ims.vo.LookupInstanceBean)vo.getPublicCareNeed().getBean();
		this.txtoccupation = vo.getTxtOccupation();
	}

	public ims.core.vo.Patient buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.Patient buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.Patient vo = null;
		if(map != null)
			vo = (ims.core.vo.Patient)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.Patient();
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
	public ims.core.vo.beans.PersonNameBean getName()
	{
		return this.name;
	}
	public void setName(ims.core.vo.beans.PersonNameBean value)
	{
		this.name = value;
	}
	public ims.vo.LookupInstanceBean getSex()
	{
		return this.sex;
	}
	public void setSex(ims.vo.LookupInstanceBean value)
	{
		this.sex = value;
	}
	public Integer getAge()
	{
		return this.age;
	}
	public void setAge(Integer value)
	{
		this.age = value;
	}
	public String getAgeText()
	{
		return this.agetext;
	}
	public void setAgeText(String value)
	{
		this.agetext = value;
	}
	public ims.core.vo.beans.PersonAddressBean getAddress()
	{
		return this.address;
	}
	public void setAddress(ims.core.vo.beans.PersonAddressBean value)
	{
		this.address = value;
	}
	public ims.framework.utils.beans.PartialDateBean getDob()
	{
		return this.dob;
	}
	public void setDob(ims.framework.utils.beans.PartialDateBean value)
	{
		this.dob = value;
	}
	public ims.framework.utils.beans.DateBean getDod()
	{
		return this.dod;
	}
	public void setDod(ims.framework.utils.beans.DateBean value)
	{
		this.dod = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.ward = value;
	}
	public ims.vo.LookupInstanceBean getReligion()
	{
		return this.religion;
	}
	public void setReligion(ims.vo.LookupInstanceBean value)
	{
		this.religion = value;
	}
	public Boolean getHasAllergies()
	{
		return this.hasallergies;
	}
	public void setHasAllergies(Boolean value)
	{
		this.hasallergies = value;
	}
	public Boolean getHasAlerts()
	{
		return this.hasalerts;
	}
	public void setHasAlerts(Boolean value)
	{
		this.hasalerts = value;
	}
	public ims.core.vo.beans.PatientIdBean[] getIdentifiers()
	{
		return this.identifiers;
	}
	public void setIdentifiers(ims.core.vo.beans.PatientIdBean[] value)
	{
		this.identifiers = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public ims.core.vo.beans.PatientShortBean getAssociatedPatient()
	{
		return this.associatedpatient;
	}
	public void setAssociatedPatient(ims.core.vo.beans.PatientShortBean value)
	{
		this.associatedpatient = value;
	}
	public ims.core.vo.beans.CommChannelVoBean[] getCommChannels()
	{
		return this.commchannels;
	}
	public void setCommChannels(ims.core.vo.beans.CommChannelVoBean[] value)
	{
		this.commchannels = value;
	}
	public ims.vo.LookupInstanceBean getEthnicOrigin()
	{
		return this.ethnicorigin;
	}
	public void setEthnicOrigin(ims.vo.LookupInstanceBean value)
	{
		this.ethnicorigin = value;
	}
	public ims.vo.LookupInstanceBean getMaritalStatus()
	{
		return this.maritalstatus;
	}
	public void setMaritalStatus(ims.vo.LookupInstanceBean value)
	{
		this.maritalstatus = value;
	}
	public Integer getSCN()
	{
		return this.scn;
	}
	public void setSCN(Integer value)
	{
		this.scn = value;
	}
	public ims.vo.LookupInstanceBean getSourceOfInformation()
	{
		return this.sourceofinformation;
	}
	public void setSourceOfInformation(ims.vo.LookupInstanceBean value)
	{
		this.sourceofinformation = value;
	}
	public ims.vo.SysInfoBean getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SysInfoBean value)
	{
		this.sysinfo = value;
	}
	public Boolean getHasActiveAlerts()
	{
		return this.hasactivealerts;
	}
	public void setHasActiveAlerts(Boolean value)
	{
		this.hasactivealerts = value;
	}
	public ims.framework.utils.beans.TimeBean getTimeOfDeath()
	{
		return this.timeofdeath;
	}
	public void setTimeOfDeath(ims.framework.utils.beans.TimeBean value)
	{
		this.timeofdeath = value;
	}
	public Boolean getIsQuickRegistrationPatient()
	{
		return this.isquickregistrationpatient;
	}
	public void setIsQuickRegistrationPatient(Boolean value)
	{
		this.isquickregistrationpatient = value;
	}
	public ims.core.vo.beans.PatientNotificationsFillerOnlyVoBean getOCSNotification()
	{
		return this.ocsnotification;
	}
	public void setOCSNotification(ims.core.vo.beans.PatientNotificationsFillerOnlyVoBean value)
	{
		this.ocsnotification = value;
	}
	public ims.vo.RefVoBean getCurrentResponsibleConsultant()
	{
		return this.currentresponsibleconsultant;
	}
	public void setCurrentResponsibleConsultant(ims.vo.RefVoBean value)
	{
		this.currentresponsibleconsultant = value;
	}
	public ims.framework.utils.beans.DateTimeBean getDementiaBreachDateTime()
	{
		return this.dementiabreachdatetime;
	}
	public void setDementiaBreachDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.dementiabreachdatetime = value;
	}
	public ims.vo.LookupInstanceBean getDementiaWorklistStatus()
	{
		return this.dementiaworkliststatus;
	}
	public void setDementiaWorklistStatus(ims.vo.LookupInstanceBean value)
	{
		this.dementiaworkliststatus = value;
	}
	public ims.vo.LookupInstanceBean getMRNStatus()
	{
		return this.mrnstatus;
	}
	public void setMRNStatus(ims.vo.LookupInstanceBean value)
	{
		this.mrnstatus = value;
	}
	public Boolean getHasScannedCaseNoteFolders()
	{
		return this.hasscannedcasenotefolders;
	}
	public void setHasScannedCaseNoteFolders(Boolean value)
	{
		this.hasscannedcasenotefolders = value;
	}
	public Boolean getIsConfidential()
	{
		return this.isconfidential;
	}
	public void setIsConfidential(Boolean value)
	{
		this.isconfidential = value;
	}
	public ims.framework.utils.beans.TimeBean getTimeOfBirth()
	{
		return this.timeofbirth;
	}
	public void setTimeOfBirth(ims.framework.utils.beans.TimeBean value)
	{
		this.timeofbirth = value;
	}
	public Boolean getIsSelfAdmitPatient()
	{
		return this.isselfadmitpatient;
	}
	public void setIsSelfAdmitPatient(Boolean value)
	{
		this.isselfadmitpatient = value;
	}
	public ims.vo.LookupInstanceBean getPatientCategory()
	{
		return this.patientcategory;
	}
	public void setPatientCategory(ims.vo.LookupInstanceBean value)
	{
		this.patientcategory = value;
	}
	public ims.core.vo.beans.PDSPatientGPVoBean getPDSPatientGP()
	{
		return this.pdspatientgp;
	}
	public void setPDSPatientGP(ims.core.vo.beans.PDSPatientGPVoBean value)
	{
		this.pdspatientgp = value;
	}
	public Boolean getHasAlertCategory1()
	{
		return this.hasalertcategory1;
	}
	public void setHasAlertCategory1(Boolean value)
	{
		this.hasalertcategory1 = value;
	}
	public Boolean getHasAlertCategory2()
	{
		return this.hasalertcategory2;
	}
	public void setHasAlertCategory2(Boolean value)
	{
		this.hasalertcategory2 = value;
	}
	public Boolean getHasAlertCategory3()
	{
		return this.hasalertcategory3;
	}
	public void setHasAlertCategory3(Boolean value)
	{
		this.hasalertcategory3 = value;
	}
	public Boolean getHasAlertCategory4()
	{
		return this.hasalertcategory4;
	}
	public void setHasAlertCategory4(Boolean value)
	{
		this.hasalertcategory4 = value;
	}
	public Boolean getHasAlertCategoryOther()
	{
		return this.hasalertcategoryother;
	}
	public void setHasAlertCategoryOther(Boolean value)
	{
		this.hasalertcategoryother = value;
	}
	public Boolean getFutureApptsCancelOnMarkDeceasedAnswer()
	{
		return this.futureapptscancelonmarkdeceasedanswer;
	}
	public void setFutureApptsCancelOnMarkDeceasedAnswer(Boolean value)
	{
		this.futureapptscancelonmarkdeceasedanswer = value;
	}
	public ims.core.vo.beans.GpShortVoBean getGp()
	{
		return this.gp;
	}
	public void setGp(ims.core.vo.beans.GpShortVoBean value)
	{
		this.gp = value;
	}
	public ims.vo.LookupInstanceBean getOccupation()
	{
		return this.occupation;
	}
	public void setOccupation(ims.vo.LookupInstanceBean value)
	{
		this.occupation = value;
	}
	public ims.vo.LookupInstanceBean getLanguage()
	{
		return this.language;
	}
	public void setLanguage(ims.vo.LookupInstanceBean value)
	{
		this.language = value;
	}
	public ims.core.vo.beans.NextOfKinBean getNok()
	{
		return this.nok;
	}
	public void setNok(ims.core.vo.beans.NextOfKinBean value)
	{
		this.nok = value;
	}
	public ims.core.vo.beans.PersonNameBean[] getOtherNames()
	{
		return this.othernames;
	}
	public void setOtherNames(ims.core.vo.beans.PersonNameBean[] value)
	{
		this.othernames = value;
	}
	public ims.core.vo.beans.PersonAddressBean[] getAddresses()
	{
		return this.addresses;
	}
	public void setAddresses(ims.core.vo.beans.PersonAddressBean[] value)
	{
		this.addresses = value;
	}
	public ims.core.vo.beans.LocSiteShortVoBean getGpSurgery()
	{
		return this.gpsurgery;
	}
	public void setGpSurgery(ims.core.vo.beans.LocSiteShortVoBean value)
	{
		this.gpsurgery = value;
	}
	public ims.core.vo.beans.PatientAlertLiteVoBean[] getPatientAlerts()
	{
		return this.patientalerts;
	}
	public void setPatientAlerts(ims.core.vo.beans.PatientAlertLiteVoBean[] value)
	{
		this.patientalerts = value;
	}
	public ims.vo.RefVoBean getClientParent()
	{
		return this.clientparent;
	}
	public void setClientParent(ims.vo.RefVoBean value)
	{
		this.clientparent = value;
	}
	public ims.core.vo.beans.AppDBImageVoBean getPhoto()
	{
		return this.photo;
	}
	public void setPhoto(ims.core.vo.beans.AppDBImageVoBean value)
	{
		this.photo = value;
	}
	public String getSaveAlias()
	{
		return this.savealias;
	}
	public void setSaveAlias(String value)
	{
		this.savealias = value;
	}
	public Boolean getCancelSD_APPTS()
	{
		return this.cancelsd_appts;
	}
	public void setCancelSD_APPTS(Boolean value)
	{
		this.cancelsd_appts = value;
	}
	public ims.vo.LookupInstanceBean getHomeFolderLocation()
	{
		return this.homefolderlocation;
	}
	public void setHomeFolderLocation(ims.vo.LookupInstanceBean value)
	{
		this.homefolderlocation = value;
	}
	public String getHARCCode()
	{
		return this.harccode;
	}
	public void setHARCCode(String value)
	{
		this.harccode = value;
	}
	public ims.vo.LookupInstanceBean getPrefCommLanguage()
	{
		return this.prefcommlanguage;
	}
	public void setPrefCommLanguage(ims.vo.LookupInstanceBean value)
	{
		this.prefcommlanguage = value;
	}
	public ims.core.vo.beans.OrganisationWithSitesVoBean getPractice()
	{
		return this.practice;
	}
	public void setPractice(ims.core.vo.beans.OrganisationWithSitesVoBean value)
	{
		this.practice = value;
	}
	public Boolean getCopyPatientOnCorrespondence()
	{
		return this.copypatientoncorrespondence;
	}
	public void setCopyPatientOnCorrespondence(Boolean value)
	{
		this.copypatientoncorrespondence = value;
	}
	public ims.framework.utils.beans.DateBean getCopyPatientOnCorrespondenceDate()
	{
		return this.copypatientoncorrespondencedate;
	}
	public void setCopyPatientOnCorrespondenceDate(ims.framework.utils.beans.DateBean value)
	{
		this.copypatientoncorrespondencedate = value;
	}
	public ims.core.vo.beans.PatientMedicalInsuranceVoBean getCurrentMedicalInsurance()
	{
		return this.currentmedicalinsurance;
	}
	public void setCurrentMedicalInsurance(ims.core.vo.beans.PatientMedicalInsuranceVoBean value)
	{
		this.currentmedicalinsurance = value;
	}
	public ims.core.vo.beans.NationalHealthCoverVoBean getNationalHealthCover()
	{
		return this.nationalhealthcover;
	}
	public void setNationalHealthCover(ims.core.vo.beans.NationalHealthCoverVoBean value)
	{
		this.nationalhealthcover = value;
	}
	public ims.core.vo.beans.PatientContactPreferenceVoBean getAlternativeContact()
	{
		return this.alternativecontact;
	}
	public void setAlternativeContact(ims.core.vo.beans.PatientContactPreferenceVoBean value)
	{
		this.alternativecontact = value;
	}
	public ims.vo.LookupInstanceBean getHealthBoard()
	{
		return this.healthboard;
	}
	public void setHealthBoard(ims.vo.LookupInstanceBean value)
	{
		this.healthboard = value;
	}
	public ims.core.vo.beans.SupportNetworkFamilyBean[] getSupportNetworkFamily()
	{
		return this.supportnetworkfamily;
	}
	public void setSupportNetworkFamily(ims.core.vo.beans.SupportNetworkFamilyBean[] value)
	{
		this.supportnetworkfamily = value;
	}
	public ims.vo.LookupInstanceBean getPDSDeathNotificationStatus()
	{
		return this.pdsdeathnotificationstatus;
	}
	public void setPDSDeathNotificationStatus(ims.vo.LookupInstanceBean value)
	{
		this.pdsdeathnotificationstatus = value;
	}
	public Boolean getPDSInterpreterRequired()
	{
		return this.pdsinterpreterrequired;
	}
	public void setPDSInterpreterRequired(Boolean value)
	{
		this.pdsinterpreterrequired = value;
	}
	public ims.core.vo.beans.PatRelativeBean[] getPDSrelatives()
	{
		return this.pdsrelatives;
	}
	public void setPDSrelatives(ims.core.vo.beans.PatRelativeBean[] value)
	{
		this.pdsrelatives = value;
	}
	public ims.core.vo.beans.PDSPatientUpdateVoBean getPDSPatientUpdate()
	{
		return this.pdspatientupdate;
	}
	public void setPDSPatientUpdate(ims.core.vo.beans.PDSPatientUpdateVoBean value)
	{
		this.pdspatientupdate = value;
	}
	public ims.core.vo.beans.PDSPatientGPVoBean[] getPDSPatientGPHistory()
	{
		return this.pdspatientgphistory;
	}
	public void setPDSPatientGPHistory(ims.core.vo.beans.PDSPatientGPVoBean[] value)
	{
		this.pdspatientgphistory = value;
	}
	public ims.vo.RefVoBean getSchool()
	{
		return this.school;
	}
	public void setSchool(ims.vo.RefVoBean value)
	{
		this.school = value;
	}
	public Boolean getOverseasVisitor()
	{
		return this.overseasvisitor;
	}
	public void setOverseasVisitor(Boolean value)
	{
		this.overseasvisitor = value;
	}
	public ims.vo.LookupInstanceBean getOverseasClassification()
	{
		return this.overseasclassification;
	}
	public void setOverseasClassification(ims.vo.LookupInstanceBean value)
	{
		this.overseasclassification = value;
	}
	public Boolean getHasLivedUK()
	{
		return this.hasliveduk;
	}
	public void setHasLivedUK(Boolean value)
	{
		this.hasliveduk = value;
	}
	public Boolean getDecoupled()
	{
		return this.decoupled;
	}
	public void setDecoupled(Boolean value)
	{
		this.decoupled = value;
	}
	public ims.framework.utils.beans.DateBean getPDSDateLastChecked()
	{
		return this.pdsdatelastchecked;
	}
	public void setPDSDateLastChecked(ims.framework.utils.beans.DateBean value)
	{
		this.pdsdatelastchecked = value;
	}
	public ims.vo.LookupInstanceBean getSchoolOrCollege()
	{
		return this.schoolorcollege;
	}
	public void setSchoolOrCollege(ims.vo.LookupInstanceBean value)
	{
		this.schoolorcollege = value;
	}
	public Boolean getIsChildInPublicCare()
	{
		return this.ischildinpubliccare;
	}
	public void setIsChildInPublicCare(Boolean value)
	{
		this.ischildinpubliccare = value;
	}
	public ims.vo.LookupInstanceBean getPublicCareNeed()
	{
		return this.publiccareneed;
	}
	public void setPublicCareNeed(ims.vo.LookupInstanceBean value)
	{
		this.publiccareneed = value;
	}
	public String getTxtOccupation()
	{
		return this.txtoccupation;
	}
	public void setTxtOccupation(String value)
	{
		this.txtoccupation = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PersonNameBean name;
	private ims.vo.LookupInstanceBean sex;
	private Integer age;
	private String agetext;
	private ims.core.vo.beans.PersonAddressBean address;
	private ims.framework.utils.beans.PartialDateBean dob;
	private ims.framework.utils.beans.DateBean dod;
	private ims.core.vo.beans.LocationLiteVoBean ward;
	private ims.vo.LookupInstanceBean religion;
	private Boolean hasallergies;
	private Boolean hasalerts;
	private ims.core.vo.beans.PatientIdBean[] identifiers;
	private Boolean isactive;
	private ims.core.vo.beans.PatientShortBean associatedpatient;
	private ims.core.vo.beans.CommChannelVoBean[] commchannels;
	private ims.vo.LookupInstanceBean ethnicorigin;
	private ims.vo.LookupInstanceBean maritalstatus;
	private Integer scn;
	private ims.vo.LookupInstanceBean sourceofinformation;
	private ims.vo.SysInfoBean sysinfo;
	private Boolean hasactivealerts;
	private ims.framework.utils.beans.TimeBean timeofdeath;
	private Boolean isquickregistrationpatient;
	private ims.core.vo.beans.PatientNotificationsFillerOnlyVoBean ocsnotification;
	private ims.vo.RefVoBean currentresponsibleconsultant;
	private ims.framework.utils.beans.DateTimeBean dementiabreachdatetime;
	private ims.vo.LookupInstanceBean dementiaworkliststatus;
	private ims.vo.LookupInstanceBean mrnstatus;
	private Boolean hasscannedcasenotefolders;
	private Boolean isconfidential;
	private ims.framework.utils.beans.TimeBean timeofbirth;
	private Boolean isselfadmitpatient;
	private ims.vo.LookupInstanceBean patientcategory;
	private ims.core.vo.beans.PDSPatientGPVoBean pdspatientgp;
	private Boolean hasalertcategory1;
	private Boolean hasalertcategory2;
	private Boolean hasalertcategory3;
	private Boolean hasalertcategory4;
	private Boolean hasalertcategoryother;
	private Boolean futureapptscancelonmarkdeceasedanswer;
	private ims.core.vo.beans.GpShortVoBean gp;
	private ims.vo.LookupInstanceBean occupation;
	private ims.vo.LookupInstanceBean language;
	private ims.core.vo.beans.NextOfKinBean nok;
	private ims.core.vo.beans.PersonNameBean[] othernames;
	private ims.core.vo.beans.PersonAddressBean[] addresses;
	private ims.core.vo.beans.LocSiteShortVoBean gpsurgery;
	private ims.core.vo.beans.PatientAlertLiteVoBean[] patientalerts;
	private ims.vo.RefVoBean clientparent;
	private ims.core.vo.beans.AppDBImageVoBean photo;
	private String savealias;
	private Boolean cancelsd_appts;
	private ims.vo.LookupInstanceBean homefolderlocation;
	private String harccode;
	private ims.vo.LookupInstanceBean prefcommlanguage;
	private ims.core.vo.beans.OrganisationWithSitesVoBean practice;
	private Boolean copypatientoncorrespondence;
	private ims.framework.utils.beans.DateBean copypatientoncorrespondencedate;
	private ims.core.vo.beans.PatientMedicalInsuranceVoBean currentmedicalinsurance;
	private ims.core.vo.beans.NationalHealthCoverVoBean nationalhealthcover;
	private ims.core.vo.beans.PatientContactPreferenceVoBean alternativecontact;
	private ims.vo.LookupInstanceBean healthboard;
	private ims.core.vo.beans.SupportNetworkFamilyBean[] supportnetworkfamily;
	private ims.vo.LookupInstanceBean pdsdeathnotificationstatus;
	private Boolean pdsinterpreterrequired;
	private ims.core.vo.beans.PatRelativeBean[] pdsrelatives;
	private ims.core.vo.beans.PDSPatientUpdateVoBean pdspatientupdate;
	private ims.core.vo.beans.PDSPatientGPVoBean[] pdspatientgphistory;
	private ims.vo.RefVoBean school;
	private Boolean overseasvisitor;
	private ims.vo.LookupInstanceBean overseasclassification;
	private Boolean hasliveduk;
	private Boolean decoupled;
	private ims.framework.utils.beans.DateBean pdsdatelastchecked;
	private ims.vo.LookupInstanceBean schoolorcollege;
	private Boolean ischildinpubliccare;
	private ims.vo.LookupInstanceBean publiccareneed;
	private String txtoccupation;
}
