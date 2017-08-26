<%@ page contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改当月消费计划</title>
</head>
<body>
	
		<span>您当月的消费计划为：</span><br/>
		
			<s:form action="{pageContext.request.contextPath}/consumePlan_addConsumePlan" method="post">
				<table>
					<tr >
						<td>日常消费:</td>
						<s:textfield name="everyDayPay" id="everyDayPay"></s:textfield>
					</tr>
					<tr>
						<td>电子产品消费:</td>
						<s:textfield name="electricPay" id="electricPay"></s:textfield>
					</tr>
					<tr>
						<td>服饰消费:</td>
						<s:textfield name="costumePay" id="costumePay"></s:textfield>
					</tr>
					<tr>
						<td>出行消费:</td>
						<s:textfield name="gongingOutPay" id="gongingOutPay"></s:textfield>
					</tr>
					<tr>
						<td>化妆品消费:</td>
						<s:textfield name="toiletryPay" id="toiletryPay"></s:textfield>
					</tr>
					<tr>
						<td>母婴消费:</td>
						<s:textfield name="momAndBabyPay" id="momAndBabyPay"></s:textfield>
					</tr>
					<tr>
						<td>化妆品消费:</td>
						<s:textfield name="toiletryPay" id="toiletryPay"></s:textfield>
					</tr>
					<tr>
						<td>制定计划的时间为：</td>
						<s:textfield name="planTime" id="planTime"></s:textfield>
					</tr>
					<tr>
						<td>当月计划消费总额：</td>
						<td>
							<s:textfield name="totalPlanPay" id="totalPlanPay"></s:textfield>
						</td>
					</tr>
					<tr>
						<td>
							<%-- <s:hidden name="User.id" id="userId"></s:hidden> --%>
							<input type="submit" value="提交"/>
						</td>
					</tr>
				</table>
				
			</s:form>
</body>
</html>