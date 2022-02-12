package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * Eliminar alumno del Curso
	 * @param dni DNI del alumno que quieres eliminar
	 * @throws Exception Si el DNI no tiene la longitud de 9 digitos
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Añade un alumno al curso
	 * 
	 * @param Objeto alumno a añadir
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 *  Nos dice si un alumno esta registrado en el curso
	 * @param dni DNI del alumno que queremos saber si esta registrado en el curso
	 * @return Retorna true si el alumno esta registrado y false en caso contrario
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Constructor de la clase Curso
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 *  Saber cuantos alumnos hay en un curso
	 * @return El numero de alumnos que hay en un curso
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
