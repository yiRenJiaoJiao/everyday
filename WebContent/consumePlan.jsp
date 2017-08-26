<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>消费计划表</h3>
		<s:form action="consumePlan_addConsumePlan.action" method="post">
			<table>
				<tr>
					<td>消费类别</td>
					<td>预计消费金额</td>
				</tr>
				
				<tr>
					<td>
						<span>日用品消费：</span>
						
					</td>
					<td><s:textfield name="everyDayPay" id="everyDayPay"></s:textfield>
					</td>
					<td>
						<textarea rows="1" cols="3">备注：</textarea>
					</td>
				</tr>
				<tr>
					<td>
						<span>电子产品消费：</span>
						
					</td>
					<td><s:textfield name="electricPay" id="electricPay"></s:textfield>
					</td>
					<td>
						<textarea rows="1" cols="3">备注：</textarea>
					</td>
				</tr>
				
				<tr>
					<td>
						<span>服饰消费：</span>
						
					</td>
					<td><s:textfield name="costumePay" id="costumePay"></s:textfield>
					</td>
					<td>
						<textarea rows="1" cols="3">备注：</textarea>
					</td>
				</tr>
				<tr>
					<td>
						<span>出行消费：</span>
						
					</td>
					<td><s:textfield name="gongingOutPay" id="gongingOutPay"></s:textfield>
					</td>
					<td>
						<textarea rows="1" cols="3">备注：</textarea>
					</td>
				</tr>
				<tr>
					<td>
						<span>化妆品：</span>
						
					</td>
					<td><s:textfield name="toiletryPay" id="toiletryPay"></s:textfield>
					</td>
					<td>
						<textarea rows="1" cols="3">备注：</textarea>
					</td>
				</tr>
				<tr>
					<td>
						<span>母婴：</span>
						
					</td>
					<td><s:textfield name="momAndBabyPay" id="momAndBabyPay"></s:textfield>
					</td>
					<td>
						<textarea rows="1" cols="3">备注：</textarea>
					</td>
				</tr>
				<tr>
					<td>
						<span>其他消费：</span>
						
					</td>
					<td><s:textfield name="otherPay" id="otherPay"></s:textfield>
					</td>
					<td>
						<textarea rows="1" cols="3">备注：</textarea>
					</td>
				</tr>
			</table>
			<tr>
			<td>
				<input type="submit" value="提交" />
			</td>
			
			</tr>
			
		</s:form>
	</center>
</body>
</html>