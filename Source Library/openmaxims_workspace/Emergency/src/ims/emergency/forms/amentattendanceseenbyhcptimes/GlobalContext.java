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

package ims.emergency.forms.amentattendanceseenbyhcptimes;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Emergency = new EmergencyContext(context);
	}
	public final class EmergencyContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private EmergencyContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getEmergencyAttendanceForTimeAmendmentsIsNotNull()
		{
			return !cx_EmergencyEmergencyAttendanceForTimeAmendments.getValueIsNull(context);
		}
		public ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsLiteVo getEmergencyAttendanceForTimeAmendments()
		{
			return (ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsLiteVo)cx_EmergencyEmergencyAttendanceForTimeAmendments.getValue(context);
		}
		public void setEmergencyAttendanceForTimeAmendments(ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsLiteVo value)
		{
			cx_EmergencyEmergencyAttendanceForTimeAmendments.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyEmergencyAttendanceForTimeAmendments = new ims.framework.ContextVariable("Emergency.EmergencyAttendanceForTimeAmendments", "_cv_Emergency.EmergencyAttendanceForTimeAmendments");
		public boolean getAmendAttendanceReferralToSpecialtyTimesIsNotNull()
		{
			return !cx_EmergencyAmendAttendanceReferralToSpecialtyTimes.getValueIsNull(context);
		}
		public ims.emergency.vo.ReferralToSpecTeamRefVo getAmendAttendanceReferralToSpecialtyTimes()
		{
			return (ims.emergency.vo.ReferralToSpecTeamRefVo)cx_EmergencyAmendAttendanceReferralToSpecialtyTimes.getValue(context);
		}
		public void setAmendAttendanceReferralToSpecialtyTimes(ims.emergency.vo.ReferralToSpecTeamRefVo value)
		{
			cx_EmergencyAmendAttendanceReferralToSpecialtyTimes.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyAmendAttendanceReferralToSpecialtyTimes = new ims.framework.ContextVariable("Emergency.AmendAttendanceReferralToSpecialtyTimes", "_cv_Emergency.AmendAttendanceReferralToSpecialtyTimes");
		public boolean getAmendAttendanceSeenByTimesIsNotNull()
		{
			return !cx_EmergencyAmendAttendanceSeenByTimes.getValueIsNull(context);
		}
		public ims.emergency.vo.SeenByHCPRefVo getAmendAttendanceSeenByTimes()
		{
			return (ims.emergency.vo.SeenByHCPRefVo)cx_EmergencyAmendAttendanceSeenByTimes.getValue(context);
		}
		public void setAmendAttendanceSeenByTimes(ims.emergency.vo.SeenByHCPRefVo value)
		{
			cx_EmergencyAmendAttendanceSeenByTimes.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyAmendAttendanceSeenByTimes = new ims.framework.ContextVariable("Emergency.AmendAttendanceSeenByTimes", "_cv_Emergency.AmendAttendanceSeenByTimes");

		private ims.framework.Context context;
	}

	public EmergencyContext Emergency;
}
