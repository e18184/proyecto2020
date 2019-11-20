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
public class Area implements Serializable {
	public Area() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_AREA_PROYECTOSES) {
			return ORM_proyectoses;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idarea;
	
	private String nombre;
	
	private java.util.Set ORM_proyectoses = new java.util.HashSet();
	
	private void setIdarea(int value) {
		this.idarea = value;
	}
	
	public int getIdarea() {
		return idarea;
	}
	
	public int getORMID() {
		return getIdarea();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Proyectoses(java.util.Set value) {
		this.ORM_proyectoses = value;
	}
	
	private java.util.Set getORM_Proyectoses() {
		return ORM_proyectoses;
	}
	
	public final proyecto.ProyectosSetCollection proyectoses = new proyecto.ProyectosSetCollection(this, _ormAdapter, ORMConstants.KEY_AREA_PROYECTOSES, ORMConstants.KEY_PROYECTOS_AREA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdarea());
	}
	
}
