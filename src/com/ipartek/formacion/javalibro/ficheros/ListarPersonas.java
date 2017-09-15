package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Leer linea a linea el fichero "data/personas.txt" y mostrar por pantalla.<br>
 * Contar el total de personas leidas.
 * 
 * 
 * @author ur00
 *
 */
public class ListarPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// C:\Users\Administrador\eclipse-workspace\LibroAnder\data\personas.txt
		int cont = 0;
		// fichero de texto personas
		FileReader fr=null; // lector de ficheros de caracteres
		BufferedReader br = null; // buffer para mejorar lectura del fichero

		try {

			fr = new FileReader("C:\\Users\\Administrador\\eclipse-workspace\\LibroAnder\\data\\personas.txt");
			br = new BufferedReader(fr);
			String linea="";
			
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
				cont++;
			}
			System.out.println("--------------------------------------");
			System.out.println("Lineas leidas: "+cont);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
