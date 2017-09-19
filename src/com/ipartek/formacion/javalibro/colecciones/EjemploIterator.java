package com.ipartek.formacion.javalibro.colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {
		
		//MUESTRA EL TIEMPO DE INICIO EN MILISEGUNDOS
		long tInicio=System.currentTimeMillis();
		
		
		HashSet<String> listaNombres= new HashSet<>();
		
		listaNombres.add("Manolo");
		listaNombres.add("Manola");
		listaNombres.add("Manolito");
		listaNombres.add("Manolita");
		listaNombres.add("Manuel");
		listaNombres.add("Manolo");
		
		
		//ITERATOR ES MAS OPTIMO PARA RECORRER COLECCIONES QUE UN FOR
		Iterator<String> it=listaNombres.iterator();
		String nombre="";
		while(it.hasNext()) {
			nombre=it.next();
			System.out.println(nombre);
		}
		//MUESTRA EL TIEMPO JUSTO CUANDO FINALIZA EN MILISEGUNDOS
		long tFinal= System.currentTimeMillis();
		
		System.out.println("El programa ha tardado "+(tFinal-tInicio));
	}

}
