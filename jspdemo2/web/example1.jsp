<%-- 
    Document   : example1
    Created on : Jul 8, 2026, 1:32:55 PM
    Author     : minhloan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Example 1</h1>
        <%@include  file="header.jsp" %>
        <jsp:include page="header.jsp" flush="true"/>
        Var 1: <%= request.getParameter("var1")%> <br/>
        <c:out value="${param.var1}"/>
        
        Var 2: <%= request.getParameter("var2")%>
        <c:out value="${param.var2}"/>
        <jsp:text>
            Rectangle Perimeter is: ${2* 10 + 2* 20}
        </jsp:text>
        <c:out value="Hello JSTL"/>
        <c:set var="x1" value="456"/>
        <c:out value="${x1}"/>
        <c:out value="${param.var1}"/>
        <%
            //out.print(request.getParameter("param1"));
            //response.sendRedirect("index.jsp");
            //session.setAttribute("abc", 15);
%>
    </body>
</html>
