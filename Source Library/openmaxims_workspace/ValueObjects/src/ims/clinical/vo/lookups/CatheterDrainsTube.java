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

package ims.clinical.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class CatheterDrainsTube extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public CatheterDrainsTube()
	{
		super();
	}
	public CatheterDrainsTube(int id)
	{
		super(id, "", true);
	}
	public CatheterDrainsTube(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public CatheterDrainsTube(int id, String text, boolean active, CatheterDrainsTube parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public CatheterDrainsTube(int id, String text, boolean active, CatheterDrainsTube parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public CatheterDrainsTube(int id, String text, boolean active, CatheterDrainsTube parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static CatheterDrainsTube buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new CatheterDrainsTube(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (CatheterDrainsTube)super.getParentInstance();
	}
	public CatheterDrainsTube getParent()
	{
		return (CatheterDrainsTube)super.getParentInstance();
	}
	public void setParent(CatheterDrainsTube parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		CatheterDrainsTube[] typedChildren = new CatheterDrainsTube[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (CatheterDrainsTube)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof CatheterDrainsTube)
		{
			super.addChild((CatheterDrainsTube)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof CatheterDrainsTube)
		{
			super.removeChild((CatheterDrainsTube)child);
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
		CatheterDrainsTubeCollection result = new CatheterDrainsTubeCollection();
		result.add(CATHETER);
		result.add(DRAIN);
		result.add(TUBE);
		return result;
	}
	public static CatheterDrainsTube[] getNegativeInstances()
	{
		CatheterDrainsTube[] instances = new CatheterDrainsTube[3];
		instances[0] = CATHETER;
		instances[1] = DRAIN;
		instances[2] = TUBE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "CATHETER";
		negativeInstances[1] = "DRAIN";
		negativeInstances[2] = "TUBE";
		return negativeInstances;
	}
	public static CatheterDrainsTube getNegativeInstance(String name)
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
	public static CatheterDrainsTube getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		CatheterDrainsTube[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1231162;
	public static final CatheterDrainsTube CATHETER = new CatheterDrainsTube(-3238, "Catheter", true, null, null, Color.Default);
	public static final CatheterDrainsTube DRAIN = new CatheterDrainsTube(-3239, "Drain", true, null, null, Color.Default);
	public static final CatheterDrainsTube TUBE = new CatheterDrainsTube(-3240, "Tube", true, null, null, Color.Default);
}
