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

package ims.core.forms.nextofkingpidentifierscc;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

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
		public boolean getGPPracticeWithCommIsNotNull()
		{
			return !cx_CoreGPPracticeWithComm.getValueIsNull(context);
		}
		public ims.core.vo.OrganisationWithSitesVo getGPPracticeWithComm()
		{
			return (ims.core.vo.OrganisationWithSitesVo)cx_CoreGPPracticeWithComm.getValue(context);
		}
		public void setGPPracticeWithComm(ims.core.vo.OrganisationWithSitesVo value)
		{
			cx_CoreGPPracticeWithComm.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreGPPracticeWithComm = new ims.framework.ContextVariable("Core.GPPracticeWithComm", "_cv_Core.GPPracticeWithComm");
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
		public boolean getCommentDialogStringIsNotNull()
		{
			return !cx_CoreCommentDialogString.getValueIsNull(context);
		}
		public String getCommentDialogString()
		{
			return (String)cx_CoreCommentDialogString.getValue(context);
		}
		public void setCommentDialogString(String value)
		{
			cx_CoreCommentDialogString.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCommentDialogString = new ims.framework.ContextVariable("Core.CommentDialogString", "_cv_Core.CommentDialogString");
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
		public boolean getCommentDialogReadOnlyIsNotNull()
		{
			return !cx_CoreCommentDialogReadOnly.getValueIsNull(context);
		}
		public Boolean getCommentDialogReadOnly()
		{
			return (Boolean)cx_CoreCommentDialogReadOnly.getValue(context);
		}
		public void setCommentDialogReadOnly(Boolean value)
		{
			cx_CoreCommentDialogReadOnly.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCommentDialogReadOnly = new ims.framework.ContextVariable("Core.CommentDialogReadOnly", "_cv_Core.CommentDialogReadOnly");
		public boolean getCommentDialogTitleIsNotNull()
		{
			return !cx_CoreCommentDialogTitle.getValueIsNull(context);
		}
		public String getCommentDialogTitle()
		{
			return (String)cx_CoreCommentDialogTitle.getValue(context);
		}
		public void setCommentDialogTitle(String value)
		{
			cx_CoreCommentDialogTitle.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCommentDialogTitle = new ims.framework.ContextVariable("Core.CommentDialogTitle", "_cv_Core.CommentDialogTitle");

		private ims.framework.Context context;
	}

	public CoreContext Core;
}