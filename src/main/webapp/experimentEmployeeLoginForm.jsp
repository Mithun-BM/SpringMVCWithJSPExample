<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ taglib prefix="spring" uri="/WEB-INF/spring.tld" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVCHelloWorldJSPExample Experiment Employee Login Form JSP
	Page</title>
	<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>
	<form:form id="postExperimentEmpForm" method="post" action="employeeSessionUsageExample" modelAttribute="employee">
		<!-- modelAttribute="employee" OR commandName="employee"  modelAttribute="employee" - value should be same as used in Controllers @ModelAttribute(employee) Employee employee -->
		<h3>Experiment Employee Login Form</h3>
		<table align="center">
			<tr>
				<td align="left"><form:label path="employeeId">Employee Id</form:label></td>
				<td width="15%" align="left"><form:input id="empId"
						path="employeeId" size="12" /></td>
						<td><form:errors path="employeeId" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeFirstName">Employee FirstName</form:label></td>
				<td width="15%" align="left"><form:input id="empFirstName"
						path="employeeFirstName" size="12" /></td>
						<td><form:errors path="employeeFirstName" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeLastName">Employee LastName</form:label></td>
				<td width="15%" align="left"><form:input id="empLastName"
						path="employeeLastName" size="12" /></td>
						<td><form:errors path="employeeLastName" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeAge">Employee Age</form:label></td>
				<td width="15%" align="left"><form:input id="empAge"
						path="employeeAge" size="12" /></td>
						<td><form:errors path="employeeAge" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeDOB">Employee DOB</form:label></td>
				<td width="15%" align="left"><form:input id="empLastName"
						path="employeeDOB" size="12" /></td>
						<td><form:errors path="employeeDOB" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="employeeEmail">Employee Email</form:label></td>
				<td width="15%" align="left"><form:input id="empLastName"
						path="employeeEmail" size="12" /></td>
						<td><form:errors path="employeeEmail" cssClass="error"/></td>
			</tr>
		</table>
		<br />
		<input type="submit" value="SUBMIT" />
	</form:form>
</body>
</html>