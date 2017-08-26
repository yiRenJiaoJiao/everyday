<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p class="advertisement">请登录</p>
		<div id="panelname" style="margin-left:500px; width:800px;" >
			<div id="registername" ><p class="userregister">用户登录</p></div>
			<span style='color:#3333ff'>
				<form action="register_add.action" onsubmit="return clickreg" method="post">
					<div>账号：</div>
					<span style="color:#3333ff">
						<input class="easyui-textbox" id="telephonename" name="loginName" data-options="prompt:'账号',validType:'mobile'
						" style="width:300px;height:30px;">
					</span>
					<div ><br/>
				
					<div>
						<span>密码</span><br/>
						<input type="password" name="password" id="password" data-options="prompt:'密码,validType:'mobile'
						" style="width:150px;height:30px;"/>
					</div><br/>
					<input type="submit" id="toSubmit"  value="注册" ata-options="prompt:'注册',validType:'mobile'
						" style="width:50px;height:30px;"/>
				</form>
			</span>
		</div>
</body>
