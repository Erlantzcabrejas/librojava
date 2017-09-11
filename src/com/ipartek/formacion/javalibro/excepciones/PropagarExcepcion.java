package com.ipartek.formacion.javalibro.excepciones;

public class PropagarExcepcion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		comoMarron();
	}
	private static void lanzoExcepcion() throws Exception{
		System.out.println("lanzoExcepcion ENTRO");
		throw new Exception();
		//System.out.println("lanzoExcepcion SALGO");
	}

	private static void pasoMarron() throws Exception {
		System.out.println("pasoMarron ENTRO");
		lanzoExcepcion();
		System.out.println("pasoMarron SALGO");
	}
	
	private static void comoMarron() throws Exception {
		System.out.println("comoMarron ENTRO");
		
			pasoMarron();
		
			System.out.println("Ya me encargo yo de gestionar la Excepcion");
		
		System.out.println("comoMarron SALGO");
	}
}
