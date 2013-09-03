<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Output</title>
</head>
<body>
    <jsp:useBean id="pers" class="cc.mv.bean.PersonBean" scope="session"/>
    
    Name: <jsp:getProperty property="name" name="pers" /><br/>
    Age: <jsp:getProperty property="age" name="pers" /> <br/>
    City: <jsp:getProperty property="city" name="pers" />
</body>
</html>