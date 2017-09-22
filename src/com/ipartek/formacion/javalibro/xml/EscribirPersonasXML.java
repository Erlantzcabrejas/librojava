package com.ipartek.formacion.javalibro.xml;

/*
 * Ejercicio para convertir data/personas.txt a data/personas.xml
 * 
 * estructura del TXT:
 * Ted,Upton,Sant Andreu De La Barca,8,tedfupton@mailinator.com,12277015Y,TRABAJADOR
 * 
 * 
 * estructura del xml:
 * 
 * <personas>
 * 		<persona>
 * 				<nombre>Ted</nombre>
 * 				<apellido1>Upton</apellido1>
 * 				<apellido2>Sant Andreu De La Barca</apellido2>
 * 				<edad>8</edad>
 * 				<email>tedfupton@mailinator.com</email>
 * 				<dni>12277015Y</dni>
 * 				<rol>TRABAJADOR</rol>
 * 		</persona>
 * 
 * 		<persona>
 * 			....
 * 		</persona>
 * </personas>
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscribirPersonasXML {

		 final static String PATH_FICHERO_PERSONAS = "C:\\Users\\Administrador\\eclipse-workspace\\LibroJava\\src\\data\\personas.txt";
		 final static int CAMPOS_NOMBRE = 0;
		 final static int CAMPOS_APE1 = 1;
		 final static int CAMPOS_APE2 = 2;
		 final static int CAMPOS_EDAD = 3;
		 final static int CAMPOS_MAIL = 4;
		 final static int CAMPOS_DNI = 5;
		 final static int CAMPOS_ROL = 6;
		 final static int NUM_CAMPOS_LINEA = 7;

		

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

						

			}
			}catch(Exception e1) { // FIN DE TRY1
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
			}
		}
}	
		/*
		
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			//crear nodo raiz
			Element rootElement = doc.createElement("personas");
	        doc.appendChild(rootElement);
	        
	        //TODO conseguir un ArrayList<Persona> a partir del fichero de texto
	        
	        //TODO un bucle para todas las personas
	        
	        //añadir Elementos Persona al nodo raiz
	        Element ePersona =doc.createElement("persona");
	        	Element eNombre= doc.createElement("nombre");
	        	eNombre.setTextContent("Ted");
	        	
	        	Element eApe1=doc.createElement("apellido1");
	        	eApe1.setTextContent("Upton");
	        	
	        	Element eApe2=doc.createElement("apellido2");
	        	eApe2.setTextContent("Sant Andreu De La Barca");
	        	
	        	Element eEdad=doc.createElement("edad");
	        	eEdad.setTextContent("8");
	        	
	        	Element eEmail=doc.createElement("email");
	        	eEmail.setTextContent("tedfupton@mailinator.com");
	        	
	        	Element eDni=doc.createElement("dni");
	        	eDni.setTextContent("12277015Y");
	        	
	        	Element eRol=doc.createElement("rol");
	        	eRol.setTextContent("TRABAJADOR");
	        	//TODO resto de Campos o Elementos
	        	
	        	
	        	ePersona.appendChild(eNombre);
	        	ePersona.appendChild(eApe1);
	        	ePersona.appendChild(eApe2);
	        	ePersona.appendChild(eEdad);
	        	ePersona.appendChild(eEmail);
	        	ePersona.appendChild(eDni);
	        	ePersona.appendChild(eRol);
	        	
	        	rootElement.appendChild(ePersona);
	        	
	        	
	        	
	        	
	        	
	        	
	        
	        //guardar en fichero
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	         DOMSource source = new DOMSource(doc);
	         StreamResult result = new StreamResult(new File("C:\\Users\\Administrador\\eclipse-workspace\\LibroJava\\src\\data\\personas.xml"));
	         transformer.transform(source, result);
		
		
		
		
	
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	*/

