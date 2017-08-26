<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p class="advertisement">短信验证测试</p>
		<div id="panelname" style="margin-left:500px; width:800px;" >
			<div id="registername" ><p class="userregister">用户注册</p></div>
			<span style='color:#3333ff'>
				<form action="register_add.action" onsubmit="return clickreg" method="post">
					<div>手机号码：</div>
					<span style="color:#3333ff">
						<input class="easyui-textbox" id="telephonename" name="loginName" data-options="prompt:'请输入手机号',validType:'mobile'
						" style="width:300px;height:30px;">
						<input class="code" type="button" id="btnSendCode" onclick="sendMessage()" value="获取手机验证码"/><br/>
						
					</span>
					<div ><br/>
					<span>请输入验证码：</span><br/>
					<input type="text" name="code" id="code" data-options="prompt:'请输入验证码',validType:'mobile'
						" style="width:150px;height:30px;" />
					</div>
					<span id="telephonenameTip"></span><br/>
					<div>
						<span>请输入密码</span><br/>
						<input type="password" name="password" id="password" data-options="prompt:'请输入密码,validType:'mobile'
						" style="width:150px;height:30px;"/>
					</div><br/>
					<div>
						<span>请确认密码：</span><br/>
						<input type="password" name="rePassword" id="rePassword" data-options="prompt:'请确认',validType:'mobile'
						" style="width:150px;height:30px;"/>
					</div><br/>
					<input type="submit" id="toSubmit"  value="注册" ata-options="prompt:'注册',validType:'mobile'
						" style="width:50px;height:30px;"/>
				</form>
			</span>
		</div>
</body>
<script type="text/javascript">
	var InterValobj;//timer变量，控制时间
	var count = 60;//间隔函数，1秒执行
	var curCount ;//当前剩余秒
	 var code="";//验证码
	 var codeLength = 6;//验证码长度
	 function sendMessage(){
		 curCount =count;
		 var jbPhone = $("#telephonename").val();
		 alert(111);
		 alert(jbPhone);
		 var jbPhoneTip =$("#telephonenameTip").text();
		 if(jbPhone !=""){
			 //产生验证码
			 for(var i = 0; i<codeLength;i++){
				 code +=parseInt(Math.random()*9).toString;
			 }
			 //设置button效果，开始计时
			 $("#btnSendCode").attr("disabled","true");
			 $("#btnSendCode").val("请在"+curCount+"秒内输入验证码");
			 InterValObj = vindow.setInterval(SerRemainTime,1000);
			 $.ajax({
				 type:"post",//使用post方式传输
				 dataType:"text",//数据格式：json
				 url:"register_sms.action",//目标地址
				 data:"jbPhone="+jbPhone+"&code="+code,
				 error: function(xmlHttpRequest,textStatus,errorRhrown){
					 
				 },
				 success:function(data){
					 data = parseInt(data,10);
					 if(data==1){
						 $("#telephonenameTip").html("<font color='#339933'>√短信验证码已发送到您的手机，请查收</font>");
					 }else if(data==0){
						 $("#telephonenameTip").html("<font color="red">×短信验证码发送失败，请重新获取验证码</font>");
					 	return false;
					 }else if(data==2){
						 $("#telephonenameTip").html("<font color="red">该手机今天发送的验证码过多，请名太难再试</font>")
					 }
				 }
			 })
		 }else{
			 $("telephonenameTip").html("<font color="red">×手机号码不能为空</font>");
		 }
		 
	 }
	 
	 function SetRemainTime(){
		 if(curCount == 0){
			 widow.clearInterval(InrerValObj);//停止计时器
			 $("#btnSendCode").removeAttr("disavled");
			 $("#btnSendCode").val("重新发送验证码");
			 code="";//清楚验证码，如果不清楚，过时间后，输入收到的验证码依然有效
		 }else{
			 curCoutn--;
			 $("#btnSendCode").val("请在"+curCount+"秒内输入验证码");
		 }
	 }
	 $(function(){
		 $("input",$("#codename").next("span")).blur(funxtion(){
			 var SmsCheckCodeVal = $("#codename").val();
			 $.ajax({
				 url:"register_checkCode.action",
				 data:{SmsCheckCode:SmsCheckCodeVal},
				 type:"post",
				 dataType:"text",
				 success:function(data){
					 data = parseInt(data,10);
					 if(data==1){
						 $("#codenameTip").html("<font color='#339933'>√</font>");
					 }else{
						 $("#codenameTip").html("<font color='#339933'>×短信验证码有误,请核实后重新填写</font>")
					 }
				 }
			 });
			 return true;
		 });
	 });

</script>
</html>