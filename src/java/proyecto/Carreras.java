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
 * Contiene las carreras registradas en el sistema
 */
public class Carreras implements Serializable {
	public Carreras() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CARRERAS_MATERIAS) {
			return ORM_materias;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idcarr;
	
	private String nombre;
	
	private String direccion;
	
	private String telefono;
	
	private boolean activo;
	
	private java.util.Set ORM_materias = new java.util.HashSet();
	
	/**
	 * Identificador de la carrera
	 */
	private void setIdcarr(int value) {
		this.idcarr = value;
	}
	
	/**
	 * Identificador de la carrera
	 */
	public int getIdcarr() {
		return idcarr;
	}
	
	public int getORMID() {
		return getIdcarr();
	}
	
	/**
	 * Nombre de la carrera
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre de la carrera
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Dirección de la carrera
	 */
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	/**
	 * Dirección de la carrera
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Teléfono principal de la carrera
	 */
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	/**
	 * Teléfono principal de la carrera
	 */
	public String getTelefono() {
		return telefono;
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
	
	private void setORM_Materias(java.util.Set value) {
		this.ORM_materias = value;
	}
	
	private java.util.Set getORM_Materias() {
		return ORM_materias;
	}
	
	public final proyecto.MateriasSetCollection materias = new proyecto.MateriasSetCollection(this, _ormAdapter, ORMConstants.KEY_CARRERAS_MATERIAS, ORMConstants.KEY_MATERIAS_IDCARR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdcarr());
	}
	
}
