<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<form action="${pageContext.request.contextPath }/user_login.action" method="post">
			<table>
				<tr>
					<td>账号：
					<s:textfield name="userName" id="userName" onblur="chackUserName(this.value)"/></td>
					<td><span id="accountNumberMSG"></span></td>
				</tr>
				<tr>
					<td>密码：
					<s:textfield name="password" id="password" onblur="chackpassword(this.value)"></s:textfield>
					<td><span id="passwordMSG"></span></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"></td>
					<td><input type="reset" value="重置"/></td>
				</tr>
			</table>
		</form>
	</center>
</body>
<script type="text/javascript">
	function chackUserName(accountNumber){
		/* $("#accountNumberMSG").html(""); */
		accountNumberMSG.innerHTML="";
		if(accountNumber.trim()){
		
			ajax({
		 		   // 离焦事件查询数据库
		 		   url:"${pageContext.request.contextPath}/user_chackLoginName.action?accountNumber="+accountNumber,
		 		   method:"get",
		 		   callback:function(data){
		 			   // data  true/false
		 			  if(data=='0'){
		 				 accountNumberMSG.style.color = "red";
		 				  accountNumberMSG.innerHTML = "该账号不存在,请注册后登录";
							
		 			   }else{
		 				  accountNumberMSG.style.color = "green";
		 				 accountNumberMSG.innerHTML = "<font color='green'>￣︶￣   GO!</font>";
		 			   }
		 		   }
		 	   });
		}else{
			accountNumberMSG.innerHTML="您还没有填入账号哦！请填写后再提交吧！￣︶￣";
			/* $("#accountNumberMSG").html("您还没有填入账号哦！请填写后再提交吧！￣︶￣"); */
		/* 	$("#accountNumber").html(""); */
		}
	}
	function chackpassword(password){
		/* $("#passwordMSG").html(""); */
		passwordMSG.innerHTML="";
		if(!password.trim()){
			/* $("#passwordMSG").html("您还没有输入密码哦！￣︶￣"); */
			passwordMSG.innerHTML="您还没有输入密码哦！￣︶￣";
		}
	}
	
	
</script>
</html>