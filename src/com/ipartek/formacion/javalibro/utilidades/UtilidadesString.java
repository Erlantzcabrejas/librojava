package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesString {
	
	/**
	 * Cuenta las palabras que esten contenidas dentro del 'texto'
	 * @param texto String donde buscar las palabras
	 * @param busqueda String palabra que buscamos dentro del 'texto'
	 * @return int 0 si no encuentra, numero de palabras encontradas
	 */
	static int buscarPalabra ( String texto, String busqueda ) {
		//TODO implementar despues del Test
		int result=0;
		int pos= -1;
		
		
		if(texto==null || busqueda ==null) {
			result=0;
		
		}else {
			
			do {
			//while o for hasta posicion=-1
			pos=texto.indexOf(busqueda);
		
			//*existe?
			if(pos!=-1) {
				
				result++;
				
		   /*recortar cadena*/ 
			texto =texto.substring(pos + busqueda.length());
			}
				
			}while(pos !=-1);
		
		
	
		
	}
		return result;
}
}
