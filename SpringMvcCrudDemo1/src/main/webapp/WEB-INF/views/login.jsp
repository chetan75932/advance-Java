<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="/validate" method="post">
    UserName :<input type="text" name="uname" id="un" placeHolder="Enter Uname"/><br>
    Password : <input type="password" name="passwd" id="passwd" placeHolder="Enter Password"/><br>
    <input type="submit" name="btn" id="btn" value="Login"/>
</form>
</body>
</html>