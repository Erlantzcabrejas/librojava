package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

public class ListarVolumenes {

	public static void main(String[] args) {
		
		//EJERCICIO DE LA PAGINA 189, EJERCICIO 10.1
		
		//Nos muestra los discos que hay en nuestro PC
		System.out.println("Volumenes o Unidades de nuestro PC");
		File f= new File("");
		File [] volumenes=f.listRoots();
		for(File v: volumenes) {
			System.out.println(v.getPath());
		}
	}

}
