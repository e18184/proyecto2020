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
public class Observaciones implements Serializable {
	public Observaciones() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_OBSERVACIONES_TRIBUNAL) {
			this.tribunal = (proyecto.Tribunal) owner;
		}
		
		else if (key == ORMConstants.KEY_OBSERVACIONES_ETAPAS) {
			this.etapas = (proyecto.Etapas) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private proyecto.Etapas etapas;
	
	private proyecto.Tribunal tribunal;
	
	private String fecha;
	
	private String archivo;
	
	private String observaciones;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setArchivo(String value) {
		this.archivo = value;
	}
	
	public String getArchivo() {
		return archivo;
	}
	
	public void setObservaciones(String value) {
		this.observaciones = value;
	}
	
	public String getObservaciones() {
		return observaciones;
	}
	
	public void setTribunal(proyecto.Tribunal value) {
		if (tribunal != null) {
			tribunal.observacioneses.remove(this);
		}
		if (value != null) {
			value.observacioneses.add(this);
		}
	}
	
	public proyecto.Tribunal getTribunal() {
		return tribunal;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tribunal(proyecto.Tribunal value) {
		this.tribunal = value;
	}
	
	private proyecto.Tribunal getORM_Tribunal() {
		return tribunal;
	}
	
	public void setEtapas(proyecto.Etapas value) {
		if (etapas != null) {
			etapas.observacioneses.remove(this);
		}
		if (value != null) {
			value.observacioneses.add(this);
		}
	}
	
	public proyecto.Etapas getEtapas() {
		return etapas;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Etapas(proyecto.Etapas value) {
		this.etapas = value;
	}
	
	private proyecto.Etapas getORM_Etapas() {
		return etapas;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
