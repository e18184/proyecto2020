/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.estudiante;

import controlador.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.orm.PersistentException;
public class ListaEstudianteControlador {
    // http://127.0.0.1:8080/proyecto2020/listaEstudiantes.htm
    @RequestMapping("listaEstudiantes.htm")
    public ModelAndView listaEstudiantes() {
    /*    ModelAndView mav = new ModelAndView();
       //java.util.List modelpojoestudiantes = null;
       model.pojo.Estudiante[] modelpojoestudiantes; 
        try {
              modelpojoestudiantes = model.pojo.EstudianteDAO.listEstudianteByQuery(null,"Nombre desc");
              //modelpojoestudiantes = model.pojo.extend.listaEstudiante.listarEstudianteDAO();
            // pasar los datos a la vista
            
              mav.addObject("datos",modelpojoestudiantes);
       mav.setViewName("listaEstudiantes");
       
        } catch (PersistentException ex) {
            Logger.getLogger(ListaEstudianteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mav;    
    }
      */
    return null;
}
}
