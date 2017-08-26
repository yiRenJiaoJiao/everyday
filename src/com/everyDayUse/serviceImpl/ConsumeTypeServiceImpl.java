package com.everyDayUse.serviceImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.erveryDayUse.domain.ConsumePlan;
import com.erveryDayUse.domain.ConsumeType;
import com.everyDayUse.dao.IGenericDao;
import com.everyDayUse.service.ConsumeTypeService;


public class ConsumeTypeServiceImpl  implements ConsumeTypeService{
	@Autowired
	private IGenericDao<ConsumeType, Integer> genericDao;
	@Override
	public List<ConsumeType> findConsumeTypeByParentId(ConsumeType model) {
		DetachedCriteria criteria = DetachedCriteria.forClass(ConsumeType.class);
		List<ConsumeType> list = genericDao.findByCriteria(criteria);
		return list;
	}

}
