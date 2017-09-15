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

		String linea = "";
		String palabra = "osobuko";

		
		//Recursos para la lectura de fichero
		File[] ficheros = directorio.listFiles();
		FileReader fr=null;
		BufferedReader br = null;

		//Recorremos uno a uno todos los ficheros
		for (int x = 0; x < ficheros.length; x++) {
			System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()) {	//es un directorio
				listarDirectorio(ficheros[x], separador + separador);
			} else {							//es un fichero
					
				
				//buscar palabra
				if (ficheros[x].isFile()) {
					try {
						fr = new FileReader(ficheros[x]);
						br = new BufferedReader(fr);
						linea = br.readLine();
						
						//leer linea a linea todo el fichero de texto
						while ((linea = br.readLine()) != null) {
							if (linea.indexOf(palabra) != -1) {
								System.out.println("Se encontro la palabra " + palabra+" en fichero "+ficheros[x]);
							}

						}
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						try {
							br.close();
							fr.close();
						}catch(Exception e) {
							
						}
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
