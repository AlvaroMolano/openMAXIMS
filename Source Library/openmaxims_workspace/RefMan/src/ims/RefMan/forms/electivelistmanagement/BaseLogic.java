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

package ims.RefMan.forms.electivelistmanagement;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.ElectiveListManagement.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.RefMan.domain.ElectiveListManagement domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbPlannedDatePeriodValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrMain().tabPageSearchCriteria().cmbPlannedDatePeriod().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.TimeUnitsSecondsToMonths existingInstance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPlannedDatePeriodLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.TimeUnitsSecondsToMonths)
		{
			ims.core.vo.lookups.TimeUnitsSecondsToMonths instance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPlannedDatePeriodLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.TimeUnitsSecondsToMonths existingInstance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrMain().tabPageSearchCriteria().cmbPlannedDatePeriod().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPlannedDatePeriodLookup()
	{
		this.form.lyrMain().tabPageSearchCriteria().cmbPlannedDatePeriod().clear();
		ims.core.vo.lookups.TimeUnitsSecondsToMonthsCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonths(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrMain().tabPageSearchCriteria().cmbPlannedDatePeriod().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPlannedDatePeriodLookupValue(int id)
	{
		ims.core.vo.lookups.TimeUnitsSecondsToMonths instance = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonthsInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrMain().tabPageSearchCriteria().cmbPlannedDatePeriod().setValue(instance);
	}
	protected final void defaultcmbPlannedDatePeriodLookupValue()
	{
		this.form.lyrMain().tabPageSearchCriteria().cmbPlannedDatePeriod().setValue((ims.core.vo.lookups.TimeUnitsSecondsToMonths)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.TimeUnitsSecondsToMonths.class, engine.getFormName().getID(), ims.core.vo.lookups.TimeUnitsSecondsToMonths.TYPE_ID));
	}
	protected final void oncmbRTTBreachPeriodValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrMain().tabPageSearchCriteria().cmbRTTBreachPeriod().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.TimeUnitsSecondsToMonths existingInstance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbRTTBreachPeriodLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.TimeUnitsSecondsToMonths)
		{
			ims.core.vo.lookups.TimeUnitsSecondsToMonths instance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbRTTBreachPeriodLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.TimeUnitsSecondsToMonths existingInstance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrMain().tabPageSearchCriteria().cmbRTTBreachPeriod().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbRTTBreachPeriodLookup()
	{
		this.form.lyrMain().tabPageSearchCriteria().cmbRTTBreachPeriod().clear();
		ims.core.vo.lookups.TimeUnitsSecondsToMonthsCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonths(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrMain().tabPageSearchCriteria().cmbRTTBreachPeriod().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbRTTBreachPeriodLookupValue(int id)
	{
		ims.core.vo.lookups.TimeUnitsSecondsToMonths instance = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonthsInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrMain().tabPageSearchCriteria().cmbRTTBreachPeriod().setValue(instance);
	}
	protected final void defaultcmbRTTBreachPeriodLookupValue()
	{
		this.form.lyrMain().tabPageSearchCriteria().cmbRTTBreachPeriod().setValue((ims.core.vo.lookups.TimeUnitsSecondsToMonths)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.TimeUnitsSecondsToMonths.class, engine.getFormName().getID(), ims.core.vo.lookups.TimeUnitsSecondsToMonths.TYPE_ID));
	}
	protected final void oncmbAnaestheticTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrMain().tabPageSearchCriteria().cmbAnaestheticType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.AnaestheticType existingInstance = (ims.clinical.vo.lookups.AnaestheticType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbAnaestheticTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.AnaestheticType)
		{
			ims.clinical.vo.lookups.AnaestheticType instance = (ims.clinical.vo.lookups.AnaestheticType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbAnaestheticTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.AnaestheticType existingInstance = (ims.clinical.vo.lookups.AnaestheticType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrMain().tabPageSearchCriteria().cmbAnaestheticType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbAnaestheticTypeLookup()
	{
		this.form.lyrMain().tabPageSearchCriteria().cmbAnaestheticType().clear();
		ims.clinical.vo.lookups.AnaestheticTypeCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getAnaestheticType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrMain().tabPageSearchCriteria().cmbAnaestheticType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbAnaestheticTypeLookupValue(int id)
	{
		ims.clinical.vo.lookups.AnaestheticType instance = ims.clinical.vo.lookups.LookupHelper.getAnaestheticTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrMain().tabPageSearchCriteria().cmbAnaestheticType().setValue(instance);
	}
	protected final void defaultcmbAnaestheticTypeLookupValue()
	{
		this.form.lyrMain().tabPageSearchCriteria().cmbAnaestheticType().setValue((ims.clinical.vo.lookups.AnaestheticType)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.AnaestheticType.class, engine.getFormName().getID(), ims.clinical.vo.lookups.AnaestheticType.TYPE_ID));
	}
	protected final void oncmbUrgencyValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrMain().tabPageSearchCriteria().cmbUrgency().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReferralUrgency existingInstance = (ims.RefMan.vo.lookups.ReferralUrgency)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbUrgencyLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ReferralUrgency)
		{
			ims.RefMan.vo.lookups.ReferralUrgency instance = (ims.RefMan.vo.lookups.ReferralUrgency)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbUrgencyLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReferralUrgency existingInstance = (ims.RefMan.vo.lookups.ReferralUrgency)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrMain().tabPageSearchCriteria().cmbUrgency().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbUrgencyLookup()
	{
		this.form.lyrMain().tabPageSearchCriteria().cmbUrgency().clear();
		ims.RefMan.vo.lookups.ReferralUrgencyCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReferralUrgency(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrMain().tabPageSearchCriteria().cmbUrgency().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbUrgencyLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ReferralUrgency instance = ims.RefMan.vo.lookups.LookupHelper.getReferralUrgencyInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrMain().tabPageSearchCriteria().cmbUrgency().setValue(instance);
	}
	protected final void defaultcmbUrgencyLookupValue()
	{
		this.form.lyrMain().tabPageSearchCriteria().cmbUrgency().setValue((ims.RefMan.vo.lookups.ReferralUrgency)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ReferralUrgency.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ReferralUrgency.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.ElectiveListManagement domain;
}
