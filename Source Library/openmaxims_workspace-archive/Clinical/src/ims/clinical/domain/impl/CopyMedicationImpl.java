//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Neil McAnaspie using IMS Development Environment (version 1.45 build 2404.25098)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.clinical.domain.impl;

import ims.clinical.domain.base.impl.BaseCopyMedicationImpl;
import ims.core.vo.domain.PatientMedicationVoAssembler;

public class CopyMedicationImpl extends BaseCopyMedicationImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.PatientMedicationVoCollection listPatientMedication(ims.core.vo.PatientShort patient, ims.core.vo.ClinicalContactShortVo contact)
	{
		String hqlQuery = "from PatientMedication patMed where patMed.patient.id = " + patient.getID_Patient();
		
		return PatientMedicationVoAssembler.createPatientMedicationVoCollectionFromPatientMedication(getDomainFactory().find(hqlQuery));
	}
}
