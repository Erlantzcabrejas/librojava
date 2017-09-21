package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.ipartek.formacion.javalibro.pojo.Canciones;
import com.ipartek.formacion.javalibro.pojo.Pelicula;

public class LeerPeliculasXML {

	static final String PELICULAS_XML="C:\\Users\\Administrador\\eclipse-workspace\\LibroJava\\src\\data\\peliculas.xml";
	static ArrayList<Pelicula> peliculas= null;
	
	public static void main(String[] args) {
		peliculas = new ArrayList<>();
		System.out.println("Informacion sobre Peliculas");
		System.out.println("---------------------------");

		DocumentBuilder dBuilder;
		
		try {
			 File file = new File(PELICULAS_XML);
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			 dBuilder = dbFactory.newDocumentBuilder();
			 Document doc = dBuilder.parse(file);
			 doc.getDocumentElement().normalize();
			 
		
			NodeList nPeliculas= doc.getElementsByTagName("pelicula");
			Pelicula p= null;
			Element element=null;
			for(int i=0; i<nPeliculas.getLength();i++) {
				
				
				element=(Element)nPeliculas.item(i);
				String tipo= element.getAttribute("tipo");
				String anyo=element.getAttribute("año");
				String titulo= element.getElementsByTagName("titulo").item(0).getTextContent();
				String guionista= element.getElementsByTagName("guionista").item(0).getTextContent();
				String productor=element.getElementsByTagName("productor").item(0).getTextContent();
				String director=element.getElementsByTagName("director").item(0).getTextContent();
				String actor=element.getElementsByTagName("actor").item(0).getTextContent();
				String comentarios=element.getElementsByTagName("comentarios").item(0).getTextContent();
				
				
				p=new Pelicula(tipo,anyo,titulo,guionista,productor,director,
						actor, comentarios);
				peliculas.add(p);
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
		
		for(Pelicula p: peliculas) {
			System.out.println("Tipo: "+p.getTipo()+"   Año: "+p.getAnyo());
			System.out.println("    Titulo:  "+p.getTitulo());
			System.out.println("    Guionista:  "+p.getGuionista());
			System.out.println("    Productor:  "+p.getProductor());
			System.out.println("    Director:  "+p.getDirector());
			System.out.println("    Actor:  "+p.getActor());
			System.out.println("    Comentarios:  "+p.getComentarios());
			
			
			System.out.println("");
		}
		
		
	}

}
