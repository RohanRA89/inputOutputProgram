<%--
  Created by IntelliJ IDEA.
  User: rohanayub
  Date: 1/23/17
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h3>Hello your name is: <strong><%=request.getSession().getAttribute("firName")%><%=request.getSession().getAttribute("lasName")%></strong></h3>
<h3>You are:<strong><%=request.getSession().getAttribute("ageVal")%> </strong>years old</h3>
<h3>You were born in <strong><%=request.getSession().getAttribute("cityName")%></strong> , <strong><%=request.getSession().getAttribute("countryName")%></strong></h3>

</body>
</html>
