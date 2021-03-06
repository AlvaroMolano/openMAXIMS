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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.60 build 2888.18539)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.admin.forms.dictionaryconfig;

import ims.admin.forms.dictionaryconfig.GenForm.lyr1Layer.tabWordsContainer.lyr2Layer.tabManagementContainer.GroupCriteriaEnumeration;
import ims.admin.vo.AppUserShortVo;
import ims.admin.vo.AppUserShortVoCollection;
import ims.admin.vo.AppUserVo;
import ims.admin.vo.GlobalDictionaryVoCollection;
import ims.admin.vo.UserDictionaryVo;
import ims.admin.vo.UserDictionaryVoCollection;
import ims.core.vo.HcpLiteVo;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	public static final String	COLNAME				= "-1";
	public static final String	COLSELECTED			= "-2";
	public static final Integer	USER				= -3;
	public static final Integer	GLOBAL				= -4;
	
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		checkForDefaultDictionary();		
	}
	
	private void checkForDefaultDictionary()
	{		
		AppUserVo appuser = new AppUserVo();
		AppUserShortVo currentUser = new AppUserShortVo();
		HcpLiteVo hcpUser = (HcpLiteVo)domain.getHcpLiteUser();		
		if (hcpUser != null)
		{
			appuser.setUsername(hcpUser.getIHcpName());
			AppUserShortVoCollection coll = domain.listAppUsers(appuser);
			if(coll != null &&
					coll.size() > 0)
			{
				currentUser = coll.get(0);
				
				UserDictionaryVoCollection dictionaryColl = domain.listUserDictionary(currentUser);
				UserDictionaryVo dictionary = null;
				if (dictionaryColl != null &&
						dictionaryColl.size() > 0)
				{
					dictionary = dictionaryColl.get(0);
					
					GlobalDictionaryVoCollection globalsColl = domain.listGlobalDictionary(currentUser);			
					renderDictionaryDynamicGrid(dictionary,globalsColl);
				}
			}
		}				
		else
		{
			engine.showMessage("Current loggin user don't have setup an user dictionary\nDo you want to setup an User Dictionary now?","Confirmation", MessageButtons.YESNO, MessageIcon.QUESTION);
		}
	}
	@Override
	protected void onBtnClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
			// TODO Add your code here.	
	}
	
	@Override
	protected void onBtnSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		doSearch();
	}
	
	
	private void doSearch()
	{
		String name = form.lyr1().tabWords().lyr2().tabManagement().txtSearch().getValue();
		
		name = name.trim();
		if (name == null || name.trim().length() == 0)
		{
			engine.showMessage("Please enter a word!");
			form.lyr1().tabWords().lyr2().tabManagement().txtSearch().setFocus();
			return;
		}
		
		if (name != null)
		{
			GroupCriteriaEnumeration groupCriteria = form.lyr1().tabWords().lyr2().tabManagement().GroupCriteria().getValue();
			if (groupCriteria.equals(GroupCriteriaEnumeration.rdoBegin))
			{
				name = name + "%";
			}
			else if (groupCriteria.equals(GroupCriteriaEnumeration.rdoContains))
			{
				name = "%" + name + "%";
			}
		}
		
			
		
	/*	GraphicAssessmentShortVoCollection voColl = domain.listAssessments(name, status, getUserDefinedTypes(form.cmbType().getValue()));
		if(voColl == null || voColl.size() == 0)
		{
			engine.showMessage("No Graphic Assessments found for the Search Criteria Provided");
			return;
		}
		displayCollection(voColl);*/
		
	}
	@Override
	protected void onBtnImportClick() throws ims.framework.exceptions.PresentationLogicException
	{  
      /*  String[] words = provider.getWords();*/
        //int size = provider.getWords().length;
       // int b = size /1000;
/*		
        
            try
	        {
	        	domain.importGlobalDictionary(words);
	        }
	        catch (StaleObjectException e) 
	        {
	        	
			}
			catch (UniqueKeyViolationException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	*/		
		    
	      //  engine.showMessage("Added " + size + " into global dictionary!");
	        
	         // words = split(inputBuffer.toString(), "\r\n");

         
	}
	
	private static List<String> split(String input, String delimiter) 
	{
	    StringTokenizer st = new StringTokenizer(input, delimiter);	    
	    int count = st.countTokens();
	    List<String> out = new ArrayList<String>();

	    for (int i = 0; i < count; i++) 
	    {
	      out.add(st.nextToken());
	    }

	    return out;
	}
	
	@Override
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.open(form.getForms().Admin.DictionaryConfigSelectionDialog);
		form.setMode(FormMode.EDIT);
	}
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Add your code here.
	}
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Add your code here.
	}	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.VIEW);
	}
	
	

Date d = new Date();

@Override
protected void onBtnAddClick() throws PresentationLogicException
{
	// TODO Auto-generated method stub
	
}
@Override
protected void onBtnClear2Click() throws PresentationLogicException
{
	// TODO Auto-generated method stub
	
}
@Override
protected void onDynDictionariesRowSelectionChanged(DynamicGridRow row)
{
	// TODO Auto-generated method stub
	
}
@Override
protected void onGrdListSelectionChanged() throws PresentationLogicException
{
	// TODO Auto-generated method stub
	
}

@Override
protected void onMessageBoxClosed(int messageBoxId, DialogResult result) throws PresentationLogicException
{
	if (result.equals(DialogResult.YES))
	{
		setupNewUserDictionary();
	}
}

private void setupNewUserDictionary()
{
	initialiseDictionaryDynamicGrid();
	renderDictionaryDynamicGrid(null, null);
}

private void renderDictionaryDynamicGrid(UserDictionaryVo user, GlobalDictionaryVoCollection globals)
{
	if (user == null)
	{
		
	}
	
	DynamicGrid dynGrid = form.dynDictionaries(); 
	
	DynamicGridRow dynUserTitleRow = dynGrid.getRows().newRow();
	dynUserTitleRow.setSelectable(false);
	DynamicGridCell cellUserDictionaryTitle = dynUserTitleRow.getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	cellUserDictionaryTitle.setValue("<b><bg color=blue><stro	ng><center>User Dictionary</b>");
	
	DynamicGridRow dynUserRow = dynGrid.getRows().newRow();
	dynUserRow.setIdentifier(USER);
	dynUserRow.setReadOnly(false);

	DynamicGridCell cellUserDictionaryName = dynUserRow.getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	populateUserDictionary(cellUserDictionaryName, user);
	
	DynamicGridRow dynGlobalTitleRow = dynGrid.getRows().newRow();
	dynGlobalTitleRow.setSelectable(false);
	DynamicGridCell cellGlobalDictionaryTitle = dynGlobalTitleRow.getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	cellGlobalDictionaryTitle.setValue("<b><strong><center>Avaible Global Dictionaries</b>");
	
	DynamicGridRow dynGlobalRow = dynGrid.getRows().newRow();
	dynGlobalRow.setIdentifier(USER);
	dynGlobalRow.setReadOnly(false);
	
	DynamicGridCell cellGlobalDictionaryName = dynGlobalRow.getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	DynamicGridCell cellGlobalDictionarySelected = dynGlobalRow.getCells().newCell(getColumn(COLSELECTED), DynamicCellType.BOOL);
	cellGlobalDictionaryName.setValue("Global dictionary 1");
	cellGlobalDictionarySelected.setValue(true);
	
	cellGlobalDictionaryName = form.dynDictionaries().getRows().newRow().getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	cellGlobalDictionarySelected = cellGlobalDictionaryName.getRow().getCells().newCell(getColumn(COLSELECTED), DynamicCellType.BOOL);
	cellGlobalDictionaryName.setValue("Global dictionary 2");
	cellGlobalDictionarySelected.setValue(true);
	
	cellGlobalDictionaryName = form.dynDictionaries().getRows().newRow().getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	cellGlobalDictionarySelected = cellGlobalDictionaryName.getRow().getCells().newCell(getColumn(COLSELECTED), DynamicCellType.BOOL);
	cellGlobalDictionaryName.setValue("Global dictionary 3");
	cellGlobalDictionarySelected.setValue(true);
	
	cellGlobalDictionaryName = form.dynDictionaries().getRows().newRow().getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	cellGlobalDictionarySelected = cellGlobalDictionaryName.getRow().getCells().newCell(getColumn(COLSELECTED), DynamicCellType.BOOL);
	cellGlobalDictionaryName.setValue("Global dictionary 4");
	cellGlobalDictionarySelected.setValue(true);	
}

private void populateUserDictionary(DynamicGridCell cellUserDictionaryName, UserDictionaryVo user)
{
	cellUserDictionaryName.setValue("John Smith dictionary");	
}

private void populateGlobalDictionary(DynamicGridCell cellGlobalDictionaryName, GlobalDictionaryVoCollection globals)
{
	cellGlobalDictionaryName.setValue("Global dictionary 1");
	cellGlobalDictionaryName = form.dynDictionaries().getRows().newRow().getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	cellGlobalDictionaryName.setValue("Global dictionary 2");
	cellGlobalDictionaryName = form.dynDictionaries().getRows().newRow().getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	cellGlobalDictionaryName.setValue("Global dictionary 3");
	cellGlobalDictionaryName = form.dynDictionaries().getRows().newRow().getCells().newCell(getColumn(COLNAME), DynamicCellType.HTMLVIEW);
	cellGlobalDictionaryName.setValue("Global dictionary 4");
}


private DynamicGridColumn getColumn(String identifier)
{
	return form.dynDictionaries().getColumns().getByIdentifier(identifier);
}

private void initialiseDictionaryDynamicGrid()
{
	DynamicGrid dynGrid = form.dynDictionaries();
	form.dynDictionaries().clear();
	
	DynamicGridColumn colName = null;
	DynamicGridColumn colSelected = null;
	
	colName = dynGrid.getColumns().newColumn("Dictionary Name", COLNAME);
	colSelected = dynGrid.getColumns().newColumn("Selected", COLSELECTED);
	
	colName.setWidth(300);
	colSelected.setWidth(-1);
}
	
}
