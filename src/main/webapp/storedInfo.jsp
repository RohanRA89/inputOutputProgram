<%@ page import="com.ironyard.data.gSonClass" %><%--
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
<%
    gSonClass personObj = (gSonClass) request.getSession().getAttribute("person");
    if(personObj != null){%>
        <h3>Hello your name is:
            <strong>
                <%=personObj.getFirstName()%>
                <%=personObj.getLastName()%>
            </strong>
        </h3>
        <h3>You are:
            <strong>
                <%=personObj.getPersonAge()%>
            </strong>years old
        </h3>
        <h3>You were born in
            <strong>
                <%=personObj.getCityName()%>
            </strong> ,
            <strong>
                <%=personObj.getCountryName()%>
            </strong></h3>
    <%}%>

</body>
</html>
