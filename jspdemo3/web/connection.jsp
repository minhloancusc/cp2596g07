<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Connection</h1>
        <sql:setDataSource var="conn" driver="com.microsoft.sqlserver.jdbc.SQLServerDriver" 
                           url="jdbc:sqlserver://localhost:1433;databaseName=northwind;encrypt=false" 
                           user="sa" password="sqladmin" scope="session"/>           
        ${(conn!=null)?"Ket noi thanh cong":"Ket noi khong thanh cong"}
        <jsp:forward page="admin_dashboard.jsp"/>
    </body>
</html>
