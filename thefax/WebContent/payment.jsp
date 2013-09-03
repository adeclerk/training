<%@page import="weblogic.apache.org.apache.velocity.runtime.directive.Foreach"%>
<%@page import="com.thefax.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
            <% 
            if(session.getAttribute("USER") == null) 
                response.sendRedirect("home.jsp");
         %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkout - Payment</title>
<link rel="stylesheet" href="main.css" />
</head>
<body>
<jsp:include page="banner.jsp" />
<div id="content_container">
 
    <div class="window" id="payment">
           <% ArrayList<ProductBean> cart = (ArrayList<ProductBean>) session.getAttribute("CART");
           session.setAttribute("CART",cart);
           double total = 0;
            for(ProductBean cur : cart){
                total += cur.getPrice();
            }
         %>
        <div class="title">Payment</div>
        <div id="total_payment">Total: $<%= total %></div>
        <form name="payment" action="">
            <div id="cc_num">Credit Card #: <input type="text" name="cc"></div>
            <div id="cc_name_field">Name on Card: <input type="text" name="cc_name"></div>
            <div id="cc_cvv" class="inline">CCV: <input type="text" name="ccv" size="3" maxlength="3"></div>
            <div id="cc_exp">Expiration: 
            <select class="inline">
                <% for(int i = 1; i < 13; i++) {
                    if(i < 10) {%>
                    <option value="<%=i%>">0<%=i %></option>
                    <% } else { %>
                    <option value="<%=i%>"><%=i%></option>
                    <% } } %>
            </select>
            <select class="inline">
                <% for (int i = 2013; i < 2020; i++) {%>
                <option value="<%= i %>"><%= i %></option>
                <% } %>
            </select>
            </div>
            <input id="cc_submit" type="submit" value="Continue">
        </form>
    </div>


</div>
<div id="footer"><div id="copyright">&copy;2013</div></div>
</body>
</html>