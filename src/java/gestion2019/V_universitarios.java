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
package gestion2019;

import java.io.Serializable;
public class V_universitarios implements Serializable {
	public V_universitarios() {
	}
	
	private long id;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido1(String value) {
		this.apellido1 = value;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido2(String value) {
		this.apellido2 = value;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
