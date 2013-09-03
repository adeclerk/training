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
<div id="product_container">
    <div class="window" id="product_summary">
        <div class="title">Item Summary</div>
    <% ProductBean product = (ProductBean) request.getAttribute("PRODUCT"); %>
             <div>
                <div class="product_summary_description">Item: <%=product.getDescription() %></div>
                <div class="product_summary_price">Price: $<%=product.getPrice() %></div>
                <a href="shopping.fax"><input type="button" value="Continue Shopping" class="add_item"></a>
                <a href="checkout.jsp"><input type="button" value="Checkout" class="checkout"></a>
             </div>
             
             
    </div>
</div>
</div>
<div id="footer"><div id="copyright">&copy;2013</div></div>
</body>
</html>