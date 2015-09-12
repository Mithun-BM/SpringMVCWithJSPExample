<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVCHelloWorldJSPExample GET Person Form Data JSP
	Page</title>
</head>
<body>
	<form:form id="getPersonForm" method="get" action="getPersonFormData1stWay" modelAttribute="personForm">
		<!-- modelAttribute="personForm" OR commandName="personForm"  - value should be same as used in Controllers !model.containsAttribute("personForm") -->
		<table align="center">
			<tr>
				<td align="left"><form:label path="fname">Person FirstName</form:label></td>
				<td width="15%" align="left"><form:input id="personFname"
						path="fname" size="12" /></td>
						<td><form:errors path="fname" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="mname">Person MiddleName</form:label></td>
				<td width="15%" align="left"><form:input id="personMname"
						path="mname" size="12" /></td>
						<td><form:errors path="mname" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="lname">Person LastName</form:label></td>
				<td width="15%" align="left"><form:input id="personLname"
						path="lname" size="12" /></td>
						<td><form:errors path="lname" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="age">Age</form:label></td>
				<td width="15%" align="left"><form:input id="personAge"
						path="age" size="12" /></td>
						<td><form:errors path="age" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="phoneNumber">Phone</form:label></td>
				<td width="15%" align="left"><form:input id="personPhone"
						path="phoneNumber" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="email">Email</form:label></td>
				<td width="15%" align="left"><form:input id="personEmail"
						path="email" size="12" /></td>
						<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="car">Car</form:label></td>
				<td width="15%" align="left"><form:input id="personCar"
						path="car" size="12" /></td>
						<td><form:errors path="car" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="minLengthCheck">MinLength Check</form:label></td>
				<td width="15%" align="left"><form:input id="personCar"
						path="minLengthCheck" size="12" /></td>
						<td><form:errors path="minLengthCheck" cssClass="error"/></td>
			</tr>
			<tr>
				<td align="left"><form:label path="maxLengthCheck">MaxLength Check</form:label></td>
				<td width="15%" align="left"><form:input id="personCar"
						path="maxLengthCheck" size="12" /></td>
						<td><form:errors path="maxLengthCheck" cssClass="error"/></td>
			</tr>
		</table>
		<br />
		<input type="submit" value="SUBMIT" />
	</form:form>
</body>
</html>