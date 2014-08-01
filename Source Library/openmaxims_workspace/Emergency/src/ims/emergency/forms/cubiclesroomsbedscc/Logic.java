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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 4664.22850)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.cubiclesroomsbedscc;

import ims.configuration.gen.ConfigFlag;
import ims.emergency.forms.cubiclesroomsbedscc.GenForm.grdCubiclesRoomsBedsRow;
import ims.emergency.vo.CubicleAllocationVoCollection;
import ims.emergency.vo.TrackingAreaCubiclesVo;
import ims.emergency.vo.TrackingAreaVo;
import ims.emergency.vo.TrackingCubicleRoomBedVoCollection;
import ims.emergency.vo.enums.SendToConfigEvent;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Add your code here.
	}
	
	protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
		if( result.equals(DialogResult.OK))
		{
			if( form.getGlobalContext().getEmergencyCubiclesRoomsBedIsNotNull())
			{
				if( Boolean.FALSE.equals(form.getLocalContext().getEditCubicleRoomBed()) )  	//ADD
				{
					grdCubiclesRoomsBedsRow row = form.grdCubiclesRoomsBeds().getRows().newRow();
					row.setCubilcelsRoomsBeds(form.getGlobalContext().getEmergencyCubiclesRoomsBed().getCubicleRoomBedName());
					row.setValue(form.getGlobalContext().getEmergencyCubiclesRoomsBed());
				}
				else if( Boolean.TRUE.equals(form.getLocalContext().getEditCubicleRoomBed()))	//EDIT
				{
					grdCubiclesRoomsBedsRow row = form.grdCubiclesRoomsBeds().getSelectedRow();
					row.setCubilcelsRoomsBeds(form.getGlobalContext().getEmergencyCubiclesRoomsBed().getCubicleRoomBedName());
					row.setValue(form.getGlobalContext().getEmergencyCubiclesRoomsBed());
				}
				
				form.getLocalContext().setEditCubicleRoomBed(null);
				form.getGlobalContext().setEmergencyCubiclesRoomsBed(null);
				updateControlsState();
				
					
			}
		}
	}
	
	protected void onCmbAreaValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		comboAreaValueChanged();
		
	}
	private void comboAreaValueChanged()
	{
		form.grdCubiclesRoomsBeds().getRows().clear();
		if( form.cmbArea().getValue() != null)
		{
			TrackingAreaCubiclesVo tempVo = domain.getTrackingAreaCubicle(form.cmbArea().getValue());
			form.getLocalContext().setCurrentTrackingAreaCubicles(tempVo);
			form.getLocalContext().setTrackingArea(form.cmbArea().getValue());
			if( tempVo != null && tempVo.getCubiclesRoomsBedsIsNotNull()&& tempVo.getCubiclesRoomsBeds().size() > 0 )
			{
				for(int i = 0; i < tempVo.getCubiclesRoomsBeds().size();i++)
				{
					grdCubiclesRoomsBedsRow row = form.grdCubiclesRoomsBeds().getRows().newRow();
					row.setCubilcelsRoomsBeds(tempVo.getCubiclesRoomsBeds().get(i).getCubicleRoomBedName());
					row.setValue(tempVo.getCubiclesRoomsBeds().get(i));
				}
			}
		}
		else
			form.getLocalContext().setCurrentTrackingAreaCubicles(null);
		
		form.getLocalContext().setSelectedEvent(SendToConfigEvent.COMBOVALUECHANGED);
		form.fireCustomControlValueChanged();
	}
	
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setEditCubicleRoomBed(null);
		switch (menuItemID)
		{
			case ims.emergency.forms.cubiclesroomsbedscc.GenForm.ContextMenus.EmergencyNamespace.CubiclesRoomBed.ADD:
				form.getGlobalContext().setEmergencyCubiclesRoomsBed(null);
				form.getLocalContext().setEditCubicleRoomBed(Boolean.FALSE);
				engine.open(form.getForms().Emergency.CubicleRoomBedDlg);
				break;
			case ims.emergency.forms.cubiclesroomsbedscc.GenForm.ContextMenus.EmergencyNamespace.CubiclesRoomBed.EDIT:
				form.getGlobalContext().setEmergencyCubiclesRoomsBed(form.grdCubiclesRoomsBeds().getSelectedRow().getValue());
				form.getLocalContext().setEditCubicleRoomBed(Boolean.TRUE);
				engine.open(form.getForms().Emergency.CubicleRoomBedDlg);
				break;
			case ims.emergency.forms.cubiclesroomsbedscc.GenForm.ContextMenus.EmergencyNamespace.CubiclesRoomBed.REMOVE:
				CubicleAllocationVoCollection tempColl = domain.getAllcotiobCubilce(form.grdCubiclesRoomsBeds().getValue());
				if( tempColl == null)
				{
    				if( form.grdCubiclesRoomsBeds().getSelectedRow() != null)
    					form.grdCubiclesRoomsBeds().removeSelectedRow();
				}
				else
				{
					engine.showMessage(" The Cubicle/Room/Bed cannot be removed as it is currently assigned to a patient.");
				}
    				
				updateControlsState();
				break;	
			

		}

	}
	public ims.emergency.vo.TrackingAreaCubiclesVo getValue()
	{
		if( form.cmbArea().getValue() != null )
		{
			form.getLocalContext().setTrackingArea(form.cmbArea().getValue());
			TrackingAreaCubiclesVo tempVo = form.getLocalContext().getCurrentTrackingAreaCubicles(); 
			if(	tempVo == null )
			{
				tempVo = new TrackingAreaCubiclesVo();
				tempVo.setTrackingArea(form.cmbArea().getValue());
			}
			TrackingCubicleRoomBedVoCollection tempVoColl = new TrackingCubicleRoomBedVoCollection();
			if( form.grdCubiclesRoomsBeds().getRows().size() > 0)
			{
				for(int i = 0; i < form.grdCubiclesRoomsBeds().getRows().size();i++)
				{
					tempVoColl.add(form.grdCubiclesRoomsBeds().getRows().get(i).getValue());
				}
			}
			else
				tempVoColl = null;
			
			tempVo.setCubiclesRoomsBeds(tempVoColl);
			form.getLocalContext().setCurrentTrackingAreaCubicles(tempVo);
			
			return form.getLocalContext().getCurrentTrackingAreaCubicles();
				
		}
		else
		{
			form.getLocalContext().setTrackingArea(null);
			return null;
		}
	}

	public void initialize(Boolean argument, ims.emergency.vo.TrackingAreaVoCollection areaDefCollection)
	{
		if(	Boolean.FALSE.equals(argument))
		{
			populateAreaCombo(areaDefCollection);
			if( form.getLocalContext().getTrackingAreaIsNotNull())
			{
				form.cmbArea().setValue(form.getLocalContext().getTrackingArea());
				comboAreaValueChanged();
			}
		}
	}
	private void populateAreaCombo(ims.emergency.vo.TrackingAreaVoCollection areaDefCollection)
	{
		form.cmbArea().clear();
		if( areaDefCollection == null )
			return;
		for( int i = 0; i < areaDefCollection.size();i++ )
		{
			TrackingAreaVo temp = areaDefCollection.get(i);
			if( temp != null && !Boolean.TRUE.equals(temp.getIsRegistrationArea()) && !Boolean.TRUE.equals(temp.getIsOverallView()))
			{
				form.cmbArea().newRow(temp, temp.getAreaDisplayName());
			}
		}
	}
	private void updateControlsState()
	{
		form.getContextMenus().Emergency.hideAllCubiclesRoomBedMenuItems();
		if( FormMode.EDIT.equals(form.getMode()) )
		{
			form.getContextMenus().Emergency.getCubiclesRoomBedADDItem().setVisible(form.cmbArea().getValue() != null);
			form.getContextMenus().Emergency.getCubiclesRoomBedEDITItem().setVisible(form.cmbArea().getValue() != null && form.grdCubiclesRoomsBeds().getSelectedRow() != null);
			form.getContextMenus().Emergency.getCubiclesRoomBedREMOVEItem().setVisible(form.cmbArea().getValue() != null && form.grdCubiclesRoomsBeds().getSelectedRow() != null);
			
			form.cmbArea().setEnabled(false);
		}
		else
			form.cmbArea().setEnabled(true);
	}

	
	protected void onFormModeChanged()
	{
		updateControlsState();
		
	}

	
	protected void onGrdCubiclesRoomsBedsSelectionChanged() throws PresentationLogicException
	{
		updateControlsState();
		
	}

	
	public TrackingAreaVo getFromAreaCombo()
	{
		
		return form.cmbArea().getValue();
	}

	
	public SendToConfigEvent getSelectedEvent()
	{
		return form.getLocalContext().getSelectedEvent();
	}

	//WDEV-17368
	public Boolean removedCubicleAreUsed()
	{
		TrackingAreaCubiclesVo tempVo = domain.getTrackingAreaCubicle(form.cmbArea().getValue());
		TrackingCubicleRoomBedVoCollection collRemovedCubicle=new TrackingCubicleRoomBedVoCollection();
		if( tempVo != null && tempVo.getCubiclesRoomsBedsIsNotNull()&& tempVo.getCubiclesRoomsBeds().size() > 0 )
		{
			TrackingCubicleRoomBedVoCollection collCubicleFromDB = tempVo.getCubiclesRoomsBeds();
			
			TrackingCubicleRoomBedVoCollection collCubicleFromScreen = new TrackingCubicleRoomBedVoCollection();
			if( form.grdCubiclesRoomsBeds().getRows().size() > 0)
			{
				for(int i = 0; i < form.grdCubiclesRoomsBeds().getRows().size();i++)
				{
					collCubicleFromScreen.add(form.grdCubiclesRoomsBeds().getRows().get(i).getValue());
				}
			}
			else
				collCubicleFromScreen = null;
			
			for(int i = 0; i < collCubicleFromDB.size();i++)
			{
				if (collCubicleFromDB!=null && collCubicleFromScreen!=null && !collCubicleFromScreen.contains(collCubicleFromDB.get(i)))
				{
					collRemovedCubicle.add(collCubicleFromDB.get(i));
				}
			}
		}
		
		if (collRemovedCubicle==null || collRemovedCubicle.size()==0)
			return false;
	
		for (int i=0;i<collRemovedCubicle.size();i++)
		{
			CubicleAllocationVoCollection tempColl = domain.getAllcotiobCubilce(collRemovedCubicle.get(i));
			
			if( tempColl != null)
			{
				return true;
			}
		}
		
		return false;
	}
}