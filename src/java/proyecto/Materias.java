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
 * Contiene las materias registradas en el sistema
 */
public class Materias implements Serializable {
	public Materias() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Materias))
			return false;
		Materias materias = (Materias)aObj;
		if (getIdcarr() == null) {
			if (materias.getIdcarr() != null)
				return false;
		}
		else if (!getIdcarr().equals(materias.getIdcarr()))
			return false;
		if ((getSigla() != null && !getSigla().equals(materias.getSigla())) || (getSigla() == null && materias.getSigla() != null))
			return false;
		if (getParalelo() != materias.getParalelo())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getIdcarr() != null) {
			hashcode = hashcode + (int) getIdcarr().getORMID();
		}
		hashcode = hashcode + (getSigla() == null ? 0 : getSigla().hashCode());
		hashcode = hashcode + (int) getParalelo();
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MATERIAS_DICTA) {
			return ORM_dicta;
		}
		else if (key == ORMConstants.KEY_MATERIAS_PROGRAMACION) {
			return ORM_programacion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MATERIAS_IDCARR) {
			this.idcarr = (proyecto.Carreras) owner;
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
	
	private proyecto.Carreras idcarr;
	
	private int idcarrId;
	
	private void setIdcarrId(int value) {
		this.idcarrId = value;
	}
	
	public int getIdcarrId() {
		return idcarrId;
	}
	
	private String sigla;
	
	private char paralelo;
	
	private String nombre;
	
	private short cargahoraria;
	
	private String plan;
	
	private char periodo;
	
	private boolean activo;
	
	private java.util.Set ORM_dicta = new java.util.HashSet();
	
	private java.util.Set ORM_programacion = new java.util.HashSet();
	
	/**
	 * Sigla de la materia
	 */
	public void setSigla(String value) {
		this.sigla = value;
	}
	
	/**
	 * Sigla de la materia
	 */
	public String getSigla() {
		return sigla;
	}
	
	/**
	 * Nombre de la materia
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre de la materia
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Carga horaria (hrs/semana)
	 */
	public void setCargahoraria(short value) {
		this.cargahoraria = value;
	}
	
	/**
	 * Carga horaria (hrs/semana)
	 */
	public short getCargahoraria() {
		return cargahoraria;
	}
	
	/**
	 * Año del plan de estudios en vigencia
	 */
	public void setPlan(String value) {
		this.plan = value;
	}
	
	/**
	 * Año del plan de estudios en vigencia
	 */
	public String getPlan() {
		return plan;
	}
	
	/**
	 * 1, Primer semestre; 2, Segundo semestre; A, Anual; N, Nivelación; V, Verano
	 */
	public void setPeriodo(char value) {
		this.periodo = value;
	}
	
	/**
	 * 1, Primer semestre; 2, Segundo semestre; A, Anual; N, Nivelación; V, Verano
	 */
	public char getPeriodo() {
		return periodo;
	}
	
	/**
	 * Paralelo de la materia
	 */
	public void setParalelo(char value) {
		this.paralelo = value;
	}
	
	/**
	 * Paralelo de la materia
	 */
	public char getParalelo() {
		return paralelo;
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
	
	public void setIdcarr(proyecto.Carreras value) {
		if (idcarr != null) {
			idcarr.materias.remove(this);
		}
		if (value != null) {
			value.materias.add(this);
		}
	}
	
	public proyecto.Carreras getIdcarr() {
		return idcarr;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idcarr(proyecto.Carreras value) {
		this.idcarr = value;
	}
	
	private proyecto.Carreras getORM_Idcarr() {
		return idcarr;
	}
	
	private void setORM_Dicta(java.util.Set value) {
		this.ORM_dicta = value;
	}
	
	private java.util.Set getORM_Dicta() {
		return ORM_dicta;
	}
	
	public final proyecto.DictaSetCollection dicta = new proyecto.DictaSetCollection(this, _ormAdapter, ORMConstants.KEY_MATERIAS_DICTA, ORMConstants.KEY_DICTA_IDCARR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Programacion(java.util.Set value) {
		this.ORM_programacion = value;
	}
	
	private java.util.Set getORM_Programacion() {
		return ORM_programacion;
	}
	
	public final proyecto.ProgramacionSetCollection programacion = new proyecto.ProgramacionSetCollection(this, _ormAdapter, ORMConstants.KEY_MATERIAS_PROGRAMACION, ORMConstants.KEY_PROGRAMACION_IDCARR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(((getIdcarr() == null) ? "" : String.valueOf(getIdcarr().getORMID())) + " " + getSigla() + " " + getParalelo());
	}
	
}
