package com.ipartek.formacion.javalibro.ejercicios;

public class variablesReferenciaYvalor {

	public static void main(String[] args) {
		
		//Las variables primitivas se pasan por valor
		
		int primitiva =1;
		System.out.println("Primitiva = "+primitiva);
		int primitiva2 =sumar(primitiva);
		System.out.println("Primitiva2 = "+primitiva2);
	
		
		//Las variables de Clase se pasan por referencia
		String referencia= "1";
		String referencia2= sumar(referencia);
		System.out.println("referencia= "+referencia);
		System.out.println("referencia2= "+referencia2);
	}

	
	static int sumar(int i) {
		return ++i;
	}
	
	static String sumar(String s) {
		s="2";
		return s;
	}
	
	
}
