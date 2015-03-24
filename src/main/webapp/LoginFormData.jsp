<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVCHelloWorldJSPExample Login Form Data JSP Page</title>
</head>
<body>
	<form:form id="msgForm" method="post" action="postFormData"
		modelAttribute="message"><!-- modelAttribute="message" OR commandName="message"  modelAttribute="message" - value should be same as used in Controllers @ModelAttribute(message) Message message -->
		<table align="center">
			<tr>
				<td align="left"><form:label path="mesageId">Message Id</form:label></td><!-- path="mesageId" - field attribute value should be same as used in Message model class -->
				<td width="15%" align="left"><form:input id="msgId"
						path="mesageId" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="mesageContent">Message Content</form:label></td><!-- path="mesageContent" - field attribute value should be same as used in Message model class -->
				<td width="15%" align="left"><form:input id="msgContent"
						path="mesageContent" size="12" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="mesageTime">Message Time</form:label></td><!-- path="mesageTime" - field attribute value should be same as used in Message model class -->
				<td width="15%" align="left"><form:input id="msgtime"
						path="mesageTime" size="12" /></td>
			</tr>
		</table>
		<br />
		<input type="submit" value="SUBMIT" />
	</form:form>
</body>
</html>