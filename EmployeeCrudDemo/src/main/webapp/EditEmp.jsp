<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EditEmp" method="post">
<input type="number" value="${emp.empNo}" name="${emp.empNo}"  readonly></input><br>
<input type="text" value="${emp.empName}" name="${emp.empName}"></input><br>
<input type="number" value="${emp.sal}" name="${emp.sal}"></input><br>
<input type="submit" value="AddEmp">
</form>
</body>
</html>

