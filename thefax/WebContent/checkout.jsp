<%@page import="weblogic.apache.org.apache.velocity.runtime.directive.Foreach"%>
<%@page import="com.thefax.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%    if(session.getAttribute("USER") == null) 
                response.sendRedirect("home.jsp"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkout</title>
<link rel="stylesheet" href="main.css" />
</head>
<body>
<jsp:include page="banner.jsp" />
<div id="content_container">
    <div class="window" id="catalog">
        <div class="title">Checkout</div>
        <table id="cat_table">
            <tr class="table_head">

                <th>Description</th>
                <th>Price</th>
                <th>Buy</th>
             </tr>
        <% ArrayList<ProductBean> cart = (ArrayList<ProductBean>) session.getAttribute("CART");
            String idx = request.getParameter("index");
            if(idx != null)
                cart.remove(Integer.parseInt(idx));
           session.setAttribute("CART",cart);
            int index = 0;
            for(ProductBean cur : cart){
         %>
         <tr>

            <td class="product_description"><%= cur.getDescription() %></td>
            <td class="product_price"> $<%= cur.getPrice() %></td>
            <td class="product_buy"><a href="checkout.jsp?index=<%=index++ %>"><img src="redx.jpg" width="20px" /></a></td>
         </tr>
         <%} %>
         <tr>
         <% double total = 0;
            for(ProductBean current : cart)
                total += current.getPrice(); %>
            <td style="text-align: right;">Total </td>
            <td>$<%=total %></td>
            <td>&nbsp;</td>
         </table>
            
         <a href="shopping.fax"><input style="float: left;" type="button" value="<- Back to catalog"></a>
         <a href="payment.jsp"><input style="float: right;" type="button" value="Checkout"></a>
    </div>
</div>
<div id="footer"><div id="copyright">&copy;2013</div></div>
</body>
</html>