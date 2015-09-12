<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVCHelloWorldJSPExample GET Employee Form Data JSP
	Page</title>
</head>
<body>
	<form:form id="getEmpForm" method="get"
		action="getEmployeeFormData1stWay" modelAttribute="employeeForm" >
		<!-- modelAttribute="employeeForm" OR commandName="employeeForm" - value should be same as used in Controllers !model.containsAttribute("employeeForm") -->
		<table align="center">
			<tr>
				<td align="left"><form:label path="employeeId">Employee Id</form:label></td>
				<td width="15%" align="left"><form:input id="empId"
						path="employeeId" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeFirstName">Employee FirstName</form:label></td>
				<td width="15%" align="left"><form:input id="empFName"
						path="employeeFirstName" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeLastName">Employee LastName</form:label></td>
				<td width="15%" align="left"><form:input id="empLName"
						path="employeeLastName" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeAge">Employee Age</form:label></td>
				<td width="15%" align="left"><form:input id="empAge"
						path="employeeAge" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeDOB">Employee DOB</form:label></td>
				<td width="15%" align="left"><form:input id="empDOB"
						path="employeeDOB" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeEmail">Employee Email</form:label></td>
				<td width="15%" align="left"><form:input id="empEmail"
						path="employeeEmail" size="12" /></td>
			</tr>
		</table>
		<br />
		<input type="submit" value="SUBMIT" />
	</form:form>
</body>
</html>