<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<table border="2">
<tr>
<th>ID</th>
<th>Name</th>
<th>SALARY</th>
<th>OPTION</th>
</tr>
<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.empNo}</td>
<td>${emp.empName}</td>
<td>${emp.sal}</td>
<td>
<a href="EditEmp?empNo=${emp.empNo}">EditEmp</a> /
<a href="#">DeleteEmp</a>
</td>
</tr>
</c:forEach>
</table>

<a href="AddEmp.jsp">AddNewEmp</a>
</body>
</html>