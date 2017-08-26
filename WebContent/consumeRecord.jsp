<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>consumeMain</title>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ui/jquery-ui-1.9.2.custom.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/ui/smoothness/jquery-ui-1.9.2.custom.css"></link>

<script type="text/javascript">
	$(function(){
		$.post("${pageContext.request.contextPath}/consumeType_findConsumeType",function(data){
			$(data).each(function(){
					var option=$("<option value='"+this.id+"'>"+this.type+"</option>");
					$("#consumeType").append(option);
			});
			/* $("#consumeType").val($("#hiddenOfConsumeType").val());  */
		});
		$("#user_toID").val($("#user_id").val());
		
	});
	
	
</script>
</head>

<body>
<center>
	<h3>消费主页</h3>
	<a href="${pageContext.request.contextPath}/consumePlan.jsp">消费计划</a>
	<br/>
	<br/>
	<s:form action="consume_addConsume" method="post" >
		<div>
			<span>消费金额:</span>
			<%-- <s:textfield nam="singltonPayment" id="singltonPayment"></s:textfield><br/> --%>
			<!-- <input  type="text" name="singltonPayment" id="singltonPayment"/> -->
			<s:textfield  name="singltonPayment" id="singltonPayment"></s:textfield>
		</div><br/>
		<!-- 获取消费类别回显数据 -->
		<s:hidden name="type" id="hiddenOfConsumeType"></s:hidden>
		<div>
			<span>消费类别：</span>
			<select class="tx" style="width:180px;" name="consumeType" id="consumeType">
			</select>
			<%-- <s:hidden name="type" id="type"></s:hidden> --%>
		</div><br/>
		<%-- <s:hidden name="id" id="user_id"></s:hidden> --%>
		<!-- <input type="hidden" name="user.id" id="user_toID"> -->
		<input type="submit" value="提交"/><br/>
		
		
	</s:form>
	
	<br/>
	<a href="${pageContext.request.contextPath}/consume_findConsumeInfo.action">查询消费管理</a><br/>
	<a href ="${pageContext.request.contextPath}/consumePlan.jsp">制定新的消费计划</a><br/>
	 <font color='red'>注意：如果您本月已经制定了消费计划，那么原消费计划将被覆盖</font><br/>
	<a href="${pageContext.request.contextPath}/consumePlan_findConsumePlan">消费计划管理</a>
</center>

</body>
</body>
</html>