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
		Persona p = new Persona("123456789A", "Marcos", "Guerreros");
		assertEquals("123456789A", p.getDni());

	}

	@Test
	void testGetApellido1() {
		Persona p = new Persona("123456789A", "Marcos", "Guerreros");

		assertEquals("Guerreros", p.getApellido1());
	}

	@Test
	void testGetNombre() {
		Persona p = new Persona("123456789A", "Marcos", "Guerreros");

		assertEquals("Marcos", p.getNombre());
	}

	@Test
	void testSetDni(){
		Persona p = new Persona();

		try {
			p.setDni("12345678A");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "12345678A";
		String actual = p.getDni();

		assertEquals(expected, actual);
		
		Exception e = assertThrows(Exception.class, ()->p.setDni("12345"));
		assertEquals(e.getMessage(), "El ultimo caracter introducido no es una letra");
	}

	@Test
	void testSetNombre() {
		Persona p = new Persona();

		p.setNombre("Marcos");
		String expected = "Marcos";
		String actual = p.getNombre();

		assertEquals(expected, actual);
	}

	@Test
	void testSetApellido1() {
		Persona p = new Persona();

		p.setApellido1("Guerreros");
		String expected = "Guerreros";
		String actual = p.getApellido1();

		assertEquals(expected, actual);
	}

}
