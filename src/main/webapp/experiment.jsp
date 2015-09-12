<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Experiment JSP Page</title>
</head>
<body>
	<br />
	<a href="./generic_success.jsp"><u>href calling JSP</u></a>
	<br />
	<br />
	<%@ include file="./generic_included.jsp"%>
	<!-- Including a jsp -->
	<!-- OR -->
	<%-- <jsp:include page="./generic_included.jsp"></jsp:include> --%> <!-- jsp:include -->
	<br />
	<br />
	<%-- <jsp:forward page="./generic_included.jsp"></jsp:forward> --%>
	<!-- jsp:forward forwards to a specified jsp -->
	<br />
	<input type="hidden" name="Language" value="English"> <!-- This field is hidden and not visible in UI -->
	<br />
	<div id="mydiv"></div>
</body>
</html>