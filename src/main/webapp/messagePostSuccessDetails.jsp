<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ taglib prefix="spring" uri="spring.tld" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Message POST Success Details JSP Page</title>
</head>
<body>
	<c:if test="${not empty responseMessage}">
		<h2>Submitted Message Form Information From UI</h2>
		<br/>
		<li><c:if test="${not empty messageResponse.messageId}"><c:out value="${messageResponse.messageId}" /></c:if></li>
		<li><c:if test="${not empty messageResponse.messageContent}"><c:out value="${messageResponse.messageContent}" /></c:if></li>
		<li><c:if test="${not empty messageResponse.messageTime}"><c:out value="${messageResponse.messageTime}" /></c:if></li>
	</c:if>
</body>
</html>