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
 * Login y contraseña de cada usuario registrado
 */
public class Datos implements Serializable {
	public Datos() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Datos))
			return false;
		Datos datos = (Datos)aObj;
		if (getIdusu() == null) {
			if (datos.getIdusu() != null)
				return false;
		}
		else if (!getIdusu().equals(datos.getIdusu()))
			return false;
		if ((getLogin() != null && !getLogin().equals(datos.getLogin())) || (getLogin() == null && datos.getLogin() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getIdusu() != null) {
			hashcode = hashcode + (int) getIdusu().getORMID();
		}
		hashcode = hashcode + (getLogin() == null ? 0 : getLogin().hashCode());
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DATOS_IDUSU) {
			this.idusu = (proyecto.Usuarios) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
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
	
	private String login;
	
	private String password;
	
	private boolean activo;
	
	/**
	 * Nombre de acceso al sistema del usuario
	 */
	public void setLogin(String value) {
		this.login = value;
	}
	
	/**
	 * Nombre de acceso al sistema del usuario
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * Clave encriptada del usuario
	 */
	public void setPassword(String value) {
		this.password = value;
	}
	
	/**
	 * Clave encriptada del usuario
	 */
	public String getPassword() {
		return password;
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
	
	public void setIdusu(proyecto.Usuarios value) {
		if (idusu != null) {
			idusu.datos.remove(this);
		}
		if (value != null) {
			value.datos.add(this);
		}
	}
	
	public proyecto.Usuarios getIdusu() {
		return idusu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idusu(proyecto.Usuarios value) {
		this.idusu = value;
	}
	
	private proyecto.Usuarios getORM_Idusu() {
		return idusu;
	}
	
	public String toString() {
		return String.valueOf(((getIdusu() == null) ? "" : String.valueOf(getIdusu().getORMID())) + " " + getLogin());
	}
	
}
