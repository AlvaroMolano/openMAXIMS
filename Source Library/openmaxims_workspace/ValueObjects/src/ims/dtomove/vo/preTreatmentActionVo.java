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

package ims.dtomove.vo;

/**
 * Linked to dto_move.PreTreatmentAction business object (ID: 1105100042).
 */
public class preTreatmentActionVo extends ims.dto_move.vo.PreTreatmentActionRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public preTreatmentActionVo()
	{
	}
	public preTreatmentActionVo(Integer id, int version)
	{
		super(id, version);
	}
	public preTreatmentActionVo(ims.dtomove.vo.beans.preTreatmentActionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.actionname = bean.getActionName();
		this.actiondescription = bean.getActionDescription();
		this.isdefault = bean.getIsDefault();
		this.requiresmachine = bean.getRequiresMachine();
		this.activeidentifier = bean.getActiveIdentifier();
		this.requiresconsultant = bean.getRequiresConsultant();
		this.isdosecalcaction = bean.getIsDoseCalcAction();
		this.ismouldroomworklistitem = bean.getIsMouldRoomWorklistItem();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.dtomove.vo.beans.preTreatmentActionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.actionname = bean.getActionName();
		this.actiondescription = bean.getActionDescription();
		this.isdefault = bean.getIsDefault();
		this.requiresmachine = bean.getRequiresMachine();
		this.activeidentifier = bean.getActiveIdentifier();
		this.requiresconsultant = bean.getRequiresConsultant();
		this.isdosecalcaction = bean.getIsDoseCalcAction();
		this.ismouldroomworklistitem = bean.getIsMouldRoomWorklistItem();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.dtomove.vo.beans.preTreatmentActionVoBean bean = null;
		if(map != null)
			bean = (ims.dtomove.vo.beans.preTreatmentActionVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.dtomove.vo.beans.preTreatmentActionVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("ACTIONNAME"))
			return getActionName();
		if(fieldName.equals("ACTIONDESCRIPTION"))
			return getActionDescription();
		if(fieldName.equals("ISDEFAULT"))
			return getIsDefault();
		if(fieldName.equals("REQUIRESMACHINE"))
			return getRequiresMachine();
		if(fieldName.equals("ACTIVEIDENTIFIER"))
			return getActiveIdentifier();
		if(fieldName.equals("REQUIRESCONSULTANT"))
			return getRequiresConsultant();
		if(fieldName.equals("ISDOSECALCACTION"))
			return getIsDoseCalcAction();
		if(fieldName.equals("ISMOULDROOMWORKLISTITEM"))
			return getIsMouldRoomWorklistItem();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getActionNameIsNotNull()
	{
		return this.actionname != null;
	}
	public String getActionName()
	{
		return this.actionname;
	}
	public static int getActionNameMaxLength()
	{
		return 70;
	}
	public void setActionName(String value)
	{
		this.isValidated = false;
		this.actionname = value;
	}
	public boolean getActionDescriptionIsNotNull()
	{
		return this.actiondescription != null;
	}
	public String getActionDescription()
	{
		return this.actiondescription;
	}
	public static int getActionDescriptionMaxLength()
	{
		return 200;
	}
	public void setActionDescription(String value)
	{
		this.isValidated = false;
		this.actiondescription = value;
	}
	public boolean getIsDefaultIsNotNull()
	{
		return this.isdefault != null;
	}
	public Boolean getIsDefault()
	{
		return this.isdefault;
	}
	public void setIsDefault(Boolean value)
	{
		this.isValidated = false;
		this.isdefault = value;
	}
	public boolean getRequiresMachineIsNotNull()
	{
		return this.requiresmachine != null;
	}
	public Boolean getRequiresMachine()
	{
		return this.requiresmachine;
	}
	public void setRequiresMachine(Boolean value)
	{
		this.isValidated = false;
		this.requiresmachine = value;
	}
	public boolean getActiveIdentifierIsNotNull()
	{
		return this.activeidentifier != null;
	}
	public Boolean getActiveIdentifier()
	{
		return this.activeidentifier;
	}
	public void setActiveIdentifier(Boolean value)
	{
		this.isValidated = false;
		this.activeidentifier = value;
	}
	public boolean getRequiresConsultantIsNotNull()
	{
		return this.requiresconsultant != null;
	}
	public Boolean getRequiresConsultant()
	{
		return this.requiresconsultant;
	}
	public void setRequiresConsultant(Boolean value)
	{
		this.isValidated = false;
		this.requiresconsultant = value;
	}
	public boolean getIsDoseCalcActionIsNotNull()
	{
		return this.isdosecalcaction != null;
	}
	public Boolean getIsDoseCalcAction()
	{
		return this.isdosecalcaction;
	}
	public void setIsDoseCalcAction(Boolean value)
	{
		this.isValidated = false;
		this.isdosecalcaction = value;
	}
	public boolean getIsMouldRoomWorklistItemIsNotNull()
	{
		return this.ismouldroomworklistitem != null;
	}
	public Boolean getIsMouldRoomWorklistItem()
	{
		return this.ismouldroomworklistitem;
	}
	public void setIsMouldRoomWorklistItem(Boolean value)
	{
		this.isValidated = false;
		this.ismouldroomworklistitem = value;
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
		if(this.actionname != null)
			if(this.actionname.length() > 70)
				listOfErrors.add("The length of the field [actionname] in the value object [ims.dtomove.vo.preTreatmentActionVo] is too big. It should be less or equal to 70");
		if(this.actiondescription != null)
			if(this.actiondescription.length() > 200)
				listOfErrors.add("The length of the field [actiondescription] in the value object [ims.dtomove.vo.preTreatmentActionVo] is too big. It should be less or equal to 200");
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
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		preTreatmentActionVo clone = new preTreatmentActionVo(this.id, this.version);
		
		clone.actionname = this.actionname;
		clone.actiondescription = this.actiondescription;
		clone.isdefault = this.isdefault;
		clone.requiresmachine = this.requiresmachine;
		clone.activeidentifier = this.activeidentifier;
		clone.requiresconsultant = this.requiresconsultant;
		clone.isdosecalcaction = this.isdosecalcaction;
		clone.ismouldroomworklistitem = this.ismouldroomworklistitem;
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
		if (!(preTreatmentActionVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A preTreatmentActionVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((preTreatmentActionVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((preTreatmentActionVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.actionname != null)
			count++;
		if(this.actiondescription != null)
			count++;
		if(this.isdefault != null)
			count++;
		if(this.requiresmachine != null)
			count++;
		if(this.activeidentifier != null)
			count++;
		if(this.requiresconsultant != null)
			count++;
		if(this.isdosecalcaction != null)
			count++;
		if(this.ismouldroomworklistitem != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected String actionname;
	protected String actiondescription;
	protected Boolean isdefault;
	protected Boolean requiresmachine;
	protected Boolean activeidentifier;
	protected Boolean requiresconsultant;
	protected Boolean isdosecalcaction;
	protected Boolean ismouldroomworklistitem;
	private boolean isValidated = false;
	private boolean isBusy = false;
}