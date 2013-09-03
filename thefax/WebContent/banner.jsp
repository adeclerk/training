<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
    <div id="banner" style="overflow: hidden;">
    <h1 style="text-align: center;">TheFax.com</h1>
    <% String user = (String) session.getAttribute("USER"); 
        if(user != null) {
    %>
        <div style="text-align: center;"><%=user %>'s Online Shopping destination!</div>
         <div style="float: right;">
            <a href="home.jsp?logout=yes"><input type="button" value="logout"></a>
        </div>
    <% } else { %>
    <div style="text-align: center;">Your Online Shopping destination!</div>
    <% } %>
    
</div>
</body>
</html>