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

package ims.core.forms.patientcasenotes;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbFolderLookup();
	abstract protected void defaultcmbFolderLookupValue();
	abstract protected void bindcmbTypeReqLookup();
	abstract protected void defaultcmbTypeReqLookupValue();
	abstract protected void bindcmbReasonReqLookup();
	abstract protected void defaultcmbReasonReqLookupValue();
	abstract protected void bindcmbVolTypeLookup();
	abstract protected void defaultcmbVolTypeLookupValue();
	abstract protected void bindcmbVolStatusLookup();
	abstract protected void defaultcmbVolStatusLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onMessageBoxClosed(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnViewAllRequestsClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnAddCommentClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCreateCaseNoteFolderClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelRequestClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnRequiresMergingClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnMarkAsMissingClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnMarkAsFoundClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnVolumeNewTemporaryClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnScanVolumeClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbFolderValueSet(Object value);
	abstract protected void onCcCaseNoteFolderValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcCaseNoteRequestValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbTypeReqValueSet(Object value);
	abstract protected void onBtnViewCommentsClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCompleteRequestClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnTransferClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkCurrentOnlyValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbReasonReqValueSet(Object value);
	abstract protected void onBtnEditRequestClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewRequestClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveReqClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnVolumeDestroyClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnVolumeArchiveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnVolumeMergeClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbVolTypeValueSet(Object value);
	abstract protected void oncmbVolStatusValueSet(Object value);
	abstract protected void onQmbVolCurrentLocationTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnViewTransfersClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnVolumeCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnVolumeSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnVolumeEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnVolumeNewClick() throws ims.framework.exceptions.PresentationLogicException;

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
		this.form.setMessageBoxClosedEvent(new MessageBoxClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onMessageBoxClosed(messageBoxId, result);
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
		this.form.btnViewAllRequests().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnViewAllRequestsClick();
			}
		});
		this.form.btnAddComment().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnAddCommentClick();
			}
		});
		this.form.btnCreateCaseNoteFolder().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCreateCaseNoteFolderClick();
			}
		});
		this.form.btnCancelRequest().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelRequestClick();
			}
		});
		this.form.btnRequiresMerging().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnRequiresMergingClick();
			}
		});
		this.form.btnMarkAsMissing().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnMarkAsMissingClick();
			}
		});
		this.form.btnMarkAsFound().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnMarkAsFoundClick();
			}
		});
		this.form.btnVolumeNewTemporary().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnVolumeNewTemporaryClick();
			}
		});
		this.form.btnScanVolume().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnScanVolumeClick();
			}
		});
		this.form.cmbFolder().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbFolderValueSet(value);
			}
		});
		this.form.setccCaseNoteFolderValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcCaseNoteFolderValueChanged();
			}
		});
		this.form.setccCaseNoteRequestValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcCaseNoteRequestValueChanged();
			}
		});
		this.form.cmbTypeReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbTypeReqValueSet(value);
			}
		});
		this.form.btnViewComments().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnViewCommentsClick();
			}
		});
		this.form.btnCompleteRequest().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCompleteRequestClick();
			}
		});
		this.form.btnTransfer().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnTransferClick();
			}
		});
		this.form.chkCurrentOnly().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkCurrentOnlyValueChanged();
			}
		});
		this.form.cmbReasonReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbReasonReqValueSet(value);
			}
		});
		this.form.btnEditRequest().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditRequestClick();
			}
		});
		this.form.btnNewRequest().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewRequestClick();
			}
		});
		this.form.btnSaveReq().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveReqClick();
			}
		});
		this.form.btnVolumeDestroy().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnVolumeDestroyClick();
			}
		});
		this.form.btnVolumeArchive().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnVolumeArchiveClick();
			}
		});
		this.form.btnVolumeMerge().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnVolumeMergeClick();
			}
		});
		this.form.cmbVolType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbVolTypeValueSet(value);
			}
		});
		this.form.cmbVolStatus().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbVolStatusValueSet(value);
			}
		});
		this.form.qmbVolCurrentLocation().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbVolCurrentLocationTextSubmited(value);
			}
		});
		this.form.btnViewTransfers().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnViewTransfersClick();
			}
		});
		this.form.btnVolumeCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnVolumeCancelClick();
			}
		});
		this.form.btnVolumeSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnVolumeSaveClick();
			}
		});
		this.form.btnVolumeEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnVolumeEditClick();
			}
		});
		this.form.btnVolumeNewPermanent().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnVolumeNewClick();
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbFolderLookup();
		bindcmbTypeReqLookup();
		bindcmbReasonReqLookup();
		bindcmbVolTypeLookup();
		bindcmbVolStatusLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbFolderLookup();
		bindcmbTypeReqLookup();
		bindcmbReasonReqLookup();
		bindcmbVolTypeLookup();
		bindcmbVolStatusLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbFolderLookupValue();
		defaultcmbTypeReqLookupValue();
		defaultcmbReasonReqLookupValue();
		defaultcmbVolTypeLookupValue();
		defaultcmbVolStatusLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}