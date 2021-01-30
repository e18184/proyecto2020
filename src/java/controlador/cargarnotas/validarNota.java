/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.cargarnotas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import proyecto.Proyectos;

/**
 *
 * @author Usuario
 */
public class validarNota {
    
    public boolean supports(Class<?> type) 
    {
        return Proyectos.class.isAssignableFrom(type);
       // return TuClase.class.isAssignableFrom(type);
    }
    private void validateNota(int nota, Errors errors) {
       if ((nota < 0) && (nota>100) ) 
       { 
           errors.rejectValue("nota", "error.proyecto.nota", "Error la nota debe estar en el rango 0-100"); 
       }
       
        }

    void validate(Proyectos p, BindingResult result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
        
    
}
