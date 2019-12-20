<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./home">Home</a>
	<a href="./logout" style="float: right;">Logout</a>
	<fieldset>
		<legend>Update Profile</legend>
		<h2>${msg}</h2>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Change Name:</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Change Email:</td>
					<td><input type="email" name="email"></td>
				</tr>

				<tr>
					<td>Change DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>

				<tr>
					<td>Change Gender:</td>
					<td><select name="gender" required="required">
							<option>-----Select-----</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" name="update"></td>
				</tr>

</body>
</html>