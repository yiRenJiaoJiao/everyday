package com.everyDayUse.action;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.erveryDayUse.domain.User;
import com.everyDayUse.service.UserService;
import com.everyDayUse.utils.ServletUtils;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;


public class UserAction extends BaseAction<User> {
	
	@Autowired
	private UserService userService;
	
	@InputConfig(resultName="loginInput" )
	/**
	 * 登陆
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception {
		// ��¼��־
		LOG.info("�û���ʼ��½��");
		// �ж���ݿ��Ƿ��и��û���������򷵻�User���󣬷���session��

		User userinfo = userService.findUserByLoginNameAndLoginPassword(model);
		if (userinfo == null) {
			this.addActionError(this.getText("login.loginError"));
			return "loginInput";
		} else {
			ServletUtils.setLoginUserToSession(userinfo);
			pushToValueSatackroot(userinfo);
			return "welcom";
		}

	}
	/**
	 * 补全用户信息
	 * @return
	 */
	public String addUserInfo(){
		LOG.info("�û���д��ͥ������Ϣ");
		User user  = ServletUtils.getLoginUserFromSession();
		if (user!=null) {
			userService.updateUserToDataBase(model);
		}
		return "consumeRecord";
	}
	
	/**
	 * 更新用户信息
	 * @return
	 */
	public String updateUser(){
		User  user= userService.finUserById(model);
		if (user!=null) {
			Integer num = user.getCrewNum();
			if (num==null) {
				userService.updateUserToDataBase(model);
				pushToValueSatackroot(user);
				return "concumePage";
			}
		}
		pushToValueSatackroot(user);
		return "consumeRecord";
	
	}
}
