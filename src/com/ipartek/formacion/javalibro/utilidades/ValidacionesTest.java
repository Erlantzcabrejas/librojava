package com.ipartek.formacion.javalibro.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ValidacionesTest extends TestCase {

	public void testEmail() {
		
		
		assertFalse(Validaciones.email(null));
		assertFalse(Validaciones.email(""));
		assertFalse(Validaciones.email("auraga.ipartek.com"));
		assertFalse(Validaciones.email("auraga.ipartek."));
		assertFalse(Validaciones.email("auraga@"));
		assertFalse(Validaciones.email("auraga@ipartekcom"));
		assertFalse(Validaciones.email("auraga@ipartekcom.e"));

		assertTrue(Validaciones.email("auraga@ipartek.com"));

	}
	public void testDNI() {
		assertFalse(Validaciones.dni(null));
		assertFalse(Validaciones.dni(""));
		assertFalse(Validaciones.dni("2eee"));
		assertFalse(Validaciones.dni("1111111"));
		assertFalse(Validaciones.dni("11111111Y"));
		
		assertFalse("sin guiones", Validaciones.dni("11111111-H"));
		assertFalse("sin espacios en blanco", Validaciones.dni("1111111 H"));
		assertTrue(Validaciones.dni("11111111H"));
	}
}
