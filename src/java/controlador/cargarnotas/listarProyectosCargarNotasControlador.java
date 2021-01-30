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
@RequestMapping("iListarProyectos.htm")
public class listarProyectosCargarNotasControlador {
    // http://127.0.0.1:8080/proyecto2020/iListarProyectos.htm
    @RequestMapping(method=RequestMethod.GET)
        
            public ModelAndView principalControlerGet(@RequestParam("id") String id) 
            
    {   
        ModelAndView mav1 =new ModelAndView();
       
       
        // se adiciono esta variable
        
        List proyectos = null;
        try {
            // controlador; clases que se generaron a partir del diagrama de clases 
            // DAO metodos genericos
            
            proyectos =  gestion2019.V_listarproyectosDAO.queryV_listarproyectos("usuario="+id,null); // List 
            
            //  select * from Proyectos
            // where null
            // order by null
            
             mav1.addObject("list",proyectos);
            
        } catch (PersistentException ex) {
            Logger.getLogger(listarProyectosCargarNotasControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
         mav1.setViewName("iListarProyectos");
        
        return mav1;
    }
}
