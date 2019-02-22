<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="world" commandName="user">
	<table>
			<tr><td>Username</td><td><f:input path="uname"/></td><f:errors path="uname" cssStyle="color:red;"/></tr>
			<tr><td>Password</td><td><f:password path="pass"/><f:errors path="pass" cssStyle="color : red;"/></td></tr>	
			<tr><td><f:button >Submit</f:button></td></tr>
	</table>

</f:form>

</body>
</html>