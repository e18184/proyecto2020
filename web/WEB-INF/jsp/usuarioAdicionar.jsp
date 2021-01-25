<%-- 
    Document   : usuarioAñadir
    Created on : 15-ene-2021, 0:13:29
    Author     : HP
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
        <link rel="stylesheet" href="css/administracion.css">
        <title>Nuevo usuario</title>
    </head>
    <body>
        <h2>Nuevo usuario</h2>
        <form:form method="post"   action="usuarioAdicionar.htm" commandName="nuevoUsuario" >
            <p>
                <form:label path="nombre">Nombre</form:label>
                <form:input path="nombre" />
            </p>
            
            <p>
                <form:label path="apellido1">Primer Apellido</form:label>
                <form:input path="apellido1" />
            </p>
              
            <p>
                <form:label path="apellido2">Segundo Apellido</form:label>
                <form:input path="apellido2" />
            </p>
            <%-- 
    
            <p>
                <form:label path="">Aula a asignar</form:label> 
                <form:select path="aulaId"> 
                    <form:option value="0">Seleccione.....</form:option>
                    <form:options items="${aulaId}" />
                    
                </form:select>
            </p>
--%>    
<p>
                <form:label path="cedula">CI</form:label>
                <form:input path="cedula" />
            </p>   
            <br> 
            Mujer<form:radiobutton path="sexo" value="F"/>  
            Hombre<form:radiobutton path="sexo" value="M"/>  
        <br> 
        <p>
                <form:label path="telefono">Teléfono</form:label>
                <form:input path="telefono" />
            </p>

            <p>
                <form:label path="direccion">Direccion</form:label>
                <form:input path="direccion" />
            </p>
            
            <input type="submit" value="Enviar"/> <a href="admUsuarios.htm" class="cancelar"> Cancelar </a>
        </form:form>
            
            
            
            
    </body>
</html>
