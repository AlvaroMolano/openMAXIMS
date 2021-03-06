// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.icpactions;

public final class FormInfo extends ims.framework.FormInfo
{
	private static final long serialVersionUID = 1L;
	public FormInfo(Integer formId)
	{
		super(formId);
	}
	public String getNamespaceName()
	{
		return "RefMan";
	}
	public String getFormName()
	{
		return "ICPActions";
	}
	public int getWidth()
	{
		return 848;
	}
	public int getHeight()
	{
		return 632;
	}
	public String[] getContextVariables()
	{
		return new String[] {  };
	}
	public String getLocalVariablesPrefix()
	{
		return "_lv_RefMan.ICPActions.__internal_x_context__" + String.valueOf(getFormId());
	}
	public ims.framework.FormInfo[] getComponentsFormInfo()
	{
		ims.framework.FormInfo[] componentsInfo = new ims.framework.FormInfo[3];
		componentsInfo[0] = new ims.core.forms.demographicscomponent.FormInfo(134124);
		componentsInfo[1] = new ims.RefMan.forms.nursingnotescomponent.FormInfo(134205);
		componentsInfo[2] = new ims.RefMan.forms.investigationscomponent.FormInfo(134121);
		return componentsInfo;
	}
	public String getImagePath()
	{
		return "Images/RefMan/icp_actions_48.png";
	}
}
