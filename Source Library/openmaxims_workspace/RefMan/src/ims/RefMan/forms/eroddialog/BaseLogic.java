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

package ims.RefMan.forms.eroddialog;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.ERODDialog.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.RefMan.domain.ERODDialog domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbDelayReasonValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbDelayReason().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ERODReason existingInstance = (ims.RefMan.vo.lookups.ERODReason)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDelayReasonLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ERODReason)
		{
			ims.RefMan.vo.lookups.ERODReason instance = (ims.RefMan.vo.lookups.ERODReason)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDelayReasonLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ERODReason existingInstance = (ims.RefMan.vo.lookups.ERODReason)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbDelayReason().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDelayReasonLookup()
	{
		this.form.ctnDetails().cmbDelayReason().clear();
		ims.RefMan.vo.lookups.ERODReasonCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getERODReason(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbDelayReason().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDelayReasonLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ERODReason instance = ims.RefMan.vo.lookups.LookupHelper.getERODReasonInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbDelayReason().setValue(instance);
	}
	protected final void defaultcmbDelayReasonLookupValue()
	{
		this.form.ctnDetails().cmbDelayReason().setValue((ims.RefMan.vo.lookups.ERODReason)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ERODReason.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ERODReason.TYPE_ID));
	}
	protected final void oncmbERODTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbERODType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ERODType existingInstance = (ims.RefMan.vo.lookups.ERODType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbERODTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ERODType)
		{
			ims.RefMan.vo.lookups.ERODType instance = (ims.RefMan.vo.lookups.ERODType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbERODTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ERODType existingInstance = (ims.RefMan.vo.lookups.ERODType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbERODType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbERODTypeLookup()
	{
		this.form.ctnDetails().cmbERODType().clear();
		ims.RefMan.vo.lookups.ERODTypeCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getERODType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbERODType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbERODTypeLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ERODType instance = ims.RefMan.vo.lookups.LookupHelper.getERODTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbERODType().setValue(instance);
	}
	protected final void defaultcmbERODTypeLookupValue()
	{
		this.form.ctnDetails().cmbERODType().setValue((ims.RefMan.vo.lookups.ERODType)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ERODType.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ERODType.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.ERODDialog domain;
}
