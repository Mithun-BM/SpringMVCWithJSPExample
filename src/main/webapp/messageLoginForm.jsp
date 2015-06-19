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
<title>SpringMVCHelloWorldJSPExample Message Login Form JSP Page</title>
</head>
<body>
	<form:form id="msgFormId" method="post" action="postMessageFormData" modelAttribute="message">
		<!-- modelAttribute="message" OR commandName="message"  modelAttribute="message" - value should be same as used in Controllers @ModelAttribute(message) Message message -->
		<table align="center">
			<tr>
				<td align="left"><form:label path="messageId">Message Id</form:label></td>
				<!-- path="messageId" - field attribute value should be same as used in Message model class -->
				<td width="15%" align="left"><form:input id="msgId"
						path="messageId" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="messageContent">Message Content</form:label></td>
				<!-- path="messageContent" - field attribute value should be same as used in Message model class -->
				<td width="15%" align="left"><form:input id="msgContent"
						path="messageContent" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="messageTime">Message Time</form:label></td>
				<!-- path="messageTime" - field attribute value should be same as used in Message model class -->
				<td width="15%" align="left"><form:input id="msgtime"
						path="messageTime" size="12" /></td>
			</tr>
		</table>
		<br />
		<input type="submit" value="SUBMIT" />
	</form:form>
</body>
</html>