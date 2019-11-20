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
public class Proyectos implements Serializable {
	public Proyectos() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Proyectos))
			return false;
		Proyectos proyectos = (Proyectos)aObj;
		if ((getIdproyecto() != null && !getIdproyecto().equals(proyectos.getIdproyecto())) || (getIdproyecto() == null && proyectos.getIdproyecto() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIdproyecto() == null ? 0 : getIdproyecto().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROYECTOS_TRIBUNALS) {
			return ORM_tribunals;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PROYECTOS_AREA) {
			this.area = (proyecto.Area) owner;
		}
		
		else if (key == ORMConstants.KEY_PROYECTOS_PROGRAMACION) {
			this.programacion = (proyecto.Programacion) owner;
		}
		
		else if (key == ORMConstants.KEY_PROYECTOS_PROGRAMACIONIDPROG) {
			this.programacionidprog = (proyecto.Programacion) owner;
		}
		
		else if (key == ORMConstants.KEY_PROYECTOS_DOCENTESIDUSU) {
			this.docentesidusu = (proyecto.Docentes) owner;
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
	
	private String idproyecto;
	
	private proyecto.Programacion programacion;
	
	private proyecto.Area area;
	
	private int nota;
	
	private boolean estado;
	
	private String titulo;
	
	private String resumen;
	
	private String archivo;
	
	private proyecto.Programacion programacionidprog;
	
	private java.util.Set ORM_tribunals = new java.util.HashSet();
	
	private proyecto.Docentes docentesidusu;
	
	public void setIdproyecto(String value) {
		this.idproyecto = value;
	}
	
	public String getIdproyecto() {
		return idproyecto;
	}
	
	public String getORMID() {
		return getIdproyecto();
	}
	
	public void setNota(int value) {
		this.nota = value;
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setResumen(String value) {
		this.resumen = value;
	}
	
	public String getResumen() {
		return resumen;
	}
	
	public void setArchivo(String value) {
		this.archivo = value;
	}
	
	public String getArchivo() {
		return archivo;
	}
	
	public proyecto.Docentes[] getDocentess() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = tribunals.getIterator();lIter.hasNext();) {
			lValues.add(((proyecto.Tribunal)lIter.next()).getDocentes());
		}
		return (proyecto.Docentes[])lValues.toArray(new proyecto.Docentes[lValues.size()]);
	}
	
	public void removeDocentes(proyecto.Docentes aDocentes) {
		proyecto.Tribunal[] lTribunals = tribunals.toArray();
		for(int i = 0; i < lTribunals.length; i++) {
			if(lTribunals[i].getDocentes().equals(aDocentes)) {
				tribunals.remove(lTribunals[i]);
			}
		}
	}
	
	public void addDocentes(proyecto.Tribunal aTribunal, proyecto.Docentes aDocentes) {
		aTribunal.setDocentes(aDocentes);
		tribunals.add(aTribunal);
	}
	
	public proyecto.Tribunal getTribunalByDocentes(proyecto.Docentes aDocentes) {
		proyecto.Tribunal[] lTribunals = tribunals.toArray();
		for(int i = 0; i < lTribunals.length; i++) {
			if(lTribunals[i].getDocentes().equals(aDocentes)) {
				return lTribunals[i];
			}
		}
		return null;
	}
	
	private void setORM_Tribunals(java.util.Set value) {
		this.ORM_tribunals = value;
	}
	
	private java.util.Set getORM_Tribunals() {
		return ORM_tribunals;
	}
	
	public final proyecto.TribunalSetCollection tribunals = new proyecto.TribunalSetCollection(this, _ormAdapter, ORMConstants.KEY_PROYECTOS_TRIBUNALS, ORMConstants.KEY_TRIBUNAL_PROYECTOS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setArea(proyecto.Area value) {
		if (area != null) {
			area.proyectoses.remove(this);
		}
		if (value != null) {
			value.proyectoses.add(this);
		}
	}
	
	public proyecto.Area getArea() {
		return area;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Area(proyecto.Area value) {
		this.area = value;
	}
	
	private proyecto.Area getORM_Area() {
		return area;
	}
	
	public void setProgramacion(proyecto.Programacion value) {
		if (programacion != null) {
			programacion.proyectoses.remove(this);
		}
		if (value != null) {
			value.proyectoses.add(this);
		}
	}
	
	public proyecto.Programacion getProgramacion() {
		return programacion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Programacion(proyecto.Programacion value) {
		this.programacion = value;
	}
	
	private proyecto.Programacion getORM_Programacion() {
		return programacion;
	}
	
	public void setProgramacionidprog(proyecto.Programacion value) {
		if (programacionidprog != null) {
			programacionidprog.proyectos.remove(this);
		}
		if (value != null) {
			value.proyectos.add(this);
		}
	}
	
	public proyecto.Programacion getProgramacionidprog() {
		return programacionidprog;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Programacionidprog(proyecto.Programacion value) {
		this.programacionidprog = value;
	}
	
	private proyecto.Programacion getORM_Programacionidprog() {
		return programacionidprog;
	}
	
	public void setDocentesidusu(proyecto.Docentes value) {
		if (docentesidusu != null) {
			docentesidusu.proyectos.remove(this);
		}
		if (value != null) {
			value.proyectos.add(this);
		}
	}
	
	public proyecto.Docentes getDocentesidusu() {
		return docentesidusu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Docentesidusu(proyecto.Docentes value) {
		this.docentesidusu = value;
	}
	
	private proyecto.Docentes getORM_Docentesidusu() {
		return docentesidusu;
	}
	
	public String toString() {
		return String.valueOf(getIdproyecto());
	}
	
}
