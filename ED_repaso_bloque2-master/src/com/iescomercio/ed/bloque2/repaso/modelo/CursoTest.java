package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class CursoTest {

	@Test
	void testEliminarAlumno() {
		Persona p1 = new Persona("123AB","Marcos","Guerreros");
		Persona p2 = new Persona("246BC", "Carlos", "Adan");
		Curso c = new Curso();
				
		c.aniadirAlumno(p1);
		c.aniadirAlumno(p2);

		Exception e = assertThrows(Exception.class, ()->c.eliminarAlumno("123F"));
		assertEquals(e.getMessage(), "El dni no tiene la longitud adecuada");
		

	}

	@Test
	void testAniadirAlumno() {
		Persona p1 = new Persona("123AB","Marcos","Guerreros");
		Persona p2 = new Persona("246BC", "Carlos", "Adan");
		int antes,despues;
		Curso c = new Curso();
				
		c.aniadirAlumno(p1);
		antes = c.numeroAlumnos();
		
		c.aniadirAlumno(p2);
		despues = c.numeroAlumnos();
		
		assertEquals(antes+1, despues);
	
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
