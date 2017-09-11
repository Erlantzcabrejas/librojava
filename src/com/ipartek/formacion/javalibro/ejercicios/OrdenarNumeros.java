package com.ipartek.formacion.javalibro.ejercicios;

public class OrdenarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aDesordando = {0,3,1,8,7,2,5,4,6,9};
		int[] resul = aDesordando;
		int aux=0;
		
		//mayor a menor
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
	}


