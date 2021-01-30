/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.cargarnotas;


import controlador.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller 
@RequestMapping("iListarEstudiantes.htm")
public class listarEstudiantesCargarNotasControlador {
    // http://127.0.0.1:8080/proyecto2020/iListarEstudiantes.htm
    @RequestMapping(method=RequestMethod.GET) 
        
    public ModelAndView principalControlerGet() 
            
    {   
        
        // asignar un valor 
        
        ModelAndView mav =new ModelAndView();
       
        
        // se adiciono esta variable
        
        List V_listarestudiantes = null;
        try {
            // controlador; clases que se generaron a partir del diagrama de clases 
            // DAO metodos genericos
           
            V_listarestudiantes =  gestion2019.V_listarestudiantesDAO.queryV_listarestudiantes(null,null); // List 
            
            //  select * from Usuarios
            // where null
            // order by null
            
             mav.addObject("listado",V_listarestudiantes);
            
        } catch (PersistentException ex) {
            Logger.getLogger(listarEstudiantesCargarNotasControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
         mav.setViewName("iListarEstudiantes");
        
        return mav;
    }
    
}
