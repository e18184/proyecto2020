/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import principal.TopControler;
import proyecto.Menus;
import proyecto.Roles;
import proyecto.Usuarios;
import proyecto.UsuariosDAO;

/**
 *
 * @author HP
 */
  @Controller
@RequestMapping(value="admUsuarios")
@SessionAttributes({"miusuario","rolseleccionado","listaFiltrada"})


  
    
  public class controladorUsuario{
  
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView lusuarioControlerPost(@RequestParam("idusu") int o,@ModelAttribute("fmiusuario") Usuarios usuario,Model model ) 
            
    {   
        
        System.out.println("usuario logeado helooooo:"+usuario.getIdusu());
        System.out.println("rol seleccionado bomboon:"+o);
        Usuarios[] usua = null;
        if(o==0){return listarUsuario(model);}
        try {
            usua = proyecto.UsuariosDAO.listUsuariosByQuery(null, null);
       
        } catch (PersistentException ex) {
            Logger.getLogger(TopControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Usuarios> usuarios = new ArrayList<Usuarios>();
        Usuarios u = null;
         for (int i=0;i<usua.length; i++){     
             {    
         Usuarios usu=usua[i];
               //  System.out.println("USU["+i+"]= "+usu);
        for (Iterator iterator = usu.idrol.getIterator(); iterator.hasNext();){     
            Roles roles = (Roles)iterator.next(); 
            if (roles.getIdrol()==o){
                // MENU
            
                    System.out.println ("Usuario a mostrar:"+usu.getNombre());
                    usuarios.add(usu); 
               }
            }
            }
        }
        ModelAndView mav =new ModelAndView();
        mav.addObject("listaFiltrada",usuarios);       
        mav.setViewName("admUsuarios");
        return mav;
    }
    
     @ModelAttribute("allRoles")
        public Map<String,String> lroles(@ModelAttribute("miusuario") Usuarios usuario) throws PersistentException
        {
            Map <String,String> listado = new LinkedHashMap<>();
            List roles=proyecto.RolesDAO.queryRoles(null, null);
            for (Iterator iterator = roles.iterator(); iterator.hasNext();) {
                Roles rol = (Roles)iterator.next();
               listado.put(Integer.toString(rol.getIdrol()),rol.getNombre());             
            }
            return listado;
        }
     
@RequestMapping(method=RequestMethod.GET)
   
    public ModelAndView listarUsuario(Model model) {//To change body of generated methods, choose Tools | Templates.4
        
       ModelAndView mav =new ModelAndView();
        List usuarios = null;
        try {
            usuarios =  proyecto.UsuariosDAO.queryUsuarios(null," idusu ASC "); // List
             mav.addObject("listaFiltrada",usuarios);
            
        } catch (PersistentException ex) {
            Logger.getLogger(controladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("fmiusuario",new Usuarios());
        mav.setViewName("admUsuarios");
        return mav;
    }
    }
    
    
    
    
    
    
  
        
        