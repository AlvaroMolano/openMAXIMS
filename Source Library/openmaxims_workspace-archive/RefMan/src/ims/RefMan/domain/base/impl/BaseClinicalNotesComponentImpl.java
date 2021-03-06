// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseClinicalNotesComponentImpl extends DomainImpl implements ims.RefMan.domain.ClinicalNotesComponent, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validategetConsultationClinicalNotesVo(ims.RefMan.vo.CatsReferralRefVo refVoCatsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveConsultationClinicalNotesVo(ims.RefMan.vo.ConsultationClinicalNotesVo voConsultationClinicalNotes)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistHcpLiteByName(String hcpName)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistPatientAllergies(ims.core.vo.PatientShort patient)
	{
	}

	@SuppressWarnings("unused")
	public void validategetNote(ims.RefMan.vo.ConsultationClinicalNotesRefVo note)
	{
		if(note == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'note' of type 'ims.RefMan.vo.ConsultationClinicalNotesRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetPatientNoAllergyInfo(ims.core.patient.vo.PatientRefVo patientRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatesavePatientNoAllergyInfo(ims.core.vo.PatientNoAllergyInfoVo patientNoAllergyInfo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatientShort(ims.core.patient.vo.PatientRefVo patientRefVo)
	{
	}
}
