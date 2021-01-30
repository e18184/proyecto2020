<%-- 
    Document   : calificar
    Created on : 28-01-2021, 03:12:55 PM
    Author     : Usuario
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calificar Proyecto</title>
    </head>
    <body>
        <h1>><font size="20">Calificar </font></h1>
        
    <form:form action="calificar.htm" method="post" commandName="datos">
            
            <form:label path="nota">Nota</form:label>
            <form:input path="nota" />
            <form:hidden path="idproyecto"/>
            
           <form:button >Guardar</form:button> <a href="iListarEstudiantes.htm"> Cancelar </a>   
        </form:form>
     </body>   
    
</html>
