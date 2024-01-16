<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/SpringCrud/Product/editProduct" method="post">
       Product id : <input type="text" name="pid" id="pid" value="${p.prodId}" readonly><br>
       Product Desc : <input type="text" name="pname" value="${p.desc}" id="pname"><br>
        
         <button type="submit" name="btn" id="btn">Add new Product</button>
   </form>

</body>
</html>