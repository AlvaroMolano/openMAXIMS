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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.19 build 40709.1515)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.nursing.domain.impl;

import ims.coe.assessmenttools.domain.objects.PatientMovementHandling;
import ims.coe.assessmenttools.domain.objects.PatientMovementHandlingScreening;
import ims.coe.vo.PatientHandling;
import ims.coe.vo.PatientHandlingHeader;
import ims.coe.vo.PatientHandlingHeaderCollection;
import ims.coe.vo.PatientMovement;
import ims.coe.vo.PatientMovementHeader;
import ims.coe.vo.PatientMovementHeaderCollection;
import ims.coe.vo.domain.PatientHandlingAssembler;
import ims.coe.vo.domain.PatientHandlingHeaderAssembler;
import ims.coe.vo.domain.PatientMovementAssembler;
import ims.coe.vo.domain.PatientMovementHeaderAssembler;
import ims.core.domain.Reports;
import ims.core.domain.impl.ReportsImpl;
import ims.core.vo.CareContextShortVo;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.SortOrder;
import ims.nursing.vo.AssessmentComponent;
import ims.nursing.vo.AssessmentHeaderInfo;

import java.util.ArrayList;
import java.util.List;

public class PatientMovementImpl extends DomainImpl implements ims.nursing.domain.PatientMovement, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	public PatientHandling getPatientHandling(PatientHandlingHeader patientHandling)
	{		
		DomainFactory factory = getDomainFactory();

		PatientMovementHandlingScreening domHandling = (PatientMovementHandlingScreening) factory.getDomainObject(PatientMovementHandlingScreening.class, patientHandling.getID_Assessment());
		return PatientHandlingAssembler.create(domHandling);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ims.coe.domain.PatientMovement#getPatientMovement(java.lang.Integer)
	 */
	public PatientMovement getPatientMovement(PatientMovementHeader patientMovement)
	{
		DomainFactory factory = getDomainFactory();

		PatientMovementHandling domMovement = (PatientMovementHandling) factory.getDomainObject(PatientMovementHandling.class, patientMovement.getID_Assessment());
		return PatientMovementAssembler.create(domMovement);
	}

	/**
	 * This method is called when the patient movement/handling form is called
	 * from the Assessment Mobility Component form. It will save the mobility
	 * component by calling the implementation from
	 * AssessmentComponentImpl.java, with the patienthandling and
	 * patientmovement details set.
	 * @throws UniqueKeyViolationException 
	 * @throws DomainInterfaceException 
	 */
	public ims.nursing.vo.AssessmentHeaderInfo saveMobilityComponent(ims.nursing.vo.AssessmentHeaderInfo assessment, ims.nursing.vo.AssessmentComponent component) throws ims.domain.exceptions.StaleObjectException, UniqueKeyViolationException, DomainInterfaceException
//	private ims.nursing.vo.AssessmentHeaderInfo saveMobilityComponent(ims.nursing.vo.AssessmentHeaderInfo assessment, ims.nursing.vo.AssessmentComponent component) throws ims.domain.exceptions.StaleObjectException, UniqueKeyViolationException
	{
//		AssessSkin componentImpl = (AssessSkin)getDomainImpl(AssessmentComponentImpl.class);
//		AssessMobility componentImpl = (AssessMobility) getDomainImpl(AssessmentComponentImpl.class);
//		AssessMobility componentImpl = (AssessMobility) getDomainImpl(AssessmentComponentImpl.class);
//		ims.nursing.vo.AssessmentHeaderInfo header = componentImpl.saveComponent(assessment, component);
//		header.setCurrentComponent(componentImpl.getComponent(header.getCurrentComponent()));
///		return header;
		return null;
	}

	/**
	 * saves Patient Handling
	 */
	public AssessmentHeaderInfo savePatientHandling(PatientHandling patientHandling, AssessmentHeaderInfo assessment, AssessmentComponent component) throws StaleObjectException
	{
		// Ensure the value object has been validated
		if (!patientHandling.isValidated())
			throw new DomainRuntimeException("Patient Handling has not been validated");

		DomainFactory factory = getDomainFactory();

		PatientMovementHandlingScreening domHandle = PatientHandlingAssembler.extractPatientMovementHandlingScreening(factory, patientHandling);

		factory.save(domHandle);

		/*	if (assessment != null)
			{
				AssessmentMobility comp = (AssessmentMobility) component;
				comp.setPatientHandling(PatientHandlingAssembler.create(domHandle));
				if (comp.validate() != null)
					throw new DomainRuntimeException("Mobility Component has not been validated");

				return (saveMobilityComponent(assessment, comp));
			}*/
		
		return null;
	}

	/**
	 * saves Patient Movement
	 */
	public AssessmentHeaderInfo savePatientMovement(PatientMovement patientMovement, AssessmentHeaderInfo assessment, AssessmentComponent component) throws StaleObjectException
	{
		// Ensure the Patient Movement has been validated
		if (!patientMovement.isValidated())
			throw new DomainRuntimeException("Patient Movement has not been validated");

		DomainFactory factory = getDomainFactory();

		PatientMovementHandling domMovement = PatientMovementAssembler.extractPatientMovementHandling(factory, patientMovement);

		factory.save(domMovement);

			/*if (assessment != null)
			{
				AssessmentMobility comp = (AssessmentMobility) component;
				comp.setPatientMovement(PatientMovementAssembler.create(domMovement));
				if (comp.validate() != null)
					throw new DomainRuntimeException("Mobility Component has not been validated");
				return (saveMobilityComponent(assessment, comp));
			}*/
		
		return null;
	}

	/*
	 * /** Retrieves a list of PatientHandling Objects on Episode iD
	 */
	/*
	 * public ims.coe.vo.PatientHandlingHeaderCollection
	 * listPatientHandling(ims.core.vo.ClinicalEpisode episode) { DomainFactory
	 * factory = getDomainFactory();
	 * 
	 * ClinicalEpisode domEpis =
	 * (ClinicalEpisode)factory.getDomainObject(ClinicalEpisode.class,
	 * episode.getID_ClinicalEpisode());
	 * if(!NursingDetailsAccessor.class.isAssignableFrom(domEpis.getClass())) {
	 * throw new DomainRuntimeException("The episode does not contain Nursing
	 * Details"); } NursingDetailsAccessor nsAccess =
	 * (NursingDetailsAccessor)domEpis; NursingEpisDetails doNursingEpisDetails =
	 * nsAccess.getNursingEpisDetails();
	 * 
	 * if (doNursingEpisDetails != null) { List phList =
	 * factory.find(doNursingEpisDetails.getAssessments(), " where this.class =
	 * PatientMovementHandlingScreening");
	 * return(PatientHandlingHeaderAssembler.createPatientHandlingHeaderCollectionFromPatientMovementHandlingScreening(phList).sort(SortOrder.DESCENDING)); }
	 * else return new ims.coe.vo.PatientHandlingHeaderCollection(); }
	 * 
	 * /** Retrieves a list of PatientMovement Objects on Episode iD
	 */
	/*
	 * public ims.coe.vo.PatientMovementHeaderCollection
	 * listPatientMovement(ims.core.vo.ClinicalEpisode episode) { DomainFactory
	 * factory = getDomainFactory();
	 * 
	 * ClinicalEpisode domEpis =
	 * (ClinicalEpisode)factory.getDomainObject(ClinicalEpisode.class,
	 * episode.getID_ClinicalEpisode());
	 * if(!NursingDetailsAccessor.class.isAssignableFrom(domEpis.getClass())) {
	 * throw new DomainRuntimeException("The episode does not contain Nursing
	 * Details"); } NursingDetailsAccessor nsAccess =
	 * (NursingDetailsAccessor)domEpis; NursingEpisDetails doNursingEpisDetails =
	 * nsAccess.getNursingEpisDetails();
	 * 
	 * if (doNursingEpisDetails != null) { List pmList =
	 * factory.find(doNursingEpisDetails.getAssessments(), " where this.class =
	 * PatientMovementHandling");
	 * return(PatientMovementHeaderAssembler.createPatientMovementHeaderCollectionFromPatientMovementHandling(pmList).sort(SortOrder.DESCENDING)); }
	 * else return new ims.coe.vo.PatientMovementHeaderCollection(); } /*
	 * (non-Javadoc)
	 * 
	 * @see ims.coe.domain.PatientMovement#savePatientHandling(ims.coe.vo.PatientHandling)
	 */

	/**
	 * Retrieves a list of PatientHandling Objects on root contact short id
	 */
	public PatientHandlingHeaderCollection listPatientHandling(CareContextShortVo careContextShortVo)
	{
		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer(" ");
		String query = "from PatientMovementHandlingScreening pmhs ";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		String andStr = " ";

		if (careContextShortVo != null)
		{
			hql.append(andStr + " pmhs.careContext.id = :rcc");
			markers.add("rcc");
			values.add(careContextShortVo.getID_CareContext());
			andStr = " and ";
		}

		if (markers.size() > 0)
			query += " where ";
		query += hql.toString();
		List patHandlingScreening = factory.find(query, markers, values);

		return (PatientHandlingHeaderAssembler.createPatientHandlingHeaderCollectionFromPatientMovementHandlingScreening(patHandlingScreening).sort(SortOrder.DESCENDING));
	}

	/**
	 * Retrieves a list of PatientMovement Objects on root contact short id
	 */
	public PatientMovementHeaderCollection listPatientMovement(CareContextShortVo careContextShortVo)
	{
		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer(" ");
		String query = "from PatientMovementHandling pmh ";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		String andStr = " ";

		if (careContextShortVo != null)
		{
			hql.append(andStr + " pmh.careContext.id = :rcc");
			markers.add("rcc");
			values.add(careContextShortVo.getID_CareContext());
			andStr = " and ";
		}

		if (markers.size() > 0)
			query += " where ";
		query += hql.toString();
		List patMovementHandling = factory.find(query, markers, values);

		return (PatientMovementHeaderAssembler.createPatientMovementHeaderCollectionFromPatientMovementHandling(patMovementHandling).sort(SortOrder.DESCENDING));
	}

	/*
	 * 
	 */
	public Boolean isHandlingPartOfMobilityAss(PatientHandlingHeader voPatientHandling) throws DomainInterfaceException
	{
		DomainFactory factory = getDomainFactory();

		PatientMovementHandlingScreening domPatientHandling = PatientHandlingHeaderAssembler.extractPatientMovementHandlingScreening(factory, voPatientHandling);
		java.util.List handlingList = factory.find("from MobilityComponent mc where mc.patientHandling = :patHand", "patHand", domPatientHandling);

		if (handlingList == null || handlingList.size() == 0)
			return Boolean.FALSE;

		return Boolean.TRUE;
	}

	public Boolean isMovementPartOfMobilityAss(PatientMovementHeader voPatientMovement) throws DomainInterfaceException
	{
		DomainFactory factory = getDomainFactory();

		PatientMovementHandling domPatientMovement = PatientMovementHeaderAssembler.extractPatientMovementHandling(factory, voPatientMovement);
		java.util.List movementList = factory.find("from MobilityComponent mc where mc.patientMovement = :patMove", "patMove", domPatientMovement);

		if (movementList == null || movementList.size() == 0)
			return Boolean.FALSE;

		return Boolean.TRUE;
	}

	public PatientHandling savePatientHandlingNoAssessment(PatientHandling patientHandlingVo) throws StaleObjectException 
	{
		// Ensure the value object has been validated
		if (!patientHandlingVo.isValidated())
			throw new DomainRuntimeException("Patient Handling has not been validated");

		DomainFactory factory = getDomainFactory();

		PatientMovementHandlingScreening domHandle = PatientHandlingAssembler.extractPatientMovementHandlingScreening(factory, patientHandlingVo);

		factory.save(domHandle);
			
		return PatientHandlingAssembler.create(domHandle);
	}

	public PatientMovement savePatientMovementNoAssessment(PatientMovement patientMovementVo) throws StaleObjectException 
	{
		// Ensure the Patient Movement has been validated
		if (!patientMovementVo.isValidated())
			throw new DomainRuntimeException("Patient Movement has not been validated");

		DomainFactory factory = getDomainFactory();

		PatientMovementHandling domMovement = PatientMovementAssembler.extractPatientMovementHandling(factory, patientMovementVo);

		factory.save(domMovement);
		
		return PatientMovementAssembler.create(domMovement);
	}

	public PatientHandlingHeaderCollection listPatientHandlingByCareContext(
			CareContextShortVo careContextVo) {
		// TODO Auto-generated method stub
		return null;
	}

	public PatientMovementHeaderCollection listPatientMovementByCareContext(
			CareContextShortVo careContextVo) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getReportAndTemplate(Integer reportId, Integer templateId)
	{
		Reports impl = (Reports) getDomainImpl(ReportsImpl.class);
		return impl.getReportAndTemplate(reportId, templateId);
	}

	/*
	 * public ims.nursing.vo.AssessmentHeaderInfo
	 * savePatientHandling(PatientHandling patientHandling,
	 * ims.core.vo.ClinicalEpisode episode, ims.nursing.vo.AssessmentHeaderInfo
	 * assessment, ims.nursing.vo.AssessmentComponent component) throws
	 * StaleObjectException { // Ensure the value object has been validated if
	 * (!patientHandling.isValidated()) throw new
	 * DomainRuntimeException("Patient Handling has not been validated");
	 * 
	 * DomainFactory factory = getDomainFactory();
	 * 
	 * ClinicalEpisode domEpis =
	 * (ClinicalEpisode)factory.getDomainObject(ClinicalEpisode.class,
	 * episode.getID_ClinicalEpisode());
	 * 
	 * if(!NursingDetailsAccessor.class.isAssignableFrom(domEpis.getClass())) {
	 * throw new DomainRuntimeException("The episode does not contain Nursing
	 * Details"); }
	 * 
	 * NursingDetailsAccessor nsAccess = (NursingDetailsAccessor)domEpis;
	 * NursingEpisDetails doNursingEpisDetails =
	 * nsAccess.getNursingEpisDetails();
	 * 
	 * PatientMovementHandlingScreening domHandle
	 * =PatientHandlingAssembler.extractPatientMovementHandlingScreening(factory,
	 * patientHandling);
	 * 
	 * try { factory.save(domHandle);
	 * 
	 * if (doNursingEpisDetails == null) { doNursingEpisDetails = new
	 * NursingEpisDetails(); factory.save(doNursingEpisDetails);
	 * nsAccess.setNursingEpisDetails(doNursingEpisDetails); }
	 * 
	 * doNursingEpisDetails.getAssessments().add(domHandle);
	 * 
	 * if (assessment != null) { AssessmentMobility comp =
	 * (AssessmentMobility)component;
	 * comp.setPatientHandling(PatientHandlingAssembler.create(domHandle)); if
	 * (comp.validate() != null) throw new DomainRuntimeException("Mobility
	 * Component has not been validated"); factory.save(domEpis); return
	 * (saveMobilityComponent(assessment, comp, episode)); } return null; }
	 * catch (DomainException e) { throw new
	 * DomainRuntimeException("DomainException occurred saving patient
	 * handling.\r\n" + e.getMessage(), e); } }
	 * 
	 * public ims.nursing.vo.AssessmentHeaderInfo
	 * savePatientMovement(PatientMovement
	 * patientMovement,ims.core.vo.ClinicalEpisode episode,
	 * ims.nursing.vo.AssessmentHeaderInfo assessment,
	 * ims.nursing.vo.AssessmentComponent component) throws StaleObjectException { //
	 * Ensure the Patient Movement has been validated if
	 * (!patientMovement.isValidated()) throw new
	 * DomainRuntimeException("Patient Movement has not been validated");
	 * 
	 * DomainFactory factory = getDomainFactory();
	 * 
	 * ClinicalEpisode domEpis =
	 * (ClinicalEpisode)factory.getDomainObject(ClinicalEpisode.class,
	 * episode.getID_ClinicalEpisode());
	 * 
	 * if(!NursingDetailsAccessor.class.isAssignableFrom(domEpis.getClass())) {
	 * throw new DomainRuntimeException("The episode does not contain Nursing
	 * Details"); }
	 * 
	 * NursingDetailsAccessor nsAccess = (NursingDetailsAccessor)domEpis;
	 * NursingEpisDetails doNursingEpisDetails =
	 * nsAccess.getNursingEpisDetails();
	 * 
	 * PatientMovementHandling domMovement =
	 * PatientMovementAssembler.extractPatientMovementHandling(factory,
	 * patientMovement);
	 * 
	 * try { factory.save(domMovement);
	 * 
	 * if (doNursingEpisDetails == null) { doNursingEpisDetails = new
	 * NursingEpisDetails(); factory.save(doNursingEpisDetails);
	 * nsAccess.setNursingEpisDetails(doNursingEpisDetails); }
	 * 
	 * doNursingEpisDetails.getAssessments().add(domMovement);
	 * 
	 * if (assessment != null) { AssessmentMobility comp =
	 * (AssessmentMobility)component;
	 * comp.setPatientMovement(PatientMovementAssembler.create(domMovement)); if
	 * (comp.validate() != null) throw new DomainRuntimeException("Mobility
	 * Component has not been validated"); return
	 * (saveMobilityComponent(assessment, comp, episode)); } return null; }
	 * catch (DomainException e) { throw new
	 * DomainRuntimeException("DomainException occurred saving patient
	 * movement.\r\n" + e.getMessage(), e); } }
	 */
}
