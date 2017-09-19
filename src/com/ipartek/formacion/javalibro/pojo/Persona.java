package com.ipartek.formacion.javalibro.pojo;

public class Persona {
	
	String nombre;
	String ape1;
	String ape2;
	String email;
	String dni;
	String edad;
	String rol;
	
	public Persona(String nombre, String ape1, String ape2, String email, String dni, String edad, String rol) {
		super();
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.email = email;
		this.dni = dni;
		this.edad = edad;
		this.rol = rol;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", email=" + email + ", dni=" + dni
				+ ", edad=" + edad + ", rol=" + rol + "]";
	}
	
	
}
