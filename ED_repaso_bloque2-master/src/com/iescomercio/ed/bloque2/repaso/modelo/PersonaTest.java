package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testPersona() {
		fail("Not yet implemented");
	}


	@Test
	void testGetDni() {
		Persona p = new Persona("123456789A","Marcos","Guerreros");
		assertEquals("123456789A", p.getDni());
		

	}

	@Test
	void testSetDni() {
	}

	@Test
	void testGetNombre() {
		Persona p = new Persona("123456789A","Marcos","Guerreros");
		
		assertEquals("Marcos", p.getNombre());
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}





}
