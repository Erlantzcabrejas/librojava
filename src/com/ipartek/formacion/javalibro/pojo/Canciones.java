package com.ipartek.formacion.javalibro.pojo;

public class Canciones {

	private String nombre;
	private String artista;
	private String duracion;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Canciones(String nombre, String artista, String duracion, long id) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
		this.id = id;
	}

	public Canciones(String nombre, String artista, String duracion) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Canciones [nombre=" + nombre + ", artista=" + artista + ", duracion=" + duracion + ", id=" + id + "]";
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
