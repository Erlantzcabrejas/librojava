package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Descomprime el fichero "data/buscatesoro.rar" donde quieras y recorre forma
 * recursiva los ficheros, hasta encontrar dentro de un .txt la palabra
 * "osobuko".<br>
 * Muestra por pantalla la ruta del fichero que contiene la palabra a buscar.
 * 
 * @author ur00
 *
 */
public class BuscarPalabra {

	public static void listarDirectorio(File directorio, String separador) {
		
		
		
		
		String linea="";
		String palabra="osobuko";
		File[] ficheros = directorio.listFiles();
		FileReader fr;
		BufferedReader br=null;
		
		for (int x = 0; x < ficheros.length; x++) {
			System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()) {
				listarDirectorio(ficheros[x], separador + separador);
			}else {
				
				if(ficheros[x].isFile()) {
					try {
						fr=new FileReader(ficheros[x]);
						br=new BufferedReader(fr);
						linea=br.readLine();
						while((palabra = br.readLine())!= null){
							if(palabra.indexOf("osobuko")!= -1){
							System.out.println("se encontro la palabra "+ palabra);
							}
							
						}
						/*if(linea!=null) {
							System.out.println(linea);
						}*/
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\buscatesoro");
		listarDirectorio(f, "----");
	}

}
