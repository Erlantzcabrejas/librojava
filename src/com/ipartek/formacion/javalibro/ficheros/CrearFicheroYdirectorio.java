package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Pide por pantalla:
 * <ol>
 * <li>Nombre de un directorio</li>
 * <li>Nombre fichero.txt</li>
 * <li>Palabras a guardar dentro del fichero.txt</li>
 * </ol>
 * 
 * Crea la carpeta en C:
 * 
 * @author ur00
 *
 */
public class CrearFicheroYdirectorio {

	public static void listarDirectorio(File directorio, String separador) {

		File[] ficheros = directorio.listFiles();
		for (int x = 0; x < ficheros.length; x++) {
			System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()) {				
				listarDirectorio(ficheros[x], separador + separador );
			}
		}
	}
	
	
	public static void main(String[] args) {

		String linea = "";
		File folder = new File("C:\\Ejercicio_CrearFicheroYDirectorio");
		folder.mkdirs();
		File canal= new File("C:\\Ejercicio_CrearFicheroYDirectorio");
		File [] lista= canal.listFiles();
		
		
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fw = new FileWriter(
					"C:\\Ejercicio_CrearFicheroYDirectorio\\Ejercicio.txt");
			bw = new BufferedWriter(fw);

			bw.write("Escribo esto y espero que se pueda leer o me voy a enfadar");
			System.out.println("Fichero creado con exito");

		} catch (IOException e) {
			System.out.println("No se puede escribir en el fichero");
			e.printStackTrace();
		} finally {

			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer y Writer");
				e.printStackTrace();
			}

		}
		try {
			fr = new FileReader(
					"C:\\Ejercicio_CrearFicheroYDirectorio\\Ejercicio.txt");
			br = new BufferedReader(fr);
			
			while (linea != null) {
				linea = br.readLine();
				if (linea != null) {
					System.out.println(linea);
				}
			}
			br.close();
			fr.close();
		} catch (IOException e) {

		}
		File f = new File("C:");
		listarDirectorio(f, "----");
	}
}