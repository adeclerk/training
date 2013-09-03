<%@page import="weblogic.apache.org.apache.velocity.runtime.directive.Foreach"%>
<%@page import="com.thefax.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Fax Catalog</title>
<link rel="stylesheet" href="main.css" />
</head>
<body>
<jsp:include page="banner.jsp" />
<div id="content_container">
    <div class="window" id="catalog">
        <div class="title">Catalog</div>
        <table id="cat_table">
            <tr class="table_head">

                <th>Description</th>
                <th>Price</th>
                <th>Buy</th>
             </tr>
        <% 
            if(session.getAttribute("USER") == null) 
                response.sendRedirect("home.jsp");
            ArrayList<ProductBean> catalog = (ArrayList<ProductBean>) request.getAttribute("CATALOG");
            for(ProductBean cur : catalog){
         %>
         <tr>

            <td class="product_description"><%= cur.getDescription() %></td>
            <td class="product_price"> $<%= cur.getPrice() %></td>
            <td class="product_buy"><a href="shopping.fax?code=<%= cur.getCode() %>"><img src="add-to-cart-dark.png" width="30px" /></a></td>
         </tr>
         <%} %>
         </table>
    </div>
    <div class="window" id="shopping_cart">
        <div class="title">Shopping Cart</div>
        <% ArrayList<ProductBean> cart = (ArrayList<ProductBean>) session.getAttribute("CART");
            int items = 0;
            double total = 0; 
            if(cart != null) {
                for(ProductBean item : cart){
                    items++;
                    total += item.getPrice();
                }
             }%>
        <div class="shopping_cart_items">Items: <%=items %> (<a href="checkout.jsp">view/edit</a>)</div>
        <div class="shopping_cart_total">Total: $<%=total %></div>
    </div>
</div>
<div id="footer"><div id="copyright">&copy;2013</div></div>
</body>
</html>