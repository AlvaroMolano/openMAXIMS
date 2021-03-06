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

package ims.core.forms.pdsdemographics;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		RefMan = new RefManContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getHideCancelButtonIsNotNull()
		{
			return !cx_CoreHideCancelButton.getValueIsNull(context);
		}
		public Boolean getHideCancelButton()
		{
			return (Boolean)cx_CoreHideCancelButton.getValue(context);
		}
		public void setHideCancelButton(Boolean value)
		{
			cx_CoreHideCancelButton.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreHideCancelButton = new ims.framework.ContextVariable("Core.HideCancelButton", "_cv_Core.HideCancelButton");
		public boolean getPatientImageIsNotNull()
		{
			return !cx_CorePatientImage.getValueIsNull(context);
		}
		public ims.core.vo.AppDBImageVo getPatientImage()
		{
			return (ims.core.vo.AppDBImageVo)cx_CorePatientImage.getValue(context);
		}
		public void setPatientImage(ims.core.vo.AppDBImageVo value)
		{
			cx_CorePatientImage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientImage = new ims.framework.ContextVariable("Core.PatientImage", "_cv_Core.PatientImage");
		public boolean getGPDetailsIsNotNull()
		{
			return !cx_CoreGPDetails.getValueIsNull(context);
		}
		public ims.core.vo.GpShortVo getGPDetails()
		{
			return (ims.core.vo.GpShortVo)cx_CoreGPDetails.getValue(context);
		}
		public void setGPDetails(ims.core.vo.GpShortVo value)
		{
			cx_CoreGPDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreGPDetails = new ims.framework.ContextVariable("Core.GPDetails", "_cv_Core.GPDetails");
		public boolean getCheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearchIsNotNull()
		{
			return !cx_CoreCheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearch.getValueIsNull(context);
		}
		public Boolean getCheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearch()
		{
			return (Boolean)cx_CoreCheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearch.getValue(context);
		}
		public void setCheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearch(Boolean value)
		{
			cx_CoreCheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearch.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearch = new ims.framework.ContextVariable("Core.CheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearch", "_cv_Core.CheckKeyFieldsOnPDSDemographicsOnOpenFromPdsSearch");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");
		public boolean getPatientToBeDisplayedIsNotNull()
		{
			return !cx_CorePatientToBeDisplayed.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientToBeDisplayed()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientToBeDisplayed.getValue(context);
		}
		public void setPatientToBeDisplayed(ims.core.vo.PatientShort value)
		{
			cx_CorePatientToBeDisplayed.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientToBeDisplayed = new ims.framework.ContextVariable("Core.PatientToBeDisplayed", "_cv_Core.PatientToBeDisplayed");
		public boolean getPdsRelatedPersonIsNotNull()
		{
			return !cx_CorePdsRelatedPerson.getValueIsNull(context);
		}
		public ims.core.vo.PatRelative getPdsRelatedPerson()
		{
			return (ims.core.vo.PatRelative)cx_CorePdsRelatedPerson.getValue(context);
		}
		public void setPdsRelatedPerson(ims.core.vo.PatRelative value)
		{
			cx_CorePdsRelatedPerson.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePdsRelatedPerson = new ims.framework.ContextVariable("Core.PdsRelatedPerson", "_cv_Core.PdsRelatedPerson");
		public boolean getYesNoDialogMessageIsNotNull()
		{
			return !cx_CoreYesNoDialogMessage.getValueIsNull(context);
		}
		public String getYesNoDialogMessage()
		{
			return (String)cx_CoreYesNoDialogMessage.getValue(context);
		}
		public void setYesNoDialogMessage(String value)
		{
			cx_CoreYesNoDialogMessage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreYesNoDialogMessage = new ims.framework.ContextVariable("Core.YesNoDialogMessage", "_cv_Core.YesNoDialogMessage");
		public boolean getViewRelatedPersonIsNotNull()
		{
			return !cx_CoreViewRelatedPerson.getValueIsNull(context);
		}
		public Boolean getViewRelatedPerson()
		{
			return (Boolean)cx_CoreViewRelatedPerson.getValue(context);
		}
		public void setViewRelatedPerson(Boolean value)
		{
			cx_CoreViewRelatedPerson.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreViewRelatedPerson = new ims.framework.ContextVariable("Core.ViewRelatedPerson", "_cv_Core.ViewRelatedPerson");
		public boolean getPatientRelativesIsNotNull()
		{
			return !cx_CorePatientRelatives.getValueIsNull(context);
		}
		public ims.core.vo.PatRelativeCollection getPatientRelatives()
		{
			return (ims.core.vo.PatRelativeCollection)cx_CorePatientRelatives.getValue(context);
		}
		public void setPatientRelatives(ims.core.vo.PatRelativeCollection value)
		{
			cx_CorePatientRelatives.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientRelatives = new ims.framework.ContextVariable("Core.PatientRelatives", "_cv_Core.PatientRelatives");
		public boolean getSynchronizeRelativesIsNotNull()
		{
			return !cx_CoreSynchronizeRelatives.getValueIsNull(context);
		}
		public Boolean getSynchronizeRelatives()
		{
			return (Boolean)cx_CoreSynchronizeRelatives.getValue(context);
		}
		public void setSynchronizeRelatives(Boolean value)
		{
			cx_CoreSynchronizeRelatives.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreSynchronizeRelatives = new ims.framework.ContextVariable("Core.SynchronizeRelatives", "_cv_Core.SynchronizeRelatives");
		public boolean getSamlXmlIsNotNull()
		{
			return !cx_CoreSamlXml.getValueIsNull(context);
		}
		public String getSamlXml()
		{
			return (String)cx_CoreSamlXml.getValue(context);
		}
		public void setSamlXml(String value)
		{
			cx_CoreSamlXml.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreSamlXml = new ims.framework.ContextVariable("Core.SamlXml", "_cv_Core.SamlXml");
		public boolean getOtherNamesIsNotNull()
		{
			return !cx_CoreOtherNames.getValueIsNull(context);
		}
		public ims.core.vo.PersonNameCollection getOtherNames()
		{
			return (ims.core.vo.PersonNameCollection)cx_CoreOtherNames.getValue(context);
		}
		public void setOtherNames(ims.core.vo.PersonNameCollection value)
		{
			cx_CoreOtherNames.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreOtherNames = new ims.framework.ContextVariable("Core.OtherNames", "_cv_Core.OtherNames");
		public boolean getGPPracticeIsNotNull()
		{
			return !cx_CoreGPPractice.getValueIsNull(context);
		}
		public ims.core.vo.OrgLiteVo getGPPractice()
		{
			return (ims.core.vo.OrgLiteVo)cx_CoreGPPractice.getValue(context);
		}
		public void setGPPractice(ims.core.vo.OrgLiteVo value)
		{
			cx_CoreGPPractice.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreGPPractice = new ims.framework.ContextVariable("Core.GPPractice", "_cv_Core.GPPractice");
		public boolean getGPSurgeryIsNotNull()
		{
			return !cx_CoreGPSurgery.getValueIsNull(context);
		}
		public ims.core.vo.LocSiteShortVo getGPSurgery()
		{
			return (ims.core.vo.LocSiteShortVo)cx_CoreGPSurgery.getValue(context);
		}
		public void setGPSurgery(ims.core.vo.LocSiteShortVo value)
		{
			cx_CoreGPSurgery.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreGPSurgery = new ims.framework.ContextVariable("Core.GPSurgery", "_cv_Core.GPSurgery");
		public boolean getNOKPersonAddressIsNotNull()
		{
			return !cx_CoreNOKPersonAddress.getValueIsNull(context);
		}
		public ims.core.vo.PersonAddress getNOKPersonAddress()
		{
			return (ims.core.vo.PersonAddress)cx_CoreNOKPersonAddress.getValue(context);
		}
		public void setNOKPersonAddress(ims.core.vo.PersonAddress value)
		{
			cx_CoreNOKPersonAddress.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreNOKPersonAddress = new ims.framework.ContextVariable("Core.NOKPersonAddress", "_cv_Core.NOKPersonAddress");
		public boolean getAliasNameIsNotNull()
		{
			return !cx_CoreAliasName.getValueIsNull(context);
		}
		public String getAliasName()
		{
			return (String)cx_CoreAliasName.getValue(context);
		}
		public void setAliasName(String value)
		{
			cx_CoreAliasName.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreAliasName = new ims.framework.ContextVariable("Core.AliasName", "_cv_Core.AliasName");
		public boolean getRefreshParentIsNotNull()
		{
			return !cx_CoreRefreshParent.getValueIsNull(context);
		}
		public Boolean getRefreshParent()
		{
			return (Boolean)cx_CoreRefreshParent.getValue(context);
		}
		public void setRefreshParent(Boolean value)
		{
			cx_CoreRefreshParent.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreRefreshParent = new ims.framework.ContextVariable("Core.RefreshParent", "_cv_Core.RefreshParent");
		public boolean getDeathDetailsIsNotNull()
		{
			return !cx_CoreDeathDetails.getValueIsNull(context);
		}
		public ims.core.vo.DeathDetailsVo getDeathDetails()
		{
			return (ims.core.vo.DeathDetailsVo)cx_CoreDeathDetails.getValue(context);
		}
		public void setDeathDetails(ims.core.vo.DeathDetailsVo value)
		{
			cx_CoreDeathDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreDeathDetails = new ims.framework.ContextVariable("Core.DeathDetails", "_cv_Core.DeathDetails");
		public boolean getPatientFilterIsNotNull()
		{
			return !cx_CorePatientFilter.getValueIsNull(context);
		}
		public ims.core.vo.PatientFilter getPatientFilter()
		{
			return (ims.core.vo.PatientFilter)cx_CorePatientFilter.getValue(context);
		}
		public void setPatientFilter(ims.core.vo.PatientFilter value)
		{
			cx_CorePatientFilter.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientFilter = new ims.framework.ContextVariable("Core.PatientFilter", "_cvp_Core.PatientFilter");
		public boolean getParentFormModeIsNotNull()
		{
			return !cx_CoreParentFormMode.getValueIsNull(context);
		}
		public ims.framework.enumerations.FormMode getParentFormMode()
		{
			return (ims.framework.enumerations.FormMode)cx_CoreParentFormMode.getValue(context);
		}
		public void setParentFormMode(ims.framework.enumerations.FormMode value)
		{
			cx_CoreParentFormMode.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreParentFormMode = new ims.framework.ContextVariable("Core.ParentFormMode", "_cv_Core.ParentFormMode");
		public boolean getNOKDetailsIsNotNull()
		{
			return !cx_CoreNOKDetails.getValueIsNull(context);
		}
		public ims.core.vo.NextOfKin getNOKDetails()
		{
			return (ims.core.vo.NextOfKin)cx_CoreNOKDetails.getValue(context);
		}
		public void setNOKDetails(ims.core.vo.NextOfKin value)
		{
			cx_CoreNOKDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreNOKDetails = new ims.framework.ContextVariable("Core.NOKDetails", "_cv_Core.NOKDetails");
		public boolean getPersonAddressIsNotNull()
		{
			return !cx_CorePersonAddress.getValueIsNull(context);
		}
		public ims.core.vo.PersonAddress getPersonAddress()
		{
			return (ims.core.vo.PersonAddress)cx_CorePersonAddress.getValue(context);
		}
		public void setPersonAddress(ims.core.vo.PersonAddress value)
		{
			cx_CorePersonAddress.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePersonAddress = new ims.framework.ContextVariable("Core.PersonAddress", "_cv_Core.PersonAddress");
		public boolean getPatientFromPDSIsNotNull()
		{
			return !cx_CorePatientFromPDS.getValueIsNull(context);
		}
		public ims.core.vo.Patient getPatientFromPDS()
		{
			return (ims.core.vo.Patient)cx_CorePatientFromPDS.getValue(context);
		}
		public void setPatientFromPDS(ims.core.vo.Patient value)
		{
			cx_CorePatientFromPDS.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientFromPDS = new ims.framework.ContextVariable("Core.PatientFromPDS", "_cv_Core.PatientFromPDS");
		public boolean getPatientToBeSynchronizedIsNotNull()
		{
			return !cx_CorePatientToBeSynchronized.getValueIsNull(context);
		}
		public ims.core.vo.Patient getPatientToBeSynchronized()
		{
			return (ims.core.vo.Patient)cx_CorePatientToBeSynchronized.getValue(context);
		}
		public void setPatientToBeSynchronized(ims.core.vo.Patient value)
		{
			cx_CorePatientToBeSynchronized.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientToBeSynchronized = new ims.framework.ContextVariable("Core.PatientToBeSynchronized", "_cv_Core.PatientToBeSynchronized");
		public boolean getPdsRelativesSynchronizationIsNotNull()
		{
			return !cx_CorePdsRelativesSynchronization.getValueIsNull(context);
		}
		public ims.core.vo.PatRelativeCollection getPdsRelativesSynchronization()
		{
			return (ims.core.vo.PatRelativeCollection)cx_CorePdsRelativesSynchronization.getValue(context);
		}
		public void setPdsRelativesSynchronization(ims.core.vo.PatRelativeCollection value)
		{
			cx_CorePdsRelativesSynchronization.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePdsRelativesSynchronization = new ims.framework.ContextVariable("Core.PdsRelativesSynchronization", "_cv_Core.PdsRelativesSynchronization");
		public boolean getDuplicatedPatientsIsNotNull()
		{
			return !cx_CoreDuplicatedPatients.getValueIsNull(context);
		}
		public ims.core.vo.PatientLiteVoCollection getDuplicatedPatients()
		{
			return (ims.core.vo.PatientLiteVoCollection)cx_CoreDuplicatedPatients.getValue(context);
		}
		public void setDuplicatedPatients(ims.core.vo.PatientLiteVoCollection value)
		{
			cx_CoreDuplicatedPatients.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreDuplicatedPatients = new ims.framework.ContextVariable("Core.DuplicatedPatients", "_cv_Core.DuplicatedPatients");
		public boolean getPdsSuccesfullSearchIsNotNull()
		{
			return !cx_CorePdsSuccesfullSearch.getValueIsNull(context);
		}
		public Boolean getPdsSuccesfullSearch()
		{
			return (Boolean)cx_CorePdsSuccesfullSearch.getValue(context);
		}
		public void setPdsSuccesfullSearch(Boolean value)
		{
			cx_CorePdsSuccesfullSearch.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePdsSuccesfullSearch = new ims.framework.ContextVariable("Core.PdsSuccesfullSearch", "_cv_Core.PdsSuccesfullSearch");
		public boolean getCommChannelsIsNotNull()
		{
			return !cx_CoreCommChannels.getValueIsNull(context);
		}
		public ims.core.vo.CommChannelVoCollection getCommChannels()
		{
			return (ims.core.vo.CommChannelVoCollection)cx_CoreCommChannels.getValue(context);
		}
		public void setCommChannels(ims.core.vo.CommChannelVoCollection value)
		{
			cx_CoreCommChannels.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCommChannels = new ims.framework.ContextVariable("Core.CommChannels", "_cv_Core.CommChannels");

		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public void clearCatsReferral()
		{
			cx_RefManCatsReferral.setValue(context, null);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferral = new ims.framework.ContextVariable("RefMan.CatsReferral", "_cvp_RefMan.CatsReferral");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public RefManContext RefMan;
}
