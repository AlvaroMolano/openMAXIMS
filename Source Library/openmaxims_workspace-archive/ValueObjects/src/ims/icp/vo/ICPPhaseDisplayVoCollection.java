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

package ims.icp.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to ICPs.Configuration.ICPPhase business object (ID: 1060100002).
 */
public class ICPPhaseDisplayVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<ICPPhaseDisplayVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<ICPPhaseDisplayVo> col = new ArrayList<ICPPhaseDisplayVo>();
	public String getBoClassName()
	{
		return "ims.icps.configuration.domain.objects.ICPPhase";
	}
	public boolean add(ICPPhaseDisplayVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, ICPPhaseDisplayVo value)
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
	public int indexOf(ICPPhaseDisplayVo instance)
	{
		return col.indexOf(instance);
	}
	public ICPPhaseDisplayVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, ICPPhaseDisplayVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(ICPPhaseDisplayVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(ICPPhaseDisplayVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		ICPPhaseDisplayVoCollection clone = new ICPPhaseDisplayVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((ICPPhaseDisplayVo)this.col.get(x).clone());
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
	public ICPPhaseDisplayVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public ICPPhaseDisplayVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public ICPPhaseDisplayVoCollection sort(SortOrder order)
	{
		return sort(new ICPPhaseDisplayVoComparator(order));
	}
	public ICPPhaseDisplayVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new ICPPhaseDisplayVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public ICPPhaseDisplayVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.icps.configuration.vo.ICPPhaseRefVoCollection toRefVoCollection()
	{
		ims.icps.configuration.vo.ICPPhaseRefVoCollection result = new ims.icps.configuration.vo.ICPPhaseRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public ICPPhaseDisplayVo[] toArray()
	{
		ICPPhaseDisplayVo[] arr = new ICPPhaseDisplayVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<ICPPhaseDisplayVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class ICPPhaseDisplayVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public ICPPhaseDisplayVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public ICPPhaseDisplayVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public ICPPhaseDisplayVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			ICPPhaseDisplayVo voObj1 = (ICPPhaseDisplayVo)obj1;
			ICPPhaseDisplayVo voObj2 = (ICPPhaseDisplayVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.icp.vo.beans.ICPPhaseDisplayVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.icp.vo.beans.ICPPhaseDisplayVoBean[] getBeanCollectionArray()
	{
		ims.icp.vo.beans.ICPPhaseDisplayVoBean[] result = new ims.icp.vo.beans.ICPPhaseDisplayVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			ICPPhaseDisplayVo vo = ((ICPPhaseDisplayVo)col.get(i));
			result[i] = (ims.icp.vo.beans.ICPPhaseDisplayVoBean)vo.getBean();
		}
		return result;
	}
	public static ICPPhaseDisplayVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ICPPhaseDisplayVoCollection coll = new ICPPhaseDisplayVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.icp.vo.beans.ICPPhaseDisplayVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static ICPPhaseDisplayVoCollection buildFromBeanCollection(ims.icp.vo.beans.ICPPhaseDisplayVoBean[] beans)
	{
		ICPPhaseDisplayVoCollection coll = new ICPPhaseDisplayVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
