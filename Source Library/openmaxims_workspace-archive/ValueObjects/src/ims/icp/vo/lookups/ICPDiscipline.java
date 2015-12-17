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

package ims.icp.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class ICPDiscipline extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public ICPDiscipline()
	{
		super();
	}
	public ICPDiscipline(int id)
	{
		super(id, "", true);
	}
	public ICPDiscipline(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public ICPDiscipline(int id, String text, boolean active, ICPDiscipline parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public ICPDiscipline(int id, String text, boolean active, ICPDiscipline parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public ICPDiscipline(int id, String text, boolean active, ICPDiscipline parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static ICPDiscipline buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new ICPDiscipline(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (ICPDiscipline)super.getParentInstance();
	}
	public ICPDiscipline getParent()
	{
		return (ICPDiscipline)super.getParentInstance();
	}
	public void setParent(ICPDiscipline parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		ICPDiscipline[] typedChildren = new ICPDiscipline[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (ICPDiscipline)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof ICPDiscipline)
		{
			super.addChild((ICPDiscipline)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof ICPDiscipline)
		{
			super.removeChild((ICPDiscipline)child);
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
		ICPDisciplineCollection result = new ICPDisciplineCollection();
		result.add(NURSING);
		result.add(MEDICAL);
		result.add(PHYSIOTHERAPIST);
		return result;
	}
	public static ICPDiscipline[] getNegativeInstances()
	{
		ICPDiscipline[] instances = new ICPDiscipline[3];
		instances[0] = NURSING;
		instances[1] = MEDICAL;
		instances[2] = PHYSIOTHERAPIST;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "NURSING";
		negativeInstances[1] = "MEDICAL";
		negativeInstances[2] = "PHYSIOTHERAPIST";
		return negativeInstances;
	}
	public static ICPDiscipline getNegativeInstance(String name)
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
	public static ICPDiscipline getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		ICPDiscipline[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1181006;
	public static final ICPDiscipline NURSING = new ICPDiscipline(-337, "Nursing", true, null, null, Color.Default);
	public static final ICPDiscipline MEDICAL = new ICPDiscipline(-338, "Medical", true, null, null, Color.Default);
	public static final ICPDiscipline PHYSIOTHERAPIST = new ICPDiscipline(-339, "Physiotherapist", true, null, null, Color.Default);
}