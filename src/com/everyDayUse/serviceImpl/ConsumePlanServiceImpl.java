package com.everyDayUse.serviceImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.erveryDayUse.domain.Consume;
import com.erveryDayUse.domain.ConsumePlan;
import com.erveryDayUse.domain.ConsumeType;
import com.everyDayUse.dao.IGenericDao;
import com.everyDayUse.service.ConsumePlanService;
import com.everyDayUse.utils.DataUtils;

public class ConsumePlanServiceImpl implements ConsumePlanService {
	@Autowired
	private IGenericDao<ConsumePlan, Integer> genericDao;

	@Override
	public void addConsumePlan(ConsumePlan model) {
		
		String nowMonth = DataUtils.getNowMonth();
		DetachedCriteria criteria = DetachedCriteria.forClass(ConsumePlan.class);
		criteria.add(Restrictions.like("planTime", nowMonth+"%"));
		ConsumePlan consumePlan = genericDao.findObject(criteria);
		if (consumePlan!=null) {
			//genericDao.update(model);
			genericDao.delete(consumePlan);
		}
		genericDao.save(model);
		
		
	}

	@Override
	public ConsumePlan findConsumePlan(ConsumePlan model) {
		DetachedCriteria criteria = DetachedCriteria.forClass(ConsumePlan.class);
		criteria.add(Restrictions.eq("user.id", model.getUser().getId()));
		ConsumePlan plan = genericDao.findObject(criteria);
		double e = plan.getEveryDayPay();
		double c = plan.getCostumePay();
		double el = plan.getElectricPay();
		double g = plan.getGongingOutPay();
		double mb = plan.getMomAndBabyPay();
		double o = plan.getOtherPay();
		double t = plan.getToiletryPay();
		plan.setTotalPlanPay(e+c+el+g+mb+o+t);
		//double sum =e+c+el+g+mb+o+t;
		//plan.getEveryDayPay()+plan.getCostumePay()+plan.getElectricPay()+plan.getGongingOutPay()+plan.getMomAndBabyPay()+plan.getOtherPay()+plan.getToiletryPay()+plan.setCostumePay(costumePay);
		return plan;
	}

	@Override
	public void updateConsumePlan(ConsumePlan model) {
		genericDao.update(model);
	}


}
