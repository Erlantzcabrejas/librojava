package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

/*
 * Listar todas las canciones de la carpeta X
 */


public class ListarCanciones {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		File directorio= new File("C:\\desarrollo\\Music");
		File [] lista =directorio.listFiles();
		System.out.println("Directorios de Musica en la carpeta Music:");
		System.out.println("---------------------------------------------------");
		
		for(File c: lista) {
			File[] canciones =c.listFiles();
			System.out.println("["+ canciones.length+"]"+c.getName());
		
			for(File cancion: canciones) {
				System.out.println("      "+cancion.getName()+"   "+(cancion.length()/1024)+"KB");
			}
		
		}
	}

}
