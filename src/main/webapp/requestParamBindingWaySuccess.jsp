<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVCHelloWorldJSPExample Request Param Binding Way
	Success JSP Page</title>
</head>
<body>
	<c:if test="${not empty requestParamBindingWayFName}">
		<h2>Information From UI :</h2>
		<br/>
		<c:out value="${requestParamBindingWayFName}" />
	</c:if>
	<br/>
	<c:if test="${not empty requestParamBindingWayLName}">
		<h2>Information From UI :</h2>
		<br/>
		<c:out value="${requestParamBindingWayLName}" />
	</c:if>
	<br/>
	<c:if test="${not empty requestParamBindingWayAge}">
		<h2>Information From UI :</h2>
		<br/>
		<c:out value="${requestParamBindingWayAge}" />
	</c:if>
	
</body>
</html>