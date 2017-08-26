package com.everyDayUse.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.erveryDayUse.domain.ConsumePlan;
import com.erveryDayUse.domain.ConsumeType;
import com.everyDayUse.service.ConsumePlanService;
import com.everyDayUse.service.ConsumeTypeService;

public class ConsumeTypeAction extends BaseAction<ConsumeType> {
	
	@Autowired
	private ConsumeTypeService consumeTypeService;
	/**
	 * 获取消费类型
	 * @return
	 */
	public String findConsumeType(){
		List<ConsumeType> list = consumeTypeService.findConsumeTypeByParentId(model);
		pushToValueSatackroot(list);
		return "json";
	}
}
