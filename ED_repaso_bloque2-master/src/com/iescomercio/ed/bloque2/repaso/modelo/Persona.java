
package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * Retorna el DNI de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Añade un valor al campo DNI de la persona
	 * Tambien comprueba si el ultimo valor del DNI es una letra
	 * Si no lo es devuelve una excepcion
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length() - 1))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/**
	 * Retorna el nombre del alumno
	 * @return Retorna el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Añade un nombre al campo nombre
	 * @param nombre Nombre del alumno que queramos poner
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el apellido de la persona
	 * @return El apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Añade el apellido al campo apellido
	 * @param apellido1 Apellido de la persona
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
