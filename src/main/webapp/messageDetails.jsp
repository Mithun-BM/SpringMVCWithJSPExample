<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Message Details Page</title>
</head>
<body>
	<h1>Message Details :</h1>
	<br />
	<!-- Display Message Using Model Attribute -->
	<c:if test="${not empty messageModel}">
		<!-- null or empty check using JSTL -->
		<p>Message is: ${messageModel}</p>
	</c:if>
	<c:if test="${not empty messageFromModel}">
		<p>Message From: ${messageFromModel}</p>
	</c:if>
	<c:if test="${not empty messageTimeModel}">
		<p>Message Time: ${messageTimeModel}</p>
	</c:if>

	<!-- Display Message Using ModelMap Attribute -->
	<c:if test="${not empty messageModelMap}">
		<!-- null or empty check using JSTL -->
		<p>Message is: ${messageModelMap}</p>
	</c:if>
	<c:if test="${not empty messageFromModelMap}">
		<p>Message From: ${messageFromModelMap}</p>
	</c:if>
	<c:if test="${not empty messageTimeModelMap}">
		<p>Message Time: ${messageTimeModelMap}</p>
	</c:if>
	
	<!-- Display MessageList Using Model Attribute -->
	<c:if test="${not empty messageList1Model}">
		<!-- For each iteration in using JSTL -->
		<ul>
			<c:forEach items="${messageList1Model}" var="value">
				<li><c:out value="${value}" /></li>
			</c:forEach>
		</ul>
	</c:if>

	<!-- Display Message Using Model Attribute -->
	<c:if test="${not empty messageList2Model}">
		<!-- For each iteration in using JSTL -->
		<ul>
			<c:forEach items="${messageList2Model}" var="value">
				<li><c:out value="${value.mesageId}" /></li>
				<!-- Either this -->
				<li><c:out value="${value.mesageContent}" /></li>
				<li><c:out value="${value.mesageTime}" /></li>

				<!-- <li><c:out value="${value.getMesageContent()}"/></li> Or Either this. Both of them work 
		  		<li><c:out value="${value.getMesageId()}"/></li>
		  		<li><c:out value="${value.getMesageTime()}"/></li> -->
			</c:forEach>
		</ul>
	</c:if>
	
	<!-- Display MessageList Using ModelMap Attribute -->
	<c:if test="${not empty messageList1ModelMap}">
		<!-- For each iteration in using JSTL -->
		<ul>
			<c:forEach items="${messageList1ModelMap}" var="value">
				<li><c:out value="${value}" /></li>
			</c:forEach>
		</ul>
	</c:if>

	<!-- Display Message Using ModelMap Attribute -->
	<c:if test="${not empty messageList2ModelMap}">
		<!-- For each iteration in using JSTL -->
		<ul>
			<c:forEach items="${messageList2ModelMap}" var="value">
				<li><c:out value="${value.mesageId}" /></li>
				<!-- Either this -->
				<li><c:out value="${value.mesageContent}" /></li>
				<li><c:out value="${value.mesageTime}" /></li>

				<!-- <li><c:out value="${value.getMesageContent()}"/></li> Or Either this. Both of them work 
		  		<li><c:out value="${value.getMesageId()}"/></li>
		  		<li><c:out value="${value.getMesageTime()}"/></li> -->
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>