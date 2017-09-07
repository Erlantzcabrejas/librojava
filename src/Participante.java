
public class Participante {

	//1. Atributos--> Nombre, Usuario, email...
		//Atributos privados para no ser accesibles desde fuera de la Clase
	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;
	
		//2. Constructores--> Se llama igual que la clase...
		
		
	
		public Participante(String nombre, String usuarioGit) {
			super();
			this.nombre = nombre;
			this.usuarioGit = usuarioGit;
			this.email="";
			this.trabajador=false;
			
		}
		
		//CONSTRUCTOR GENERADO DE SUPERCLASE
		public Participante() { 
			super();
			this.nombre="";
			this.usuarioGit = "";
			this.email="";
			this.trabajador=false;//IMPLEMENTAR
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
	//4. Otros metodos...
	
		
		String getLinkGitHub() {
			
			
			return "https://github.com/" +this.usuarioGit;
			
		}
	
	public static void main(String[] args) {
		

	}

	

	

}
