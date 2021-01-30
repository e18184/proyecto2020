<%-- 
    Document   : modificarNota
    Created on : 30-01-2021, 12:12:17 PM
    Author     : Usuario
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Notas</title>
    </head>
    <body>
        <h1>><font size="20">Modificar Notas</font></h1>
        
    <form:form action="modificarNota.htm" method="post" commandName="datos">
            
            <form:label path="nota">Nota</form:label>
            <form:input path="nota" />
            
           <form:button >Guardar</form:button> <a href="listarNotasProyectos.htm"> Cancelar </a>   
        </form:form>
     </body>   
</html>
