package com.everyDayUse.service;

import java.util.List;

import com.erveryDayUse.domain.Consume;
import com.erveryDayUse.domain.ConsumePlan;
import com.erveryDayUse.domain.ConsumeType;

public interface ConsumePlanService {

	void addConsumePlan(ConsumePlan model);

	ConsumePlan findConsumePlan(ConsumePlan model);

	void updateConsumePlan(ConsumePlan model);
	

}
