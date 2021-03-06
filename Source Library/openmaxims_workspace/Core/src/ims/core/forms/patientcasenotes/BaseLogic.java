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

package ims.core.forms.patientcasenotes;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.PatientCaseNotes.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.core.domain.PatientCaseNotes domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbFolderValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbFolder().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.FolderCaseNote existingInstance = (ims.core.vo.lookups.FolderCaseNote)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbFolderLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.FolderCaseNote)
		{
			ims.core.vo.lookups.FolderCaseNote instance = (ims.core.vo.lookups.FolderCaseNote)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbFolderLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.FolderCaseNote existingInstance = (ims.core.vo.lookups.FolderCaseNote)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbFolder().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbFolderLookup()
	{
		this.form.cmbFolder().clear();
		ims.core.vo.lookups.FolderCaseNoteCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getFolderCaseNote(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbFolder().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbFolderLookupValue(int id)
	{
		ims.core.vo.lookups.FolderCaseNote instance = ims.core.vo.lookups.LookupHelper.getFolderCaseNoteInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbFolder().setValue(instance);
	}
	protected final void defaultcmbFolderLookupValue()
	{
		this.form.cmbFolder().setValue((ims.core.vo.lookups.FolderCaseNote)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.FolderCaseNote.class, engine.getFormName().getID(), ims.core.vo.lookups.FolderCaseNote.TYPE_ID));
	}
	protected final void oncmbTypeReqValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbTypeReq().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.CaseNoteType existingInstance = (ims.core.vo.lookups.CaseNoteType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbTypeReqLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.CaseNoteType)
		{
			ims.core.vo.lookups.CaseNoteType instance = (ims.core.vo.lookups.CaseNoteType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbTypeReqLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.CaseNoteType existingInstance = (ims.core.vo.lookups.CaseNoteType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbTypeReq().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbTypeReqLookup()
	{
		this.form.cmbTypeReq().clear();
		ims.core.vo.lookups.CaseNoteTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getCaseNoteType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbTypeReq().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbTypeReqLookupValue(int id)
	{
		ims.core.vo.lookups.CaseNoteType instance = ims.core.vo.lookups.LookupHelper.getCaseNoteTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbTypeReq().setValue(instance);
	}
	protected final void defaultcmbTypeReqLookupValue()
	{
		this.form.cmbTypeReq().setValue((ims.core.vo.lookups.CaseNoteType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.CaseNoteType.class, engine.getFormName().getID(), ims.core.vo.lookups.CaseNoteType.TYPE_ID));
	}
	protected final void oncmbReasonReqValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReasonReq().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.CaseNoteReasonForRequest existingInstance = (ims.core.vo.lookups.CaseNoteReasonForRequest)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReasonReqLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.CaseNoteReasonForRequest)
		{
			ims.core.vo.lookups.CaseNoteReasonForRequest instance = (ims.core.vo.lookups.CaseNoteReasonForRequest)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReasonReqLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.CaseNoteReasonForRequest existingInstance = (ims.core.vo.lookups.CaseNoteReasonForRequest)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReasonReq().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReasonReqLookup()
	{
		this.form.cmbReasonReq().clear();
		ims.core.vo.lookups.CaseNoteReasonForRequestCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getCaseNoteReasonForRequest(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReasonReq().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReasonReqLookupValue(int id)
	{
		ims.core.vo.lookups.CaseNoteReasonForRequest instance = ims.core.vo.lookups.LookupHelper.getCaseNoteReasonForRequestInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReasonReq().setValue(instance);
	}
	protected final void defaultcmbReasonReqLookupValue()
	{
		this.form.cmbReasonReq().setValue((ims.core.vo.lookups.CaseNoteReasonForRequest)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.CaseNoteReasonForRequest.class, engine.getFormName().getID(), ims.core.vo.lookups.CaseNoteReasonForRequest.TYPE_ID));
	}
	protected final void oncmbVolTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbVolType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.CaseNoteType existingInstance = (ims.core.vo.lookups.CaseNoteType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbVolTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.CaseNoteType)
		{
			ims.core.vo.lookups.CaseNoteType instance = (ims.core.vo.lookups.CaseNoteType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbVolTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.CaseNoteType existingInstance = (ims.core.vo.lookups.CaseNoteType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbVolType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbVolTypeLookup()
	{
		this.form.cmbVolType().clear();
		ims.core.vo.lookups.CaseNoteTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getCaseNoteType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbVolType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbVolTypeLookupValue(int id)
	{
		ims.core.vo.lookups.CaseNoteType instance = ims.core.vo.lookups.LookupHelper.getCaseNoteTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbVolType().setValue(instance);
	}
	protected final void defaultcmbVolTypeLookupValue()
	{
		this.form.cmbVolType().setValue((ims.core.vo.lookups.CaseNoteType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.CaseNoteType.class, engine.getFormName().getID(), ims.core.vo.lookups.CaseNoteType.TYPE_ID));
	}
	protected final void oncmbVolStatusValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbVolStatus().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.CaseNoteStatus existingInstance = (ims.core.vo.lookups.CaseNoteStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbVolStatusLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.CaseNoteStatus)
		{
			ims.core.vo.lookups.CaseNoteStatus instance = (ims.core.vo.lookups.CaseNoteStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbVolStatusLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.CaseNoteStatus existingInstance = (ims.core.vo.lookups.CaseNoteStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbVolStatus().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbVolStatusLookup()
	{
		this.form.cmbVolStatus().clear();
		ims.core.vo.lookups.CaseNoteStatusCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getCaseNoteStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbVolStatus().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbVolStatusLookupValue(int id)
	{
		ims.core.vo.lookups.CaseNoteStatus instance = ims.core.vo.lookups.LookupHelper.getCaseNoteStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbVolStatus().setValue(instance);
	}
	protected final void defaultcmbVolStatusLookupValue()
	{
		this.form.cmbVolStatus().setValue((ims.core.vo.lookups.CaseNoteStatus)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.CaseNoteStatus.class, engine.getFormName().getID(), ims.core.vo.lookups.CaseNoteStatus.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.PatientCaseNotes domain;
}
