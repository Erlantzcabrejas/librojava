package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.ipartek.formacion.javalibro.pojo.Canciones;

/*
 * Ejercicio para aprender a leer o parsear un documento XML
 */

public class LeerCancionesXML {
	
	static final String CANCIONES_XML="C:\\Users\\Administrador\\eclipse-workspace\\LibroJava\\src\\data\\canciones.xml";
	static ArrayList<Canciones> canciones= null;
	
	
	public static void main(String[] args) {
		canciones = new ArrayList<>();
		System.out.println("Listado Canciones");
		System.out.println("---------------------------");
		
		//parsear el fichero XML
		
		DocumentBuilder dBuilder;
		try {
			 File file = new File(CANCIONES_XML);
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			 dBuilder = dbFactory.newDocumentBuilder();
			 Document doc = dBuilder.parse(file);
			 doc.getDocumentElement().normalize();
			 //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		
			NodeList nCanciones= doc.getElementsByTagName("cancion");
			Canciones c= null;
			Element element=null;
			for(int i=0; i<nCanciones.getLength();i++) {
				
				
				element=(Element)nCanciones.item(i);
				String idString= element.getAttribute("id");
				long id= Long.parseLong(idString);
				String nombre= element.getElementsByTagName("nombre").item(0).getTextContent();
				String artista= element.getElementsByTagName("artista").item(0).getTextContent();
				String duracion=element.getElementsByTagName("duracion").item(0).getTextContent();
				
				c=new Canciones(nombre, artista,duracion,id);
				canciones.add(c);
			}
		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
		//mostrar Cancion por pantalla
		for(Canciones c: canciones) {
			System.out.println("Cancion "+c.getId());
			System.out.println("    Nombre:  "+c.getNombre());
			System.out.println("    Artista: "+c.getArtista());
			System.out.println("    Duracion: "+c.getDuracion());
			
			System.out.println("");
		}
		
		
		
	}

}
