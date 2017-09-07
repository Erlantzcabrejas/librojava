

public class Canciones {

	private String nombre;
	private String artista;
	private double duracion;
	
	
	public Canciones(String nombre, String artista, double d) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = d;
	}
	

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", artista=" + artista + ", duracion=" + duracion + "]";
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


	public double getDuracion() {
		return duracion;
	}


	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}


	


	

}
