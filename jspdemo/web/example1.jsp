<%-- 
    Document   : example1
    Created on : Jul 6, 2026, 1:47:42 PM
    Author     : minhloan
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.Date, java.util.ArrayList"%>
<%@page errorPage="myerror.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> <%= "Hello JSP"%></h1>
        <%= 5 + 6%> <br/>

        <%
            //java.util.Date date = new java.util.Date();
            Date date = new Date();
            out.print(date.getDate());
            ArrayList alist = new ArrayList();
            int x = 5;
            int y = 0;
            int z = x / y;
            out.print("Z: " + z);
//            public void sum(int k,int l){
//                
//            }
            class MyClass2 {
                public void display(){

                }
            }

        %>        
        <%= date.getMonth() + 1%>
        
    <%--    <%= z%>  --%>

        <%!
            int a = 10;

            public void sum(int k, int l) {
            }

            class MyClass {
                public void display(){

                }
            }
        %>        
    </body>
</html>
