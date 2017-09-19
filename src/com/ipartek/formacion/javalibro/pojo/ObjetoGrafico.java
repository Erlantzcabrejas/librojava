package com.ipartek.formacion.javalibro.pojo;

/*
 * Una clase abstracta puede contener codigo implementado, 
 * pero tiene algun metodo SIN implementar (abstract).
 * Es algo intermedio entre Class e Interface.
 * No puede instanciar objetos.
 * Las clases hijas deben implementar los metodos abstractos o volver a declararlos abstract
 */

public abstract class ObjetoGrafico {
	
	int x;
	int y;
	
	void mover(int xPos, int yPos) {
		this.x=xPos;
		this.y=yPos;
	}
	
	//SI HAY UN METODO ABSTRACTO, LA CLASE TIENE QUE SER ABSTRACTA TAMBIEN
	abstract void dibujar();
	
}
