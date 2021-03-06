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

package ims.emergency.forms.supportservices;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbEmergencyLookup();
	abstract protected void defaultcmbEmergencyLookupValue();
	abstract protected void bindcmbRelationshipLookup();
	abstract protected void defaultcmbRelationshipLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyrSupportServicesTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onBtnProfEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnProfNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbHcpNameValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbHcpNameTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelProfessionalClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveProfessionalClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnInactivateProfessionalClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkNoneAtPresentProValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbProfessionServiceValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbHcpSubTypeValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkSupplyHcpValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbLocationHcpValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRadioButtongrpProfFilterValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdProfessionalSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnServEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnServNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelServicesClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveServicesClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnInactivateServiceClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkNoneAtPresentSerValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbServiceValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkSupplyServiceDetailValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbLocationValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRadioButtongrpServiceFilterValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdServicesSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnFamEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnFamNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCopyPAClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnReactivateClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnInactiveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveFamilyClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelFamilyClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbEmergencyValueSet(Object value);
	abstract protected void oncmbRelationshipValueSet(Object value);
	abstract protected void onRadioButtongroupFamilyFilterValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdFamilySelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form)
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
		this.form.lyrSupportServices().tabPageProf().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrSupportServicestabPageProfActivated();
			}
		});
		this.form.lyrSupportServices().tabPageServices().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrSupportServicestabPageServicesActivated();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrSupportServicestabPageFamilyActivated();
			}
		});
		this.form.lyrSupportServices().tabPageProf().btnProfEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnProfEditClick();
			}
		});
		this.form.lyrSupportServices().tabPageProf().btnProfNew().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnProfNewClick();
			}
		});
		this.form.lyrSupportServices().tabPageProf().qmbHcpName().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbHcpNameValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageProf().qmbHcpName().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbHcpNameTextSubmited(value);
			}
		});
		this.form.lyrSupportServices().tabPageProf().btnCancelProfessional().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelProfessionalClick();
			}
		});
		this.form.lyrSupportServices().tabPageProf().btnSaveProfessional().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveProfessionalClick();
			}
		});
		this.form.lyrSupportServices().tabPageProf().btnInactivateProfessional().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnInactivateProfessionalClick();
			}
		});
		this.form.lyrSupportServices().tabPageProf().chkNoneAtPresentPro().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkNoneAtPresentProValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageProf().cmbProfessional().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbProfessionServiceValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageProf().cmbHcpSubType().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbHcpSubTypeValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageProf().chkSupplyHcp().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkSupplyHcpValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageProf().cmbLocationHcp().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbLocationHcpValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageProf().grpProfFilter().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtongrpProfFilterValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageProf().grdProfessional().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdProfessionalSelectionChanged();
			}
		});
		this.form.lyrSupportServices().tabPageServices().btnServEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnServEditClick();
			}
		});
		this.form.lyrSupportServices().tabPageServices().btnServNew().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnServNewClick();
			}
		});
		this.form.lyrSupportServices().tabPageServices().btnCancelServices().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelServicesClick();
			}
		});
		this.form.lyrSupportServices().tabPageServices().btnSaveServices().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveServicesClick();
			}
		});
		this.form.lyrSupportServices().tabPageServices().btnInactivateService().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnInactivateServiceClick();
			}
		});
		this.form.lyrSupportServices().tabPageServices().chkNoneAtPresentSer().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkNoneAtPresentSerValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageServices().cmbService().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbServiceValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageServices().chkSupplyServiceDetail().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkSupplyServiceDetailValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageServices().cmbLocationServices().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbLocationValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageServices().grpServiceFilter().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtongrpServiceFilterValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageServices().grdServices().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdServicesSelectionChanged();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().btnFamEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnFamEditClick();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().btnFamNew().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnFamNewClick();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().btnCopyPA().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCopyPAClick();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().btnReactivate().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnReactivateClick();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().btnInactive().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnInactiveClick();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().btnSaveFamily().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveFamilyClick();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().btnCancelFamily().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelFamilyClick();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().cmbEmergency().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbEmergencyValueSet(value);
			}
		});
		this.form.lyrSupportServices().tabPageFamily().cmbRelationship().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbRelationshipValueSet(value);
			}
		});
		this.form.lyrSupportServices().tabPageFamily().groupFamilyFilter().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtongroupFamilyFilterValueChanged();
			}
		});
		this.form.lyrSupportServices().tabPageFamily().grdFamily().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdFamilySelectionChanged();
			}
		});
		this.form.getContextMenus().Emergency.getSupportNetworkProfessionalADDItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EmergencyNamespace.SupportNetworkProfessional.ADD, sender);
			}
		});
		this.form.getContextMenus().Emergency.getSupportNetworkProfessionalEDITItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EmergencyNamespace.SupportNetworkProfessional.EDIT, sender);
			}
		});
		this.form.getContextMenus().Emergency.getSupportNetworkProfessionalCOPY_ALL_PREVIOUS_PROFItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EmergencyNamespace.SupportNetworkProfessional.COPY_ALL_PREVIOUS_PROF, sender);
			}
		});
		this.form.getContextMenus().Emergency.getSupportNetworkServicesADDItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EmergencyNamespace.SupportNetworkServices.ADD, sender);
			}
		});
		this.form.getContextMenus().Emergency.getSupportNetworkServicesEDITItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EmergencyNamespace.SupportNetworkServices.EDIT, sender);
			}
		});
		this.form.getContextMenus().Emergency.getSupportNetworkServicesCOPY_ALL_PREVIOUS_SERVItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EmergencyNamespace.SupportNetworkServices.COPY_ALL_PREVIOUS_SERV, sender);
			}
		});
		this.form.getContextMenus().getSupportNetworkFamilyGridNewItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.SupportNetworkFamilyGrid.New, sender);
			}
		});
		this.form.getContextMenus().getSupportNetworkFamilyGridUpdateItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.SupportNetworkFamilyGrid.Update, sender);
			}
		});
		this.form.getContextMenus().getSupportNetworkFamilyGridNewFromNextofkinItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.SupportNetworkFamilyGrid.NewFromNextofkin, sender);
			}
		});
		this.form.getContextMenus().getSupportNetworkFamilyGridCOPY_ALL_PREVIOUS_FAMILYItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.SupportNetworkFamilyGrid.COPY_ALL_PREVIOUS_FAMILY, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbEmergencyLookup();
		bindcmbRelationshipLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbEmergencyLookup();
		bindcmbRelationshipLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbEmergencyLookupValue();
		defaultcmbRelationshipLookupValue();
	}
	private void onlyrSupportServicestabPageProfActivated()
	{
		this.form.lyrSupportServices().showtabPageProf();
		onlyrSupportServicesTabChanged(this.form.lyrSupportServices().tabPageProf());
	}
	private void onlyrSupportServicestabPageServicesActivated()
	{
		this.form.lyrSupportServices().showtabPageServices();
		onlyrSupportServicesTabChanged(this.form.lyrSupportServices().tabPageServices());
	}
	private void onlyrSupportServicestabPageFamilyActivated()
	{
		this.form.lyrSupportServices().showtabPageFamily();
		onlyrSupportServicesTabChanged(this.form.lyrSupportServices().tabPageFamily());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIComponentEngine engine;
	protected GenForm form;
}
