/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package proyecto;

import java.io.Serializable;
/**
 * Contiene los roles definidos en el sistema
 */
public class Roles implements Serializable {
	public Roles() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ROLES_IDUSU) {
			return ORM_idusu;
		}
		else if (key == ORMConstants.KEY_ROLES_IDMENU) {
			return ORM_idmenu;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idrol;
	
	private String nombre;
	
	private boolean activo;
	
	private java.util.Set ORM_idusu = new java.util.HashSet();
	
	private java.util.Set ORM_idmenu = new java.util.HashSet();
	
	/**
	 * Identificador del rol
	 */
	private void setIdrol(int value) {
		this.idrol = value;
	}
	
	/**
	 * Identificador del rol
	 */
	public int getIdrol() {
		return idrol;
	}
	
	public int getORMID() {
		return getIdrol();
	}
	
	/**
	 * Nombre del rol
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre del rol
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * True, vigente. False, dado de baja
	 */
	public void setActivo(boolean value) {
		this.activo = value;
	}
	
	/**
	 * True, vigente. False, dado de baja
	 */
	public boolean getActivo() {
		return activo;
	}
	
	private void setORM_Idusu(java.util.Set value) {
		this.ORM_idusu = value;
	}
	
	private java.util.Set getORM_Idusu() {
		return ORM_idusu;
	}
	
	public final proyecto.UsuariosSetCollection idusu = new proyecto.UsuariosSetCollection(this, _ormAdapter, ORMConstants.KEY_ROLES_IDUSU, ORMConstants.KEY_USUARIOS_IDROL, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Idmenu(java.util.Set value) {
		this.ORM_idmenu = value;
	}
	
	private java.util.Set getORM_Idmenu() {
		return ORM_idmenu;
	}
	
	public final proyecto.MenusSetCollection idmenu = new proyecto.MenusSetCollection(this, _ormAdapter, ORMConstants.KEY_ROLES_IDMENU, ORMConstants.KEY_MENUS_IDROL, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdrol());
	}
	
}
