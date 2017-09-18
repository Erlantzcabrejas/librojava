package com.ipartek.formacion.javalibro.pojo;

import java.util.ArrayList;

import com.ipartek.formacion.javalibro.pojo.interfaces.Imprimible;

public class LibrosRecomendados {

	public static void main(String[] args) {
		//EJERCICIO 1 DE INTERFACES
		
		
		Libro li =new Libro("100 años de soledad");
		li.setAutor("Gabriel Garcia");
		li.setPaginas(307);
		
		LibroElectronico le=new LibroElectronico("Años salvajes");
		le.setAutor("William Finnegan");
		le.setPaginas(523);
		le.setTamanyo(27);
		
		LibroPapel lp=new LibroPapel("Papillon");
		lp.setAutor("Charriere Henri");
		lp.setPaginas(789);
		lp.setTapaBlanda(false);
		
		System.out.println(li.toString());
		System.out.println("Este libro tiene un valor de : "+li.getPrecio()+" leuros");
		System.out.println(le.toString());
		System.out.println("Este libro tiene un valor de : "+le.getPrecio()+" leuros");
		System.out.println(lp.toString());
		System.out.println("Este libro tiene un valor de : "+lp.getPrecio()+" leuros");
	
	
	
		
		
		//EJERCICIO 2 DE INTERFACES
		
		
	}

}
