package com.ipartek.formacion.javalibro.ejercicios;
/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. 
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.

	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {
	
	
	public static void main(String[] args) {
		double precio=1326.24;
		long pagar=2000;
		double vueltas=pagar-precio;
		
		final float [] billetesmonedas= {50,20,10,5,2,1,0.50f,0.20f,0.10f,0.05f,0.02f,0.01f};
		final String [] billetesmonedasLiterales= {"Billetes de 50","Billetes de 20","Billetes de 10","Billetes de 5","Monedas de 2"," Monedas de 1","Monedas de 50 centimos","Monedas de 20 centimos","Monedas de 10 centimos","Monedas de 5 centimos","Monedas de 2 centimos","Monedas de 1 centimo"};
		int[] aVueltas = new int[billetesmonedas.length];
		
		
		for(int x=0; x<billetesmonedas.length;x++) {
			aVueltas[x] = (int) (vueltas / billetesmonedas[x]);
			double cantidad=vueltas/billetesmonedas[x];
			int quantity=(int) cantidad;
			
			System.out.println(quantity+" Billetes de "+billetesmonedas[x]);
			
			
			vueltas=vueltas-(quantity*billetesmonedas[x]);
			
				
		}
		
		
		
		
		
		
		
	}
	
	
}
