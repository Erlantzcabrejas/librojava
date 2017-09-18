package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

public class LibroPapel extends Libro implements Vendible{

	

	boolean tapaBlanda;
	
	public LibroPapel(String titulo) {
		super(titulo);
		this.tapaBlanda=true;
	}

	public boolean isTapaBlanda() {
		return tapaBlanda;
	}

	public void setTapaBlanda(boolean tapaBlanda) {
		this.tapaBlanda = tapaBlanda;
	}

	@Override
	public String toString() {
		return super.toString()+ " LibroPapel [tapaBlanda=" + tapaBlanda + "]";
	}

	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		float precio=super.getPrecio();
		if(!tapaBlanda) {
			precio=(float) (precio+1.50);
		}
		
		return precio;
	}

	
	
	
	
}
