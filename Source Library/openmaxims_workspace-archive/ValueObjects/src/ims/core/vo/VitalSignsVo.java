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

package ims.core.vo;

/**
 * Linked to core.vitals.VitalSigns business object (ID: 1022100004).
 */
public class VitalSignsVo extends ims.core.vo.VitalSignsShortVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public VitalSignsVo()
	{
	}
	public VitalSignsVo(Integer id, int version)
	{
		super(id, version);
	}
	public VitalSignsVo(ims.core.vo.beans.VitalSignsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.isventilationchartrecord = bean.getIsVentilationChartRecord();
		this.clinicalcontact = bean.getClinicalContact() == null ? null : bean.getClinicalContact().buildVo();
		this.vitalstakendatetime = bean.getVitalsTakenDateTime() == null ? null : bean.getVitalsTakenDateTime().buildDateTime();
		this.bloodpressure = bean.getBloodPressure() == null ? null : bean.getBloodPressure().buildVo();
		this.pulse = bean.getPulse() == null ? null : bean.getPulse().buildVo();
		this.respiratory = bean.getRespiratory() == null ? null : bean.getRespiratory().buildVo();
		this.temperature = bean.getTemperature() == null ? null : bean.getTemperature().buildVo();
		this.glasgowcomascale = bean.getGlasgowComaScale() == null ? null : bean.getGlasgowComaScale().buildVo();
		this.oxygensaturation = bean.getOxygenSaturation() == null ? null : bean.getOxygenSaturation().buildVo();
		this.bloodsugar = bean.getBloodSugar() == null ? null : bean.getBloodSugar().buildVo();
		this.pupils = bean.getPupils() == null ? null : bean.getPupils().buildVo();
		this.visualacuity = bean.getVisualAcuity() == null ? null : bean.getVisualAcuity().buildVo();
		this.metrics = bean.getMetrics() == null ? null : bean.getMetrics().buildVo();
		this.arterialbloodgas = bean.getArterialBloodGas() == null ? null : bean.getArterialBloodGas().buildVo();
		this.ventilationchart = bean.getVentilationChart() == null ? null : bean.getVentilationChart().buildVo();
		this.recordedsigns = ims.core.vo.lookups.VSTypeCollection.buildFromBeanCollection(bean.getRecordedSigns());
		this.lungfunctiontest = bean.getLungFunctionTest() == null ? null : bean.getLungFunctionTest().buildVo();
		this.pain = bean.getPain() == null ? null : bean.getPain().buildVo();
		this.patientconscious = bean.getPatientConscious() == null ? null : ims.core.vo.lookups.ConsciousLevel.buildLookup(bean.getPatientConscious());
		this.urine2mlkgkhr = bean.getUrine2mlkgkhr() == null ? null : ims.core.vo.lookups.UrineOutput.buildLookup(bean.getUrine2mlkgkhr());
		this.patientcausingconcern = bean.getPatientCausingConcern() == null ? null : ims.core.vo.lookups.PatientCausingConcern.buildLookup(bean.getPatientCausingConcern());
		this.recordinginformation = bean.getRecordingInformation() == null ? null : bean.getRecordingInformation().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.VitalSignsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.isventilationchartrecord = bean.getIsVentilationChartRecord();
		this.clinicalcontact = bean.getClinicalContact() == null ? null : bean.getClinicalContact().buildVo(map);
		this.vitalstakendatetime = bean.getVitalsTakenDateTime() == null ? null : bean.getVitalsTakenDateTime().buildDateTime();
		this.bloodpressure = bean.getBloodPressure() == null ? null : bean.getBloodPressure().buildVo(map);
		this.pulse = bean.getPulse() == null ? null : bean.getPulse().buildVo(map);
		this.respiratory = bean.getRespiratory() == null ? null : bean.getRespiratory().buildVo(map);
		this.temperature = bean.getTemperature() == null ? null : bean.getTemperature().buildVo(map);
		this.glasgowcomascale = bean.getGlasgowComaScale() == null ? null : bean.getGlasgowComaScale().buildVo(map);
		this.oxygensaturation = bean.getOxygenSaturation() == null ? null : bean.getOxygenSaturation().buildVo(map);
		this.bloodsugar = bean.getBloodSugar() == null ? null : bean.getBloodSugar().buildVo(map);
		this.pupils = bean.getPupils() == null ? null : bean.getPupils().buildVo(map);
		this.visualacuity = bean.getVisualAcuity() == null ? null : bean.getVisualAcuity().buildVo(map);
		this.metrics = bean.getMetrics() == null ? null : bean.getMetrics().buildVo(map);
		this.arterialbloodgas = bean.getArterialBloodGas() == null ? null : bean.getArterialBloodGas().buildVo(map);
		this.ventilationchart = bean.getVentilationChart() == null ? null : bean.getVentilationChart().buildVo(map);
		this.recordedsigns = ims.core.vo.lookups.VSTypeCollection.buildFromBeanCollection(bean.getRecordedSigns());
		this.lungfunctiontest = bean.getLungFunctionTest() == null ? null : bean.getLungFunctionTest().buildVo(map);
		this.pain = bean.getPain() == null ? null : bean.getPain().buildVo(map);
		this.patientconscious = bean.getPatientConscious() == null ? null : ims.core.vo.lookups.ConsciousLevel.buildLookup(bean.getPatientConscious());
		this.urine2mlkgkhr = bean.getUrine2mlkgkhr() == null ? null : ims.core.vo.lookups.UrineOutput.buildLookup(bean.getUrine2mlkgkhr());
		this.patientcausingconcern = bean.getPatientCausingConcern() == null ? null : ims.core.vo.lookups.PatientCausingConcern.buildLookup(bean.getPatientCausingConcern());
		this.recordinginformation = bean.getRecordingInformation() == null ? null : bean.getRecordingInformation().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.VitalSignsVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.VitalSignsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.VitalSignsVoBean();
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
		if(fieldName.equals("BLOODPRESSURE"))
			return getBloodPressure();
		if(fieldName.equals("PULSE"))
			return getPulse();
		if(fieldName.equals("RESPIRATORY"))
			return getRespiratory();
		if(fieldName.equals("TEMPERATURE"))
			return getTemperature();
		if(fieldName.equals("GLASGOWCOMASCALE"))
			return getGlasgowComaScale();
		if(fieldName.equals("OXYGENSATURATION"))
			return getOxygenSaturation();
		if(fieldName.equals("BLOODSUGAR"))
			return getBloodSugar();
		if(fieldName.equals("PUPILS"))
			return getPupils();
		if(fieldName.equals("VISUALACUITY"))
			return getVisualAcuity();
		if(fieldName.equals("METRICS"))
			return getMetrics();
		if(fieldName.equals("ARTERIALBLOODGAS"))
			return getArterialBloodGas();
		if(fieldName.equals("VENTILATIONCHART"))
			return getVentilationChart();
		if(fieldName.equals("RECORDEDSIGNS"))
			return getRecordedSigns();
		if(fieldName.equals("LUNGFUNCTIONTEST"))
			return getLungFunctionTest();
		if(fieldName.equals("PAIN"))
			return getPain();
		if(fieldName.equals("PATIENTCONSCIOUS"))
			return getPatientConscious();
		if(fieldName.equals("URINE2MLKGKHR"))
			return getUrine2mlkgkhr();
		if(fieldName.equals("PATIENTCAUSINGCONCERN"))
			return getPatientCausingConcern();
		if(fieldName.equals("RECORDINGINFORMATION"))
			return getRecordingInformation();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getBloodPressureIsNotNull()
	{
		return this.bloodpressure != null;
	}
	public ims.core.vo.VSBloodPressure getBloodPressure()
	{
		return this.bloodpressure;
	}
	public void setBloodPressure(ims.core.vo.VSBloodPressure value)
	{
		this.isValidated = false;
		this.bloodpressure = value;
	}
	public boolean getPulseIsNotNull()
	{
		return this.pulse != null;
	}
	public ims.core.vo.VSPulse getPulse()
	{
		return this.pulse;
	}
	public void setPulse(ims.core.vo.VSPulse value)
	{
		this.isValidated = false;
		this.pulse = value;
	}
	public boolean getRespiratoryIsNotNull()
	{
		return this.respiratory != null;
	}
	public ims.core.vo.VSRespirations getRespiratory()
	{
		return this.respiratory;
	}
	public void setRespiratory(ims.core.vo.VSRespirations value)
	{
		this.isValidated = false;
		this.respiratory = value;
	}
	public boolean getTemperatureIsNotNull()
	{
		return this.temperature != null;
	}
	public ims.core.vo.VSTemperature getTemperature()
	{
		return this.temperature;
	}
	public void setTemperature(ims.core.vo.VSTemperature value)
	{
		this.isValidated = false;
		this.temperature = value;
	}
	public boolean getGlasgowComaScaleIsNotNull()
	{
		return this.glasgowcomascale != null;
	}
	public ims.core.vo.VSGlasgowComaScale getGlasgowComaScale()
	{
		return this.glasgowcomascale;
	}
	public void setGlasgowComaScale(ims.core.vo.VSGlasgowComaScale value)
	{
		this.isValidated = false;
		this.glasgowcomascale = value;
	}
	public boolean getOxygenSaturationIsNotNull()
	{
		return this.oxygensaturation != null;
	}
	public ims.core.vo.VSOxygenSaturation getOxygenSaturation()
	{
		return this.oxygensaturation;
	}
	public void setOxygenSaturation(ims.core.vo.VSOxygenSaturation value)
	{
		this.isValidated = false;
		this.oxygensaturation = value;
	}
	public boolean getBloodSugarIsNotNull()
	{
		return this.bloodsugar != null;
	}
	public ims.core.vo.VSBloodSugar getBloodSugar()
	{
		return this.bloodsugar;
	}
	public void setBloodSugar(ims.core.vo.VSBloodSugar value)
	{
		this.isValidated = false;
		this.bloodsugar = value;
	}
	public boolean getPupilsIsNotNull()
	{
		return this.pupils != null;
	}
	public ims.core.vo.VSPupils getPupils()
	{
		return this.pupils;
	}
	public void setPupils(ims.core.vo.VSPupils value)
	{
		this.isValidated = false;
		this.pupils = value;
	}
	public boolean getVisualAcuityIsNotNull()
	{
		return this.visualacuity != null;
	}
	public ims.core.vo.VSVisualAcuity getVisualAcuity()
	{
		return this.visualacuity;
	}
	public void setVisualAcuity(ims.core.vo.VSVisualAcuity value)
	{
		this.isValidated = false;
		this.visualacuity = value;
	}
	public boolean getMetricsIsNotNull()
	{
		return this.metrics != null;
	}
	public ims.core.vo.VSMetrics getMetrics()
	{
		return this.metrics;
	}
	public void setMetrics(ims.core.vo.VSMetrics value)
	{
		this.isValidated = false;
		this.metrics = value;
	}
	public boolean getArterialBloodGasIsNotNull()
	{
		return this.arterialbloodgas != null;
	}
	public ims.core.vo.VSArterialBloodGas getArterialBloodGas()
	{
		return this.arterialbloodgas;
	}
	public void setArterialBloodGas(ims.core.vo.VSArterialBloodGas value)
	{
		this.isValidated = false;
		this.arterialbloodgas = value;
	}
	public boolean getVentilationChartIsNotNull()
	{
		return this.ventilationchart != null;
	}
	public ims.core.vo.VSVentilationChartVo getVentilationChart()
	{
		return this.ventilationchart;
	}
	public void setVentilationChart(ims.core.vo.VSVentilationChartVo value)
	{
		this.isValidated = false;
		this.ventilationchart = value;
	}
	public boolean getRecordedSignsIsNotNull()
	{
		return this.recordedsigns != null;
	}
	public ims.core.vo.lookups.VSTypeCollection getRecordedSigns()
	{
		return this.recordedsigns;
	}
	public void setRecordedSigns(ims.core.vo.lookups.VSTypeCollection value)
	{
		this.isValidated = false;
		this.recordedsigns = value;
	}
	public boolean getLungFunctionTestIsNotNull()
	{
		return this.lungfunctiontest != null;
	}
	public ims.core.vo.VSLungFunctionTestVo getLungFunctionTest()
	{
		return this.lungfunctiontest;
	}
	public void setLungFunctionTest(ims.core.vo.VSLungFunctionTestVo value)
	{
		this.isValidated = false;
		this.lungfunctiontest = value;
	}
	public boolean getPainIsNotNull()
	{
		return this.pain != null;
	}
	public ims.core.vo.VSPainLadderVo getPain()
	{
		return this.pain;
	}
	public void setPain(ims.core.vo.VSPainLadderVo value)
	{
		this.isValidated = false;
		this.pain = value;
	}
	public boolean getPatientConsciousIsNotNull()
	{
		return this.patientconscious != null;
	}
	public ims.core.vo.lookups.ConsciousLevel getPatientConscious()
	{
		return this.patientconscious;
	}
	public void setPatientConscious(ims.core.vo.lookups.ConsciousLevel value)
	{
		this.isValidated = false;
		this.patientconscious = value;
	}
	public boolean getUrine2mlkgkhrIsNotNull()
	{
		return this.urine2mlkgkhr != null;
	}
	public ims.core.vo.lookups.UrineOutput getUrine2mlkgkhr()
	{
		return this.urine2mlkgkhr;
	}
	public void setUrine2mlkgkhr(ims.core.vo.lookups.UrineOutput value)
	{
		this.isValidated = false;
		this.urine2mlkgkhr = value;
	}
	public boolean getPatientCausingConcernIsNotNull()
	{
		return this.patientcausingconcern != null;
	}
	public ims.core.vo.lookups.PatientCausingConcern getPatientCausingConcern()
	{
		return this.patientcausingconcern;
	}
	public void setPatientCausingConcern(ims.core.vo.lookups.PatientCausingConcern value)
	{
		this.isValidated = false;
		this.patientcausingconcern = value;
	}
	public boolean getRecordingInformationIsNotNull()
	{
		return this.recordinginformation != null;
	}
	public ims.core.vo.RecordingUserInformationVo getRecordingInformation()
	{
		return this.recordinginformation;
	}
	public void setRecordingInformation(ims.core.vo.RecordingUserInformationVo value)
	{
		this.isValidated = false;
		this.recordinginformation = value;
	}
	/**
	* contentEquals : this method takes an istance of a VSBloodPressureVo and compares selected fields against another(used in Exam General)
	*/
	public boolean contentEquals(ims.core.vo.VSBloodPressure value)
	{
		if(this.bloodpressure == null || value == null)
			return false;
				
		if(value.bpsittingdias!= null)
		{
			if(this.bloodpressure.bpsittingdias!= null)
			{
				if(value.bpsittingdias!= this.bloodpressure.bpsittingdias)
					return false;
			}
			else
				return false;
		}
	
		if(value.bpsittingsys!= null)
		{
			if(this.bloodpressure.bpsittingsys!= null)
			{
				if(value.bpsittingsys!= this.bloodpressure.bpsittingsys)
					return false;
			}
			else
				return false;
		}
			
		return true;
	}	
	
	/**
	* contentEquals : this method takes an istance of a VSTemperatureVo and compares selected fields against another(used in Exam General)
	*/
		public boolean contentEquals(ims.core.vo.VSTemperature value)
		{
			if(this.temperature == null || value == null)
				return false;
				
			if(value.temperature != null)
			{
				if(this.temperature.temperature != null)
				{
					if(value.temperature != this.temperature.temperature)
						return false;
				}
				else
					return false;
			}
			return true;
		}	
	
	/**
	* contentEquals : this method takes an istance of a VSRespirationVo and compares selected fields against another(used in Exam General)
	*/
		public boolean contentEquals(ims.core.vo.VSRespirations value)
		{
			if(this.respiratory == null || value == null)
				return false;
				
			if(value.resprate != null)
			{
				if(this.respiratory.resprate != null)
				{
					if(value.resprate != this.respiratory.resprate)
						return false;
				}
				else
					return false;
			}
			return true;
		}	
	
	/**
	* contentEquals : this method takes an istance of a VSVitalCapacityVo and compares selected fields against another(used in Exam General)
	*/
	public boolean contentEquals(ims.core.vo.VSLungFunctionTestVo value)
			{
				if(this.lungfunctiontest == null || value == null)
					return false;
					
				if(value.tidalvolume != null)
				{
					if(this.lungfunctiontest.tidalvolume != null)
					{
						if(value.tidalvolume != this.lungfunctiontest.tidalvolume)
							return false;
					}
					else
						return false;
				}
		
				if(value.vitalcapacity != null)
				{
					if(this.lungfunctiontest.vitalcapacity != null)
					{
						if(value.vitalcapacity != this.lungfunctiontest.vitalcapacity)
							return false;
					}
					else
						return false;
				}
				
				return true;
			}		
	
	/**
	* contentEquals : this method takes an istance of a VSMetrics and compares selected fields against another(used in Exam General)
	*/
		public boolean contentEquals(ims.core.vo.VSMetrics value)
		{
			if(this.metrics == null || value == null)
				return false;
				
			if(value.weightvalue != null)
			{
				if(this.metrics.weightvalue != null)
				{
					if(value.weightvalue != this.metrics.weightvalue)
						return false;
				}
				else
					return false;
			}
	
			if(value.heightvalue != null)
			{
				if(this.metrics.heightvalue != null)
				{
					if(value.heightvalue != this.metrics.heightvalue)
						return false;
				}
				else
					return false;
			}
			
			return true;
		}	
	
	/**
	* contentEquals : this method takes an istance of a VSGlasgowComaScaleVo and compares selected fields against another(used in Exam General)
	*/
		public boolean contentEquals(ims.core.vo.VSGlasgowComaScale value)
		{
			if(this.glasgowcomascale == null || value == null)
				return false;
				
			if(value.eyeopening != null)
			{
				if(this.glasgowcomascale.eyeopening != null)
				{
					if(value.eyeopening != this.glasgowcomascale.eyeopening)
						return false;
				}
				else
					return false;
			}
			if(value.motorresponse != null)
			{
				if(this.glasgowcomascale.motorresponse != null)
				{
					if(value.motorresponse != this.glasgowcomascale.motorresponse)
						return false;
				}
				else
					return false;
			}
			if(value.verbalresponse != null)
			{
				if(this.glasgowcomascale.verbalresponse != null)
				{
					if(value.verbalresponse != this.glasgowcomascale.verbalresponse)
						return false;
				}
				else
					return false;
			}
				
			return true;
		}	
	
	/**
	* contentEquals : this method takes an istance of a VSPulseVo and compares selected fields against another(used in Exam General)
	*/
			public boolean contentEquals(ims.core.vo.VSPulse value)
			{
				if(this.pulse == null || value == null)
					return false;
						
				if(value.pulserateradial != null)
				{
					if (this.respiratory != null)
					{
						if(this.respiratory.resprate != null)
						{
							if(value.pulserateradial != this.pulse.pulserateradial)
								return false;
						}
						else
							return false;
					}
				}
	
				if(value.pulserateapex != null)
				{
					if(this.respiratory != null)
					{
						if(this.respiratory.resprate != null)
						{
							if(value.pulserateapex != this.pulse.pulserateapex)
								return false;
						}
						else
							return false;
					}
				}
					
				return true;
			
			}
	/**
	* contentEquals : this method takes an istance of a VSOxygenSatVo and compares selected fields against another(used in Exam General)
	*/
		public boolean contentEquals(ims.core.vo.VSOxygenSaturation value)
		{
			if(this.oxygensaturation == null || value == null)
				return false;
				
			if(value.oxygensaturationlevel != null)
			{
				if(this.oxygensaturation.oxygensaturationlevel != null)
				{
					if(value.oxygensaturationlevel != this.oxygensaturation.oxygensaturationlevel)
						return false;
				}
				else
					return false;
			}
			return true;
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
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.bloodpressure != null)
		{
			if(!this.bloodpressure.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.pulse != null)
		{
			if(!this.pulse.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.respiratory != null)
		{
			if(!this.respiratory.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.temperature != null)
		{
			if(!this.temperature.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.glasgowcomascale != null)
		{
			if(!this.glasgowcomascale.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.oxygensaturation != null)
		{
			if(!this.oxygensaturation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.bloodsugar != null)
		{
			if(!this.bloodsugar.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.pupils != null)
		{
			if(!this.pupils.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.visualacuity != null)
		{
			if(!this.visualacuity.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.metrics != null)
		{
			if(!this.metrics.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.arterialbloodgas != null)
		{
			if(!this.arterialbloodgas.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.ventilationchart != null)
		{
			if(!this.ventilationchart.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.lungfunctiontest != null)
		{
			if(!this.lungfunctiontest.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.pain != null)
		{
			if(!this.pain.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.recordinginformation != null)
		{
			if(!this.recordinginformation.isValidated())
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
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.authoringinformation == null)
			listOfErrors.add("AuthoringInformation is mandatory");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.vitalstakendatetime == null)
			listOfErrors.add("VitalsTakenDateTime is mandatory");
		if(this.bloodpressure != null)
		{
			String[] listOfOtherErrors = this.bloodpressure.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.pulse != null)
		{
			String[] listOfOtherErrors = this.pulse.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.respiratory != null)
		{
			String[] listOfOtherErrors = this.respiratory.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.temperature != null)
		{
			String[] listOfOtherErrors = this.temperature.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.glasgowcomascale != null)
		{
			String[] listOfOtherErrors = this.glasgowcomascale.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.oxygensaturation != null)
		{
			String[] listOfOtherErrors = this.oxygensaturation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.bloodsugar != null)
		{
			String[] listOfOtherErrors = this.bloodsugar.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.pupils != null)
		{
			String[] listOfOtherErrors = this.pupils.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.visualacuity != null)
		{
			String[] listOfOtherErrors = this.visualacuity.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.metrics != null)
		{
			String[] listOfOtherErrors = this.metrics.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.arterialbloodgas != null)
		{
			String[] listOfOtherErrors = this.arterialbloodgas.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.ventilationchart != null)
		{
			String[] listOfOtherErrors = this.ventilationchart.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.lungfunctiontest != null)
		{
			String[] listOfOtherErrors = this.lungfunctiontest.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.pain != null)
		{
			String[] listOfOtherErrors = this.pain.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.recordinginformation != null)
		{
			String[] listOfOtherErrors = this.recordinginformation.validate();
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
	
		VitalSignsVo clone = new VitalSignsVo(this.id, this.version);
		
		clone.carecontext = this.carecontext;
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		clone.isventilationchartrecord = this.isventilationchartrecord;
		if(this.clinicalcontact == null)
			clone.clinicalcontact = null;
		else
			clone.clinicalcontact = (ims.core.vo.ClinicalContactShortVo)this.clinicalcontact.clone();
		if(this.vitalstakendatetime == null)
			clone.vitalstakendatetime = null;
		else
			clone.vitalstakendatetime = (ims.framework.utils.DateTime)this.vitalstakendatetime.clone();
		if(this.bloodpressure == null)
			clone.bloodpressure = null;
		else
			clone.bloodpressure = (ims.core.vo.VSBloodPressure)this.bloodpressure.clone();
		if(this.pulse == null)
			clone.pulse = null;
		else
			clone.pulse = (ims.core.vo.VSPulse)this.pulse.clone();
		if(this.respiratory == null)
			clone.respiratory = null;
		else
			clone.respiratory = (ims.core.vo.VSRespirations)this.respiratory.clone();
		if(this.temperature == null)
			clone.temperature = null;
		else
			clone.temperature = (ims.core.vo.VSTemperature)this.temperature.clone();
		if(this.glasgowcomascale == null)
			clone.glasgowcomascale = null;
		else
			clone.glasgowcomascale = (ims.core.vo.VSGlasgowComaScale)this.glasgowcomascale.clone();
		if(this.oxygensaturation == null)
			clone.oxygensaturation = null;
		else
			clone.oxygensaturation = (ims.core.vo.VSOxygenSaturation)this.oxygensaturation.clone();
		if(this.bloodsugar == null)
			clone.bloodsugar = null;
		else
			clone.bloodsugar = (ims.core.vo.VSBloodSugar)this.bloodsugar.clone();
		if(this.pupils == null)
			clone.pupils = null;
		else
			clone.pupils = (ims.core.vo.VSPupils)this.pupils.clone();
		if(this.visualacuity == null)
			clone.visualacuity = null;
		else
			clone.visualacuity = (ims.core.vo.VSVisualAcuity)this.visualacuity.clone();
		if(this.metrics == null)
			clone.metrics = null;
		else
			clone.metrics = (ims.core.vo.VSMetrics)this.metrics.clone();
		if(this.arterialbloodgas == null)
			clone.arterialbloodgas = null;
		else
			clone.arterialbloodgas = (ims.core.vo.VSArterialBloodGas)this.arterialbloodgas.clone();
		if(this.ventilationchart == null)
			clone.ventilationchart = null;
		else
			clone.ventilationchart = (ims.core.vo.VSVentilationChartVo)this.ventilationchart.clone();
		if(this.recordedsigns == null)
			clone.recordedsigns = null;
		else
			clone.recordedsigns = (ims.core.vo.lookups.VSTypeCollection)this.recordedsigns.clone();
		if(this.lungfunctiontest == null)
			clone.lungfunctiontest = null;
		else
			clone.lungfunctiontest = (ims.core.vo.VSLungFunctionTestVo)this.lungfunctiontest.clone();
		if(this.pain == null)
			clone.pain = null;
		else
			clone.pain = (ims.core.vo.VSPainLadderVo)this.pain.clone();
		if(this.patientconscious == null)
			clone.patientconscious = null;
		else
			clone.patientconscious = (ims.core.vo.lookups.ConsciousLevel)this.patientconscious.clone();
		if(this.urine2mlkgkhr == null)
			clone.urine2mlkgkhr = null;
		else
			clone.urine2mlkgkhr = (ims.core.vo.lookups.UrineOutput)this.urine2mlkgkhr.clone();
		if(this.patientcausingconcern == null)
			clone.patientcausingconcern = null;
		else
			clone.patientcausingconcern = (ims.core.vo.lookups.PatientCausingConcern)this.patientcausingconcern.clone();
		if(this.recordinginformation == null)
			clone.recordinginformation = null;
		else
			clone.recordinginformation = (ims.core.vo.RecordingUserInformationVo)this.recordinginformation.clone();
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
		if (!(VitalSignsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A VitalSignsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		VitalSignsVo compareObj = (VitalSignsVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getVitalsTakenDateTime() == null && compareObj.getVitalsTakenDateTime() != null)
				return -1;
			if(this.getVitalsTakenDateTime() != null && compareObj.getVitalsTakenDateTime() == null)
				return 1;
			if(this.getVitalsTakenDateTime() != null && compareObj.getVitalsTakenDateTime() != null)
				retVal = this.getVitalsTakenDateTime().compareTo(compareObj.getVitalsTakenDateTime());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.bloodpressure != null)
			count++;
		if(this.pulse != null)
			count++;
		if(this.respiratory != null)
			count++;
		if(this.temperature != null)
			count++;
		if(this.glasgowcomascale != null)
			count++;
		if(this.oxygensaturation != null)
			count++;
		if(this.bloodsugar != null)
			count++;
		if(this.pupils != null)
			count++;
		if(this.visualacuity != null)
			count++;
		if(this.metrics != null)
			count++;
		if(this.arterialbloodgas != null)
			count++;
		if(this.ventilationchart != null)
			count++;
		if(this.recordedsigns != null)
			count++;
		if(this.lungfunctiontest != null)
			count++;
		if(this.pain != null)
			count++;
		if(this.patientconscious != null)
			count++;
		if(this.urine2mlkgkhr != null)
			count++;
		if(this.patientcausingconcern != null)
			count++;
		if(this.recordinginformation != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 19;
	}
	protected ims.core.vo.VSBloodPressure bloodpressure;
	protected ims.core.vo.VSPulse pulse;
	protected ims.core.vo.VSRespirations respiratory;
	protected ims.core.vo.VSTemperature temperature;
	protected ims.core.vo.VSGlasgowComaScale glasgowcomascale;
	protected ims.core.vo.VSOxygenSaturation oxygensaturation;
	protected ims.core.vo.VSBloodSugar bloodsugar;
	protected ims.core.vo.VSPupils pupils;
	protected ims.core.vo.VSVisualAcuity visualacuity;
	protected ims.core.vo.VSMetrics metrics;
	protected ims.core.vo.VSArterialBloodGas arterialbloodgas;
	protected ims.core.vo.VSVentilationChartVo ventilationchart;
	protected ims.core.vo.lookups.VSTypeCollection recordedsigns;
	protected ims.core.vo.VSLungFunctionTestVo lungfunctiontest;
	protected ims.core.vo.VSPainLadderVo pain;
	protected ims.core.vo.lookups.ConsciousLevel patientconscious;
	protected ims.core.vo.lookups.UrineOutput urine2mlkgkhr;
	protected ims.core.vo.lookups.PatientCausingConcern patientcausingconcern;
	protected ims.core.vo.RecordingUserInformationVo recordinginformation;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
