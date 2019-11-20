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
 * Tabla de los Universitarios
 */
public class Universitarios implements Serializable {
	public Universitarios() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_UNIVERSITARIOS_PROGRAMACION) {
			return ORM_programacion;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private proyecto.Usuarios idusu;
	
	private int idusuId;
	
	private void setIdusuId(int value) {
		this.idusuId = value;
	}
	
	public int getIdusuId() {
		return idusuId;
	}
	
	private int ru;
	
	private java.util.Set ORM_programacion = new java.util.HashSet();
	
	/**
	 * Registro universitario
	 */
	public void setRu(int value) {
		this.ru = value;
	}
	
	/**
	 * Registro universitario
	 */
	public int getRu() {
		return ru;
	}
	
	public void setIdusu(proyecto.Usuarios value) {
		if (this.idusu != value) {
			proyecto.Usuarios lidusu = this.idusu;
			this.idusu = value;
			if (value != null) {
				idusu.setUniversitarios(this);
			}
			if (lidusu != null && lidusu.getUniversitarios() == this) {
				lidusu.setUniversitarios(null);
			}
		}
	}
	
	public proyecto.Usuarios getIdusu() {
		return idusu;
	}
	
	public proyecto.Usuarios getORMID() {
		return getIdusu();
	}
	
	private void setORM_Programacion(java.util.Set value) {
		this.ORM_programacion = value;
	}
	
	private java.util.Set getORM_Programacion() {
		return ORM_programacion;
	}
	
	public final proyecto.ProgramacionSetCollection programacion = new proyecto.ProgramacionSetCollection(this, _ormAdapter, ORMConstants.KEY_UNIVERSITARIOS_PROGRAMACION, ORMConstants.KEY_PROGRAMACION_IDUSU, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(((getIdusu() == null) ? "" : String.valueOf(getIdusu().getORMID())));
	}
	
}
