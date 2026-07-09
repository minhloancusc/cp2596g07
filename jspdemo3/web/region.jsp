<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!--Insert-->
<c:if test="${!empty param.addRegion}">
    <sql:update var="numinsertrow" dataSource="${conn}">
        insert into Region(RegionID,RegionDescription) values (?,?)
        <sql:param value="${param.regionID}"/>
        <sql:param value="${param.regionDescription}"/>
    </sql:update>         
</c:if>
<!--Delete-->
<c:if test="${(!empty param.action) &&(param.action=='delete')}">    
    <sql:update dataSource="${conn}">
        delete Region where RegionID = ?
        <sql:param value="${param.id}"/>
    </sql:update> 
    <c:out value="Xoa thanh cong"/>
</c:if>            
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Region</h1>
        <!--Insert-->
        <form method="POST">
            <table border="0">
                <thead>
                    <tr>
                        <th colspan="2">Region Form</th>                
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Region ID</td>
                        <td><input type="text" name="regionID" value="" /></td>
                    </tr>
                    <tr>
                        <td>Region Description</td>
                        <td><input type="text" name="regionDescription" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Add" name="addRegion" />
                            <input type="reset" value="Reset" />
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
        <br/>
        <!--View-->
        <sql:query var="rs1" dataSource="${conn}" sql="select RegionID,RegionDescription from Region"/>
        <c:choose>
            <c:when test="${rs1.rowCount!=0}">
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
                        <c:forEach var="item" items="${rs1.rows}">
                            <tr>
                                <td>${item.RegionID}</td>
                                <td>${item.RegionDescription}</td>
                                <td><a href="?id=${item.RegionID}&action=edit">Edit</a></td>
                                <td><a href="?id=${item.RegionID}&action=delete">Delete</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:when>
            <c:otherwise>
                <h2>Khong co ket qua tra ve</h2>
            </c:otherwise>
        </c:choose>

        <%--    
            <c:if test="${rs1.rowCount==0}"><h2>Khong co du lieu</h2></c:if>
            <c:if test="${!(rs1.rowCount==0)}">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Region ID</th>
                            <th>Region Description</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${rs1.rows}">
                            <tr>
                                <td>${item.RegionID}</td>
                                <td>${item.RegionDescription}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>
        --%>
    </body>
</html>
