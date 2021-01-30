/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.proceso;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import proyecto.Usuarios;
import proyecto.UsuariosDAO;
/*import proyecto.PruebaPersona;

/**
 *
 * @author richards
 */
@Controller 
@RequestMapping("iprimero.htm")
public class primero {
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView principalControlerGet() 
            
    {   
        
        // asignar un valor 
        
        ModelAndView mav =new ModelAndView();
       
        
        // se adiciono esta variable
        
        List usuarios = null;
        try {
            // controlador; clases que se generaron a partir del diagrama de clases 
            // DAO metodos genericos
            // SOLAMENTE USUARIO RICHARD
            usuarios =  proyecto.UsuariosDAO.queryUsuarios(" idusu=1 OR idusu=4 "," apellido1 DESC "); // List 
            
            //  select * from Usuarios
            // where null
            // order by null
            
             mav.addObject("listado",usuarios);
            
        } catch (PersistentException ex) {
            Logger.getLogger(primero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
         mav.setViewName("iprimero");
        
        return mav;
    }
    
}
