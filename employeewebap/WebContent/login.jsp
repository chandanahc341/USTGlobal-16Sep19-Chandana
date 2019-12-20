<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request" /> 
<%
	String id = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
%>
<body>
	<h4><%=msg%></h4>
	<fieldset align='center'>
		<form action='./login' method='post'>
			<table align='center'>
				<h1 align='center'>Login Page</h1>
				<tr>
					<td>Id:</td>
					<td><input type='number' name='id' value='"+id+"'></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td>Remember</td>
					<td><input type='checkbox' name='rememberme' value='checked'></td>
				</tr>
				<tr>
					<td><button type='submit'>login</button></td>
				</tr>
				</form>
				</fieldset>
				<a href='register.html'></a>
</body>
</html>