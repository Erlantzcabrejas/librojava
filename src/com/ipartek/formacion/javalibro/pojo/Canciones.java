package com.ipartek.formacion.javalibro.pojo;


public class Canciones {

	private String nombre;
	private String artista;
	private String duracion;
	
	
	public Canciones(String nombre, String artista, String duracion) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
	}
	

	@Override
	public String toString() {
		return "Nombre :" + nombre + ", Artista :" + artista + ", Duracion: " + duracion ;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	


	

}
