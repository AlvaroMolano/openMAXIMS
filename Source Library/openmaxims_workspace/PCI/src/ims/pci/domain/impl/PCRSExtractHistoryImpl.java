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
// This code was generated by Vasile Purdila using IMS Development Environment (version 1.62 build 3126.20282)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.pci.domain.impl;

import java.util.ArrayList;

import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.pci.domain.base.impl.BasePCRSExtractHistoryImpl;
import ims.pci.vo.domain.ExportTransactionLogVoAssembler;

public class PCRSExtractHistoryImpl extends BasePCRSExtractHistoryImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* listHistory
	*/
	public ims.pci.vo.ExportTransactionLogVoCollection listHistory(ims.framework.utils.DateTime dateFrom, ims.framework.utils.DateTime dateTo) throws ims.domain.exceptions.DomainInterfaceException
	{
		if (dateFrom == null || dateTo == null)
			throw new DomainInterfaceException("The dateFrom/dateTo parameters cannot be null !");

		DomainFactory factory = getDomainFactory();

		String query = "from ExportTransactionLog as e1_1 where (e1_1.dateGenerated between :dtFrom and :dtTo) order by e1_1.dateGenerated desc";

		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();

		markers.add("dtFrom");
		values.add(dateFrom.getJavaDate());
		markers.add("dtTo");
		values.add(dateTo.getJavaDate());
		
		return ExportTransactionLogVoAssembler.createExportTransactionLogVoCollectionFromExportTransactionLog(factory.find(query, markers, values));
	}
}
