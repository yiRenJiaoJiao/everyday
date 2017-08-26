<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消费计划管理</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ui/jquery-ui-1.9.2.custom.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ui/jquery-ui-1.9.2.custom.js"></script>
</head>
<body>
	<h3>消费计划管理</h3>
	<center>
		
		<span>您当月的消费计划为：</span><br/>
		
			<s:form action="consumePlan_updateConsumePlan" method="post">
				<table>
					<tr >
						<td>日常消费:</td>
						<td>
							<s:textfield name="everyDayPay" id="everyDayPay" disabled="true"/>
						</td>
						
					</tr>
					<tr>
						<td>电子产品消费:</td>
						<td>
							<s:textfield name="electricPay" id="electricPay" disabled="true"></s:textfield>
						</td>
						
					</tr>
					<tr>
						<td>服饰消费:</td>
						<td>
							<s:textfield name="costumePay" id="costumePay" disabled="true"></s:textfield>
						</td>
						
					</tr>
					<tr>
						<td>出行消费:</td>
						<td>
							<s:textfield name="gongingOutPay" id="gongingOutPay" disabled="true"></s:textfield>
						</td>
						
					</tr>
					<tr>
						<td>化妆品消费:</td>
						<td>
							<s:textfield name="toiletryPay" id="toiletryPay" disabled="true"></s:textfield>
						</td>
						
					</tr>
					<tr>
						<td>母婴消费:</td>
						<td>
							<s:textfield name="momAndBabyPay" id="momAndBabyPay" disabled="true"></s:textfield>
						</td>
						
					</tr>
					<tr>
						<td>其他消费:</td>
						<td>
							<s:textfield name="otherPay" id="otherPay" disabled="true"></s:textfield>
						</td>
						
					</tr>
					<tr>
						<td>制定计划的时间为：</td>
						<td>
							<s:textfield name="planTime" id="planTime" disabled="true"></s:textfield>
						</td>
						
					</tr>
					<tr>
						<td>当月计划消费总额：</td>
						<td>
							<s:textfield name="totalPlanPay" id="totalPlanPay" disabled="true"></s:textfield>
						</td>
					</tr>
					<s:hidden id="consumePlanId" name="id"></s:hidden>
					<s:hidden id="userId" name="user.id"></s:hidden>
					<tr>
						<td>
							<input type="button" id="setConsumePlan" value="修改"  onclick="reSetConsumePlan()"/>
						</td>
						<td>
							<%-- <s:submit id="submitUpdate" value="确定修改"></s:submit> --%>
							<input type="submit" id="submitUpdate" value="确定修改">
						</td>
					</tr>
					<!-- <input type="submit" id="sumitUpdate" > -->
					
				</table>
				
			</s:form>
			
	</center>
</body>
<script type="text/javascript">
	function reSetConsumePlan(){
		$("#everyDayPay").removeAttr("disabled");
		$("#electricPay").removeAttr("disabled");
		$("#costumePay").removeAttr("disabled");
		$("#gongingOutPay").removeAttr("disabled");
		$("#toiletryPay").removeAttr("disabled");
		$("#momAndBabyPay").removeAttr("disabled");
		$("#otherPay").removeAttr("disabled");
		
	}
</script>
</html>