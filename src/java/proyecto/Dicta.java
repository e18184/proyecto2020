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
 * Asignación de materias a docentes
 */
public class Dicta implements Serializable {
	public Dicta() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Dicta))
			return false;
		Dicta dicta = (Dicta)aObj;
		if (getIddicta() != dicta.getIddicta())
			return false;
		if (getIdusu() == null) {
			if (dicta.getIdusu() != null)
				return false;
		}
		else if (!getIdusu().equals(dicta.getIdusu()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getIddicta();
		if (getIdusu() != null) {
			hashcode = hashcode + (getIdusu().getORMID() == null ? 0 : getIdusu().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DICTA_IDUSU) {
			this.idusu = (proyecto.Docentes) owner;
		}
		
		else if (key == ORMConstants.KEY_DICTA_IDCARR) {
			this.idcarr = (proyecto.Grupo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int iddicta;
	
	private proyecto.Docentes idusu;
	
	private proyecto.Usuarios idusuId;
	
	private int idusuIdId;
	
	private void setIdusuIdId(int value) {
		this.idusuIdId = value;
	}
	
	public int getIdusuIdId() {
		return idusuIdId;
	}
	
	private void setIdusuId(proyecto.Usuarios value) {
		this.idusuId = value;
	}
	
	public proyecto.Usuarios getIdusuId() {
		return idusuId;
	}
	
	private String gestion;
	
	private proyecto.Grupo idcarr;
	
	private boolean estado;
	
	/**
	 * Identificador de la asignación de materias
	 */
	public void setIddicta(int value) {
		this.iddicta = value;
	}
	
	/**
	 * Identificador de la asignación de materias
	 */
	public int getIddicta() {
		return iddicta;
	}
	
	/**
	 * Año que se dicta la materia
	 */
	public void setGestion(String value) {
		this.gestion = value;
	}
	
	/**
	 * Año que se dicta la materia
	 */
	public String getGestion() {
		return gestion;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setIdusu(proyecto.Docentes value) {
		if (idusu != null) {
			idusu.dicta.remove(this);
		}
		if (value != null) {
			value.dicta.add(this);
		}
	}
	
	public proyecto.Docentes getIdusu() {
		return idusu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idusu(proyecto.Docentes value) {
		this.idusu = value;
	}
	
	private proyecto.Docentes getORM_Idusu() {
		return idusu;
	}
	
	public void setIdcarr(proyecto.Grupo value) {
		if (idcarr != null) {
			idcarr.dicta.remove(this);
		}
		if (value != null) {
			value.dicta.add(this);
		}
	}
	
	public proyecto.Grupo getIdcarr() {
		return idcarr;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idcarr(proyecto.Grupo value) {
		this.idcarr = value;
	}
	
	private proyecto.Grupo getORM_Idcarr() {
		return idcarr;
	}
	
	public String toString() {
		return String.valueOf(getIddicta() + " " + ((getIdusu() == null) ? "" : String.valueOf(getIdusu().getORMID())));
	}
	
}
