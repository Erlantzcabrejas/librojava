package com.ipartek.formacion.javalibro.pojo;
import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;

public class Participante {

	//1. Atributos--> Nombre, Usuario, email...
		//Atributos privados para no ser accesibles desde fuera de la Clase
	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;
	private int edad;
		//2. Constructores--> Se llama igual que la clase...
		
		
	
		public Participante(String nombre, String usuarioGit) {
			super();
			this.nombre = nombre;
			this.usuarioGit = usuarioGit;
			this.email="";
			this.trabajador=false;
			this.edad=0;
		}
		
		//CONSTRUCTOR GENERADO DE SUPERCLASE
		public Participante() { 
			super();
			this.nombre="";
			this.usuarioGit = "";
			this.email="";
			this.trabajador=false;//IMPLEMENTAR
			
			
			this.edad=0;
		}
		public Participante(String nombre, int edad) throws ParticipanteException { 
			super();
			this.nombre=nombre;
			this.usuarioGit = "";
			this.email="";
			this.trabajador=false;//IMPLEMENTAR
			
			if (edad <0) {
				throw new ParticipanteException(ParticipanteException.EXCEPTION_MENOR_CERO);
			}else if(edad >100) {
				throw new ParticipanteException(ParticipanteException.EXCEPTION_MAYOR_CIEN);
			}
			this.setEdad(edad);
		
		}
		
		//3. Getters y Setters...Son necesarios para mantener la encapsulacion
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombreAcambiar) {
			this.nombre = nombreAcambiar;
		}
		
		public String getUsuarioGit() {
			return usuarioGit;
		}
		public void setUsuarioGit(String usuarioGit) {
			this.usuarioGit = usuarioGit;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public boolean isTrabajador() {
			return trabajador;
		}
		public void setTrabajador(boolean trabajador) {
			this.trabajador = trabajador;
		}
		
		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) throws ParticipanteException {
			if (edad <0) {
				throw new ParticipanteException(ParticipanteException.EXCEPTION_MENOR_CERO);
			}else if(edad >100) {
				throw new ParticipanteException(ParticipanteException.EXCEPTION_MAYOR_CIEN);
			}
			
			this.edad = edad;
		}

		//4. Otros metodos...
		String getLinkGitHub() {
			
			
			return "https://github.com/" +this.usuarioGit;
			
		}
	
	@Override
		public String toString() {
			return "Participante [nombre=" + nombre + ", usuarioGit=" + usuarioGit + ", email=" + email
					+ ", trabajador=" + trabajador + ", edad=" + edad + "]";
		}

	public static void main(String[] args) {
		

	}

	

	

}
