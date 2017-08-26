<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
   <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/ajax.js"></script>
</head>
<body>
	<center>
		<form action="${pageContext.request.contextPath }/user_addUserInfo.action" method="post">
			<span><font color="blue">为了保证给您的服务真实有效,<br/>请认真填写以下内容哦！！！</font></span><br/>
			<span><font size="3">基本消息:</font></span><br/>
			<span>家庭月收入：</span><br/>
			<s:textfield name="adoption" id="adoption"></s:textfield><br/>
			<span>几口之家：</span><br/>
			<s:textfield name="crewNum" id="crewNum"></s:textfield><br/>
			<%-- <s:hidden name="id" ></s:hidden><br/> --%>
			<input type="hidden" name="id" value="${id}">
			<input type="submit" value="下一页">
		</form>
	</center>
</body>

</html>