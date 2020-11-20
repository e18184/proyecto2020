/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.proceso;

import org.springframework.web.servlet.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HAUSE
 */
@Controller 
//@RequestMapping("uproceso.htm")
public class UprocesoControler {
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView listaExamenes() {
		// TODO - implement EstudianteControlador.listaEstudiantes
		throw new UnsupportedOperationException();
	}
    
}
