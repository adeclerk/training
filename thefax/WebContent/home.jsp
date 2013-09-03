<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Fax</title>
<link rel="stylesheet" href="main.css" />
<script type="text/javascript">

function getLogin() {
    xmlhttp.onreadystatechange=function(){
    if(xmlhttp.readyState==4 && xmlhttp.status==200)
    {
        document.getElementById("content_container").innerHTML=xmlhttp.responseText;
    }
    else {
    alert("ERROR LOADING LOGIN FORM");
    }
    }
    xmlhttp.open("GET","login.html",true);
    xmlhttp.send();
}
</script>
</head>
<% if(request.getParameter("logout") != null)
        session.invalidate(); %>
<body onload="getLogin()">
<jsp:include page="banner.jsp" />
<div id="content_container">
    <% if(request.getParameter("invalid") != null) {
     %>
     <div id="error" class="window">
        <div class="title">Error!</div>
        <span style="color: red; text-align: center;">Error: Invalid User or Password</span>
     </div>
     <% } %>
 <form action="user.fax">
 <div id="login_form" class="window">
     <div class="title">Login</div>
     <div class="field">Username: <input type="text" name="user"></div>
     <div class="field">Password: <input type="password" name="password"></div>
     <input type="submit" value="Submit" class="center">
     <div id="new_user">New User? <a href="registration.jsp">Register.</a></div>
 </div>
 </form>
     <div id="welcome" class="window">
        <div class="title">Welcome</div>
        <div class="p_title">Welcome to The Fax!</div>
    
    </div>
</div>
<div id="footer">
<div id="copyright">&copy;2013</div></div>
</body>
</html>