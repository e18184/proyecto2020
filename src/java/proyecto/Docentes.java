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
		else if (key == ORMConstants.KEY_DOCENTES_TRIBUNALS) {
			return ORM_tribunals;
		}
		else if (key == ORMConstants.KEY_DOCENTES_PROYECTOS) {
			return ORM_proyectos;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DOCENTES_IDUSU) {
			this.idusu = (proyecto.Usuarios) owner;
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
	
	private java.util.Set ORM_tribunals = new java.util.HashSet();
	
	private java.util.Set ORM_proyectos = new java.util.HashSet();
	
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
	
	public proyecto.Proyectos[] getProyectoss() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = tribunals.getIterator();lIter.hasNext();) {
			lValues.add(((proyecto.Tribunal)lIter.next()).getProyectos());
		}
		return (proyecto.Proyectos[])lValues.toArray(new proyecto.Proyectos[lValues.size()]);
	}
	
	public void removeProyectos(proyecto.Proyectos aProyectos) {
		proyecto.Tribunal[] lTribunals = tribunals.toArray();
		for(int i = 0; i < lTribunals.length; i++) {
			if(lTribunals[i].getProyectos().equals(aProyectos)) {
				tribunals.remove(lTribunals[i]);
			}
		}
	}
	
	public void addProyectos(proyecto.Tribunal aTribunal, proyecto.Proyectos aProyectos) {
		aTribunal.setProyectos(aProyectos);
		tribunals.add(aTribunal);
	}
	
	public proyecto.Tribunal getTribunalByProyectos(proyecto.Proyectos aProyectos) {
		proyecto.Tribunal[] lTribunals = tribunals.toArray();
		for(int i = 0; i < lTribunals.length; i++) {
			if(lTribunals[i].getProyectos().equals(aProyectos)) {
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
	
	public final proyecto.TribunalSetCollection tribunals = new proyecto.TribunalSetCollection(this, _ormAdapter, ORMConstants.KEY_DOCENTES_TRIBUNALS, ORMConstants.KEY_TRIBUNAL_DOCENTES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Proyectos(java.util.Set value) {
		this.ORM_proyectos = value;
	}
	
	private java.util.Set getORM_Proyectos() {
		return ORM_proyectos;
	}
	
	public final proyecto.ProyectosSetCollection proyectos = new proyecto.ProyectosSetCollection(this, _ormAdapter, ORMConstants.KEY_DOCENTES_PROYECTOS, ORMConstants.KEY_PROYECTOS_DOCENTESIDUSU, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(((getIdusu() == null) ? "" : String.valueOf(getIdusu().getORMID())));
	}
	
}
