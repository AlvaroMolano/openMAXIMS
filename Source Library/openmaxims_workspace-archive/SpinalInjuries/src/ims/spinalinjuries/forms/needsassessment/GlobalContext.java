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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.spinalinjuries.forms.needsassessment;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		SpinalInjuries = new SpinalInjuriesContext(context);
		Core = new CoreContext(context);
	}
	public final class SpinalInjuriesContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private SpinalInjuriesContext(ims.framework.Context context)
		{
			this.context = context;

			NeedsAssessment = new NeedsAssessmentContext(context);
		}
		public final class NeedsAssessmentContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private NeedsAssessmentContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getSelectedAssessmentIsNotNull()
			{
				return !cx_SpinalInjuriesNeedsAssessmentSelectedAssessment.getValueIsNull(context);
			}
			public ims.core.vo.NeedsAssessmentListVo getSelectedAssessment()
			{
				return (ims.core.vo.NeedsAssessmentListVo)cx_SpinalInjuriesNeedsAssessmentSelectedAssessment.getValue(context);
			}
		public void setSelectedAssessment(ims.core.vo.NeedsAssessmentListVo value)
		{
				cx_SpinalInjuriesNeedsAssessmentSelectedAssessment.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_SpinalInjuriesNeedsAssessmentSelectedAssessment = new ims.framework.ContextVariable("SpinalInjuries.NeedsAssessment.SelectedAssessment", "_cv_SpinalInjuries.NeedsAssessment.SelectedAssessment");
			public boolean getEditComponentIsNotNull()
			{
				return !cx_SpinalInjuriesNeedsAssessmentEditComponent.getValueIsNull(context);
			}
			public Boolean getEditComponent()
			{
				return (Boolean)cx_SpinalInjuriesNeedsAssessmentEditComponent.getValue(context);
			}
		public void setEditComponent(Boolean value)
		{
				cx_SpinalInjuriesNeedsAssessmentEditComponent.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_SpinalInjuriesNeedsAssessmentEditComponent = new ims.framework.ContextVariable("SpinalInjuries.NeedsAssessment.EditComponent", "_cv_SpinalInjuries.NeedsAssessment.EditComponent");
			public boolean getAssessmentWasEditedIsNotNull()
			{
				return !cx_SpinalInjuriesNeedsAssessmentAssessmentWasEdited.getValueIsNull(context);
			}
			public Boolean getAssessmentWasEdited()
			{
				return (Boolean)cx_SpinalInjuriesNeedsAssessmentAssessmentWasEdited.getValue(context);
			}
		public void setAssessmentWasEdited(Boolean value)
		{
				cx_SpinalInjuriesNeedsAssessmentAssessmentWasEdited.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_SpinalInjuriesNeedsAssessmentAssessmentWasEdited = new ims.framework.ContextVariable("SpinalInjuries.NeedsAssessment.AssessmentWasEdited", "_cv_SpinalInjuries.NeedsAssessment.AssessmentWasEdited");
			public boolean getEditedComponentIsNewIsNotNull()
			{
				return !cx_SpinalInjuriesNeedsAssessmentEditedComponentIsNew.getValueIsNull(context);
			}
			public Boolean getEditedComponentIsNew()
			{
				return (Boolean)cx_SpinalInjuriesNeedsAssessmentEditedComponentIsNew.getValue(context);
			}
		public void setEditedComponentIsNew(Boolean value)
		{
				cx_SpinalInjuriesNeedsAssessmentEditedComponentIsNew.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_SpinalInjuriesNeedsAssessmentEditedComponentIsNew = new ims.framework.ContextVariable("SpinalInjuries.NeedsAssessment.EditedComponentIsNew", "_cv_SpinalInjuries.NeedsAssessment.EditedComponentIsNew");
			public boolean getEditedAssessmentIsNotNull()
			{
				return !cx_SpinalInjuriesNeedsAssessmentEditedAssessment.getValueIsNull(context);
			}
			public ims.assessment.instantiation.vo.PatientAssessmentRefVo getEditedAssessment()
			{
				return (ims.assessment.instantiation.vo.PatientAssessmentRefVo)cx_SpinalInjuriesNeedsAssessmentEditedAssessment.getValue(context);
			}
		public void setEditedAssessment(ims.assessment.instantiation.vo.PatientAssessmentRefVo value)
		{
				cx_SpinalInjuriesNeedsAssessmentEditedAssessment.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_SpinalInjuriesNeedsAssessmentEditedAssessment = new ims.framework.ContextVariable("SpinalInjuries.NeedsAssessment.EditedAssessment", "_cv_SpinalInjuries.NeedsAssessment.EditedAssessment");
			private ims.framework.Context context;
		}

		public boolean getNeedsAssessmentComponentScoreCollectionIsNotNull()
		{
			return !cx_SpinalInjuriesNeedsAssessmentComponentScoreCollection.getValueIsNull(context);
		}
		public ims.core.vo.NeedsAssessmentComponentScoreVoCollection getNeedsAssessmentComponentScoreCollection()
		{
			return (ims.core.vo.NeedsAssessmentComponentScoreVoCollection)cx_SpinalInjuriesNeedsAssessmentComponentScoreCollection.getValue(context);
		}
		public void setNeedsAssessmentComponentScoreCollection(ims.core.vo.NeedsAssessmentComponentScoreVoCollection value)
		{
			cx_SpinalInjuriesNeedsAssessmentComponentScoreCollection.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SpinalInjuriesNeedsAssessmentComponentScoreCollection = new ims.framework.ContextVariable("SpinalInjuries.NeedsAssessmentComponentScoreCollection", "_cv_SpinalInjuries.NeedsAssessmentComponentScoreCollection");

		public NeedsAssessmentContext NeedsAssessment;
		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");
		public boolean getCurrentClinicalContactIsNotNull()
		{
			return !cx_CoreCurrentClinicalContact.getValueIsNull(context);
		}
		public ims.core.vo.ClinicalContactShortVo getCurrentClinicalContact()
		{
			return (ims.core.vo.ClinicalContactShortVo)cx_CoreCurrentClinicalContact.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreCurrentClinicalContact = new ims.framework.ContextVariable("Core.CurrentClinicalContact", "_cvp_Core.CurrentClinicalContact");
		public boolean getEpisodeofCareShortIsNotNull()
		{
			return !cx_CoreEpisodeofCareShort.getValueIsNull(context);
		}
		public ims.core.vo.EpisodeofCareShortVo getEpisodeofCareShort()
		{
			return (ims.core.vo.EpisodeofCareShortVo)cx_CoreEpisodeofCareShort.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreEpisodeofCareShort = new ims.framework.ContextVariable("Core.EpisodeofCareShort", "_cvp_Core.EpisodeofCareShort");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");
		public boolean getNeedsAssessmentIdIsNotNull()
		{
			return !cx_CoreNeedsAssessmentId.getValueIsNull(context);
		}
		public Integer getNeedsAssessmentId()
		{
			return (Integer)cx_CoreNeedsAssessmentId.getValue(context);
		}
		public void setNeedsAssessmentId(Integer value)
		{
			cx_CoreNeedsAssessmentId.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreNeedsAssessmentId = new ims.framework.ContextVariable("Core.NeedsAssessmentId", "_cv_Core.NeedsAssessmentId");

		private ims.framework.Context context;
	}

	public SpinalInjuriesContext SpinalInjuries;
	public CoreContext Core;
}
