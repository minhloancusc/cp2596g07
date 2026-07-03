<%-- 
    Document   : region
    Created on : Jul 2, 2026, 1:35:15 PM
    Author     : minhloan
--%>

<%@page import="java.util.List"%>
<%@page import="mypack.Region"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  Region regionEdit = null;
            if(request.getAttribute("regionEdit")!=null){
                regionEdit = (Region)request.getAttribute("regionEdit");
                out.print(regionEdit.getRegionID());
                out.print(regionEdit.getRegionDescription());
            }
        %>
        <h1>Region</h1>
        <form method="POST" action="DemoCSDL">
            <table border="0">
                <thead>
                    <tr>
                        <th>Region Form</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Region ID</td>
                        <td><input type="text" name="regionID" value="<%= ((regionEdit!=null)?regionEdit.getRegionID():"") %>" /></td>
                    </tr>
                    <tr>
                        <td>Region Description</td>
                        <td><input type="text" name="regionDescription" value="<%= ((regionEdit!=null)?regionEdit.getRegionDescription():"") %>" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Add" name="btnAdd" />
                            <input type="reset" value="Reset" />
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
        <br/>
        <!--View-->
        <%
            List<Region> listRegion = (List<Region>) request.getAttribute("listRegion");
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>Region ID</th>
                    <th>Region Description</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <%for (Region r : listRegion) {%>
                <tr>
                    <td><%= r.getRegionID()%></td>
                    <td><%= r.getRegionDescription()%></td>
                    <td><a href="DemoCSDL?action=edit&id=<%= r.getRegionID()%>"><img src="resources/images/icon_edit.png"/></a></td>
                    <td><a href="DemoCSDL?action=delete&id=<%= r.getRegionID()%>"><img src="resources/images/icon_delete.png" /></a></td>
                </tr>
                <% }%>
            </tbody>
        </table>

    </body>
</html>
