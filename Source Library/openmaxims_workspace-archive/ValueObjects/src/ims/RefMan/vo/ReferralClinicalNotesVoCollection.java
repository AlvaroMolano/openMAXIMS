// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to RefMan.ReferralClinicalNotes business object (ID: 1096100058).
 */
public class ReferralClinicalNotesVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<ReferralClinicalNotesVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<ReferralClinicalNotesVo> col = new ArrayList<ReferralClinicalNotesVo>();
	public String getBoClassName()
	{
		return "ims.RefMan.domain.objects.ReferralClinicalNotes";
	}
	public boolean add(ReferralClinicalNotesVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, ReferralClinicalNotesVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(ReferralClinicalNotesVo instance)
	{
		return col.indexOf(instance);
	}
	public ReferralClinicalNotesVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, ReferralClinicalNotesVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(ReferralClinicalNotesVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(ReferralClinicalNotesVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		ReferralClinicalNotesVoCollection clone = new ReferralClinicalNotesVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((ReferralClinicalNotesVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public ReferralClinicalNotesVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public ReferralClinicalNotesVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public ReferralClinicalNotesVoCollection sort(SortOrder order)
	{
		return sort(new ReferralClinicalNotesVoComparator(order));
	}
	public ReferralClinicalNotesVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new ReferralClinicalNotesVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public ReferralClinicalNotesVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.RefMan.vo.ReferralClinicalNotesRefVoCollection toRefVoCollection()
	{
		ims.RefMan.vo.ReferralClinicalNotesRefVoCollection result = new ims.RefMan.vo.ReferralClinicalNotesRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public ReferralClinicalNotesVo[] toArray()
	{
		ReferralClinicalNotesVo[] arr = new ReferralClinicalNotesVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<ReferralClinicalNotesVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class ReferralClinicalNotesVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public ReferralClinicalNotesVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public ReferralClinicalNotesVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public ReferralClinicalNotesVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			ReferralClinicalNotesVo voObj1 = (ReferralClinicalNotesVo)obj1;
			ReferralClinicalNotesVo voObj2 = (ReferralClinicalNotesVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.ReferralClinicalNotesVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.ReferralClinicalNotesVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.ReferralClinicalNotesVoBean[] result = new ims.RefMan.vo.beans.ReferralClinicalNotesVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			ReferralClinicalNotesVo vo = ((ReferralClinicalNotesVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.ReferralClinicalNotesVoBean)vo.getBean();
		}
		return result;
	}
	public static ReferralClinicalNotesVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ReferralClinicalNotesVoCollection coll = new ReferralClinicalNotesVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.ReferralClinicalNotesVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static ReferralClinicalNotesVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.ReferralClinicalNotesVoBean[] beans)
	{
		ReferralClinicalNotesVoCollection coll = new ReferralClinicalNotesVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
