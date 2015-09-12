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
<title>Session Data POST Success Details JSP Page</title>
</head>
<body>
<!-- Employee info got from model -->
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
	<!-- Person info got from session -->
	<c:if test="${not empty personResponse}">
		<h2>Submitted Person Form Information From UI</h2>
		<br/>
		<li><c:if test="${not empty personResponse.fname}"><c:out value="${personResponse.fname}" /></c:if></li>
		<li><c:if test="${not empty personResponse.mname}"><c:out value="${personResponse.mname}" /></c:if></li>
		<li><c:if test="${not empty personResponse.lname}"><c:out value="${personResponse.lname}" /></c:if></li>
		<li><c:if test="${not empty personResponse.age}"><c:out value="${personResponse.age}" /></c:if></li>
		<li><c:if test="${not empty personResponse.phoneNumber}"><c:out value="${personResponse.phoneNumber}" /></c:if></li>
		<li><c:if test="${not empty personResponse.email}"><c:out value="${personResponse.email}" /></c:if></li>
		<li><c:if test="${not empty personResponse.car}"><c:out value="${personResponse.car}" /></c:if></li>
		<li><c:if test="${not empty personResponse.minLengthCheck}"><c:out value="${personResponse.minLengthCheck}" /></c:if></li>
		<li><c:if test="${not empty personResponse.maxLengthCheck}"><c:out value="${personResponse.maxLengthCheck}" /></c:if></li>
	</c:if>
</body>
</html>