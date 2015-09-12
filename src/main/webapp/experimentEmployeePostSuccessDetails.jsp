<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ taglib prefix="spring" uri="spring.tld" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Experiment Employee POST Success Details JSP Page</title>
</head>
<body>
	<c:if test="${not empty employeeResponse}">
		<h2>Submitted Employee Form Information From UI</h2>
		<br/>
		<li><c:if test="${not empty employeeResponse.employeeId}"><c:out value="${employeeResponse.employeeId}" /></c:if></li>
		<li><c:if test="${not empty employeeResponse.employeeFirstName}"><c:out value="${employeeResponse.employeeFirstName}" /></c:if></li>
		<li><c:if test="${not empty employeeResponse.employeeLastName}"><c:out value="${employeeResponse.employeeLastName}" /></c:if></li>
		<li><c:if test="${not empty employeeResponse.employeeAge}"><c:out value="${employeeResponse.employeeAge}" /></c:if></li>
		<li><c:if test="${not empty employeeResponse.employeeDOB}"><c:out value="${employeeResponse.employeeDOB}" /></c:if></li>
		<li><c:if test="${not empty employeeResponse.employeeEmail}"><c:out value="${employeeResponse.employeeEmail}" /></c:if></li>
	</c:if>
	<c:if test="${not empty projectResponse}">
		<h2>Submitted Project Form Information From UI</h2>
		<br/>
		<li><c:if test="${not empty projectResponse.projectId}"><c:out value="${projectResponse.projectId}" /></c:if></li>
		<li><c:if test="${not empty projectResponse.projectName}"><c:out value="${projectResponse.projectName}" /></c:if></li>
		<li><c:if test="${not empty projectResponse.projectDuration}"><c:out value="${projectResponse.projectDuration}" /></c:if></li>
	</c:if>
</body>
</html>