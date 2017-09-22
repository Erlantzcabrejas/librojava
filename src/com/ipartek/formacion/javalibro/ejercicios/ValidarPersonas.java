package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;
import com.ipartek.formacion.javalibro.utilidades.Validaciones;

public class ValidarPersonas {

	
	static final String PATH_FICHERO_PERSONAS = "C:\\Users\\Administrador\\eclipse-workspace\\LibroJava\\src\\data\\personas.txt";
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;
	static final int NUM_CAMPOS_LINEA = 7;

	

	public static void main(String[] args) {
		cargaArrayList();

	}

	private static Persona mapeoLinea(String[] campos) throws NumberFormatException, PersonaException {

		Persona p = new Persona(campos[CAMPOS_NOMBRE], campos[CAMPOS_APE1], campos[CAMPOS_APE2], campos[CAMPOS_MAIL],
				campos[CAMPOS_DNI], campos[CAMPOS_ROL], Integer.parseInt(campos[CAMPOS_EDAD]));
		return p;
	}

	private static void cargaArrayList() {
		ArrayList<Persona> lista = new ArrayList();
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw1 = null;
		FileWriter fw2 = null;
		BufferedWriter bw1 = null;
		BufferedWriter bw2 = null;
		long contbueno = 0;
		long contmal = 0;

		try { // PRIMER TRY
			fr = new FileReader(PATH_FICHERO_PERSONAS);
			br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			String[] campos;
			fw1 = new FileWriter( // ESCRIBIMOS EN Personas.OK.txt
					"C:\\Users\\Administrador\\eclipse-workspace\\LibroJava\\src\\data\\Personas.OK.txt");
			bw1 = new BufferedWriter(fw1);
			fw2 = new FileWriter( // ESCRIBIMOS EN Personas.error.txt
					"C:\\Users\\Administrador\\eclipse-workspace\\LibroJava\\src\\data\\Personas.error.txt");
			bw2 = new BufferedWriter(fw2);

			while ((linea = br.readLine()) != null) { // LEEMOS FICHERO

				

					campos = linea.split(","); // DIVIDIMOS POR ","
					try {
					if (campos.length == NUM_CAMPOS_LINEA) {
						
							p = mapeoLinea(campos);
							
							// MIENTRAS SE CUMPLA, AÑADIR A LA LISTA

							bw1.write(linea + "\r\n");
							bw1.flush();
							contbueno++;
						}else {
							
							
							bw2.write(linea + "\r\n");
							bw2.flush();
							contmal++;
						}
					}catch (PersonaException e) {
							// METEMOS EN Personas.error.txt
							
							bw2.write(linea + "\r\n");
							bw2.flush();
							contmal++;
							
						}

					 // FIN DE IF QUE MIDE NUMERO CAMPOS

				
			} // FIN DE WHILE
			System.out.println(contbueno + " usuarios son correctos");
			System.out.println(contmal + " usuarios son incorrectos");
			System.out.println("Se han distribuido los usuarios en sus respectivos .txt");
		
		} catch (Exception e1) { // FIN DE TRY1
			e1.printStackTrace();
			System.out.println();
		} finally {
			try {
				bw1.close();
				bw2.close();
				fw1.close();
				bw2.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer y Writer");
				e.printStackTrace();
			}
		} // FIN DE FINALLY

	}// FIN METODO cargaArrayList()

}
