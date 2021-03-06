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

package ims.RefMan.forms.referralcoding;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindgrdCodingColLateralityLookup();
	abstract protected void bindgrdOutpatientCodingColLateralityLookup();
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnViewPatCodingRecordsClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyrTabsTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onGrdProceduresSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdCodingGridButtonClicked(int column, GenForm.lyrTabsLayer.tabInpatientCodingContainer.grdCodingRow row) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdCodingSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnPreviousDiagnosisClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdDiagnosesSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbPasEventsValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdInvSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdProcSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdOutpatientCodingGridButtonClicked(int column, GenForm.lyrTabsLayer.tabOutpatientCodingContainer.grdOutpatientCodingRow row) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdOutpatientCodingSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdDiagSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbAppointmentsValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCloseClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen(args);
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.btnViewPatCodingRecords().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnViewPatCodingRecordsClick();
			}
		});
		this.form.btnEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditClick();
			}
		});
		this.form.lyrTabs().tabInpatientCoding().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrTabstabInpatientCodingActivated();
			}
		});
		this.form.lyrTabs().tabOutpatientCoding().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrTabstabOutpatientCodingActivated();
			}
		});
		this.form.lyrTabs().tabInpatientCoding().grdProcedures().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdProceduresSelectionChanged();
			}
		});
		this.form.lyrTabs().tabInpatientCoding().grdCoding().setGridButtonClickedEvent(new GridButtonClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdCodingGridButtonClicked(column, new GenForm.lyrTabsLayer.tabInpatientCodingContainer.grdCodingRow(row));
			}
		});
		this.form.lyrTabs().tabInpatientCoding().grdCoding().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdCodingSelectionChanged();
			}
		});
		this.form.lyrTabs().tabInpatientCoding().btnPreviousDiagnosis().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnPreviousDiagnosisClick();
			}
		});
		this.form.lyrTabs().tabInpatientCoding().grdDiagnoses().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdDiagnosesSelectionChanged();
			}
		});
		this.form.lyrTabs().tabInpatientCoding().cmbPasEvents().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbPasEventsValueChanged();
			}
		});
		this.form.lyrTabs().tabOutpatientCoding().grdInv().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdInvSelectionChanged();
			}
		});
		this.form.lyrTabs().tabOutpatientCoding().grdProc().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdProcSelectionChanged();
			}
		});
		this.form.lyrTabs().tabOutpatientCoding().grdOutpatientCoding().setGridButtonClickedEvent(new GridButtonClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdOutpatientCodingGridButtonClicked(column, new GenForm.lyrTabsLayer.tabOutpatientCodingContainer.grdOutpatientCodingRow(row));
			}
		});
		this.form.lyrTabs().tabOutpatientCoding().grdOutpatientCoding().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdOutpatientCodingSelectionChanged();
			}
		});
		this.form.lyrTabs().tabOutpatientCoding().grdDiag().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdDiagSelectionChanged();
			}
		});
		this.form.lyrTabs().tabOutpatientCoding().cmbAppointments().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbAppointmentsValueChanged();
			}
		});
		this.form.btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.btnClose().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCloseClick();
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.getContextMenus().RefMan.getReferralCodingProcedureMenuADD_CODINGItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ReferralCodingProcedureMenu.ADD_CODING, sender);
			}
		});
		this.form.getContextMenus().RefMan.getReferralCodingProcedureMenuNEW_SFSItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ReferralCodingProcedureMenu.NEW_SFS, sender);
			}
		});
		this.form.getContextMenus().RefMan.getReferralCodingMOVE_UPItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ReferralCoding.MOVE_UP, sender);
			}
		});
		this.form.getContextMenus().RefMan.getReferralCodingMOVE_DOWNItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ReferralCoding.MOVE_DOWN, sender);
			}
		});
		this.form.getContextMenus().RefMan.getReferralCodingADD_OPCSItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ReferralCoding.ADD_OPCS, sender);
			}
		});
		this.form.getContextMenus().RefMan.getReferralCodingADD_ICD10Item().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ReferralCoding.ADD_ICD10, sender);
			}
		});
		this.form.getContextMenus().RefMan.getReferralCodingREMOVEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ReferralCoding.REMOVE, sender);
			}
		});
		this.form.getContextMenus().getLIPNewItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.LIP.New, sender);
			}
		});
		this.form.getContextMenus().getLIPUpdateItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.LIP.Update, sender);
			}
		});
		this.form.getContextMenus().RefMan.getReferralCodingInvestigationMenuADD_CODINGItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ReferralCodingInvestigationMenu.ADD_CODING, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindgrdCodingColLateralityLookup();
		bindgrdOutpatientCodingColLateralityLookup();
	}
	protected void rebindAllLookups()
	{
		bindgrdCodingColLateralityLookup();
		bindgrdOutpatientCodingColLateralityLookup();
	}
	protected void defaultAllLookupValues()
	{
	}
	private void onlyrTabstabInpatientCodingActivated()
	{
		this.form.lyrTabs().showtabInpatientCoding();
		onlyrTabsTabChanged(this.form.lyrTabs().tabInpatientCoding());
	}
	private void onlyrTabstabOutpatientCodingActivated()
	{
		this.form.lyrTabs().showtabOutpatientCoding();
		onlyrTabsTabChanged(this.form.lyrTabs().tabOutpatientCoding());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
