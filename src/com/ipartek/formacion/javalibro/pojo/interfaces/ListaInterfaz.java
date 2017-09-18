package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;
import com.ipartek.formacion.javalibro.pojo.Libro;
import com.ipartek.formacion.javalibro.pojo.Participante;

/*
 * Creamos una Lista para contener objetos de las Clases Participante y Libros
 */


public class ListaInterfaz {

	public static void main(String[] args) throws ParticipanteException {
		// TODO Auto-generated method stub
		ArrayList<Imprimible> lista= new ArrayList<Imprimible>();
		
		
		//CREAMOS OBJETOS DE DIFERENTES CLASES
		Libro l1=new Libro("100 años de soledad");
		Libro l2= new Libro("Años salvajes");
		
		Participante p1= new Participante("William", 50);
		
		//AÑADIR EN LISTA
		lista.add(l1);
		lista.add(l2);
		lista.add(p1);
		
		//RECORRER LISTA Y MOSTRAR
		for(Imprimible elem :lista) {
			if(elem instanceof Libro) {
				Libro libro= (Libro) elem;
				System.out.println("Libro "+libro.getTitulo());
			}else if(elem instanceof Participante) {
				Participante parti =(Participante) elem;
				System.out.println("Participante: "+parti.getNombre());
			}else {
				System.out.println("No conocemos la Clase");
			}
		}
	}

}
