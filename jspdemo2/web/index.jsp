<%-- 
    Document   : index
    Created on : Jul 8, 2026, 1:32:41 PM
    Author     : minhloan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="example1.jsp?param1=5">Example 1</a>  
        <!--response.sendRedirect("example1.jsp")-->
        <jsp:forward page="example1.jsp">
            <jsp:param name="var1" value="123"/>
            <jsp:param name="var2" value="678"/>
        </jsp:forward>
    </body>
</html>
