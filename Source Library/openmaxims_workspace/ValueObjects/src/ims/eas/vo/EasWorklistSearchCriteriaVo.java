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

package ims.eas.vo;


public class EasWorklistSearchCriteriaVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public EasWorklistSearchCriteriaVo()
	{
	}
	public EasWorklistSearchCriteriaVo(ims.eas.vo.beans.EasWorklistSearchCriteriaVoBean bean)
	{
		this.dateseenfrom = bean.getDateSeenFrom() == null ? null : bean.getDateSeenFrom().buildDate();
		this.dateseento = bean.getDateSeenTo() == null ? null : bean.getDateSeenTo().buildDate();
		this.decisiontotreatfrom = bean.getDecisionToTreatFrom() == null ? null : bean.getDecisionToTreatFrom().buildDate();
		this.decisiontotreatto = bean.getDecisionToTreatTo() == null ? null : bean.getDecisionToTreatTo().buildDate();
		// Interface field type not supported.
		// Interface field type not supported.
		this.priority = bean.getPriority() == null ? null : ims.ccosched.vo.lookups.Priority.buildLookup(bean.getPriority());
		this.treatmentintent = bean.getTreatmentIntent() == null ? null : ims.ccosched.vo.lookups.TreatmentIntent.buildLookup(bean.getTreatmentIntent());
		this.patientstatus = bean.getPatientStatus() == null ? null : ims.ccosched.vo.lookups.Status.buildLookup(bean.getPatientStatus());
		this.easstatuses = ims.eas.vo.lookups.EASStatusCollection.buildFromBeanCollection(bean.getEasStatuses());
		this.actionrequired = bean.getActionRequired();
		this.tpcreated = bean.getTpCreated();
		this.easremoved = bean.getEasRemoved();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.eas.vo.beans.EasWorklistSearchCriteriaVoBean bean)
	{
		this.dateseenfrom = bean.getDateSeenFrom() == null ? null : bean.getDateSeenFrom().buildDate();
		this.dateseento = bean.getDateSeenTo() == null ? null : bean.getDateSeenTo().buildDate();
		this.decisiontotreatfrom = bean.getDecisionToTreatFrom() == null ? null : bean.getDecisionToTreatFrom().buildDate();
		this.decisiontotreatto = bean.getDecisionToTreatTo() == null ? null : bean.getDecisionToTreatTo().buildDate();
		// Interface field type not supported.
		// Interface field type not supported.
		this.priority = bean.getPriority() == null ? null : ims.ccosched.vo.lookups.Priority.buildLookup(bean.getPriority());
		this.treatmentintent = bean.getTreatmentIntent() == null ? null : ims.ccosched.vo.lookups.TreatmentIntent.buildLookup(bean.getTreatmentIntent());
		this.patientstatus = bean.getPatientStatus() == null ? null : ims.ccosched.vo.lookups.Status.buildLookup(bean.getPatientStatus());
		this.easstatuses = ims.eas.vo.lookups.EASStatusCollection.buildFromBeanCollection(bean.getEasStatuses());
		this.actionrequired = bean.getActionRequired();
		this.tpcreated = bean.getTpCreated();
		this.easremoved = bean.getEasRemoved();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.eas.vo.beans.EasWorklistSearchCriteriaVoBean bean = null;
		if(map != null)
			bean = (ims.eas.vo.beans.EasWorklistSearchCriteriaVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.eas.vo.beans.EasWorklistSearchCriteriaVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getDateSeenFromIsNotNull()
	{
		return this.dateseenfrom != null;
	}
	public ims.framework.utils.Date getDateSeenFrom()
	{
		return this.dateseenfrom;
	}
	public void setDateSeenFrom(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dateseenfrom = value;
	}
	public boolean getDateSeenToIsNotNull()
	{
		return this.dateseento != null;
	}
	public ims.framework.utils.Date getDateSeenTo()
	{
		return this.dateseento;
	}
	public void setDateSeenTo(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dateseento = value;
	}
	public boolean getDecisionToTreatFromIsNotNull()
	{
		return this.decisiontotreatfrom != null;
	}
	public ims.framework.utils.Date getDecisionToTreatFrom()
	{
		return this.decisiontotreatfrom;
	}
	public void setDecisionToTreatFrom(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.decisiontotreatfrom = value;
	}
	public boolean getDecisionToTreatToIsNotNull()
	{
		return this.decisiontotreatto != null;
	}
	public ims.framework.utils.Date getDecisionToTreatTo()
	{
		return this.decisiontotreatto;
	}
	public void setDecisionToTreatTo(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.decisiontotreatto = value;
	}
	public boolean getResponsibleHcpIsNotNull()
	{
		return this.responsiblehcp != null;
	}
	public ims.vo.interfaces.IMos getResponsibleHcp()
	{
		return this.responsiblehcp;
	}
	public void setResponsibleHcp(ims.vo.interfaces.IMos value)
	{
		this.isValidated = false;
		this.responsiblehcp = value;
	}
	public boolean getSeenByIsNotNull()
	{
		return this.seenby != null;
	}
	public ims.vo.interfaces.IMos getSeenBy()
	{
		return this.seenby;
	}
	public void setSeenBy(ims.vo.interfaces.IMos value)
	{
		this.isValidated = false;
		this.seenby = value;
	}
	public boolean getPriorityIsNotNull()
	{
		return this.priority != null;
	}
	public ims.ccosched.vo.lookups.Priority getPriority()
	{
		return this.priority;
	}
	public void setPriority(ims.ccosched.vo.lookups.Priority value)
	{
		this.isValidated = false;
		this.priority = value;
	}
	public boolean getTreatmentIntentIsNotNull()
	{
		return this.treatmentintent != null;
	}
	public ims.ccosched.vo.lookups.TreatmentIntent getTreatmentIntent()
	{
		return this.treatmentintent;
	}
	public void setTreatmentIntent(ims.ccosched.vo.lookups.TreatmentIntent value)
	{
		this.isValidated = false;
		this.treatmentintent = value;
	}
	public boolean getPatientStatusIsNotNull()
	{
		return this.patientstatus != null;
	}
	public ims.ccosched.vo.lookups.Status getPatientStatus()
	{
		return this.patientstatus;
	}
	public void setPatientStatus(ims.ccosched.vo.lookups.Status value)
	{
		this.isValidated = false;
		this.patientstatus = value;
	}
	public boolean getEasStatusesIsNotNull()
	{
		return this.easstatuses != null;
	}
	public ims.eas.vo.lookups.EASStatusCollection getEasStatuses()
	{
		return this.easstatuses;
	}
	public void setEasStatuses(ims.eas.vo.lookups.EASStatusCollection value)
	{
		this.isValidated = false;
		this.easstatuses = value;
	}
	public boolean getActionRequiredIsNotNull()
	{
		return this.actionrequired != null;
	}
	public Boolean getActionRequired()
	{
		return this.actionrequired;
	}
	public void setActionRequired(Boolean value)
	{
		this.isValidated = false;
		this.actionrequired = value;
	}
	public boolean getTpCreatedIsNotNull()
	{
		return this.tpcreated != null;
	}
	public Boolean getTpCreated()
	{
		return this.tpcreated;
	}
	public void setTpCreated(Boolean value)
	{
		this.isValidated = false;
		this.tpcreated = value;
	}
	public boolean getEasRemovedIsNotNull()
	{
		return this.easremoved != null;
	}
	public Boolean getEasRemoved()
	{
		return this.easremoved;
	}
	public void setEasRemoved(Boolean value)
	{
		this.isValidated = false;
		this.easremoved = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof EasWorklistSearchCriteriaVo))
			return false;
		EasWorklistSearchCriteriaVo compareObj = (EasWorklistSearchCriteriaVo)obj;
		if(this.getDateSeenFrom() == null && compareObj.getDateSeenFrom() != null)
			return false;
		if(this.getDateSeenFrom() != null && compareObj.getDateSeenFrom() == null)
			return false;
		if(this.getDateSeenFrom() != null && compareObj.getDateSeenFrom() != null)
			if(!this.getDateSeenFrom().equals(compareObj.getDateSeenFrom()))
				return false;
		if(this.getDateSeenTo() == null && compareObj.getDateSeenTo() != null)
			return false;
		if(this.getDateSeenTo() != null && compareObj.getDateSeenTo() == null)
			return false;
		if(this.getDateSeenTo() != null && compareObj.getDateSeenTo() != null)
			if(!this.getDateSeenTo().equals(compareObj.getDateSeenTo()))
				return false;
		if(this.getDecisionToTreatFrom() == null && compareObj.getDecisionToTreatFrom() != null)
			return false;
		if(this.getDecisionToTreatFrom() != null && compareObj.getDecisionToTreatFrom() == null)
			return false;
		if(this.getDecisionToTreatFrom() != null && compareObj.getDecisionToTreatFrom() != null)
			if(!this.getDecisionToTreatFrom().equals(compareObj.getDecisionToTreatFrom()))
				return false;
		if(this.getDecisionToTreatTo() == null && compareObj.getDecisionToTreatTo() != null)
			return false;
		if(this.getDecisionToTreatTo() != null && compareObj.getDecisionToTreatTo() == null)
			return false;
		if(this.getDecisionToTreatTo() != null && compareObj.getDecisionToTreatTo() != null)
			if(!this.getDecisionToTreatTo().equals(compareObj.getDecisionToTreatTo()))
				return false;
		if(this.getResponsibleHcp() == null && compareObj.getResponsibleHcp() != null)
			return false;
		if(this.getResponsibleHcp() != null && compareObj.getResponsibleHcp() == null)
			return false;
		if(this.getResponsibleHcp() != null && compareObj.getResponsibleHcp() != null)
			if(!this.getResponsibleHcp().equals(compareObj.getResponsibleHcp()))
				return false;
		if(this.getSeenBy() == null && compareObj.getSeenBy() != null)
			return false;
		if(this.getSeenBy() != null && compareObj.getSeenBy() == null)
			return false;
		if(this.getSeenBy() != null && compareObj.getSeenBy() != null)
			if(!this.getSeenBy().equals(compareObj.getSeenBy()))
				return false;
		if(this.getPriority() == null && compareObj.getPriority() != null)
			return false;
		if(this.getPriority() != null && compareObj.getPriority() == null)
			return false;
		if(this.getPriority() != null && compareObj.getPriority() != null)
			if(!this.getPriority().equals(compareObj.getPriority()))
				return false;
		if(this.getTreatmentIntent() == null && compareObj.getTreatmentIntent() != null)
			return false;
		if(this.getTreatmentIntent() != null && compareObj.getTreatmentIntent() == null)
			return false;
		if(this.getTreatmentIntent() != null && compareObj.getTreatmentIntent() != null)
			if(!this.getTreatmentIntent().equals(compareObj.getTreatmentIntent()))
				return false;
		if(this.getPatientStatus() == null && compareObj.getPatientStatus() != null)
			return false;
		if(this.getPatientStatus() != null && compareObj.getPatientStatus() == null)
			return false;
		if(this.getPatientStatus() != null && compareObj.getPatientStatus() != null)
			if(!this.getPatientStatus().equals(compareObj.getPatientStatus()))
				return false;
		if(this.getActionRequired() == null && compareObj.getActionRequired() != null)
			return false;
		if(this.getActionRequired() != null && compareObj.getActionRequired() == null)
			return false;
		if(this.getActionRequired() != null && compareObj.getActionRequired() != null)
			if(!this.getActionRequired().equals(compareObj.getActionRequired()))
				return false;
		if(this.getTpCreated() == null && compareObj.getTpCreated() != null)
			return false;
		if(this.getTpCreated() != null && compareObj.getTpCreated() == null)
			return false;
		if(this.getTpCreated() != null && compareObj.getTpCreated() != null)
			if(!this.getTpCreated().equals(compareObj.getTpCreated()))
				return false;
		if(this.getEasRemoved() == null && compareObj.getEasRemoved() != null)
			return false;
		if(this.getEasRemoved() != null && compareObj.getEasRemoved() == null)
			return false;
		if(this.getEasRemoved() != null && compareObj.getEasRemoved() != null)
			return this.getEasRemoved().equals(compareObj.getEasRemoved());
		return super.equals(obj);
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		EasWorklistSearchCriteriaVo clone = new EasWorklistSearchCriteriaVo();
		
		if(this.dateseenfrom == null)
			clone.dateseenfrom = null;
		else
			clone.dateseenfrom = (ims.framework.utils.Date)this.dateseenfrom.clone();
		if(this.dateseento == null)
			clone.dateseento = null;
		else
			clone.dateseento = (ims.framework.utils.Date)this.dateseento.clone();
		if(this.decisiontotreatfrom == null)
			clone.decisiontotreatfrom = null;
		else
			clone.decisiontotreatfrom = (ims.framework.utils.Date)this.decisiontotreatfrom.clone();
		if(this.decisiontotreatto == null)
			clone.decisiontotreatto = null;
		else
			clone.decisiontotreatto = (ims.framework.utils.Date)this.decisiontotreatto.clone();
		clone.responsiblehcp = this.responsiblehcp;
		clone.seenby = this.seenby;
		if(this.priority == null)
			clone.priority = null;
		else
			clone.priority = (ims.ccosched.vo.lookups.Priority)this.priority.clone();
		if(this.treatmentintent == null)
			clone.treatmentintent = null;
		else
			clone.treatmentintent = (ims.ccosched.vo.lookups.TreatmentIntent)this.treatmentintent.clone();
		if(this.patientstatus == null)
			clone.patientstatus = null;
		else
			clone.patientstatus = (ims.ccosched.vo.lookups.Status)this.patientstatus.clone();
		if(this.easstatuses == null)
			clone.easstatuses = null;
		else
			clone.easstatuses = (ims.eas.vo.lookups.EASStatusCollection)this.easstatuses.clone();
		clone.actionrequired = this.actionrequired;
		clone.tpcreated = this.tpcreated;
		clone.easremoved = this.easremoved;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(EasWorklistSearchCriteriaVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EasWorklistSearchCriteriaVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		EasWorklistSearchCriteriaVo compareObj = (EasWorklistSearchCriteriaVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getDateSeenFrom() == null && compareObj.getDateSeenFrom() != null)
				return -1;
			if(this.getDateSeenFrom() != null && compareObj.getDateSeenFrom() == null)
				return 1;
			if(this.getDateSeenFrom() != null && compareObj.getDateSeenFrom() != null)
				retVal = this.getDateSeenFrom().compareTo(compareObj.getDateSeenFrom());
		}
		if (retVal == 0)
		{
			if(this.getDateSeenTo() == null && compareObj.getDateSeenTo() != null)
				return -1;
			if(this.getDateSeenTo() != null && compareObj.getDateSeenTo() == null)
				return 1;
			if(this.getDateSeenTo() != null && compareObj.getDateSeenTo() != null)
				retVal = this.getDateSeenTo().compareTo(compareObj.getDateSeenTo());
		}
		if (retVal == 0)
		{
			if(this.getDecisionToTreatFrom() == null && compareObj.getDecisionToTreatFrom() != null)
				return -1;
			if(this.getDecisionToTreatFrom() != null && compareObj.getDecisionToTreatFrom() == null)
				return 1;
			if(this.getDecisionToTreatFrom() != null && compareObj.getDecisionToTreatFrom() != null)
				retVal = this.getDecisionToTreatFrom().compareTo(compareObj.getDecisionToTreatFrom());
		}
		if (retVal == 0)
		{
			if(this.getDecisionToTreatTo() == null && compareObj.getDecisionToTreatTo() != null)
				return -1;
			if(this.getDecisionToTreatTo() != null && compareObj.getDecisionToTreatTo() == null)
				return 1;
			if(this.getDecisionToTreatTo() != null && compareObj.getDecisionToTreatTo() != null)
				retVal = this.getDecisionToTreatTo().compareTo(compareObj.getDecisionToTreatTo());
		}
		if (retVal == 0)
		{
			if(this.getResponsibleHcp() == null && compareObj.getResponsibleHcp() != null)
				return -1;
			if(this.getResponsibleHcp() != null && compareObj.getResponsibleHcp() == null)
				return 1;
			if(this.getResponsibleHcp() != null && compareObj.getResponsibleHcp() != null)
				retVal = this.getResponsibleHcp().compareTo(compareObj.getResponsibleHcp());
		}
		if (retVal == 0)
		{
			if(this.getSeenBy() == null && compareObj.getSeenBy() != null)
				return -1;
			if(this.getSeenBy() != null && compareObj.getSeenBy() == null)
				return 1;
			if(this.getSeenBy() != null && compareObj.getSeenBy() != null)
				retVal = this.getSeenBy().compareTo(compareObj.getSeenBy());
		}
		if (retVal == 0)
		{
			if(this.getPriority() == null && compareObj.getPriority() != null)
				return -1;
			if(this.getPriority() != null && compareObj.getPriority() == null)
				return 1;
			if(this.getPriority() != null && compareObj.getPriority() != null)
				retVal = this.getPriority().compareTo(compareObj.getPriority());
		}
		if (retVal == 0)
		{
			if(this.getTreatmentIntent() == null && compareObj.getTreatmentIntent() != null)
				return -1;
			if(this.getTreatmentIntent() != null && compareObj.getTreatmentIntent() == null)
				return 1;
			if(this.getTreatmentIntent() != null && compareObj.getTreatmentIntent() != null)
				retVal = this.getTreatmentIntent().compareTo(compareObj.getTreatmentIntent());
		}
		if (retVal == 0)
		{
			if(this.getPatientStatus() == null && compareObj.getPatientStatus() != null)
				return -1;
			if(this.getPatientStatus() != null && compareObj.getPatientStatus() == null)
				return 1;
			if(this.getPatientStatus() != null && compareObj.getPatientStatus() != null)
				retVal = this.getPatientStatus().compareTo(compareObj.getPatientStatus());
		}
		if (retVal == 0)
		{
			if(this.getActionRequired() == null && compareObj.getActionRequired() != null)
				return -1;
			if(this.getActionRequired() != null && compareObj.getActionRequired() == null)
				return 1;
			if(this.getActionRequired() != null && compareObj.getActionRequired() != null)
				retVal = this.getActionRequired().compareTo(compareObj.getActionRequired());
		}
		if (retVal == 0)
		{
			if(this.getTpCreated() == null && compareObj.getTpCreated() != null)
				return -1;
			if(this.getTpCreated() != null && compareObj.getTpCreated() == null)
				return 1;
			if(this.getTpCreated() != null && compareObj.getTpCreated() != null)
				retVal = this.getTpCreated().compareTo(compareObj.getTpCreated());
		}
		if (retVal == 0)
		{
			if(this.getEasRemoved() == null && compareObj.getEasRemoved() != null)
				return -1;
			if(this.getEasRemoved() != null && compareObj.getEasRemoved() == null)
				return 1;
			if(this.getEasRemoved() != null && compareObj.getEasRemoved() != null)
				retVal = this.getEasRemoved().compareTo(compareObj.getEasRemoved());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.dateseenfrom != null)
			count++;
		if(this.dateseento != null)
			count++;
		if(this.decisiontotreatfrom != null)
			count++;
		if(this.decisiontotreatto != null)
			count++;
		if(this.responsiblehcp != null)
			count++;
		if(this.seenby != null)
			count++;
		if(this.priority != null)
			count++;
		if(this.treatmentintent != null)
			count++;
		if(this.patientstatus != null)
			count++;
		if(this.easstatuses != null)
			count++;
		if(this.actionrequired != null)
			count++;
		if(this.tpcreated != null)
			count++;
		if(this.easremoved != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 13;
	}
	protected ims.framework.utils.Date dateseenfrom;
	protected ims.framework.utils.Date dateseento;
	protected ims.framework.utils.Date decisiontotreatfrom;
	protected ims.framework.utils.Date decisiontotreatto;
	protected ims.vo.interfaces.IMos responsiblehcp;
	protected ims.vo.interfaces.IMos seenby;
	protected ims.ccosched.vo.lookups.Priority priority;
	protected ims.ccosched.vo.lookups.TreatmentIntent treatmentintent;
	protected ims.ccosched.vo.lookups.Status patientstatus;
	protected ims.eas.vo.lookups.EASStatusCollection easstatuses;
	protected Boolean actionrequired;
	protected Boolean tpcreated;
	protected Boolean easremoved;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
