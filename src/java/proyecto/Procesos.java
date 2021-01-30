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
 * Contiene las URLs relativas de todos los procesos u operaciones implementadas, a los que los usuarios acceden desde el navegador.
 */
public class Procesos implements Serializable {
	public Procesos() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROCESOS_IDMENU) {
			return ORM_idmenu;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idpro;
	
	private String nombre;
	
	private String enlace;
	
	private String descripcion;
	
	private java.util.Set ORM_idmenu = new java.util.HashSet();
	
	/**
	 * Identificador del proceso
	 */
	private void setIdpro(int value) {
		this.idpro = value;
	}
	
	/**
	 * Identificador del proceso
	 */
	public int getIdpro() {
		return idpro;
	}
	
	public int getORMID() {
		return getIdpro();
	}
	
	/**
	 * Nombre del proceso
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre del proceso
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * URL relativa del proceso
	 */
	public void setEnlace(String value) {
		this.enlace = value;
	}
	
	/**
	 * URL relativa del proceso
	 */
	public String getEnlace() {
		return enlace;
	}
	
	/**
	 * Descripción del proceso u operación
	 */
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	/**
	 * Descripción del proceso u operación
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	private void setORM_Idmenu(java.util.Set value) {
		this.ORM_idmenu = value;
	}
	
	private java.util.Set getORM_Idmenu() {
		return ORM_idmenu;
	}
	
	public final proyecto.MenusSetCollection idmenu = new proyecto.MenusSetCollection(this, _ormAdapter, ORMConstants.KEY_PROCESOS_IDMENU, ORMConstants.KEY_MENUS_IDPRO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdpro());
	}
	
}
