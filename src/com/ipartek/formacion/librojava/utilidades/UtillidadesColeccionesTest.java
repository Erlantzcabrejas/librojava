package com.ipartek.formacion.librojava.utilidades;



import java.util.Arrays;

import junit.framework.TestCase;

public class UtillidadesColeccionesTest extends TestCase {

	
	public void testOrdenacionArray() {
		
		int[] aDesordando = {0,3,1,8,7,2,5,4,6,9};
		
		
		
		
		int[] ordenadorMenorMayor = UtilidadesColeciones.ordenarArray(aDesordando, false);
		
		for (int i = 0; i < ordenadorMenorMayor.length; i++) {
			assertEquals(i, ordenadorMenorMayor[i]);
		}
		
		int[] ordenadorMayorMenor = UtilidadesColeciones.ordenarArray(aDesordando, true);
		for(int i=ordenadorMayorMenor.length-1; i<=0; i--) {
			assertEquals(i, ordenadorMayorMenor[1]);
		}
		//TODO comprobar orden inverso
		
	}
	
	public  void testOrdenacionJava() {
		int[] aDesordando = {0,3,1,8,7,2,5,4,6,9};
		Arrays.sort(aDesordando);
		
	}
	
}
