<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		<h3><font color="pink">消费详情查询</font></h3>
		<span>自主查询模块</span>
		<a href="#">进入自主查询</a>
		<%-- <s:form action="#" method="post">
			<div>
			<table>
				<tr>
					<td>
						<span>按时间查询：</span><br/>
					</td>
					<td>
						<span>开始：</span>
						<s:textfield name="startTime" id="startTime"></s:textfield><br/>
					</td>
					<td>
						<span>结束：</span>
						<s:textfield name="endTime" id="endTime" ></s:textfield><br/>
					</td>
				</tr>
				
				<tr>
					<td>
						<span>按类别查询：</span><br/>
					</td>
					<td>
						<span>消费种类</span>
						<select class="tx" style="width:180px;" name="consumeType" id="consumeType">
					</select><br/>
					</td>
				</tr>
				
				
			</table>
			<s:submit value="去查询"></s:submit><br/>
			<s:textfield name="totalPay"></s:textfield><br/>
			<span>查询结果：</span><br/>
				根据以上查询条件，您共消费了
					<s:textfield name="consumeQueryByDefinite" id="consumeQueryByDefinite"></s:textfield>
					元。
					
		</div> 
		</s:form>
		--%>
		
		
		<table>
		<tr>
			<td>今日消费：</td>
			<td><s:property value="consumeEvryDay"/></td>
		</tr>
		<tr>
			<td>本月消费：</td>
			<td><s:property value="consumeEvryMonth"/></td>
		</tr>
		<tr>
			<td>本年度消费：</td>
			<td><s:property value="consumeEvryYear"/></td>
		</tr>
		<tr>
			<td>历史消费总额：</td>
			<td><s:property value="consumeTotal"/></td>
		</tr>
		
	</table>
	
		<div>
			<s:if test="consumeCapital>0">
				<span>您本月还有</span>
				<s:property value="residueMoney"/>
				<span>计划余额可以使用</span><br/>
			</s:if>
			<s:else>
				<span>您本月的消费已经超额</span><br/>
					超出的金额为:
					<s:property value="beyongMoney"/>元<br/>
				<span>请节约消费哦！！</span><br/>
			</s:else>
		</div>
		<a href="${pageContext.request.contextPath}/consumeRecord.jsp">返回消费记录首页</a>
		
	</center>
</body>
</html>