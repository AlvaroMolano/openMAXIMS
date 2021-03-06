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

package ims.emergency.vo;

/**
 * Linked to emergency.Tracking business object (ID: 1086100005).
 */
public class TrackingForEDPartialAdmissionVo extends ims.emergency.vo.TrackingRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TrackingForEDPartialAdmissionVo()
	{
	}
	public TrackingForEDPartialAdmissionVo(Integer id, int version)
	{
		super(id, version);
	}
	public TrackingForEDPartialAdmissionVo(ims.emergency.vo.beans.TrackingForEDPartialAdmissionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo();
		this.currentpartialadmission = bean.getCurrentPartialAdmission() == null ? null : bean.getCurrentPartialAdmission().buildVo();
		this.currentarea = bean.getCurrentArea() == null ? null : bean.getCurrentArea().buildVo();
		this.isdischarged = bean.getIsDischarged();
		this.currentreferral = bean.getCurrentReferral() == null ? null : bean.getCurrentReferral().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.TrackingForEDPartialAdmissionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo(map);
		this.currentpartialadmission = bean.getCurrentPartialAdmission() == null ? null : bean.getCurrentPartialAdmission().buildVo(map);
		this.currentarea = bean.getCurrentArea() == null ? null : bean.getCurrentArea().buildVo(map);
		this.isdischarged = bean.getIsDischarged();
		this.currentreferral = bean.getCurrentReferral() == null ? null : bean.getCurrentReferral().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.TrackingForEDPartialAdmissionVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.TrackingForEDPartialAdmissionVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.TrackingForEDPartialAdmissionVoBean();
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
		if(fieldName.equals("CURRENTSTATUS"))
			return getCurrentStatus();
		if(fieldName.equals("CURRENTPARTIALADMISSION"))
			return getCurrentPartialAdmission();
		if(fieldName.equals("CURRENTAREA"))
			return getCurrentArea();
		if(fieldName.equals("ISDISCHARGED"))
			return getIsDischarged();
		if(fieldName.equals("CURRENTREFERRAL"))
			return getCurrentReferral();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCurrentStatusIsNotNull()
	{
		return this.currentstatus != null;
	}
	public ims.emergency.vo.TrackingAttendanceStatusVo getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.emergency.vo.TrackingAttendanceStatusVo value)
	{
		this.isValidated = false;
		this.currentstatus = value;
	}
	public boolean getCurrentPartialAdmissionIsNotNull()
	{
		return this.currentpartialadmission != null;
	}
	public ims.emergency.vo.EDPartialAdmissionVo getCurrentPartialAdmission()
	{
		return this.currentpartialadmission;
	}
	public void setCurrentPartialAdmission(ims.emergency.vo.EDPartialAdmissionVo value)
	{
		this.isValidated = false;
		this.currentpartialadmission = value;
	}
	public boolean getCurrentAreaIsNotNull()
	{
		return this.currentarea != null;
	}
	public ims.emergency.vo.TrackingAreaLiteVo getCurrentArea()
	{
		return this.currentarea;
	}
	public void setCurrentArea(ims.emergency.vo.TrackingAreaLiteVo value)
	{
		this.isValidated = false;
		this.currentarea = value;
	}
	public boolean getIsDischargedIsNotNull()
	{
		return this.isdischarged != null;
	}
	public Boolean getIsDischarged()
	{
		return this.isdischarged;
	}
	public void setIsDischarged(Boolean value)
	{
		this.isValidated = false;
		this.isdischarged = value;
	}
	public boolean getCurrentReferralIsNotNull()
	{
		return this.currentreferral != null;
	}
	public ims.emergency.vo.ReferralToSpecialtyTeamVo getCurrentReferral()
	{
		return this.currentreferral;
	}
	public void setCurrentReferral(ims.emergency.vo.ReferralToSpecialtyTeamVo value)
	{
		this.isValidated = false;
		this.currentreferral = value;
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
		if(this.currentstatus != null)
		{
			if(!this.currentstatus.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.currentpartialadmission != null)
		{
			if(!this.currentpartialadmission.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.currentstatus != null)
		{
			String[] listOfOtherErrors = this.currentstatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.currentpartialadmission != null)
		{
			String[] listOfOtherErrors = this.currentpartialadmission.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
	
		TrackingForEDPartialAdmissionVo clone = new TrackingForEDPartialAdmissionVo(this.id, this.version);
		
		if(this.currentstatus == null)
			clone.currentstatus = null;
		else
			clone.currentstatus = (ims.emergency.vo.TrackingAttendanceStatusVo)this.currentstatus.clone();
		if(this.currentpartialadmission == null)
			clone.currentpartialadmission = null;
		else
			clone.currentpartialadmission = (ims.emergency.vo.EDPartialAdmissionVo)this.currentpartialadmission.clone();
		if(this.currentarea == null)
			clone.currentarea = null;
		else
			clone.currentarea = (ims.emergency.vo.TrackingAreaLiteVo)this.currentarea.clone();
		clone.isdischarged = this.isdischarged;
		if(this.currentreferral == null)
			clone.currentreferral = null;
		else
			clone.currentreferral = (ims.emergency.vo.ReferralToSpecialtyTeamVo)this.currentreferral.clone();
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
		if (!(TrackingForEDPartialAdmissionVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TrackingForEDPartialAdmissionVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TrackingForEDPartialAdmissionVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TrackingForEDPartialAdmissionVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.currentstatus != null)
			count++;
		if(this.currentpartialadmission != null)
			count++;
		if(this.currentarea != null)
			count++;
		if(this.isdischarged != null)
			count++;
		if(this.currentreferral != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.emergency.vo.TrackingAttendanceStatusVo currentstatus;
	protected ims.emergency.vo.EDPartialAdmissionVo currentpartialadmission;
	protected ims.emergency.vo.TrackingAreaLiteVo currentarea;
	protected Boolean isdischarged;
	protected ims.emergency.vo.ReferralToSpecialtyTeamVo currentreferral;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
