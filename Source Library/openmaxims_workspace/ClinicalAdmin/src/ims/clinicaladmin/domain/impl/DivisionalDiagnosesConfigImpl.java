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
// This code was generated by Bogdan Tofei using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.clinicaladmin.domain.impl;

import ims.clinicaladmin.domain.base.impl.BaseDivisionalDiagnosesConfigImpl;
import ims.core.clinical.domain.objects.DivisionalDiagnoses;
import ims.core.vo.DivisionalDiagnosesVo;
import ims.core.vo.DivisionalDiagnosesVoCollection;
import ims.core.vo.domain.DivisionalDiagnosesVoAssembler;
import ims.domain.DomainFactory;
import ims.framework.exceptions.CodingRuntimeException;

public class DivisionalDiagnosesConfigImpl extends BaseDivisionalDiagnosesConfigImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.DivisionalDiagnosesVo saveDivisionalDiagnoses(DivisionalDiagnosesVo divisionalDiagnosesToSave) throws ims.domain.exceptions.StaleObjectException
	{
		if (divisionalDiagnosesToSave == null)
			throw new CodingRuntimeException("Cannot save null DivisionalDiagnoses");

		DomainFactory factory = getDomainFactory();
		DivisionalDiagnoses domainDivisionalDiagnoses = DivisionalDiagnosesVoAssembler.extractDivisionalDiagnoses(factory, divisionalDiagnosesToSave);

		factory.save(domainDivisionalDiagnoses);

		return DivisionalDiagnosesVoAssembler.create(domainDivisionalDiagnoses);
	}

	public Boolean recordWasAlreadySaved(DivisionalDiagnosesVo divisionDiagnoses)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer();

		hql.append(" select count(DivDiag.id) from DivisionalDiagnoses as DivDiag left join DivDiag.division as div where div.id = :divisionId ");

		 Object[] count = factory.find(hql.toString(), new String[] { "divisionId" }, new Object[] {divisionDiagnoses.getDivision().getID()}).toArray();
		
		 if(count != null && count.length > 0)
			 if (((Long) count[0]).intValue() == 0) 
			 return false;
		
		return true;
	}

	public DivisionalDiagnosesVoCollection getDivisionalDiagnosis()
	{
		return DivisionalDiagnosesVoAssembler.createDivisionalDiagnosesVoCollectionFromDivisionalDiagnoses(getDomainFactory().find("from DivisionalDiagnoses"));
		
	}
}
