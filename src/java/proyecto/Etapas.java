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
public class Etapas implements Serializable {
	public Etapas() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ETAPAS_OBSERVACIONESES) {
			return ORM_observacioneses;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String nombre;
	
	private java.util.Set ORM_observacioneses = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Observacioneses(java.util.Set value) {
		this.ORM_observacioneses = value;
	}
	
	private java.util.Set getORM_Observacioneses() {
		return ORM_observacioneses;
	}
	
	public final proyecto.ObservacionesSetCollection observacioneses = new proyecto.ObservacionesSetCollection(this, _ormAdapter, ORMConstants.KEY_ETAPAS_OBSERVACIONESES, ORMConstants.KEY_OBSERVACIONES_ETAPAS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
