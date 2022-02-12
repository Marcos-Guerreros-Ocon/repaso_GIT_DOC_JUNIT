package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class CursoTest {

	@Test
	void testEliminarAlumno() {
		Persona p1 = new Persona("11111111A","Marcos","Guerreros");
		Persona p2 = new Persona("11111111B", "Carlos", "Adan");
		Curso c = new Curso();
		int antes;
		int despues;
				
		c.aniadirAlumno(p1);
		c.aniadirAlumno(p2);
		antes=c.numeroAlumnos();
		
		try {
			c.eliminarAlumno("11111111B");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		despues=c.numeroAlumnos();
		
		assertEquals(antes-1, despues);

		Exception e = assertThrows(Exception.class, ()->c.eliminarAlumno("123F"));
		assertEquals(e.getMessage(), "El dni no tiene la longitud adecuada");
		

	}

	@Test
	void testAniadirAlumno() {
		Persona p1 = new Persona("11111111A","Marcos","Guerreros");
		Persona p2 = new Persona("11111111B", "Carlos", "Adan");
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
		Persona p1 = new Persona("11111111A","Marcos","Guerreros");

		Curso c = new Curso();
		c.aniadirAlumno(p1);
	
		assertTrue(c.estaRegistrado("11111111A"));
		assertFalse(c.estaRegistrado("1234CD"));
	}

	@Test
	void testCurso() {
		ArrayList<Persona> lista = new ArrayList<>();
		Curso c = new Curso();
		Persona p1 = new Persona("11111111A","Marcos","Guerreros");
		
		lista.add(p1);
		c.aniadirAlumno(p1);
		
		assertEquals(lista.size(), c.numeroAlumnos());
	}

	@Test
	void testNumeroAlumnos() {
		Persona p1 = new Persona("11111111A","Marcos","Guerreros");
		int cantidad;
		Curso c = new Curso();
				
		c.aniadirAlumno(p1);
		cantidad = c.numeroAlumnos();
		
		assertEquals(1, cantidad);

	}


}
