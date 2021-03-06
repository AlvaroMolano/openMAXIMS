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

package ims.core.vo.enums;

public final class CaseNoteFolderCcEvent extends ims.framework.utils.Enum
{
	public final static CaseNoteFolderCcEvent SELECTIONCHANGE = new CaseNoteFolderCcEvent(0, "SelectionChange", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent NEWPERMANENT = new CaseNoteFolderCcEvent(1, "New Permanent", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent EDITVOLUME = new CaseNoteFolderCcEvent(2, "Edit Volume", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent MERGE = new CaseNoteFolderCcEvent(3, "Merge", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent ARCHIVE = new CaseNoteFolderCcEvent(4, "Archive", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent DESTROY = new CaseNoteFolderCcEvent(5, "Destroy", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent TRANSFER = new CaseNoteFolderCcEvent(6, "Transfer", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent ADDCOMMENT = new CaseNoteFolderCcEvent(7, "Add Comment", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent PRINT = new CaseNoteFolderCcEvent(8, "Print", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent SCAN = new CaseNoteFolderCcEvent(9, "Scan", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent NEWTEMPORARY = new CaseNoteFolderCcEvent(10, "New Temporary", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent CHANGEFROMTEMPORARYTOPERMANENT = new CaseNoteFolderCcEvent(11, "Change From Temporary To Permanent", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent REQUIRESMERGING = new CaseNoteFolderCcEvent(12, "Requires Merging", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent MARKED_AS_FOUND = new CaseNoteFolderCcEvent(13, "Marked As Found", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent MARK_AS_MISSING = new CaseNoteFolderCcEvent(14, "Mark As Missing", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent CREATECASENOTEFOLDER = new CaseNoteFolderCcEvent(15, "Create Case Note Folder", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent VIEW_TRANSFERS = new CaseNoteFolderCcEvent(16, "View Transfers", null, ims.framework.utils.Color.Default);
	public final static CaseNoteFolderCcEvent VIEW_ALL_COMMENTS = new CaseNoteFolderCcEvent(17, "View All Comments", null, ims.framework.utils.Color.Default);

	private CaseNoteFolderCcEvent(int id, String text, ims.framework.utils.Image image, ims.framework.utils.Color textColor)
	{
		super(id, text, image, textColor);
	}
}
