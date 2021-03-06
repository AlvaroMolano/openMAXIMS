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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.18 build 40602.1700)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.ccosched.forms.sessionlist;

import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;
import ims.dto.Result;
import ims.dto.client.Patient;
import ims.dto.client.Sd_appt_dts;
import ims.dto.client.Go_ptplact;
import ims.dto.client.Sd_activity_action;
import ims.dto.client.Sd_session;

import ims.ccosched.Helper.DateHelper;

public class Logic extends BaseLogicDTO
{
	public final String newLine = System.getProperty("line.separator");
	
	protected void OnFormOpen() 
	{
		form.PatientName().setValue("");
		form.PatientHospitalNumber().setValue("");
		form.PatientDOB().setValue("");
		form.PatientAddress().setValue("");
		form.PatientCategory().setValue("");
		form.PatientHCP().setValue("");
		form.customControlTreatmentPlan().clear();
		form.MainGrid().getRows().clear();
		form.MainGrid().setEnabled(true);
		
		LoadActions();
		PopulateActionsCombo();

		Open();
		
		form.DateLabel().setValue((form.getGlobalContext().CcoSched.Booking.getSelectedDate() != null ? form.getGlobalContext().CcoSched.Booking.getSelectedDate().toString(DateFormat.MEDIUM): ""));//Context.SelectedDate.ToString("dd MMMM yyyy") 
		
	}

	protected void OnActionChanged() throws PresentationLogicException 
	{
		Open();	
	}

	protected void OnSelectionChanged() throws PresentationLogicException 
	{
//	    Patient Details
		Patient patient = (Patient)domain.getDTOInstance(Patient.class);
		patient.Filter.clear();
		patient.Filter.Pkey = form.MainGrid().getValue().Pkey;
		Result result = patient.get();
		if (result != null)
		{
			engine.showMessage("Patient Details: " + result.getMessage());
			form.PatientHospitalNumber().setValue("");
			form.PatientName().setValue("");
			form.PatientDOB().setValue("");
			form.PatientAddress().setValue("");
			form.PatientCategory().setValue("");
			form.PatientHCP().setValue("");
			return;
		}
		if (patient.DataCollection.count() != 1)
		{
			engine.showMessage("Failed to get patient record.");
			form.PatientHospitalNumber().setValue("");
			form.PatientName().setValue("");
			form.PatientDOB().setValue("");
			form.PatientAddress().setValue("");
			form.PatientCategory().setValue("");
			form.PatientHCP().setValue("");
			return;
		}

		form.PatientHospitalNumber().setValue(patient.DataCollection.get(0).Hospnum);
		form.PatientName().setValue(patient.DataCollection.get(0).Fnm1 + " " + patient.DataCollection.get(0).Snm);
		Date sdt = DateHelper.GetDOBDateFromString(patient.DataCollection.get(0).Dob);
		form.PatientDOB().setValue(sdt == null? "" : sdt.toString(DateFormat.STANDARD));

		StringBuffer address = new StringBuffer(200);
		
		//WDEV-14504
		if (!patient.DataCollection.get(0).Adr1.equals(""))
		{
			address.append(patient.DataCollection.get(0).Adr1);
			address.append(newLine);
		}
		
		if (!patient.DataCollection.get(0).Adr2.equals(""))
		{
			address.append(patient.DataCollection.get(0).Adr2);
			address.append(newLine);
		}
		
		if (!patient.DataCollection.get(0).Adr3.equals(""))
		{
			address.append(patient.DataCollection.get(0).Adr3);
			address.append(newLine);
		}
		
		if (!patient.DataCollection.get(0).Adr4.equals(""))
		{
			address.append(patient.DataCollection.get(0).Adr4);
			address.append(newLine);
		}
		
		if (!patient.DataCollection.get(0).Adr5.equals(""))
		{
			address.append(patient.DataCollection.get(0).Adr5);
			address.append(newLine);
		}
		form.PatientAddress().setValue(address.toString());			

		// Treatment Plan
		form.customControlTreatmentPlan().clear();
		if (form.MainGrid().getValue().Treatpl_act_id.length() > 0)
		{
			Go_ptplact ptplact = (Go_ptplact)domain.getDTOInstance(Go_ptplact.class);
			ptplact.Filter.clear();
			ptplact.Filter.Pt_act_id = form.MainGrid().getValue().Treatpl_act_id;
			result = ptplact.get();
			if (result != null)
			{
				engine.showMessage("Treatment Plan Action: " + result.getMessage());
				return;
			}

			if (ptplact.DataCollection.count() != 1)
			{
				engine.showMessage("Failed to get treatment plan action.");
				return;
			}				
			
			form.PatientCategory().setValue(ptplact.DataCollection.get(0).Txcattypetxt);
			form.PatientHCP().setValue(ptplact.DataCollection.get(0).Act_consultxt);
			
			form.customControlTreatmentPlan().setUpdateContext(Boolean.FALSE);
			form.customControlTreatmentPlan().displayRecords(ptplact.DataCollection.get(0).Pt_tp_id);

			//13/06/2003 - Do not update the context variable in Session List - which is only a view
			//Context.ActionID = form.MainGrid.SelectedValue.attTreatpl_act_id;				
		}
		else
		{
			form.customControlTreatmentPlan().clear();

			//13/06/2003 - Do not update the context variable in Session List - which is only a view
			//Context.ClearActionID();
			//Context.ClearTreatmentPlanDetails();
			//Context.ClearTreatmentPlanActions();				
		}

		//13/06/2003 - Do not update the context variable in Session List - which is only a view
		//Context.PatientDetails = patient.PatientCollection[0];		
	}

	protected void OnBack() throws PresentationLogicException 
	{
		engine.close(DialogResult.OK);		
	}
	
	private void PopulateActionsCombo()
	{
		form.Action().clear();
		form.Action().newRow("-1", "All Actions");

		if(form.getLocalContext().getActivityActionDTO() == null)
			return;

		Sd_activity_action actions = form.getLocalContext().getActivityActionDTO();
		for(int x=0; x<actions.DataCollection.count(); x++)
		{
			//Ask Kevin about the flag
			//if(actions.Sd_activity_actionCollection[x].attAction_act_ind == "Y")
			form.Action().newRow(actions.DataCollection.get(x).Action_id, actions.DataCollection.get(x).Action_nm);
		}
	}

	private void LoadActions()
	{
		//Load Actions only once
		if(form.getLocalContext().getActivityActionDTO() != null)
			return;

		Sd_session session = (Sd_session)domain.getDTOInstance(Sd_session.class);
		session.Filter.clear();
		session.Filter.Prfile_sess_id = form.getGlobalContext().CcoSched.Booking.getSessionId();

		Result result = session.list();
		if (result != null)
		{
			engine.showMessage(result.getMessage());
			return;
		}
		
		if(session.DataCollection.count() > 0)
		{
			Sd_activity_action actions = (Sd_activity_action)domain.getDTOInstance(Sd_activity_action.class);
			actions.Filter.clear();
			actions.Filter.Grp_id   = session.DataCollection.get(0).Grp_id;
			actions.Filter.Activ_id = session.DataCollection.get(0).Activ_id;

			result = actions.list();
			if (result != null)
			{
				engine.showMessage(result.getMessage());
				return;
			}

			form.getLocalContext().setActivityActionDTO(actions);
		}
	}

	private void Open()
	{
		Sd_appt_dts apptDetails = (Sd_appt_dts)domain.getDTOInstance(Sd_appt_dts.class);
		Result result = null;
		apptDetails.Filter.clear();
		apptDetails.Filter.Prfile_sess_id = form.getGlobalContext().CcoSched.Booking.getSessionId();
		apptDetails.Filter.Prfiled_sess_id = form.getGlobalContext().CcoSched.Booking.getSessionDetailsId();
		if(form.Action().getValue() != null && !form.Action().getValue().equals("-1"))
			apptDetails.Filter.Action_id = form.Action().getValue();
		
		form.MainGrid().getRows().clear();
		result = apptDetails.list();
		if (result==null)
		{
			
			for (int i = 0; i<apptDetails.DataCollection.count(); i++)
			{
				if ((!apptDetails.DataCollection.get(i).Appt_stat.equals("-2190")) &&
					(!apptDetails.DataCollection.get(i).Appt_stat.equals("-2193")) &&
					(!apptDetails.DataCollection.get(i).Appt_stat.equals("-2197")))
				{
					GenForm.MainGridRow row = form.MainGrid().getRows().newRow();
					row.setValue(apptDetails.DataCollection.get(i));
					Time dt = null;
					dt = new Time(apptDetails.DataCollection.get(i).Stm, TimeFormat.FLAT6);
					if (dt == null)
					{
						InternalError("Session start time not returned.");
						return;
					}
					row.setTime(dt.toString(TimeFormat.DEFAULT));
					row.setPatientName(apptDetails.DataCollection.get(i).Titl + " " + apptDetails.DataCollection.get(i).Fnm1 + " " + apptDetails.DataCollection.get(i).Snm);
					row.setCategory(apptDetails.DataCollection.get(i).Txcattypetxt);
					row.setModality(apptDetails.DataCollection.get(i).Modidtxt);
					row.setConsultant(apptDetails.DataCollection.get(i).Act_consulttxt);
					row.setTransport(apptDetails.DataCollection.get(i).Trans_typtxt);
					if (apptDetails.DataCollection.get(i).First_appt_id.equals(apptDetails.DataCollection.get(i).Appt_id))
						row.setBooking(form.getImages().CcoSched.First);
					else if (apptDetails.DataCollection.get(i).Last_appt_id.equals(apptDetails.DataCollection.get(i).Appt_id))
						row.setBooking(form.getImages().CcoSched.Last);
					row.setStatus(apptDetails.DataCollection.get(i).Appt_stattxt);
				}
			}
		}
	}
		
	public void InternalError(String message)
	{
		throw new RuntimeException(message);
	}
}
