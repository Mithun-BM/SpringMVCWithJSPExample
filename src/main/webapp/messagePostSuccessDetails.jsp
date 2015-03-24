<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Message POST Success Details JSP Page</title>
</head>
<body>
	<c:if test="${not empty responseMessage}">
		<h2>Submitted Form Message Information From UI</h2>
		<br/>
		<li><c:out value="${responseMessage.mesageId}" /></li>
		<li><c:out value="${responseMessage.mesageContent}" /></li>
		<li><c:out value="${responseMessage.mesageTime}" /></li>
	</c:if>
</body>
</html>