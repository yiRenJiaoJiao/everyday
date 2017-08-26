package com.everyDayUse.utils;

import org.apache.struts2.ServletActionContext;

import com.erveryDayUse.domain.User;





public class ServletUtils {
	private static final String LoginUserKey = "userinfo";

	public static void setLoginUserToSession(User userinfo) {
		if (userinfo == null) {
			ServletActionContext.getRequest().getSession()
					.removeAttribute(LoginUserKey);
		} else {
			setObjectToSession(LoginUserKey, userinfo);
		}

	}

	public static User getLoginUserFromSession() {
		 Object o = ServletActionContext.getRequest().getSession()
				.getAttribute(LoginUserKey);
		 return o==null? null:(User)o;
	}

	private static void setObjectToSession(String key, User userinfo) {
		ServletActionContext.getRequest().getSession()
				.setAttribute(key, userinfo);

	}

}
