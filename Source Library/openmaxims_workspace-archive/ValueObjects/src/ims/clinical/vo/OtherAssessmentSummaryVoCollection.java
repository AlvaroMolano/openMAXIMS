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

package ims.clinical.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to core.clinical.OtherAssessmentSummary business object (ID: 1003100109).
 */
public class OtherAssessmentSummaryVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<OtherAssessmentSummaryVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<OtherAssessmentSummaryVo> col = new ArrayList<OtherAssessmentSummaryVo>();
	public String getBoClassName()
	{
		return "ims.core.clinical.domain.objects.OtherAssessmentSummary";
	}
	public boolean add(OtherAssessmentSummaryVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, OtherAssessmentSummaryVo value)
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
	public int indexOf(OtherAssessmentSummaryVo instance)
	{
		return col.indexOf(instance);
	}
	public OtherAssessmentSummaryVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, OtherAssessmentSummaryVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(OtherAssessmentSummaryVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(OtherAssessmentSummaryVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		OtherAssessmentSummaryVoCollection clone = new OtherAssessmentSummaryVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((OtherAssessmentSummaryVo)this.col.get(x).clone());
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
	public OtherAssessmentSummaryVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public OtherAssessmentSummaryVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public OtherAssessmentSummaryVoCollection sort(SortOrder order)
	{
		return sort(new OtherAssessmentSummaryVoComparator(order));
	}
	public OtherAssessmentSummaryVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new OtherAssessmentSummaryVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public OtherAssessmentSummaryVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.core.clinical.vo.OtherAssessmentSummaryRefVoCollection toRefVoCollection()
	{
		ims.core.clinical.vo.OtherAssessmentSummaryRefVoCollection result = new ims.core.clinical.vo.OtherAssessmentSummaryRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public OtherAssessmentSummaryVo[] toArray()
	{
		OtherAssessmentSummaryVo[] arr = new OtherAssessmentSummaryVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<OtherAssessmentSummaryVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class OtherAssessmentSummaryVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public OtherAssessmentSummaryVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public OtherAssessmentSummaryVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public OtherAssessmentSummaryVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			OtherAssessmentSummaryVo voObj1 = (OtherAssessmentSummaryVo)obj1;
			OtherAssessmentSummaryVo voObj2 = (OtherAssessmentSummaryVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.clinical.vo.beans.OtherAssessmentSummaryVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.clinical.vo.beans.OtherAssessmentSummaryVoBean[] getBeanCollectionArray()
	{
		ims.clinical.vo.beans.OtherAssessmentSummaryVoBean[] result = new ims.clinical.vo.beans.OtherAssessmentSummaryVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			OtherAssessmentSummaryVo vo = ((OtherAssessmentSummaryVo)col.get(i));
			result[i] = (ims.clinical.vo.beans.OtherAssessmentSummaryVoBean)vo.getBean();
		}
		return result;
	}
	public static OtherAssessmentSummaryVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		OtherAssessmentSummaryVoCollection coll = new OtherAssessmentSummaryVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.clinical.vo.beans.OtherAssessmentSummaryVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static OtherAssessmentSummaryVoCollection buildFromBeanCollection(ims.clinical.vo.beans.OtherAssessmentSummaryVoBean[] beans)
	{
		OtherAssessmentSummaryVoCollection coll = new OtherAssessmentSummaryVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
