package com.everyDayUse.service;

import java.util.List;

import com.erveryDayUse.domain.Consume;
import com.erveryDayUse.domain.User;

public interface ConsumeService {

	void addConsume(Consume model);

	Consume findConsumeInfo(Consume model);

}
