package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

public class ValidarPersonas {

	private String dni;
	static final String PATH_FICHERO_PERSONAS = "C:\\Users\\Administrador\\eclipse-workspace\\LibroJava\\src\\data\\personas.txt";
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;
	static final int NUM_CAMPOS_LINEA = 7;

	public ValidarPersonas(String dni) {
		this.dni = dni;
	}

	public static void main(String[] args) {
		cargaArrayList();
		
	}

	private static Persona mapeoLinea(String[] campos) throws NumberFormatException, PersonaException {

		Persona p = new Persona(campos[CAMPOS_NOMBRE], 
								campos[CAMPOS_APE1], 
								campos[CAMPOS_APE2], 
								campos[CAMPOS_MAIL],
								campos[CAMPOS_DNI], 
								campos[CAMPOS_ROL], 
								Integer.parseInt(campos[CAMPOS_EDAD]));
		return p;
	}

	
		private static void cargaArrayList() {
			ArrayList<Persona> lista = new ArrayList();
			FileReader fr = null;     
			BufferedReader br = null;
			FileWriter fw1=null;
			BufferedWriter bw=null;
			
			try {
				
				fr = new FileReader(PATH_FICHERO_PERSONAS);
				br = new BufferedReader(fr);
				String linea = "";
				Persona p = null;
				String[] campos;
				while( (linea = br.readLine()) != null ) {
					
					campos = linea.split(",");
					if ( campos.length == NUM_CAMPOS_LINEA ) {
						p = mapeoLinea(campos);
						if(p.getEdad()>=18) {
							lista.add(p);
							System.out.println(p);
						}else {
							System.out.println(p.getNombre()+" tiene "+p.getEdad()+" años. No tiene edad suficiente");
						}
						
						
					}				
				}			
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				//TODO cerrar recursos abiertos
			}

		}
	
}
