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

package ims.scheduling.vo;

/**
 * Linked to Scheduling.Sch_Booking business object (ID: 1055100006).
 */
public class Sch_BookingTheatreVo extends ims.scheduling.vo.Sch_BookingRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public Sch_BookingTheatreVo()
	{
	}
	public Sch_BookingTheatreVo(Integer id, int version)
	{
		super(id, version);
	}
	public Sch_BookingTheatreVo(ims.scheduling.vo.beans.Sch_BookingTheatreVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
		this.bookingcomments = bean.getBookingComments();
		this.appointments = ims.scheduling.vo.BookingAppointmentTheatreVoCollection.buildFromBeanCollection(bean.getAppointments());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.Sch_BookingTheatreVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
		this.bookingcomments = bean.getBookingComments();
		this.appointments = ims.scheduling.vo.BookingAppointmentTheatreVoCollection.buildFromBeanCollection(bean.getAppointments());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.Sch_BookingTheatreVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.Sch_BookingTheatreVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.Sch_BookingTheatreVoBean();
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
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("BOOKINGCOMMENTS"))
			return getBookingComments();
		if(fieldName.equals("APPOINTMENTS"))
			return getAppointments();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.vo.PatientShort getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.PatientShort value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getBookingCommentsIsNotNull()
	{
		return this.bookingcomments != null;
	}
	public String getBookingComments()
	{
		return this.bookingcomments;
	}
	public static int getBookingCommentsMaxLength()
	{
		return 255;
	}
	public void setBookingComments(String value)
	{
		this.isValidated = false;
		this.bookingcomments = value;
	}
	public boolean getAppointmentsIsNotNull()
	{
		return this.appointments != null;
	}
	public ims.scheduling.vo.BookingAppointmentTheatreVoCollection getAppointments()
	{
		return this.appointments;
	}
	public void setAppointments(ims.scheduling.vo.BookingAppointmentTheatreVoCollection value)
	{
		this.isValidated = false;
		this.appointments = value;
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
		if(this.appointments != null)
		{
			if(!this.appointments.isValidated())
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.bookingcomments != null)
			if(this.bookingcomments.length() > 255)
				listOfErrors.add("The length of the field [bookingcomments] in the value object [ims.scheduling.vo.Sch_BookingTheatreVo] is too big. It should be less or equal to 255");
		if(this.appointments != null)
		{
			String[] listOfOtherErrors = this.appointments.validate();
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
	
		Sch_BookingTheatreVo clone = new Sch_BookingTheatreVo(this.id, this.version);
		
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.core.vo.PatientShort)this.patient.clone();
		clone.bookingcomments = this.bookingcomments;
		if(this.appointments == null)
			clone.appointments = null;
		else
			clone.appointments = (ims.scheduling.vo.BookingAppointmentTheatreVoCollection)this.appointments.clone();
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
		if (!(Sch_BookingTheatreVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A Sch_BookingTheatreVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((Sch_BookingTheatreVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((Sch_BookingTheatreVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.patient != null)
			count++;
		if(this.bookingcomments != null)
			count++;
		if(this.appointments != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.core.vo.PatientShort patient;
	protected String bookingcomments;
	protected ims.scheduling.vo.BookingAppointmentTheatreVoCollection appointments;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
