package com.everyDayUse.serviceImpl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.erveryDayUse.domain.Consume;
import com.erveryDayUse.domain.ConsumePlan;
import com.erveryDayUse.domain.User;
import com.everyDayUse.dao.IGenericDao;
import com.everyDayUse.service.ConsumeService;
import com.everyDayUse.utils.DataUtils;
import com.everyDayUse.utils.ServletUtils;

import freemarker.template.utility.DateUtil;



public class ConsumeServiceImpl extends BaseService<Consume, Integer> implements ConsumeService{
	
	@Autowired
	private IGenericDao<Consume, Integer> genericDao;
	@Autowired
	private IGenericDao<ConsumePlan, Integer> consumePlanDao;
	
	@Override
	public void addConsume(Consume model) {
		try {
			genericDao.save(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("��Ѽ�¼�����쳣");
		}
		
	}
	@Override
	public Consume findConsumeInfo(Consume model) {
		
		//获取当前
		String date = DataUtils.getDateOfNow();
		//获取当天初始时间
		String initOfDay = DataUtils.getInitailOfDay();
		//ʹ获取当天的消费
		Double payofDay = findSingleSumOfPay("singltonPayment","consumeTime",initOfDay, date, genericDao);
		//设置
		model.setConsumeEvryDay(payofDay);
		
		//后去当前月份
		String initOfMOnth = DataUtils.getInitailOfMonth();
		Double payOfMonth = findSingleSumOfPay("singltonPayment","consumeTime",initOfMOnth, date, genericDao);
		model.setConsumeEvryMonth(payOfMonth);
		
		//获取当前年份
		String initOfYear = DataUtils.getInitailOfYear();
		Double payOfYear = findSingleSumOfPay("singltonPayment","consumeTime",initOfYear, date, genericDao);
		model.setConsumeEvryYear(payOfYear);
		
		//获取注册时间
		Timestamp timestamp = ServletUtils.getLoginUserFromSession().getRegisterTime();
		//String registerTime = timestamp+"";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String registerTime = sdf.format(timestamp);
		Double totalpay = findSingleSumOfPay("singltonPayment","consumeTime",registerTime, date, genericDao);
		model.setConsumeTotal(totalpay);
		//获取用户
		User user = ServletUtils.getLoginUserFromSession();
		//String nowMonth = DataUtils.getNowMonth();
		
		DetachedCriteria criteria = DetachedCriteria.forClass(ConsumePlan.class);
		criteria.add(Restrictions.eq("user",user));
		ConsumePlan consumePlan = consumePlanDao.findObject(criteria);
		double PlanPayOfMonth = consumePlan.getCostumePay()+ consumePlan.getElectricPay()+consumePlan.getEveryDayPay()+consumePlan.getGongingOutPay()+ consumePlan.getMomAndBabyPay()+consumePlan.getOtherPay()+consumePlan.getToiletryPay();
		model.setConsumeTotal(PlanPayOfMonth);
		double pay = PlanPayOfMonth-payOfMonth;
		if (pay>0) {  
			model.setConsumeCapital(pay);
		}else{
			model.setBeyongMoney(-pay);
		}
		model.setConsumeCapital(PlanPayOfMonth-payOfMonth);
		return model;
	}
	


}
