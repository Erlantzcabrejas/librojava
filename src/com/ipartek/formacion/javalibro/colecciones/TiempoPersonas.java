package com.ipartek.formacion.javalibro.colecciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.ipartek.formacion.javalibro.pojo.Persona;

public class TiempoPersonas {

	public static void main(String[] args) throws FileNotFoundException {
		String dniBuscar="26779063W";
		FileReader fr = null; // lector de ficheros de caracteres
		BufferedReader br = null;
		/* ARRAY */Persona p = null;
		long tInicio=System.currentTimeMillis();
		/* ARRAYLIST */List<Persona> listaPersonas = null;
		
		HashMap<String, Persona> hm = new HashMap<String, Persona>();
		
		try {
			fr = new FileReader("C:\\Users\\Administrador\\eclipse-workspace\\LibroAnder\\data\\personas.txt");
			br = new BufferedReader(fr);
			String lectura = "";

			//guardar fichero texto a hashmap
			while ((lectura = br.readLine()) != null) {

				// MOSTRAR ARRAYLIST CON NOMBRE Y DNI
				lectura = br.readLine();

				String[] trozos = lectura.split(",");
				if(trozos.length==7) {
				p = new Persona(trozos[0], trozos[1], trozos[2], trozos[3], trozos[4], trozos[5], trozos[6]);
				 listaPersonas =Arrays.asList(p);
				 
				
				
				//PARTE DEL HASHMAP
				//hm.put(p.getDni(), p);
				
				
				}//FIN DE IF
			}
			System.out.println(listaPersonas.get(0).getNombre()+" "+dniBuscar.equals(listaPersonas.get(0).getDni()));
		
			
			//Recorrer el HASHMAP
			
			/*Collection<Persona> cole = hm.values();
			Iterator<Persona> it = cole.iterator();
			Persona itPersona = null;
			while (it.hasNext()) {
				itPersona = it.next();
				System.out.println(itPersona);
			}*/
			
			
			//MOSTRAR LO QUE HA DURADO EL PROCESO
			long tFinal= System.currentTimeMillis();
			System.out.println(tFinal-tInicio);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		

	}

}
