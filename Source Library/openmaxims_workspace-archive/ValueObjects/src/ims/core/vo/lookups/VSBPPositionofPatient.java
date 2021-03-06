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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class VSBPPositionofPatient extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public VSBPPositionofPatient()
	{
		super();
	}
	public VSBPPositionofPatient(int id)
	{
		super(id, "", true);
	}
	public VSBPPositionofPatient(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public VSBPPositionofPatient(int id, String text, boolean active, VSBPPositionofPatient parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public VSBPPositionofPatient(int id, String text, boolean active, VSBPPositionofPatient parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public VSBPPositionofPatient(int id, String text, boolean active, VSBPPositionofPatient parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static VSBPPositionofPatient buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new VSBPPositionofPatient(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (VSBPPositionofPatient)super.getParentInstance();
	}
	public VSBPPositionofPatient getParent()
	{
		return (VSBPPositionofPatient)super.getParentInstance();
	}
	public void setParent(VSBPPositionofPatient parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		VSBPPositionofPatient[] typedChildren = new VSBPPositionofPatient[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (VSBPPositionofPatient)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof VSBPPositionofPatient)
		{
			super.addChild((VSBPPositionofPatient)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof VSBPPositionofPatient)
		{
			super.removeChild((VSBPPositionofPatient)child);
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
		VSBPPositionofPatientCollection result = new VSBPPositionofPatientCollection();
		result.add(SITTING);
		result.add(STANDING);
		return result;
	}
	public static VSBPPositionofPatient[] getNegativeInstances()
	{
		VSBPPositionofPatient[] instances = new VSBPPositionofPatient[2];
		instances[0] = SITTING;
		instances[1] = STANDING;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "SITTING";
		negativeInstances[1] = "STANDING";
		return negativeInstances;
	}
	public static VSBPPositionofPatient getNegativeInstance(String name)
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
	public static VSBPPositionofPatient getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		VSBPPositionofPatient[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021054;
	public static final VSBPPositionofPatient SITTING = new VSBPPositionofPatient(-86, "Supine", true, null, null, Color.Black);
	public static final VSBPPositionofPatient STANDING = new VSBPPositionofPatient(-87, "Erect", true, null, null, Color.Black);
}
