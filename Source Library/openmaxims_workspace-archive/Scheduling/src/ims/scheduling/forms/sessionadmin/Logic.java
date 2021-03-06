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
//This code was generated by Daniel Laffan using IMS Development Environment (version 1.30 build 2012.21169)
//Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.scheduling.forms.sessionadmin;

import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.Control;
import ims.framework.FormName;
import ims.framework.MessageButtons;
import ims.framework.MessageDefaultButton;
import ims.framework.MessageIcon;
import ims.framework.controls.TreeNode;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.scheduling.vo.Appointment_StatusVo;
import ims.scheduling.vo.Appointment_StatusVoCollection;
import ims.scheduling.vo.DirectoryOfServiceLiteVo;
import ims.scheduling.vo.DirectoryOfServiceLiteVoCollection;
import ims.scheduling.vo.ProfileLiteVo;
import ims.scheduling.vo.ProfileLiteVoCollection;
import ims.scheduling.vo.SessionShortVo;
import ims.scheduling.vo.SessionShortVoCollection;
import ims.scheduling.vo.SessionSlotStatusVo;
import ims.scheduling.vo.SessionSlotStatusVoCollection;
import ims.scheduling.vo.SessionSlotVo;
import ims.scheduling.vo.SessionVo;
import ims.scheduling.vo.lookups.Session_Status_and_Reason;
import ims.scheduling.vo.lookups.Status_Reason;

public class Logic extends BaseLogic
{
	protected void onFormOpen() throws FormOpenException 
	{
		form.getLocalContext().settabProfileVisible(Boolean.TRUE); //isVisible on Tabs not returning correctly
		
		if (ConfigFlag.DOM.SCHEDULING_SLOTS_CREATION.getValue().equals("Local Only"))
		{
			form.lblDos().setVisible(false);
			form.qmbDoService().setVisible(false);//WDEV-15190
		}
		
		form.getContextMenus().hideAllSessionAdminMenuItems();
	}

	private void open() 
	{
		//WDEV-14803
		if (!validateDates(form.dteFrom().getValue(), form.dteTo().getValue()))
		{
			form.treSessions().clear();
			return;
		}
		
		SessionShortVoCollection voCollSession = new SessionShortVoCollection();
	
		voCollSession = domain.listSession(form.qmbProfile().getValue(),form.qmbDoService().getValue(), form.dteFrom().getValue(), form.dteTo().getValue());//WDEV-15190
		populateTree(voCollSession);	
		
		if(voCollSession.size() == 0)
			engine.showMessage("No matching Sessions found");
		
		form.getContextMenus().hideAllSessionAdminMenuItems();
	}

	protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.qmbProfile().clear();//WDEV-15190
		form.qmbDoService().clear();//WDEV-15190
		form.dteFrom().setValue(null);
		form.dteTo().setValue(null);
		form.treSessions().clear();
		form.getContextMenus().hideAllSessionAdminMenuItems();
	}
	
	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().settabProfileVisible(Boolean.TRUE);
		
		if(validateDates(form.dteFrom().getValue(), form.dteTo().getValue()))
		{
			open();
		}
	}

	private void populateTree(SessionShortVoCollection voCollSession) 
	{
		form.treSessions().clear();
		TreeNode node;
		
		for(int i=0;i<voCollSession.size();i++)
		{
			node = form.treSessions().getNodes().add(voCollSession.get(i), voCollSession.get(i).toString());
			if(voCollSession.get(i).getIsActiveIsNotNull() && voCollSession.get(i).getIsActive().equals(Boolean.TRUE))
			{
				if(voCollSession.get(i).getSessionStatusIsNotNull())
				{
					if(voCollSession.get(i).getSessionStatus().equals(Session_Status_and_Reason.OPEN))
						node.setCollapsedImage(form.getImages().Core.Tick);
					else if(voCollSession.get(i).getSessionStatus().equals(Session_Status_and_Reason.CANCELLED))
					{
						node.setCollapsedImage(form.getImages().Scheduling.Cancelled);
						
						String nodeTooltip = voCollSession.get(i).getCancellationReason() != null ? "<b>Cancellation reason: </b>" + voCollSession.get(i).getCancellationReason().getText() + "<br>": "";
						
						if (voCollSession.get(i).getComment() != null)
						{
							nodeTooltip = nodeTooltip + "<b>Comment: </b>" + voCollSession.get(i).getComment();
						}
						
						node.setTooltip(nodeTooltip);
					}
					else if(voCollSession.get(i).getSessionStatus().equals(Session_Status_and_Reason.BLOCKED))
					{
						node.setCollapsedImage(form.getImages().Core.RedFlag);
						node.setTooltip(voCollSession.get(i).getComment() != null ? "<b>Block reason: </b>" + voCollSession.get(i).getComment() : "");
					}
				}
			}
			else
				node.setCollapsedImage(form.getImages().Core.Delete);
		}
	}

	protected void onTreSessionsTreeViewSelectionChanged(ims.framework.controls.TreeNode node) throws ims.framework.exceptions.PresentationLogicException
	{
		form.getContextMenus().hideAllSessionAdminMenuItems();
		if(node == null)
			return;
		
		
		SessionShortVo voSessionShort = (SessionShortVo) node.getValue();
		
		if(voSessionShort.getIsActive().equals(Boolean.FALSE))
			return;
		
		if(voSessionShort.getSessionStatus().equals(Session_Status_and_Reason.OPEN))
		{
			form.getContextMenus().getSessionAdminBLOCKItem().setVisible(true);
			form.getContextMenus().getSessionAdminCANCELItem().setVisible(true);
		}
		else if(voSessionShort.getSessionStatus().equals(Session_Status_and_Reason.BLOCKED))
		{
			form.getContextMenus().getSessionAdminREOPENItem().setVisible(true);
		}
		else if(voSessionShort.getSessionStatus().equals(Session_Status_and_Reason.CANCELLED))
		{
			form.getContextMenus().getSessionAdminREOPENItem().setVisible(true);
			form.getContextMenus().getSessionAdminDELETEItem().setVisible(true);
		}	
		
		//WDEV-12918
		if(voSessionShort.getIsTheatreSessionIsNotNull() && voSessionShort.getIsTheatreSession() && voSessionShort.getSessionDateIsNotNull() && voSessionShort.getSessionDate().isGreaterOrEqualThan(new Date()))
			form.getContextMenus().getSessionAdminMOVEItem().setVisible(true);
	}
	
	private boolean validateDates(Date startDate, Date endDate) 
	{
		if(startDate != null && endDate != null)
		{
			if(startDate.isGreaterThan(endDate))
			{	
				engine.showMessage("Start Date cannot be greater than End Date!"); //WDEV-14803
				return false;
			}
			return true;
		}
		
		return true;
	}

	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException 
	{
		switch(menuItemID)
		{
			case GenForm.ContextMenus.SessionAdmin.REOPEN:
				updateSessionStatus((SessionShortVo)form.treSessions().getSelectedNode().getValue(), Session_Status_and_Reason.OPEN);
				break;
			case GenForm.ContextMenus.SessionAdmin.BLOCK:
				engine.open(form.getForms().Scheduling.ReasonTextDialog);
				break;
			case GenForm.ContextMenus.SessionAdmin.CANCEL:
				// WDEV-17897 pass flag to indicate its a session being cancelled - don't want cancel patient option to be displayed
				engine.open(form.getForms().Scheduling.CancelAppointmentDialog, new Object[]{true}, "Cancel Session");
				break;
			case GenForm.ContextMenus.SessionAdmin.DELETE:
				updateSessionStatus((SessionShortVo)form.treSessions().getSelectedNode().getValue(), null);
				break;
			case GenForm.ContextMenus.SessionAdmin.MOVE: //WDEV-12918
				launchMoveSessionDialog();
				break;
			default:
		}
	}

	private void launchMoveSessionDialog()
	{
		//launch form passing selected session in args
		engine.open(form.getForms().Scheduling.MoveSessionDialog , new Object[] {(SessionShortVo)form.treSessions().getValue()});
	}

	private void updateSessionStatus(SessionShortVo voSessionShort, Session_Status_and_Reason lkpInstance) 
	{
		SessionVo voSession = domain.getSession(voSessionShort);
		
		if(voSession == null)
			return;
		
		//WDEV-17964
		if (voSessionShort.getVersion_Sch_Session() !=  voSession.getVersion_Sch_Session())
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return;
		}
		
		if(lkpInstance != null)
		{
			if(!lkpInstance.equals(Session_Status_and_Reason.OPEN))
			{
				//validation - go through all slots if any have status of cancelled pending appt send error messge to user
				if(voSession.getSessionSlotsIsNotNull())
				{
					for(int i=0;i<voSession.getSessionSlots().size();i++)
					{
						if(voSession.getSessionSlots().get(i).getStatus().equals(Status_Reason.CANCELLED_PENDING_APPT))
						{
							engine.showMessage("Some Session Slots cannot be Cancelled as they are pending confirmation from ChooseAndBook");
							return;
						}
					}
				}
			}
		}
		
		if(lkpInstance == null)
		{
			voSession.setIsActive(Boolean.FALSE);
		}
		else
		{
			voSession.setSessionStatus(lkpInstance);
			if(lkpInstance.equals(Session_Status_and_Reason.BLOCKED))
			{
				voSession.setComment(form.getGlobalContext().Core.getCommentDialogString());
				
				for(int i=0;i<voSession.getSessionSlots().size();i++)
				{
					if(voSession.getSessionSlots().get(i).getAppointment() == null)
					{
						voSession.getSessionSlots().get(i).setStatus(Status_Reason.BLOCKED); 
						voSession.getSessionSlots().get(i).setStatusReason(Status_Reason.BLOCKED);
						voSession.getSessionSlots().get(i).setStatusReasonHistory(getSessionStatusHistory(voSession.getSessionSlots().get(i), Status_Reason.BLOCKED));							
					}
				}
			}
			else if(lkpInstance.equals(Session_Status_and_Reason.CANCELLED))
			{
				for(int i=0;i<voSession.getSessionSlots().size();i++)
				{
					voSession.getSessionSlots().get(i).setStatus(Status_Reason.CANCELLED);
					
					if(voSession.getSessionSlots().get(i).getAppointmentIsNotNull())
					{
						voSession.getSessionSlots().get(i).getAppointment().setApptStatus(Status_Reason.CANCELLED);
						voSession.getSessionSlots().get(i).getAppointment().setApptStatusReas(form.getGlobalContext().ChooseAndBook.getSessionSlotStatusReason());
						Appointment_StatusVo voApptStatus = new Appointment_StatusVo();  // wdev-6034
						
						voSession.getSessionSlots().get(i).getAppointment().setApptStatusHistory(getApptStatusHistory(voSession.getSessionSlots().get(i),Status_Reason.CANCELLED, voApptStatus));
						voSession.getSessionSlots().get(i).getAppointment().setCurrentStatusRecord(voApptStatus); // wdev-6034
						voSession.getSessionSlots().get(i).setStatus(Status_Reason.CANCELLED_PENDING_APPT);
						voSession.getSessionSlots().get(i).setStatusReasonHistory(getSessionStatusHistory(voSession.getSessionSlots().get(i),Status_Reason.CANCELLED_PENDING_APPT));
					}
					else
					{
						voSession.getSessionSlots().get(i).setStatusReason(form.getGlobalContext().ChooseAndBook.getSessionSlotStatusReason());	
						voSession.getSessionSlots().get(i).setStatusReasonHistory(getSessionStatusHistory(voSession.getSessionSlots().get(i), Status_Reason.CANCELLED));
					}
				}
			}
			else if(lkpInstance.equals(Session_Status_and_Reason.OPEN))
			{
				for(int i=0;i<voSession.getSessionSlots().size();i++)
				{
					//WDEV-7470 - only re-open if appt is null
					if(voSession.getSessionSlots().get(i).getAppointment() == null)
					{
						voSession.getSessionSlots().get(i).setStatus(Status_Reason.SLOTOPENED);
						voSession.getSessionSlots().get(i).setStatusReason(Status_Reason.SLOTOPENED);
						voSession.getSessionSlots().get(i).setStatusReasonHistory(getSessionStatusHistory(voSession.getSessionSlots().get(i), Status_Reason.SLOTOPENED));
						//wdev-6713
						voSession.getSessionSlots().get(i).setIsActive(true);
					}
					else	//wdev-18911
					{
						if( voSession.getSessionSlots().get(i) != null && voSession.getSessionSlots().get(i).getStatusIsNotNull() && voSession.getSessionSlots().get(i).getStatus().equals(Status_Reason.CANCELLED))
						{
							voSession.getSessionSlots().get(i).setStatus(Status_Reason.SLOTOPENED);
							voSession.getSessionSlots().get(i).setAppointment(null);
							voSession.getSessionSlots().get(i).setIsActive(true);
						}
											
					}
				}				
			}
		}
			
		String[] arrErrors = voSession.validate();
		
		if(arrErrors != null)
		{
			engine.showErrors(arrErrors);
			return;
		}
		
		try 
		{
			domain.saveSession(voSession, false);
		} 
		catch (StaleObjectException e) 
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
		}
		
		open();
	}
	
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException 
	{
		if(formName.equals(form.getForms().Scheduling.CancelAppointmentDialog))
		{
			if(result.equals(DialogResult.OK))
			{
				//WDEV-18466
				SessionVo domainSession = domain.getSession((SessionShortVo) form.treSessions().getValue());
				
				if (isAppInSession(domainSession))
				{
					form.getLocalContext().setCancelAppConfirmationMessageBoxID(engine.showMessage("There are appointments already booked for this Session. These appointments will be cancelled. Do you wish to continue?", "Confirmation message", MessageButtons.YESNO, MessageIcon.QUESTION, MessageDefaultButton.BUTTON1));//WDEV-18528
				}
				else
				{
					if(!cancelSession(false))
		    			return;
		    		else
		    			open();
				}
				
				
			}
		}
		else if(formName.equals(form.getForms().Scheduling.BookingSlotStatus))
		{
			if(result.equals(DialogResult.OK))
			{
				if(form.getGlobalContext().ChooseAndBook.getisCancelSlotAndApptAvailableIsNotNull())
				{
					if(form.getGlobalContext().ChooseAndBook.getisCancelSlotAndApptAvailable().booleanValue())
						updateSessionStatus((SessionShortVo)form.treSessions().getSelectedNode().getValue(), Session_Status_and_Reason.BLOCKED);
					else
						updateSessionStatus((SessionShortVo)form.treSessions().getSelectedNode().getValue(), Session_Status_and_Reason.CANCELLED);
				}
				open();
			}
		}
		else if(formName.equals(form.getForms().Scheduling.MoveSessionDialog)) //WDEV-12918
		{
			if(result.equals(DialogResult.OK))
			{
				open();
			}
		}
		else if(formName.equals(form.getForms().Scheduling.ReasonTextDialog) && DialogResult.OK.equals(result))
		{
			updateSessionStatus((SessionShortVo)form.treSessions().getSelectedNode().getValue(), Session_Status_and_Reason.BLOCKED);
		}
	}
	
	//WDEV-18466
	private boolean isAppInSession(SessionVo session)
	{
		if (session==null || (session.getSessionSlots()==null && session.getTheatreSlots()==null))
			return false;
			
		for (int i=0;i<session.getSessionSlots().size();i++)
		{
			if (session.getSessionSlots().get(i).getAppointmentIsNotNull())
				return true;
		}
		
		for (int i=0;i<session.getTheatreSlots().size();i++)
		{
			if (session.getTheatreSlots().get(i).getAppointmentIsNotNull())
				return true;
		}
		return false;
	}

	private boolean cancelSession(Boolean cancelAppointment) //WDEV-18466
	{		
		if(form.getGlobalContext().Scheduling.getApptCancelStatusIsNotNull())
		{
			SessionShortVo voSession = (SessionShortVo) form.treSessions().getValue();
			SessionVo domainSession = domain.getSession(voSession);
			//WDEV-19046
			boolean isFlexibleSession = !Boolean.TRUE.equals(domainSession.getIsFixed()) && (domainSession.getSessionSlots() == null || domainSession.getSessionSlots().size() == 0);
			
			//WDEV-17964
			if (voSession.getVersion_Sch_Session() !=  domainSession.getVersion_Sch_Session())
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return false;
			}
			
			try 
			{
				domain.cancelSession(voSession, form.getGlobalContext().Scheduling.getApptCancelStatus(),cancelAppointment, isFlexibleSession);//WDEV-18466 //WDEV-19046
			}
			catch (StaleObjectException e) 
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				return false;
			}
			catch (DomainInterfaceException e)
			{
				engine.showMessage(e.getMessage());
				return false;
			}		
		}
		
		return true;
	}
	
	
	/**
	 * @param status
	 * @param appointment
	 * @return
	 */
	private Appointment_StatusVoCollection getApptStatusHistory(SessionSlotVo voSessionSlot, Status_Reason status, Appointment_StatusVo voApptStatus) 
	{
		voApptStatus.setApptDate(voSessionSlot.getAppointment().getAppointmentDate());
		voApptStatus.setApptTime(voSessionSlot.getStartTm());
		voApptStatus.setStatus(status);
		voApptStatus.setStatusReason(form.getGlobalContext().ChooseAndBook.getSessionSlotStatusReason());
		
		//TODO
		voApptStatus.setDoS(/*get Directory of service record from slot by booking ubrn*/null);
		voApptStatus.setPriority(voSessionSlot.getPriority());
		
		Appointment_StatusVoCollection voCollApptStatusHistory = voSessionSlot.getAppointment().getApptStatusHistory();
		if(voCollApptStatusHistory == null)
			voCollApptStatusHistory = new Appointment_StatusVoCollection();
		
		voCollApptStatusHistory.add(voApptStatus);

		return voCollApptStatusHistory;
	}

	/**
	 * @param voSessionSlot
	 * @param status 
	 * @return
	 */
	private SessionSlotStatusVoCollection getSessionStatusHistory(SessionSlotVo voSessionSlot, Status_Reason status) 
	{
		SessionSlotStatusVoCollection voCollStatusHistory = voSessionSlot.getStatusReasonHistory();
		
		if(voCollStatusHistory == null)
			voCollStatusHistory = new SessionSlotStatusVoCollection();
		
		SessionSlotStatusVo voSlotStatus = new SessionSlotStatusVo();
		voSlotStatus.setDateTime(new DateTime());
		//TODO
		//voSlotStatus.setUBRN(voSessionSlot.getUBRN());
		voSlotStatus.setStatus(status);
		voSlotStatus.setStatusReason(form.getGlobalContext().ChooseAndBook.getSessionSlotStatusReason());
		voCollStatusHistory.add(voSlotStatus);
		
		return voCollStatusHistory;
	}

	//WDEV-15190
	@Override
	protected void onQmbProfileTextSubmited(String value) throws PresentationLogicException
	{
		populateProfiles(value);
	}

	//WDEV-15190
	private void populateProfiles(String value)
	{
		form.qmbProfile().clear();
		
		if(value == null || value.length() == 0)
			return;
		
		ProfileLiteVoCollection profiles = domain.listProfile(value);
		
		if(profiles == null || profiles.size() == 0)
			return;
		
		for(ProfileLiteVo profile : profiles)
		{
			if(profile == null)
				continue;
			
			form.qmbProfile().newRow(profile, profile.getName());
		}
		
		if(profiles.size() == 1)
		{
			form.qmbProfile().setValue(profiles.get(0));
		}
		else
		{
			form.qmbProfile().showOpened();
		}
	}

	//WDEV-15190
	@Override
	protected void onQmbDoServiceTextSubmited(String value) throws PresentationLogicException
	{
		populateDos(value);
	}

	//WDEV-15190
	private void populateDos(String value)
	{
		form.qmbDoService().clear();
		
		if(value == null || value.length() == 0)
			return;
		
		DirectoryOfServiceLiteVoCollection doss = domain.listDos(value);
		
		if(doss == null || doss.size() == 0)
			return;
		
		for(DirectoryOfServiceLiteVo dos : doss)
		{
			if(dos == null)
				continue;
			
			form.qmbDoService().newRow(dos, dos.getDoSName());
		}
		
		if(doss.size() == 1)
		{
			form.qmbDoService().setValue(doss.get(0));
		}
		else
		{
			form.qmbDoService().showOpened();
		}
	}

	@Override //WDEV-18466
	protected void onMessageBoxClosed(int messageBoxId, DialogResult result) throws PresentationLogicException
	{
		if (form.getLocalContext().getCancelAppConfirmationMessageBoxIDIsNotNull() && form.getLocalContext().getCancelAppConfirmationMessageBoxID().equals(messageBoxId))
		{
			//WDEV-18528
    		if (DialogResult.YES.equals(result))
    		{
    			if(!cancelSession(true))
	    			return;
	    		else
	    			open();
    		}
    		else
    			open();
    		
		
		}
	}	
}
