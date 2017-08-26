package com.everyDayUse.service;

import java.util.List;

import com.erveryDayUse.domain.ConsumeType;

public interface ConsumeTypeService {

	List<ConsumeType> findConsumeTypeByParentId(ConsumeType model);

}
