package com.ipartek.formacion.librojava.utilidades;


public class UtilidadesColeciones {

	/**
	 * Ordena un Array con el metodo bubble-sort
	 * @see https://www.youtube.com/watch?v=lyZQPjUT5B4
	 * @param aDesordenado Array desordenado
	 * @param orden true de mayor a menor, false de menor a mayor
	 * @return array ordenado segun parametro <code>orden</code>
	 */
	
	
	static int[] ordenarArray( int[] aDesordenado, boolean orden ) {
		
		
		int[] resul = aDesordenado.clone();
		int aux=0;
		
		if(orden) {//mayor a menor
			for(int x=0;x<(resul.length);x++) {
				for(int i=0;i<(resul.length-1);i++) {
					if(resul[i]>resul[i+1]) {
						aux=resul[i];
						resul[i]=resul[i+1];
						resul[i+1]=aux;
					}else {
						
					}
			
					
				}//fin del for i
			
				System.out.print(resul[x]+"-");
			}
		}
		return resul;
	}
	

	
}
