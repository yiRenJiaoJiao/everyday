package com.everyDayUse.service;

import com.erveryDayUse.domain.User;



public interface UserService {

	User findUserByLoginNameAndLoginPassword(User model);

	void updateUserToDataBase(User model);

	User finUserById(User model);

}
