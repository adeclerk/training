<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="main.css" />
<title>The Fax - registration</title>
</head>
<body>
<jsp:include page="banner.jsp" />
<div id="content_container">
    <form action="user.fax">
    <div id="registration_form" class="window">
        <div class="title">Registration</div>
        <div class="field">Username:<br/> <input type="text" name="username"></div>
        <fieldset>
            <legend>Password</legend>
            <div class="field">Password: <input type="password" name="pw1"></div>
            <div class="field">Repeat Password: <input type="password" name="pw2"></div>
        </fieldset>
        <div class="field">Name: <br/><input type="text" name="name"></div>
        <div class="field">Email: <br/><input type="text" name="email"></div>
        <div class="field">City: <br/>
            <select name="city">
                <% String[] city = {"Fairfax","Miami","Chicago","New York","Orlando","Boston"}; 
                    for(int i = 0; i < city.length; i++) { %>
                    <option value="<%=city[i] %>"><%=city[i] %></option>
                <% } %>
            </select>
            <br/>
        </div>
        <div class="field">Phone: <br/><input type="text" name="phone"></div>
        <div class="field">Age: <br/>
        <select name="age">
            <% for(int i = 13; i < 80; i++) { %>
                <option value="<%=i %>"><%=i %></option>
            <% } %>
        </select></div>
        
            <input type="submit" value="Submit" class="center">
    </div>
    </form>
</div>
<div id="footer"><div id="copyright">&copy;2013</div></div>
</body>
</html>