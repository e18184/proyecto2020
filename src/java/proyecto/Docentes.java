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
 * Tabla de los docentes
 */
public class Docentes implements Serializable {
	public Docentes() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DOCENTES_DICTA) {
			return ORM_dicta;
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
	
	private boolean auxiliar;
	
	private java.util.Set ORM_dicta = new java.util.HashSet();
	
	/**
	 * true, auxiliar de cátedra; false, docente
	 */
	public void setAuxiliar(boolean value) {
		this.auxiliar = value;
	}
	
	/**
	 * true, auxiliar de cátedra; false, docente
	 */
	public boolean getAuxiliar() {
		return auxiliar;
	}
	
	public void setIdusu(proyecto.Usuarios value) {
		if (this.idusu != value) {
			proyecto.Usuarios lidusu = this.idusu;
			this.idusu = value;
			if (value != null) {
				idusu.setDocentes(this);
			}
			if (lidusu != null && lidusu.getDocentes() == this) {
				lidusu.setDocentes(null);
			}
		}
	}
	
	public proyecto.Usuarios getIdusu() {
		return idusu;
	}
	
	public proyecto.Usuarios getORMID() {
		return getIdusu();
	}
	
	private void setORM_Dicta(java.util.Set value) {
		this.ORM_dicta = value;
	}
	
	private java.util.Set getORM_Dicta() {
		return ORM_dicta;
	}
	
	public final proyecto.DictaSetCollection dicta = new proyecto.DictaSetCollection(this, _ormAdapter, ORMConstants.KEY_DOCENTES_DICTA, ORMConstants.KEY_DICTA_IDUSU, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(((getIdusu() == null) ? "" : String.valueOf(getIdusu().getORMID())));
	}
	
}
