/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.cargarnotas;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import proyecto.Proyectos;
import proyecto.ProyectosDAO;
import proyecto.Docentes;
import proyecto.DocentesDAO;
import proyecto.Programacion;
import proyecto.ProgramacionDAO;
import proyecto.Area;
import proyecto.AreaDAO;
/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping("calificar.htm")
public class calificarCargarNotasControlador {
    
   // Proyectos proy2 = null;
 @RequestMapping(method=RequestMethod.GET)
    public ModelAndView insertarNota(@RequestParam("id") int id,@ModelAttribute("datos") Proyectos proy,Model model)
    {  

        Proyectos proy2 = null;
        try{
            proy2 = proyecto.ProyectosDAO.getProyectosByORMID(String.valueOf(id));
          
        } catch (PersistentException ex) {
         Logger.getLogger(calificarCargarNotasControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

       model.addAttribute("datos", proy2);
        ModelAndView mav = new ModelAndView();
       mav.setViewName("calificar");
       return mav;
    }
    
    
     @RequestMapping(method=RequestMethod.POST)
    public ModelAndView insertarNota(
            @ModelAttribute("datos") Proyectos p,
            BindingResult result,
            SessionStatus status
    )
    {
       
            //this.validarNota.(p, result);
        
     //if (result.hasErrors()) {
       //  ModelAndView mav = new ModelAndView();
        // mav.setViewName("calificar");
        // return mav;
     //} else 
        
        try {
            Proyectos proy= proyecto.ProyectosDAO.getProyectosByORMID(p.getIdproyecto());
            proy.setNota(p.getNota()); 
            proyecto.ProyectosDAO.evict(proy);
            proyecto.ProyectosDAO.save(proy);
         
        } catch (PersistentException ex) {
            Logger.getLogger(calificarCargarNotasControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("hola");
        return new ModelAndView("redirect:iListarProyectos.htm?id="+p.getIdproyecto());
    }
    //}
}