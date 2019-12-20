<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>
	<fieldset>
		<a href="./home">Home</a><a style="float: right" href="./logout"></a>
		<h4><%=msg %></h4>
		<fieldset align="center">
		<legend>Change password</legend>
		<form action="./changepassword" method="post">
			<table align="center">
				<tr>
					<td>New password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm password</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="change password"></td>
				</tr>
			</table>

		</form>

	</fieldset>
</body>
</html>