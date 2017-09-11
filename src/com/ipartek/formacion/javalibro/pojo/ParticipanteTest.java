package com.ipartek.formacion.javalibro.pojo;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;

import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {

	public void testConstructor() {
		Participante p1 = new Participante("ander", "anderuraga");

		p1.setEmail("auraga@ipartek.com");

		assertEquals("ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("auraga@ipartek.com", p1.getEmail());
		assertFalse(p1.isTrabajador());
		assertEquals("https://github.com/anderuraga", p1.getLinkGitHub());

		
	}

	public void testExceptionEdad() {
		Participante p1 = new Participante("ander", "anderuraga");
		try {
			p1.setEdad(88);
		} catch (ParticipanteException e) {
			fail("No deberia lanzar Excepcion con edad 88");
		}

		try {
			p1.setEdad(-3);
			fail("Deberia haber lanzado Exception");
		} catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MENOR_CERO, e.getMessage());
			assertTrue(true);
		}

		try {

			p1.setEdad(105);
			fail("Deberia haber lanzado Exception");
		} catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
			assertTrue(true);
		}

		try {
			Participante matusalem = new Participante("Matu", 235);
			fail("Deberia haber lanzado Exception");
		}catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
			assertTrue(true);
		}

	}

	public void testConstructorVacio() {
		Participante p = new Participante();

		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertEquals("https://github.com/", p.getLinkGitHub());
		assertFalse(p.isTrabajador());

	}

}
