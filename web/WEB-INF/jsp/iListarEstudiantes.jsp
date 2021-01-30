<%-- 
    Document   : iListarEstudiantes
    Created on : 16-01-2021, 11:59:37 AM
    Author     : Usuario
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Estudiantes</title>
    </head>
    <body>
        <h1>><font size="40">Lista de Estudiantes</font></h1>
         <table border="2">
            <thead>
                <tr>
                    <th>id</th>
                    <th>ru</th>
                    <th>nombre</th>
                    <th>apellido1</th>
                    <th>apellido2</th>                  
                    <th>proyecto</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach  items="${listado}" var="e">
                    <tr>
                        <td> <c:out value="${e.id}"/></td>
                        <td> <c:out value="${e.ru}"/></td>
                        <td> <c:out value="${e.nombre}"/></td>
                        <td> <c:out value="${e.apellido1}"/></td>
                        <td> <c:out value="${e.apellido2}"/></td>
                        <td> <a href="<c:url value="iListarProyectos.htm?id=${e.id}"/>"> ver proyectos </a>
                        
                    </tr> 
                </c:forEach>
                    
            </tbody>
            
        </table>

    </body>
</html>
