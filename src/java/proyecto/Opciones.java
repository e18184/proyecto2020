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
public class Opciones implements Serializable {
	public Opciones() {
	}
	
	private int idopcion;
	
	private String opcion;
	
	private boolean correcta;
	
	private void setIdopcion(int value) {
		this.idopcion = value;
	}
	
	public int getIdopcion() {
		return idopcion;
	}
	
	public int getORMID() {
		return getIdopcion();
	}
	
	public void setOpcion(String value) {
		this.opcion = value;
	}
	
	public String getOpcion() {
		return opcion;
	}
	
	public void setCorrecta(boolean value) {
		this.correcta = value;
	}
	
	public boolean getCorrecta() {
		return correcta;
	}
	
	public String toString() {
		return String.valueOf(getIdopcion());
	}
	
}
