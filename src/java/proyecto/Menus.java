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
 * Contiene los menús definidos en el sistema
 */
public class Menus implements Serializable {
	public Menus() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENUS_IDROL) {
			return ORM_idrol;
		}
		else if (key == ORMConstants.KEY_MENUS_IDPRO) {
			return ORM_idpro;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idmenu;
	
	private String nombre;
	
	private boolean activo;
	
	private String descripcion;
	
	private java.util.Set ORM_idrol = new java.util.HashSet();
	
	private java.util.Set ORM_idpro = new java.util.HashSet();
	
	/**
	 * Identificador del menú
	 */
	private void setIdmenu(int value) {
		this.idmenu = value;
	}
	
	/**
	 * Identificador del menú
	 */
	public int getIdmenu() {
		return idmenu;
	}
	
	public int getORMID() {
		return getIdmenu();
	}
	
	/**
	 * Nombre del menú
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre del menú
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
	
	/**
	 * descripcion del menu
	 */
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	/**
	 * descripcion del menu
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	private void setORM_Idrol(java.util.Set value) {
		this.ORM_idrol = value;
	}
	
	private java.util.Set getORM_Idrol() {
		return ORM_idrol;
	}
	
	public final proyecto.RolesSetCollection idrol = new proyecto.RolesSetCollection(this, _ormAdapter, ORMConstants.KEY_MENUS_IDROL, ORMConstants.KEY_ROLES_IDMENU, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Idpro(java.util.Set value) {
		this.ORM_idpro = value;
	}
	
	public java.util.Set getORM_Idpro() {
		return ORM_idpro;
	}
	
	public final proyecto.ProcesosSetCollection idpro = new proyecto.ProcesosSetCollection(this, _ormAdapter, ORMConstants.KEY_MENUS_IDPRO, ORMConstants.KEY_PROCESOS_IDMENU, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdmenu());
	}
	
}
