<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="${param.lang }" />
<fmt:setBundle basename="msgresource" />
    <h1><fmt:message key="hello.msg" /></h1>
    <h2><fmt:message key="welcome.msg" /></h2>
    <h3><%= new Date() %></h3>
    
    <a href="hello.jsp?lang=en">English</a> |
     <a href="hello.jsp?lang=fr">French</a> | 
     <a href="hello.jsp?lang=es">Spanish</a>
</body>
</html>