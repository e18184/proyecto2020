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
 * Contiene los datos de los usuarios del sistema
 */
public class Usuarios implements Serializable {
	public Usuarios() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIOS_IDROL) {
			return ORM_idrol;
		}
		else if (key == ORMConstants.KEY_USUARIOS_DATOS) {
			return ORM_datos;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIOS_DOCENTES) {
			this.docentes = (proyecto.Docentes) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIOS_UNIVERSITARIOS) {
			this.universitarios = (proyecto.Universitarios) owner;
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
	
	private int idusu;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private char sexo;
	
	private java.util.Date f_nac;
	
	private String cedula;
	
	private String telefono;
	
	private String direccion;
	
	private String foto;
	
	private boolean activo;
	
	private java.util.Set ORM_idrol = new java.util.HashSet();
	
	private java.util.Set ORM_datos = new java.util.HashSet();
	
	private proyecto.Docentes docentes;
	
	private proyecto.Universitarios universitarios;
	
	/**
	 * Identificador del usuario
	 */
	private void setIdusu(int value) {
		this.idusu = value;
	}
	
	/**
	 * Identificador del usuario
	 */
	public int getIdusu() {
		return idusu;
	}
	
	public int getORMID() {
		return getIdusu();
	}
	
	/**
	 * Nombre del usuario
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Primer apellido
	 */
	public void setApellido1(String value) {
		this.apellido1 = value;
	}
	
	/**
	 * Primer apellido
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * Segundo apellido
	 */
	public void setApellido2(String value) {
		this.apellido2 = value;
	}
	
	/**
	 * Segundo apellido
	 */
	public String getApellido2() {
		return apellido2;
	}
	
	/**
	 * M, masculino; F, femenino
	 */
	public void setSexo(char value) {
		this.sexo = value;
	}
	
	/**
	 * M, masculino; F, femenino
	 */
	public char getSexo() {
		return sexo;
	}
	
	/**
	 * Fecha de nacimiento
	 */
	public void setF_nac(java.util.Date value) {
		this.f_nac = value;
	}
	
	/**
	 * Fecha de nacimiento
	 */
	public java.util.Date getF_nac() {
		return f_nac;
	}
	
	/**
	 * Número de identificación personal
	 */
	public void setCedula(String value) {
		this.cedula = value;
	}
	
	/**
	 * Número de identificación personal
	 */
	public String getCedula() {
		return cedula;
	}
	
	/**
	 * Teléfono principal del usuario
	 */
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	/**
	 * Teléfono principal del usuario
	 */
	public String getTelefono() {
		return telefono;
	}
	
	/**
	 * Dirección del usuario
	 */
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	/**
	 * Dirección del usuario
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Ruta relativa y nombre de archivo de la foto del usuario
	 */
	public void setFoto(String value) {
		this.foto = value;
	}
	
	/**
	 * Ruta relativa y nombre de archivo de la foto del usuario
	 */
	public String getFoto() {
		return foto;
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
	
	private void setORM_Idrol(java.util.Set value) {
		this.ORM_idrol = value;
	}
	
	public java.util.Set getORM_Idrol() {
		return ORM_idrol;
	}
	
	public final proyecto.RolesSetCollection idrol = new proyecto.RolesSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOS_IDROL, ORMConstants.KEY_ROLES_IDUSU, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Datos(java.util.Set value) {
		this.ORM_datos = value;
	}
	
	private java.util.Set getORM_Datos() {
		return ORM_datos;
	}
	
	public final proyecto.DatosSetCollection datos = new proyecto.DatosSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOS_DATOS, ORMConstants.KEY_DATOS_IDUSU, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setDocentes(proyecto.Docentes value) {
		if (this.docentes != value) {
			proyecto.Docentes ldocentes = this.docentes;
			this.docentes = value;
			if (value != null) {
				docentes.setIdusu(this);
			}
			if (ldocentes != null && ldocentes.getIdusu() == this) {
				ldocentes.setIdusu(null);
			}
		}
	}
	
	public proyecto.Docentes getDocentes() {
		return docentes;
	}
	
	public void setUniversitarios(proyecto.Universitarios value) {
		if (this.universitarios != value) {
			proyecto.Universitarios luniversitarios = this.universitarios;
			this.universitarios = value;
			if (value != null) {
				universitarios.setIdusu(this);
			}
			if (luniversitarios != null && luniversitarios.getIdusu() == this) {
				luniversitarios.setIdusu(null);
			}
		}
	}
	
	public proyecto.Universitarios getUniversitarios() {
		return universitarios;
	}
	
	public String toString() {
		return String.valueOf(getIdusu());
	}
	
}
