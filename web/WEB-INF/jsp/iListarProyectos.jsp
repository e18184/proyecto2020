<%-- 
    Document   : listarProyectos
    Created on : 28-01-2021, 11:41:52 AM
    Author     : Usuario
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset=UTF-8">
        <title>Proyectos</title>
    </head>
    <body>
        <h1>><font size="40">Lista de Proyectos</font></h1>
         <table border="2">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>TITULO</th>
                    <th>NOTA</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach  items="${list}" var="p">
                    <tr>
                        <td> <c:out value="${p.id}"/></td>
                        <td> <c:out value="${p.titulo}"/></td>          
                        <td> <a href="<c:url value="calificar.htm?id=${p.id}"/>">calificar </a>
                        </td> 
                        
                    </tr> 
                </c:forEach>
                    
            </tbody>
            
        </table>
    </body>
</html>
