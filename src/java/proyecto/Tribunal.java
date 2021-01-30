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
public class Tribunal implements Serializable {
	public Tribunal() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TRIBUNAL_OBSERVACIONESES) {
			return ORM_observacioneses;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TRIBUNAL_DOCENTES) {
			this.docentes = (proyecto.Docentes) owner;
		}
		
		else if (key == ORMConstants.KEY_TRIBUNAL_PROYECTOS) {
			this.proyectos = (proyecto.Proyectos) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String memorandum;
	
	private proyecto.Proyectos proyectos;
	
	private proyecto.Docentes docentes;
	
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
	
	public void setMemorandum(String value) {
		this.memorandum = value;
	}
	
	public String getMemorandum() {
		return memorandum;
	}
	
	private void setORM_Observacioneses(java.util.Set value) {
		this.ORM_observacioneses = value;
	}
	
	private java.util.Set getORM_Observacioneses() {
		return ORM_observacioneses;
	}
	
	public final proyecto.ObservacionesSetCollection observacioneses = new proyecto.ObservacionesSetCollection(this, _ormAdapter, ORMConstants.KEY_TRIBUNAL_OBSERVACIONESES, ORMConstants.KEY_OBSERVACIONES_TRIBUNAL, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setDocentes(proyecto.Docentes value) {
		if (docentes != null) {
			docentes.tribunals.remove(this);
		}
		if (value != null) {
			value.tribunals.add(this);
		}
	}
	
	public proyecto.Docentes getDocentes() {
		return docentes;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Docentes(proyecto.Docentes value) {
		this.docentes = value;
	}
	
	private proyecto.Docentes getORM_Docentes() {
		return docentes;
	}
	
	public void setProyectos(proyecto.Proyectos value) {
		if (proyectos != null) {
			proyectos.tribunals.remove(this);
		}
		if (value != null) {
			value.tribunals.add(this);
		}
	}
	
	public proyecto.Proyectos getProyectos() {
		return proyectos;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Proyectos(proyecto.Proyectos value) {
		this.proyectos = value;
	}
	
	private proyecto.Proyectos getORM_Proyectos() {
		return proyectos;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
