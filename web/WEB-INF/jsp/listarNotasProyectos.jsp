<%-- 
    Document   : listarNotasProyectos
    Created on : 29-01-2021, 01:50:36 PM
    Author     : Usuario
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <c:forEach  items="${listado}" var="pro">
                    <tr>
                        <td> <c:out value="${pro.idproyecto}"/></td>
                        <td> <c:out value="${pro.titulo}"/></td>          
                        <td> <c:out value="${pro.nota}"/></td> 
                       <td> <a href="<c:url value="modificarNota.htm?id=${pro.id}"/>">modificar</a>
                        
                    </tr> 
                </c:forEach>
                    
            </tbody>
            
        </table>
    </body>
</html>
