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

package ims.admin.domain;

// Generated from form domain impl
public interface WebServicesIntegration extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public void setPatientIdentifierTypeAndValue(String identifierType, String identifierValue);

	// Generated from form domain interface definition
	public void setPatientIdentifierType(String sessionToken, String identifierType);

	// Generated from form domain interface definition
	public void setPatientIdentifier(String sessionToken, String identifier);

	// Generated from form domain interface definition
	public void setUserLocation(String sessionToken, String location);

	// Generated from form domain interface definition
	public void setUserRole(String sessionToken, String role);

	// Generated from form domain interface definition
	public void setStartupForm(String sessionToken, String form);

	// Generated from form domain interface definition
	public void setAppointmentConsultantCode(String sessionToken, String code);

	// Generated from form domain interface definition
	public void setAppointmentLocationCode(String sessionToken, String code);

	// Generated from form domain interface definition
	public void setAppointmentStartDateTime(String sessionToken, String startDate);

	// Generated from form domain interface definition
	public void setAppointmentEndDateTime(String sessionToken, String endDate);

	// Generated from form domain interface definition
	public void restrictPatientAccess(String sessionToken, String restrict);

	// Generated from form domain interface definition
	public String getSecurityToken(String sessionToken) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* buildReport
	*/
	public byte[] buildReport(String templateId, String imsId, String templateName, String reportId, String format);

	// Generated from form domain interface definition
	/**
	* buildReportAsUrl
	*/
	public String buildReportAsUrl(String templateId, String imsId, String templateName, String reportId, String format);

	// Generated from form domain interface definition
	/**
	* buildReportAsUrlInlineFrame
	*/
	public String buildReportAsUrlInlineFrame(String templateId, String imsId, String templateName, String reportId, String format);

	// Generated from form domain interface definition
	/**
	* addSeed
	*/
	public void addSeed(String name, String value);

	// Generated from form domain interface definition
	public String convertOfficeDocument(String patientDocumentID, String format);

	// Generated from form domain interface definition
	public String deleteTempFile(String url);
}
