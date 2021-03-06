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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class PDSBackOfficeType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public PDSBackOfficeType()
	{
		super();
	}
	public PDSBackOfficeType(int id)
	{
		super(id, "", true);
	}
	public PDSBackOfficeType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public PDSBackOfficeType(int id, String text, boolean active, PDSBackOfficeType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public PDSBackOfficeType(int id, String text, boolean active, PDSBackOfficeType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public PDSBackOfficeType(int id, String text, boolean active, PDSBackOfficeType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static PDSBackOfficeType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new PDSBackOfficeType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (PDSBackOfficeType)super.getParentInstance();
	}
	public PDSBackOfficeType getParent()
	{
		return (PDSBackOfficeType)super.getParentInstance();
	}
	public void setParent(PDSBackOfficeType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		PDSBackOfficeType[] typedChildren = new PDSBackOfficeType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (PDSBackOfficeType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof PDSBackOfficeType)
		{
			super.addChild((PDSBackOfficeType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof PDSBackOfficeType)
		{
			super.removeChild((PDSBackOfficeType)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		PDSBackOfficeTypeCollection result = new PDSBackOfficeTypeCollection();
		result.add(DUPLICATE);
		result.add(CONNECTIONERROR);
		result.add(PATIENTMERGE);
		result.add(GENDER);
		result.add(DEATH);
		result.add(REMOVAL);
		result.add(GENERAL);
		result.add(CONFUSION_NORMAL);
		result.add(CONFUSION_URGENT);
		result.add(GPPRACERROR);
		result.add(DEFERREDSYNC);
		result.add(PDSSYNCFAILED);
		result.add(PDS_SYNC_REQUIRED);
		result.add(PATIENT_PDS_REL_SYN);
		result.add(DECOUPLED);
		return result;
	}
	public static PDSBackOfficeType[] getNegativeInstances()
	{
		PDSBackOfficeType[] instances = new PDSBackOfficeType[15];
		instances[0] = DUPLICATE;
		instances[1] = CONNECTIONERROR;
		instances[2] = PATIENTMERGE;
		instances[3] = GENDER;
		instances[4] = DEATH;
		instances[5] = REMOVAL;
		instances[6] = GENERAL;
		instances[7] = CONFUSION_NORMAL;
		instances[8] = CONFUSION_URGENT;
		instances[9] = GPPRACERROR;
		instances[10] = DEFERREDSYNC;
		instances[11] = PDSSYNCFAILED;
		instances[12] = PDS_SYNC_REQUIRED;
		instances[13] = PATIENT_PDS_REL_SYN;
		instances[14] = DECOUPLED;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[15];
		negativeInstances[0] = "DUPLICATE";
		negativeInstances[1] = "CONNECTIONERROR";
		negativeInstances[2] = "PATIENTMERGE";
		negativeInstances[3] = "GENDER";
		negativeInstances[4] = "DEATH";
		negativeInstances[5] = "REMOVAL";
		negativeInstances[6] = "GENERAL";
		negativeInstances[7] = "CONFUSION_NORMAL";
		negativeInstances[8] = "CONFUSION_URGENT";
		negativeInstances[9] = "GPPRACERROR";
		negativeInstances[10] = "DEFERREDSYNC";
		negativeInstances[11] = "PDSSYNCFAILED";
		negativeInstances[12] = "PDS_SYNC_REQUIRED";
		negativeInstances[13] = "PATIENT_PDS_REL_SYN";
		negativeInstances[14] = "DECOUPLED";
		return negativeInstances;
	}
	public static PDSBackOfficeType getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static PDSBackOfficeType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		PDSBackOfficeType[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1021340;
	public static final PDSBackOfficeType DUPLICATE = new PDSBackOfficeType(-3057, "Duplicate", true, null, null, Color.Default);
	public static final PDSBackOfficeType CONNECTIONERROR = new PDSBackOfficeType(-3058, "Connection Error", true, null, null, Color.Default);
	public static final PDSBackOfficeType PATIENTMERGE = new PDSBackOfficeType(-3059, "Patient Merge", true, null, null, Color.Default);
	public static final PDSBackOfficeType GENDER = new PDSBackOfficeType(-3060, "Gender", true, null, null, Color.Default);
	public static final PDSBackOfficeType DEATH = new PDSBackOfficeType(-3061, "Death", true, null, null, Color.Default);
	public static final PDSBackOfficeType REMOVAL = new PDSBackOfficeType(-3062, "Removal", true, null, null, Color.Default);
	public static final PDSBackOfficeType GENERAL = new PDSBackOfficeType(-3063, "General", true, null, null, Color.Default);
	public static final PDSBackOfficeType CONFUSION_NORMAL = new PDSBackOfficeType(-3070, "Confusion Normal", true, null, null, Color.Default);
	public static final PDSBackOfficeType CONFUSION_URGENT = new PDSBackOfficeType(-3071, "Confusion Urgent", true, null, null, Color.Default);
	public static final PDSBackOfficeType GPPRACERROR = new PDSBackOfficeType(-3294, "GP or Practice Error", true, null, null, Color.Default);
	public static final PDSBackOfficeType DEFERREDSYNC = new PDSBackOfficeType(-3300, "Deferred Synchronisation", true, null, null, Color.Default);
	public static final PDSBackOfficeType PDSSYNCFAILED = new PDSBackOfficeType(-3301, "PDS Sync Failed", true, null, null, Color.Default);
	public static final PDSBackOfficeType PDS_SYNC_REQUIRED = new PDSBackOfficeType(-3308, "PDS Synchronization Required", true, null, null, Color.Default);
	public static final PDSBackOfficeType PATIENT_PDS_REL_SYN = new PDSBackOfficeType(-3331, "PDS Relatives Synchronization", true, null, null, Color.Default);
	public static final PDSBackOfficeType DECOUPLED = new PDSBackOfficeType(-3367, "Decoupled", true, null, null, Color.Default);
}
