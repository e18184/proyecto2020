/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package controlador.usuario;

import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
 import org.orm.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import proyecto.Roles;
import proyecto.Usuarios;
import java.util.Set;
import org.hibernate.Query;
/**
 *
 * @author HP
 */
@Controller
@RequestMapping("usuarioAdicionar.htm")

public class controladorAdicionar{
    
      @RequestMapping(method = RequestMethod.GET)
    public ModelAndView adiocionarUsuarioGet() throws ParseException
    {   //try {
        ModelAndView mav = new ModelAndView("usuarioAdicionar");
        
        
        Usuarios u=new Usuarios();
        mav.addObject("nuevoUsuario", u);
        
        
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
        
        
      
        @RequestMapping(method=RequestMethod.POST)
	public ModelAndView adicionarUsuarioPost(HttpServletRequest request, @ModelAttribute("nuevoUsuario") Usuarios u) throws ParseException {
            System.out.println("Entro aqui");
           System.out.println("nombre:"+request.getParameter("nombre")+" "+
                    "  primer apellido:"+request.getParameter("apellido1"));
  /*
        Set roles=new java.util.HashSet();
        Set datos=new java.util.HashSet();*/
        String nombre=request.getParameter("nombre");
        String ap1=request.getParameter("apellido1");
        System.out.println("Entro aqui 222");
  
            System.out.println(u.toString());
        //u.setIdusu(u.getIdusu());
        u.setNombre(u.getNombre());
        u.setApellido1(u.getApellido1());
        u.setApellido2(u.getApellido2());
        u.setCedula(u.getCedula());
        u.setTelefono(u.getTelefono());
        u.setDireccion(u.getDireccion());
        u.setSexo(u.getSexo());
        String a="10/10/2000";
        Date fecha=new SimpleDateFormat("dd/MM/yyyy").parse(a); 
        u.setF_nac(fecha);
        u.setFoto("sin foto");
        u.setActivo(true);
        
            System.out.println(u.toString());
        
        try {
          
            System.out.println("Entro aqui444");
          
           
            proyecto.UsuariosDAO.evict(u);
            proyecto.UsuariosDAO.save(u);
               
            System.out.println("Entro aqui555");
        
        } catch (PersistentException ex) {
            Logger.getLogger(controladorAdicionar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            System.out.println(u.toString());
            
            
            
           return new ModelAndView("redirect: admUsuarios.htm");

	}
    

     
}