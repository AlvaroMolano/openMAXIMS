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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.45 build 2389.25607)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.assessment.domain.impl;
import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.assessment.configuration.domain.objects.UserDefinedObjectComponent;
import ims.assessment.configuration.vo.UserDefinedObjectComponentRefVo;
import ims.assessment.domain.base.impl.BaseGraphicAssessmentInstantiationImpl;
import ims.assessment.instantiation.domain.objects.PatientAssessment;
import ims.assessment.instantiation.domain.objects.PatientGraphicAssessment;
import ims.assessment.instantiation.vo.PatientAssessmentRefVo;
import ims.assessment.vo.PatientAssessmentVo;
import ims.assessment.vo.UserDefinedObjectComponentVo;
import ims.assessment.vo.domain.PatientAssessmentVoAssembler;
import ims.assessment.vo.domain.UserDefinedObjectComponentVoAssembler;
import ims.core.helper.DrawingControlReportHelper;
import ims.core.vo.HcpLiteVoCollection;
import ims.domain.DomainFactory;
import ims.framework.exceptions.CodingRuntimeException;


public class GraphicAssessmentInstantiationImpl extends BaseGraphicAssessmentInstantiationImpl
{
	public ims.assessment.vo.PatientAssessmentVo savePatientAssessment(ims.assessment.vo.PatientAssessmentVo voPatientAssessment) throws ims.domain.exceptions.StaleObjectException
	{
		if(voPatientAssessment == null)
			throw new RuntimeException("Cannot save null value for PatientAssessmentVo");
		if(voPatientAssessment.isValidated() == false)
			throw new CodingRuntimeException("PatientAssessmentVo not validated");
		
		DomainFactory factory = getDomainFactory();
		PatientAssessment doPatientAssessment = PatientAssessmentVoAssembler.extractPatientAssessment(factory, voPatientAssessment);
		
		//save every PatientGraphicAssessment as a rendered MHT - used by reports only
		DrawingControlReportHelper helper = new DrawingControlReportHelper();
		if(voPatientAssessment.getAssessmentDataIsNotNull() && voPatientAssessment.getAssessmentData().getGraphicFindingsIsNotNull())
		{
			for (int i = 0; i < voPatientAssessment.getAssessmentData().getGraphicFindings().size(); i++)
			{
				PatientGraphicAssessment pga = (PatientGraphicAssessment) doPatientAssessment.getAssessmentData().getGraphicFindings().get(i);
				pga.setRenderedMHT(helper.CreateDrawingControlSeed(voPatientAssessment.getAssessmentData().getGraphicFindings().get(i), 800, 400));
			}
		}
		
		factory.save(doPatientAssessment);
		return PatientAssessmentVoAssembler.create(doPatientAssessment);
	}

	public HcpLiteVoCollection listHCPs(String name)
	{
		HcpAdmin impHcp = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		return impHcp.listHcpLiteByName(name);
	}

	public UserDefinedObjectComponentVo getComponent(UserDefinedObjectComponentRefVo refVo)
	{
		if(refVo == null)
			throw new RuntimeException("Cannot get UserDefinedObjectComponentRefVo for null UserDefinedObjectComponentRefVo");

		DomainFactory factory = getDomainFactory();
		UserDefinedObjectComponent doUserDefinedObjectComponent = (UserDefinedObjectComponent) factory.getDomainObject(UserDefinedObjectComponent.class, refVo.getID_UserDefinedObjectComponent());
		return UserDefinedObjectComponentVoAssembler.create(doUserDefinedObjectComponent);
	}
	public PatientAssessmentVo getPatientAssessment(PatientAssessmentRefVo patientAssessmentRefVo)
	{
		if(patientAssessmentRefVo == null)
			throw new RuntimeException("Cannot get PatientAssessmentVo for null PatientAssessmentRefVo");
		
		DomainFactory factory = getDomainFactory();
		PatientAssessment doPatientAssesment = (PatientAssessment) factory.getDomainObject(PatientAssessment.class, patientAssessmentRefVo.getID_PatientAssessment());
		return PatientAssessmentVoAssembler.create(doPatientAssesment);
	}
}


