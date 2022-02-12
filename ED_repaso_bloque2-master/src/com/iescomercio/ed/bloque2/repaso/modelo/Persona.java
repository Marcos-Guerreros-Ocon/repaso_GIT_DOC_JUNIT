
package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	/*
	 * Constructor de la clase Persona
	 * 
	 * Le pasamos los parametros de entrada que son DNI, nombre y apellido1
	 * 
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/*
	 * 
	 * Devuelve el DNI del objeto
	 * 
	 */
	public String getDni() {
		return dni;
	}

	/*
	 * Añade un valor al campo DNI Comprueba si el ultimo caracter es una letra, si
	 * no lo es devuelve una excepcion
	 * 
	 * (Updete del codigo => 
	 * bug Character.isLetter(dni.charAt(dni.length())
	 * solucion Character.isLetter(dni.charAt(dni.length() - 1) )
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length() - 1))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/*
	 *  Devuelve el nombre del objeto
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * Documentar y crear test unitario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * Documentar y crear test unitario
	 */
	public String getApellido1() {
		return apellido1;
	}

	/*
	 * Documentar y crear test unitario
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
