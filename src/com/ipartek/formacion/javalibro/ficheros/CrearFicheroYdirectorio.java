package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

	//TERMINAR ESTE EJERCICIO CORRECTAMENTE!!!!!!
	
	
	public static void listarDirectorio(File directorio, String separador) {

		String linea = "";
		
		File folder = null; 
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		Scanner in = new Scanner(System.in);
		String loEscrito = "";
		String nombreDirectorio="";
		String nombreFichero="";
		
		
		
		//System.out.println("Introduce el nombre del directorio a crear");
		//nombreDirectorio=in.nextLine();
		//folder=new File(nombreDirectorio);
		if (directorio.exists()) {
			System.out.println("El fichero " + directorio + " ya existe");
		} else {
			directorio.mkdirs();
			System.out.println("Se ha creado el directorio " + directorio);
			System.out.println("---------------------------------");
		}

		try {
			System.out.println("Introduce nombre del fichero a crear:");
			nombreFichero=in.nextLine();
			fw = new FileWriter(directorio+"\\"+nombreFichero);
			bw = new BufferedWriter(fw);
			System.out.println("Escribe lo que quieras en el fichero que se acaba de crear............");
			loEscrito = in.nextLine();
			bw.write(loEscrito);
			System.out.println("---------------------------------");
			System.out.println("Se ha escrito en el fichero:");

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

		File[] ficheros = directorio.listFiles();
		for (int x = 0; x < ficheros.length; x++) {
			System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()) { // es un directorio
				listarDirectorio(ficheros[x], separador + separador);
			} else {
			}
			if (ficheros[x].isFile()) {
				try {
					fr = new FileReader(ficheros[x]);
					br = new BufferedReader(fr);
					linea = br.readLine();
				} catch (Exception e) {

				}

			}
		}
		try {
			fr = new FileReader(nombreFichero);
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

	}

	public static void main(String[] args) {
		String nDirectorio="";
		Scanner in2=new Scanner(System.in);
		
		System.out.println("Escribe el nombre de directorio a crear:");
		nDirectorio=in2.nextLine();
		File f = new File(nDirectorio);
		listarDirectorio(f, "----");
	}
}