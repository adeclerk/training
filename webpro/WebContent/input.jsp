<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input</title>
</head>
<body>
    <form action="process.jsp">
        Name: <input type="text" name="name"><br/>
        Age: <input type="text" name="age" maxlength="3" size="3">
        City: <input type="text" name="city"><br/>
        <input type="submit" value="Process">
    </form>
</body>
</html>