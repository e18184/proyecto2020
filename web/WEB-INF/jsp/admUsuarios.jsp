
<%-- 
    Document   : administrarUsuarios
    Created on : 05-ene-2021, 23:09:15
    Author     : Noemy
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>ADMINISTRAR USUARIOS</title>
        <link rel="stylesheet" href="css/administracion.css">
        <script type="text/javascript">
            function submitFORM(path, params, method) {
    method = method || 'POST'; 

    var form = document.createElement('form');
    form.setAttribute('method', method);
    form.setAttribute('action', path);
   
    //Move the submit function to another variable
    //so that it doesn't get overwritten.
    form._submit_function_ = form.submit;

    for(var key in params) {
        if(params.hasOwnProperty(key)) {
            var hiddenField = document.createElement('input');
            hiddenField.setAttribute('type', 'hidden');
            hiddenField.setAttribute('name', key);
            hiddenField.setAttribute('value', params[key]);

            form.appendChild(hiddenField);
         }
    }
    document.body.appendChild(form);
    form._submit_function_();
    }    
    function myFunc() {
        var selectBox = document.getElementById("idusu");
        var selectedValue = selectBox.options[selectBox.selectedIndex].value;
        submitFORM("${pageContext.request.contextPath}/admUsuarios.htm",{'idusu':selectedValue},'POST');
       
   }
   
   
            function desplegar(){
                        window.location.href = "usuarioAdicionar.htm"; 
            }
             
        </script>
   
    </head>
    <body>
            <h1>ADMINISTRAR USUARIOS</h1>  
            
            <label>Filtrar por rol: </label>
            
 
      <form:form method="POST" id="fmiusuario"  name="fmiusuario" commandName="fmiusuario">
               <form:select id="idusu" path="idusu"  onchange="myFunc()"> 
                   
                    <option ${dato2.key == seleccionado?"selected='selected'":""} >-Seleccione rol-</option>
                    <option value="0">Todos</option>
                   <c:forEach  var="dato2" items="${allRoles}" >
                         
                     <option value="${dato2.key}" >${dato2.value}</option>
         
                     </c:forEach>
                </form:select> 
            </form:form>  
    
<%-- 
<form:form method="POST" id="fmiusuario"  name="fmiusuario" commandName="fmiusuario">
  <form:select  path="idusu">
    <form:option value="NONE"> --SELECT--</form:option>
    <form:options items="${allRoles}"></form:options>
    </form:select>
       </form:form> 
  --%>
       <button style="position: absolute;right: 2%;" type="button" id="Añadir" onclick="desplegar()"><img id="icono2"  alt="Editar" src="https://w7.pngwing.com/pngs/100/522/png-transparent-computer-icons-plus-and-minus-signs-symbol-plus-miscellaneous-cross-sign.pngg" >Nuevo usuario</button>
            <br><br>
                <table >
            <thead> <tr>
                    <th>FOTO</th>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <th>1ER APELLIDO</th>
                    <th>2DO APELLIDO</th>
                    <th>GENERO</th>
                    <th>ESTADO</th>
                    <th>M</th>
                    <th>E</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach  items="${listaFiltrada}" var="dato">
                    <tr>
                        <td></td>
                        <td> <c:out value="${dato.idusu}"/></td>
                        <td> <c:out value="${dato.nombre}"/></td>
                        <td> <c:out value="${dato.apellido1}"/></td>
                        <td> <c:out value="${dato.apellido2}"/></td>
                        
                        <td> <c:out value="${dato.sexo}"/></td>
                        <td>  <c:out value="${dato.activo}"/></td> 
                        <td style="text-align:center"> <a href="#modalModificar">   <img id="icono" with="5" height="5" alt="Editar" src="https://image.flaticon.com/icons/png/512/83/83969.pngg" ></a></td>
                        <td style="text-align:center"> <a href="#modalEliminar"> <img id="icono" with="5" height="5" alt="Eliminar" src="https://image.freepik.com/iconos-gratis/cerrar-borrar-boton-eliminar_318-9073.jpgg" ></a></td>
                        
                        
                    </tr>
                  
                    </c:forEach>
            </tbody>
            
</table>
            
            
            
        <div id="modalModificar" class="modalDialog">
                <div>
		<h2>Modificar usuario</h2>
                <form>
                       <label>Nombre: </label>
                       <input type="text" name="nombre"/><br><br>
                       <label>Primer apellido: </label>
                       <input type="text" name="apellido1"/><br><br>
                       <label>Segundo apellido: </label>
                       <input type="text" name="apellido2"/><br><br>
                       <label>Teléfono: </label>
                       <input type="text" name="telefono"/><br><br><br>
                       
                       <input type="submit"  value="Aceptar"/>
                       &nbsp&nbsp&nbsp&nbsp
		<a href="#close" title="Close" class="cancelar">Cancelar</a>
                   </form>   
                </div>
                </div>
            
   <div id="modalEliminar" class="modalDialog">
                <div>
		<h2>Eliminar usuario</h2>
                <form name="eliminarUsuario">
                       <p>¿Está seguro que desea eliminar este usuario?</p>
                       <br><br><br>
                       <input type="submit" value="ELIMINAR" />
                       &nbsp&nbsp&nbsp&nbsp
		<a href="#close" title="Close" class="cancelar">Cancelar</a>
                       <input type="hidden" name="txtOpcion" value="3"/>
                   </form>  
                
                </div>
                </div>
          
    </body>
</html>
