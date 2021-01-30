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
public class V_listarproyectos implements Serializable {
	public V_listarproyectos() {
	}
	
	private long id;
	
	private Integer usuario;
	
	private Integer universitario;
	
	private String titulo;
	
	private Integer nota;
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	private void setUsuario(int value) {
		setUsuario(new Integer(value));
	}
	
	private void setUsuario(Integer value) {
		this.usuario = value;
	}
	
	public Integer getUsuario() {
		return usuario;
	}
	
	private void setUniversitario(int value) {
		setUniversitario(new Integer(value));
	}
	
	private void setUniversitario(Integer value) {
		this.universitario = value;
	}
	
	public Integer getUniversitario() {
		return universitario;
	}
	
	private void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	private void setNota(int value) {
		setNota(new Integer(value));
	}
	
	private void setNota(Integer value) {
		this.nota = value;
	}
	
	public Integer getNota() {
		return nota;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
