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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.71 build 3607.26880)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import ims.admin.domain.LookupTree;
import ims.admin.domain.impl.LookupTreeImpl;
import ims.core.domain.base.impl.BasePatientImageSelectionImpl;
import ims.core.vo.PatientImageVo;
import ims.core.vo.domain.PatientImageVoAssembler;
import ims.domain.DomainFactory;
import ims.vo.LookupInstanceCollection;
import ims.vo.LookupTypeVo;

public class PatientImageSelectionImpl extends BasePatientImageSelectionImpl
{

	private static final long serialVersionUID = 1L;

	public PatientImageVo getPatientImage(Integer patientID) 
	{
		DomainFactory factory = getDomainFactory();
		return PatientImageVoAssembler.create((ims.core.patient.domain.objects.Patient)factory.getDomainObject(ims.core.patient.domain.objects.Patient.class, patientID));
	}
			
	public LookupInstanceCollection getLookupTypeInstance(Integer typeId) 
	{
		LookupTypeVo vo = new LookupTypeVo();
		vo.setId(typeId);
		
		LookupTree domainLookupTree = (LookupTree) getDomainImpl(LookupTreeImpl.class);
		return domainLookupTree.getLookupInstances(vo);
	}
}
