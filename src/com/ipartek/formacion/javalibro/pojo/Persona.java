package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.utilidades.Validaciones;

public class Persona {
	
	public static int MAYOR_EDAD=18;
	
	
	String nombre;
	String ape1;
	String ape2;
	String email;
	String dni;
	int edad;
	String rol;
	
	public Persona(String nombre, String ape1, String ape2, String email, String dni,String rol,int edad) throws PersonaException {
		super();
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		setEmail(email);
		setDni(dni);
		this.rol = rol;
		setEdad(edad);
		//setEdad(edad);
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

	public void setEmail(String email) throws PersonaException {
		if(!Validaciones.email(email)) {
			throw new PersonaException(PersonaException.MSG_MAIL_ERROR);
		}
		
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws PersonaException {
		if(!Validaciones.dni(dni)){
			throw new PersonaException(PersonaException.MSG_DNI_ERROR);
			
		}
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	/*
	 * Setea la edad de la Persona
	 * @param edad int años de la Persona
	 * @throws PersonaException <18
	 */
	public void setEdad(int edad) throws PersonaException {
		if(edad<MAYOR_EDAD) {
			throw new PersonaException(PersonaException.MSG_EDAD_MENOR);
		}
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
