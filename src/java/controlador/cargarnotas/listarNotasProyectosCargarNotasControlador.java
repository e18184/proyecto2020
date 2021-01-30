/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.cargarnotas;

/**
 *
 * @author Usuario
 */
import controlador.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller 
@RequestMapping("listarNotasProyectos.htm")
public class listarNotasProyectosCargarNotasControlador {
    // http://127.0.0.1:8080/proyecto2020/listarNotasProyectos.htm
    @RequestMapping(method=RequestMethod.GET) 
        
    public ModelAndView principalControlerGet() 
            
    {   
        
        // asignar un valor 
        
        ModelAndView mav =new ModelAndView();
       
        
        // se adiciono esta variable
        
        List Proyectos = null;
        try {
            
           
            Proyectos = proyecto.ProyectosDAO.queryProyectos(null,null); // List 
            
             mav.addObject("listado",Proyectos);
            
        } catch (PersistentException ex) {
            Logger.getLogger(listarNotasProyectosCargarNotasControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
         mav.setViewName("listarNotasProyectos");
        
        return mav;
    }
}
