<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="obj" class="com.ustglobal.employeewebap.servlet.Employee" scope="application"/>
<html>

<body>
<h2><%=obj.getId() %> </h2>
<h2><%=obj.getName() %> </h2>
</body>
</html>