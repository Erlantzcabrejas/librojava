package com.ipartek.formacion.javalibro.pojo;

public class PintandoObjetosGraficos {

	public static void main(String[] args) {
		
		//UNA CLASE ABSTRACTA NO SE PUEDE INSTANCIAR
		//ObjetoGrafico obj= new ObjetoGrafico() {
		
		//UNA INTERFAZ TAMPOCO SE PUEDE INSTANCIAR
		//Vendible v=new Vendible();
		
		Circulo c=new Circulo();
		c.dibujar();
		c.mover(12, 0);
		
		
		LineaColor lc= new LineaColor();
		lc.color="rojo";
		lc.longitud=56;
		lc.mover(99, -12); //Metodo ObjetoGrafico
		lc.dibujar();		//Metodo abstracto ObjetoGrafico

	}

}
