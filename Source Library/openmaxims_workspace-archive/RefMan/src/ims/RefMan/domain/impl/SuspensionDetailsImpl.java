// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4972.23166)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import java.util.HashMap;

import ims.RefMan.domain.base.impl.BaseSuspensionDetailsImpl;
import ims.RefMan.domain.objects.PatientElectiveList;
import ims.RefMan.vo.domain.PatientElectiveListForSuspensionDetailsVoAssembler;
import ims.domain.DomainFactory;
import ims.framework.exceptions.CodingRuntimeException;

public class SuspensionDetailsImpl extends BaseSuspensionDetailsImpl
{

	private static final long serialVersionUID = 1L;

	public ims.RefMan.vo.PatientElectiveListForSuspensionDetailsVo getPatientElectiveList(ims.RefMan.vo.PatientElectiveListRefVo patientElectiveList)
	{
		if(patientElectiveList == null || patientElectiveList.getID_PatientElectiveList() == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		
		PatientElectiveList doPatientElectiveList = (PatientElectiveList) factory.getDomainObject(PatientElectiveList.class, patientElectiveList.getID_PatientElectiveList());
		return PatientElectiveListForSuspensionDetailsVoAssembler.create(doPatientElectiveList);
	}

	public ims.RefMan.vo.PatientElectiveListForSuspensionDetailsVo savePatientElectiveList(ims.RefMan.vo.PatientElectiveListForSuspensionDetailsVo patientElectiveList) throws ims.domain.exceptions.StaleObjectException
	{
		if(patientElectiveList == null)
			throw new CodingRuntimeException("Cannot save a null PatientElectiveList.");
		
		if(!patientElectiveList.isValidated())
			throw new CodingRuntimeException("PatientElectiveList is not validated.");
		
		DomainFactory factory = getDomainFactory();	
		HashMap doMap=new HashMap();//WDEV-18308
		
		PatientElectiveList doPatientElectiveList = PatientElectiveListForSuspensionDetailsVoAssembler.extractPatientElectiveList(factory, patientElectiveList,doMap);//WDEV-18308
		factory.save(doPatientElectiveList);
		
		return PatientElectiveListForSuspensionDetailsVoAssembler.create(doPatientElectiveList);
	}
}
