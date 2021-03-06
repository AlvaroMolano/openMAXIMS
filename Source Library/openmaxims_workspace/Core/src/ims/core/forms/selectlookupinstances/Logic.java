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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.53 build 2592.27837)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.core.forms.selectlookupinstances;

import ims.RefMan.vo.lookups.ReferralUrgency;
import ims.RefMan.vo.lookups.ReferralUrgencyCollection;
import ims.clinical.vo.lookups.StructuredCodingComment;
import ims.clinical.vo.lookups.StructuredCodingCommentCollection;
import ims.domain.lookups.LookupService;
import ims.framework.cn.data.TreeNode;
import ims.framework.controls.TreeNodeCollection;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.ocrr.vo.lookups.LookupHelper;
import ims.ocrr.vo.lookups.SpecimenSite;
import ims.ocrr.vo.lookups.SpecimenSiteCollection;
import ims.scheduling.vo.lookups.ProfileListType;
import ims.scheduling.vo.lookups.ProfileListTypeCollection;
import ims.vo.LookupInstVo;
import ims.vo.LookupInstanceCollection;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{		
		open();
	}
	
	private void open()
	{
		LookupInstanceCollection collSelected = form.getGlobalContext().Core.getSelectedLookupInstances();
		loadTree(collSelected);
	}
	
	private void loadTree(LookupInstanceCollection collSelected)
	{
		ims.framework.cn.data.TreeNode[] nodes = null;
		LookupService lookupService = domain.getLookupService();
		if(form.getGlobalContext().Core.getSelectLookupType().getId() == SpecimenSite.TYPE_ID)
		{
			SpecimenSiteCollection collSites = LookupHelper.getSpecimenSite(lookupService);
			nodes = collSites.getRootNodes();
		}
		else if (form.getGlobalContext().Core.getSelectLookupType().getId() == StructuredCodingComment.TYPE_ID)
		{
			engine.setCaption("Select Comments");
			StructuredCodingCommentCollection collComments = ims.clinical.vo.lookups.LookupHelper.getStructuredCodingComment(lookupService);
			nodes = collComments.getRootNodes();
		}
		else if (form.getGlobalContext().Core.getSelectLookupType().getId() == ReferralUrgency.TYPE_ID)
		{
			engine.setCaption("Select Referral Urgencies");
			ReferralUrgencyCollection collUrgencies = ims.RefMan.vo.lookups.LookupHelper.getReferralUrgency(lookupService);
			nodes = collUrgencies.getRootNodes();
		}
		else if (form.getGlobalContext().Core.getSelectLookupType().getId() == ProfileListType.TYPE_ID)
		{
			engine.setCaption("Select List Type(s)");
			ProfileListTypeCollection collListTypes = ims.scheduling.vo.lookups.LookupHelper.getProfileListType(lookupService);
			nodes = collListTypes.getRootNodes();
		}
		populateTree(nodes, null, collSelected);
		form.chkSelectAll().setValue(allNodesChecked());
	}
	
	private void populateTree(TreeNode[] collAvailable, ims.framework.controls.TreeNode parentNode, LookupInstanceCollection collSelected)
	{
		if (collAvailable == null)
			return;

		for (int i = 0; i < collAvailable.length; i++)
		{
			LookupInstVo instance = (LookupInstVo) collAvailable[i];
			
			ims.framework.controls.TreeNode itemNode = null;
			if (parentNode == null)
				itemNode = form.treInstances().getNodes().add(instance, instance.getText());
			else
				itemNode = parentNode.getNodes().add(instance, instance.getText());
			
			if(collSelected != null && collSelected.indexOf(instance) > -1)
			{
				itemNode.setChecked(true);
				if(itemNode.getParent() != null)
					itemNode.getParent().setChecked(true);
			}
				
		
			populateTree(collAvailable[i].getChildren(), itemNode, collSelected);
		}
	}

	protected void onBtnOkClick() throws ims.framework.exceptions.PresentationLogicException
	{
		LookupInstanceCollection lookupTypeToRetrieve = new LookupInstanceCollection();
		
		if (form.getGlobalContext().Core.getSelectLookupType().getId() == SpecimenSite.TYPE_ID)
		{
			lookupTypeToRetrieve = new SpecimenSiteCollection();
		}
		else if (form.getGlobalContext().Core.getSelectLookupType().getId() == StructuredCodingComment.TYPE_ID)
		{
			lookupTypeToRetrieve = new StructuredCodingCommentCollection();
		}
		else if (form.getGlobalContext().Core.getSelectLookupType().getId() == ReferralUrgency.TYPE_ID)
		{
			lookupTypeToRetrieve = new ReferralUrgencyCollection();
		}
		else if (form.getGlobalContext().Core.getSelectLookupType().getId() == ProfileListType.TYPE_ID)
		{
			lookupTypeToRetrieve = new ProfileListTypeCollection();
		}	
		form.getGlobalContext().Core.setSelectedLookupInstances(retrieveSelection(form.treInstances().getNodes(), lookupTypeToRetrieve));
		engine.close(DialogResult.OK);
	}
	
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	private LookupInstanceCollection retrieveSelection(TreeNodeCollection collection, LookupInstanceCollection collSelected)
	{			
		for(int i=0;i<collection.size();i++)
		{
			ims.framework.controls.TreeNode node = collection.get(i);
			if(node.isChecked() && (node.getNodes() == null || node.getNodes().size() == 0))
				collSelected.add((LookupInstVo) node.getValue());
			
			retrieveSelection(node.getNodes(), collSelected);
		}
		
		return collSelected;
	}

	protected void onTreInstancesTreeViewCheck(ims.framework.controls.TreeNode node) throws PresentationLogicException
	{		
		if (form.getGlobalContext().Core.getSelectLookupType().getId() == SpecimenSite.TYPE_ID)
		{	
			if (node.getNodes() != null)
			{	
				for(int i=0;i<node.getNodes().size();i++)
				{
					node.getNodes().get(i).setChecked(node.isChecked());				
				}		
			}
		}
		form.chkSelectAll().setValue(form.chkSelectAll().getValue() && !node.isChecked() ? false : node.isChecked() && allNodesChecked());
	}
	
	private boolean allNodesChecked()
	{
		TreeNodeCollection allNodes = form.treInstances().getNodes();

		for (int i=0;i<allNodes.size();i++)
		{	
			if (!allNodes.get(i).isChecked())
				return false;
		}	
		return true;
	}

	protected void onChkSelectAllValueChanged()	throws PresentationLogicException
	{
		if (form.chkSelectAll().getValue())
		{	
			TreeNodeCollection nodes = form.treInstances().getNodes();
			for (int i=0; i<nodes.size();i++)
			{
				ims.framework.controls.TreeNode node = nodes.get(i);
				node.setChecked(true);
			}
		}
	}
}
