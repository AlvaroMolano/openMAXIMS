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

package ims.clinical.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to clinical.PeriOpReadyForDischargeTi business object (ID: 1072100127).
 */
public class PeriOpReadyForDischargeTiRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<PeriOpReadyForDischargeTiRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<PeriOpReadyForDischargeTiRefVo> col = new ArrayList<PeriOpReadyForDischargeTiRefVo>();
	public final String getBoClassName()
	{
		return "ims.clinical.domain.objects.PeriOpReadyForDischargeTi";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(PeriOpReadyForDischargeTiRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, PeriOpReadyForDischargeTiRefVo value)
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
	public int indexOf(PeriOpReadyForDischargeTiRefVo instance)
	{
		return col.indexOf(instance);
	}
	public PeriOpReadyForDischargeTiRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, PeriOpReadyForDischargeTiRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(PeriOpReadyForDischargeTiRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(PeriOpReadyForDischargeTiRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		PeriOpReadyForDischargeTiRefVoCollection clone = new PeriOpReadyForDischargeTiRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((PeriOpReadyForDischargeTiRefVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		return clone;
	}
	public boolean isValidated()
	{
		return true;
	}
	public String[] validate()
	{
		return null;
	}
	public PeriOpReadyForDischargeTiRefVo[] toArray()
	{
		PeriOpReadyForDischargeTiRefVo[] arr = new PeriOpReadyForDischargeTiRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public PeriOpReadyForDischargeTiRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public PeriOpReadyForDischargeTiRefVoCollection sort(SortOrder order)
	{
		return sort(new PeriOpReadyForDischargeTiRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public PeriOpReadyForDischargeTiRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<PeriOpReadyForDischargeTiRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class PeriOpReadyForDischargeTiRefVoComparator implements Comparator
	{
		private int direction = 1;
		public PeriOpReadyForDischargeTiRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public PeriOpReadyForDischargeTiRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			PeriOpReadyForDischargeTiRefVo voObj1 = (PeriOpReadyForDischargeTiRefVo)obj1;
			PeriOpReadyForDischargeTiRefVo voObj2 = (PeriOpReadyForDischargeTiRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}
