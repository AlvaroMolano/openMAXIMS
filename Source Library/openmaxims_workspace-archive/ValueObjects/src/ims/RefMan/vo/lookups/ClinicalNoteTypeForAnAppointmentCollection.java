// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.lookups;

import ims.framework.cn.data.TreeModel;
import ims.framework.cn.data.TreeNode;
import ims.vo.LookupInstanceCollection;
import ims.vo.LookupInstVo;

public class ClinicalNoteTypeForAnAppointmentCollection extends LookupInstanceCollection implements ims.vo.ImsCloneable, TreeModel
{
	private static final long serialVersionUID = 1L;
	public void add(ClinicalNoteTypeForAnAppointment value)
	{
		super.add(value);
	}
	public int indexOf(ClinicalNoteTypeForAnAppointment instance)
	{
		return super.indexOf(instance);
	}
	public boolean contains(ClinicalNoteTypeForAnAppointment instance)
	{
		return indexOf(instance) >= 0;
	}
	public ClinicalNoteTypeForAnAppointment get(int index)
	{
		return (ClinicalNoteTypeForAnAppointment)super.getIndex(index);
	}
	public void remove(ClinicalNoteTypeForAnAppointment instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public Object clone()
	{
		ClinicalNoteTypeForAnAppointmentCollection newCol = new ClinicalNoteTypeForAnAppointmentCollection();
		ClinicalNoteTypeForAnAppointment item;
		for (int i = 0; i < super.size(); i++)
		{
			item = this.get(i);
			newCol.add(new ClinicalNoteTypeForAnAppointment(item.getID(), item.getText(), item.isActive(), item.getParent(), item.getImage(), item.getColor(), item.getOrder()));
		}
		for (int i = 0; i < newCol.size(); i++)
		{
			item = newCol.get(i);
			if (item.getParent() != null)
			{
				int parentIndex = this.indexOf(item.getParent());
				if(parentIndex >= 0)
					item.setParent(newCol.get(parentIndex));
				else
					item.setParent((ClinicalNoteTypeForAnAppointment)item.getParent().clone());
			}
		}
		return newCol;
	}
	public ClinicalNoteTypeForAnAppointment getInstance(int instanceId)
	{
		return (ClinicalNoteTypeForAnAppointment)super.getInstanceById(instanceId);
	}
	public TreeNode[] getRootNodes()
	{
		LookupInstVo[] roots = super.getRoots();
		TreeNode[] nodes = new TreeNode[roots.length];
		System.arraycopy(roots, 0, nodes, 0, roots.length);
		return nodes;
	}
	public ClinicalNoteTypeForAnAppointment[] toArray()
	{
		ClinicalNoteTypeForAnAppointment[] arr = new ClinicalNoteTypeForAnAppointment[this.size()];
		super.toArray(arr);
		return arr;
	}
	public static ClinicalNoteTypeForAnAppointmentCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ClinicalNoteTypeForAnAppointmentCollection coll = new ClinicalNoteTypeForAnAppointmentCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while(iter.hasNext())
		{
			coll.add(ClinicalNoteTypeForAnAppointment.buildLookup((ims.vo.LookupInstanceBean)iter.next()));
		}
		return coll;
	}
	public static ClinicalNoteTypeForAnAppointmentCollection buildFromBeanCollection(ims.vo.LookupInstanceBean[] beans)
	{
		ClinicalNoteTypeForAnAppointmentCollection coll = new ClinicalNoteTypeForAnAppointmentCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(ClinicalNoteTypeForAnAppointment.buildLookup(beans[x]));
		}
		return coll;
	}
}
