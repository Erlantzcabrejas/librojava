package com.ipartek.formacion.javalibro.ejercicios;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

/*
 * Nos conectaremos a una pagina web http://www.example.com/ para descargar su codigo fuente
 * 
 * 
 * ESTO FALTA POR MEJORAR EL TEMA DEL ENLACE!!!!!!
 */




public class ConectarPaginaWeb {

	public static void main(String[] args) {

		final String PAGINA_WEB = "http://www.example.com/";
		String PAGINA_WEB2="";
		String [] urlBuscar=null;
		
		try {
			// creamos URL
			URL url = new URL(PAGINA_WEB);

			// abrimos la conexion
			URLConnection con = url.openConnection();

			// creamos inputStream y Buffer asociado
			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			//leemos el codigo fuente linea a linea
			String linea="";
			String linea2="";
			while((linea=br.readLine()) !=null) {
				
				if(linea.indexOf("<a href")!=-1) {
					System.out.println(linea);
					urlBuscar=linea.split("\"");
					System.out.println(urlBuscar[1]);
					enlace(urlBuscar[1]);
					PAGINA_WEB2=urlBuscar[1];
					URL url2= new URL(PAGINA_WEB2);
					URLConnection con2= url2.openConnection();
					InputStreamReader isr2 = new InputStreamReader(con2.getInputStream());
					BufferedReader br2= new BufferedReader(isr2);
					while((linea2=br2.readLine()) != null) {
						System.out.println(linea2);
					}
				}
			}

		
		
		} catch (MalformedURLException e) {
			System.out.println("Esta la URL mal escrita " + PAGINA_WEB);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No podemos establecer conexion");
			e.printStackTrace();
		}
	}

	public static void enlace (String enlaceAAceder){
        Desktop enlace=Desktop.getDesktop();
        try {
                enlace.browse(new URI(enlaceAAceder));
        } catch (IOException | URISyntaxException e) {
            e.getMessage();
        }
    }
	
}
