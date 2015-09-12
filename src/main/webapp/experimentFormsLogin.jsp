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
<title>SpringMVCHelloWorldJSPExample Experiment Forms Login JSP Page</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<form:form id="postExperimentForm" method="post" action="experimentforms" modelAttribute="mainForm">
			<form:label path="mainFormId">Main Form Id</form:label>
			<form:input id="mfId" path="mainFormId" size="12" />
			<form:errors path="mainFormId" cssClass="error" />
		<form:form id="postExperimentEmpForm" method="post" action="experimentparams" modelAttribute="employee">
			<!-- modelAttribute="employee" OR commandName="employee"  modelAttribute="employee" - value should be same as used in Controllers @ModelAttribute(employee) Employee employee -->
			<h3>Experiment Employee Login Sub Form</h3>
			<input type="hidden" id="employeeCode" name="employeeCode"
				value="employeeCode" />
			<!-- We can either use hidden param or form path attribute as parameter for hitting post -->
			<table align="center">
				<tr>
					<td align="left"><form:label path="employeeId">Employee Id</form:label></td>
					<td width="15%" align="left"><form:input id="empId"
							path="employeeId" size="12" /></td>
					<td><form:errors path="employeeId" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left"><form:label path="employeeFirstName">Employee FirstName</form:label></td>
					<td width="15%" align="left"><form:input id="empFirstName"
							path="employeeFirstName" size="12" /></td>
					<td><form:errors path="employeeFirstName" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left"><form:label path="employeeLastName">Employee LastName</form:label></td>
					<td width="15%" align="left"><form:input id="empLastName"
							path="employeeLastName" size="12" /></td>
					<td><form:errors path="employeeLastName" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left"><form:label path="employeeAge">Employee Age</form:label></td>
					<td width="15%" align="left"><form:input id="empAge"
							path="employeeAge" size="12" /></td>
					<td><form:errors path="employeeAge" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left"><form:label path="employeeDOB">Employee DOB</form:label></td>
					<td width="15%" align="left"><form:input id="empLastName"
							path="employeeDOB" size="12" /></td>
					<td><form:errors path="employeeDOB" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left"><form:label path="employeeEmail">Employee Email</form:label></td>
					<td width="15%" align="left"><form:input id="empLastName"
							path="employeeEmail" size="12" /></td>
					<td><form:errors path="employeeEmail" cssClass="error" /></td>
				</tr>
			</table>
			<br />
			<input type="submit" value="SUBMIT EMPLOYEE SUB FORM" />
		</form:form>
		<form:form id="postExperimentProjectForm" method="post" action="experimentparams" modelAttribute="project">
			<!-- modelAttribute="project" OR commandName="project"  modelAttribute="project" - value should be same as used in Controllers @ModelAttribute(project) Project project -->
			<h3>Experiment Project Login Sub Form</h3>
			<input type="hidden" id="projectCode" name="projectCode"
				value="projectCode" />
			<!-- We can either use hidden param or form path attribute as parameter for hitting post -->
			<table align="center">
				<tr>
					<td align="left"><form:label path="projectId">Project Id</form:label></td>
					<td width="15%" align="left"><form:input id="prjId"
							path="projectId" size="12" /></td>
					<td><form:errors path="projectId" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left"><form:label path="projectName">Project Name</form:label></td>
					<td width="15%" align="left"><form:input id="prjName"
							path="projectName" size="12" /></td>
					<td><form:errors path="projectName" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left"><form:label path="projectDuration">Project Duration</form:label></td>
					<td width="15%" align="left"><form:input id="prjDuration"
							path="projectDuration" size="12" /></td>
					<td><form:errors path="projectDuration" cssClass="error" /></td>
				</tr>
			</table>
			<br />
			<input type="submit" value="SUBMIT PROJECT SUB FORM" />
		</form:form>
		<input type="submit" value="SUBMIT MAIN FORM" />
	</form:form>
</body>
</html>