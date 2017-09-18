package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

//Clase hija de Libro, se hace extends para que herede los metodos del padre
public class LibroElectronico extends Libro implements Vendible{

	private int tamanyo; // MegaBytes

	public LibroElectronico(String titulo) {
		super(titulo);
		this.tamanyo = 0;
	}

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}

	@Override
	public String toString() {
		return super.toString()+" LibroElectronico [tamanyo=" + tamanyo + "]";
	}

	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		float precio=super.getPrecio();
		precio=(precio)-5;
		
		
		return precio;
	}

	
	
	
}
