package com.everyDayUse.serviceImpl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.erveryDayUse.domain.User;
import com.everyDayUse.dao.IGenericDao;
import com.everyDayUse.service.UserService;

public class UserServiceImpl extends BaseService implements UserService {

	@Autowired
	private IGenericDao<User, Integer> genericDao;

	@Override
	public User findUserByLoginNameAndLoginPassword(User model) {
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class)
				.add(Restrictions.eq("userName", model.getUserName()))
				.add(Restrictions.eq("password", model.getPassword()));

		return (User) genericDao.findObject(criteria);
	}

	@Override
	public void updateUserToDataBase(User model) {
		User user = genericDao.findObjectById(User.class, model.getId());
		user.setConsumes(model.getConsumes());
		user.setCrewNum(model.getCrewNum());
	}

	@Override
	public User finUserById(User model) {
		return genericDao.findObjectById(User.class, model.getId());
	}

}
