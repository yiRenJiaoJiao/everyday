package com.everyDayUse.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.erveryDayUse.domain.Consume;
import com.erveryDayUse.domain.User;
import com.everyDayUse.service.ConsumeService;
import com.everyDayUse.utils.ServletUtils;

public class ConsumeAction extends BaseAction<Consume>{
	@Autowired
	private ConsumeService consumeService;
	
	/**
	 * 添加消费信息
	 * @return
	 */
	public String addConsume(){
		User user = ServletUtils.getLoginUserFromSession();
		model.setUser(user);
		consumeService.addConsume(model);
		return "findConsumeInfo";
	}
	
	/**
	 * 获取消费信息
	 * @return
	 */
	public String findConsumeInfo(){
		System.out.println("消费查询");
		User user = ServletUtils.getLoginUserFromSession();
		model.setUser(user);
		Consume consume = consumeService.findConsumeInfo(model);
		result=consume;
		return "consumeRecord";
	}
}
