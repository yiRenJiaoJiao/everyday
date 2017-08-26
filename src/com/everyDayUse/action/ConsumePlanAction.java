package com.everyDayUse.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.erveryDayUse.domain.Consume;
import com.erveryDayUse.domain.ConsumePlan;
import com.erveryDayUse.domain.User;
import com.everyDayUse.service.ConsumePlanService;
import com.everyDayUse.utils.ServletUtils;

public class ConsumePlanAction extends BaseAction<ConsumePlan>{
	
	@Autowired
	private ConsumePlanService consumeService;
	/**
	 * 添加消费计划，如果本月已经有消费计划则会将原来的消费计划清除
	 * @return
	 */
	public String addConsumePlan(){
		User user = ServletUtils.getLoginUserFromSession();
		model.setUser(user);
		consumeService.addConsumePlan(model);
		return "consume";
	}
	
	/**
	 * 获取消费计划
	 * @return
	 * @throws Exception
	 */
	public String findConsumePlan() throws Exception{
		User user = ServletUtils.getLoginUserFromSession();
		model.setUser(user);
		ConsumePlan consumePlan = consumeService.findConsumePlan(model);
		pushToValueSatackroot(consumePlan);
		//result=consumePlan;
		return "consumePlanManager";
	}
	
	/**
	 * 修改消费计划
	 * @return
	 */
	public String updateConsumePlan(){
		consumeService.updateConsumePlan(model);
		return "consume";
	}
}
