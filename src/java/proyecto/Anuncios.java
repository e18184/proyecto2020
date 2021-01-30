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
public class Anuncios implements Serializable {
	public Anuncios() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ANUNCIOS_USUARIOS) {
			this.usuarios = (proyecto.Usuarios) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idanuncio;
	
	private proyecto.Usuarios usuarios;
	
	private String fecha;
	
	private String titulo;
	
	private String mensaje;
	
	private boolean estado;
	
	private String archivo;
	
	private void setIdanuncio(int value) {
		this.idanuncio = value;
	}
	
	public int getIdanuncio() {
		return idanuncio;
	}
	
	public int getORMID() {
		return getIdanuncio();
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setArchivo(String value) {
		this.archivo = value;
	}
	
	public String getArchivo() {
		return archivo;
	}
	
	public void setUsuarios(proyecto.Usuarios value) {
		if (usuarios != null) {
			usuarios.anuncioses.remove(this);
		}
		if (value != null) {
			value.anuncioses.add(this);
		}
	}
	
	public proyecto.Usuarios getUsuarios() {
		return usuarios;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuarios(proyecto.Usuarios value) {
		this.usuarios = value;
	}
	
	private proyecto.Usuarios getORM_Usuarios() {
		return usuarios;
	}
	
	public String toString() {
		return String.valueOf(getIdanuncio());
	}
	
}
