package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

/*
 * Listar todas las canciones de la carpeta X
 */


public class ListarCanciones {

	private static void listarDirectorio(File directorio, String separador) {
		File[] ficheros=directorio.listFiles();
		for(int x=0; x<ficheros.length;x++) {
			System.out.println(separador +ficheros[x].getName());
			if(ficheros[x].isDirectory()) {
				String nuevo_separador;
				nuevo_separador=separador +"-------";
				listarDirectorio(ficheros[x], nuevo_separador);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//No funciona si es compleja la estructura de la carpeta
	/*	
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
	
	*/
	File f=new File("C:\\desarrollo\\Music");
	listarDirectorio(f, "-----");
	}

}
