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
 * Contiene los grupo que tienen en el sistema
 */
public class Grupo implements Serializable {
	public Grupo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_GRUPO_DICTA) {
			return ORM_dicta;
		}
		else if (key == ORMConstants.KEY_GRUPO_PROGRAMACION) {
			return ORM_programacion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_GRUPO_IDCARR) {
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
	
	private int id_grupo;
	
	private proyecto.Carreras idcarr;
	
	private String sigla;
	
	private String nombre;
	
	private short cargahoraria;
	
	private String plan;
	
	private char periodo;
	
	private boolean activo;
	
	private String grupo;
	
	private java.util.Set ORM_dicta = new java.util.HashSet();
	
	private java.util.Set ORM_programacion = new java.util.HashSet();
	
	private void setId_grupo(int value) {
		this.id_grupo = value;
	}
	
	public int getId_grupo() {
		return id_grupo;
	}
	
	public int getORMID() {
		return getId_grupo();
	}
	
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
	 * Anno del plan de estudios en vigencia
	 */
	public void setPlan(String value) {
		this.plan = value;
	}
	
	/**
	 * Anno del plan de estudios en vigencia
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
	
	public void setGrupo(String value) {
		this.grupo = value;
	}
	
	public String getGrupo() {
		return grupo;
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
	
	public final proyecto.DictaSetCollection dicta = new proyecto.DictaSetCollection(this, _ormAdapter, ORMConstants.KEY_GRUPO_DICTA, ORMConstants.KEY_DICTA_IDCARR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Programacion(java.util.Set value) {
		this.ORM_programacion = value;
	}
	
	private java.util.Set getORM_Programacion() {
		return ORM_programacion;
	}
	
	public final proyecto.ProgramacionSetCollection programacion = new proyecto.ProgramacionSetCollection(this, _ormAdapter, ORMConstants.KEY_GRUPO_PROGRAMACION, ORMConstants.KEY_PROGRAMACION_IDCARR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_grupo());
	}
	
}
