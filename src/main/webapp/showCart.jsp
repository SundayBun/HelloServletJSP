<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: User1
  Date: 04-Apr-21
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<% Cart cart=(Cart)session.getAttribute("cart");%>
<p>Name: <%=cart.getName()%></p>
<p>Quantity: <%=cart.getQuantity()%></p>
</body>
</html>
