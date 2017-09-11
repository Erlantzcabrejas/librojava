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
		
		int[] resul = aDesordenado;
		
		return resul;
	}
	
	public static void main(String[] args) {
		
		int[] aDesordando = {0,3,1,8,7,2,5,4,6,9};
		int aux=0;
		
		for(int x=0;x<(aDesordando.length);x++) {
			for(int i=0;i<(aDesordando.length-1);i++) {
				if(aDesordando[i]>aDesordando[i+1]) {
					aux=aDesordando[i];
					aDesordando[i]=aDesordando[i+1];
					aDesordando[i+1]=aux;
				}else {
					
				}
		
				
			}//fin del for i
		
			System.out.print(aDesordando[x]+"-");
		}//fin del for x
		
	}
	
}
