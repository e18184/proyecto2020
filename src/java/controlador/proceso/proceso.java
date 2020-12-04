/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.proceso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import proyecto.Usuarios;
import proyecto.PruebaPersona;
@SessionAttributes({"pruebapersona"})
/**
 *
 * @author richards
 */
@Controller
@RequestMapping("imiproceso.htm")
public class proceso {
   @RequestMapping(method=RequestMethod.GET)
    public ModelAndView principalControlerGet(@ModelAttribute("pruebapersona") PruebaPersona pruebapersona ) 
            
    {   
        
        System.out.println("Los datos son:");
        System.out.print(pruebapersona.getCi()+"  "+pruebapersona.getNombre()+" "+pruebapersona.getEdad());
        System.out.println("Llego metodo GET");
        ModelAndView mav =new ModelAndView();
        mav.setViewName("imiproceso");
        return mav;
    }
}