<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Message Details Page</title>
<script src="jquery-2.1.1.min.js"></script>
</head>
<script>
	$(document).ready(function() {
		if (message == null) {
			alert("message is null");
		} else if (messageFrom == null) {
			alert("messageFrom is null");
		} else
			(messageTime == null)
		{
			alert("messageTime is null");
		}
	});
</script>
<body>
	<h1>Message Details :</h1>
	<br />
	<c:if test="${not empty message}">
		<!-- null or empty check using JSTL -->
		<p>Message is: ${message}</p>
	</c:if>
	<c:if test="${not empty messageFrom}">
		<p>Message is: ${messageFrom}</p>
	</c:if>
	<c:if test="${not empty messageTime}">
		<p>Message is: ${messageTime}</p>
	</c:if>

	<c:if test="${not empty messageList1}">
		<!-- For each iteration in using JSTL -->
		<ul>
			<c:forEach items="${messageList1}" var="value">
				<li><c:out value="${value}" /></li>
			</c:forEach>
		</ul>
	</c:if>

	<c:if test="${not empty messageList2}">
		<!-- For each iteration in using JSTL -->
		<ul>
			<c:forEach items="${messageList2}" var="value">
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