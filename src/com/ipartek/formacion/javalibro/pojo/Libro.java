package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.pojo.interfaces.Imprimible;
import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

public class Libro implements Imprimible, Vendible{

	private String titulo;
	private String autor;
	private int paginas;

	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.autor = "Anonimo";
		this.paginas = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	/*
	 * "protected": Se puede acceder desde el mismo "package" o desde otro.
	 * Desde la propia clase.
	 * Desde cualquier "subclase" o "Clase Hija",
	 * pero no se pueden ver desde una clase de otro "package" 
	 */
	protected void metodoProtegido() {
		System.out.println("Soy un metodo Protegido");
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}
	
	/* sin especificar == packages como calificador de acceso */
	
	/*packaged*/ void imprimir() {
		System.out.println("Imprimiendo........");
	}

	@Override
	public float getPrecio() {
		float precio=0;
		precio= (float) (paginas*0.2);
		
		return precio;
	}
	
}
