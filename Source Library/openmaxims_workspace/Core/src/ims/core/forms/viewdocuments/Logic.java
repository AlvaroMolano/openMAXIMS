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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.

package ims.core.forms.viewdocuments;

import ims.core.vo.enums.DocumentViewLevel;
import ims.core.vo.enums.UploadDocumentStoreLevel;
import ims.core.vo.lookups.DocumentCategory;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		FormMode formMode=null;
		DocumentCategory docCategory = null;
		UploadDocumentStoreLevel documentStoreLevel = null;
		DocumentViewLevel documentViewLevel = null;
		
		if (args != null && args.length > 0 && args[0] != null && args[0] instanceof FormMode)
		{
			formMode = (FormMode) args[0];
		}
		
		if (args != null && args.length > 1 && args[1] != null && args[1] instanceof DocumentCategory)
		{
			docCategory = (DocumentCategory) args[1];
		}
		
		if (args != null && args.length > 2 && args[2] != null && args[2] instanceof UploadDocumentStoreLevel)
		{
			documentStoreLevel = (UploadDocumentStoreLevel) args[2];
		}
		
		if (args != null && args.length > 3 && args[3] != null && args[3] instanceof DocumentViewLevel)
		{
			documentViewLevel = (DocumentViewLevel) args[3];
		}
		form.getGlobalContext().RefMan.getCatsReferral();
		form.getLocalContext().setSelectedDocument(null);
		form.ccDocuments().initialize(docCategory, documentStoreLevel, documentViewLevel);
		form.ccDocuments().setMode(formMode);
		 
	}
	@Override
	protected void onBtnCloseClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.OK);
	}
	@Override
	protected void onCcDocumentsValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setSelectedDocument(form.ccDocuments().getSelectedRecord());
	}
}