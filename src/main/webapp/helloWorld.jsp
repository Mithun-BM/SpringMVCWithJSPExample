<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	<!-- JSTL taglib is required  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>helloWorld Message Details Page</title>
</head>
<body>
	<h1>Message :</h1>
	<br />
	<c:if test="${not empty message}">
		<!-- null or empty check using JSTL -->
		<p>Message is: ${message}</p>
	</c:if>
</body>
</html>