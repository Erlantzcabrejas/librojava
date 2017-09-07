
public class TocaLeer {

	/*
	 * static String [] alumnos = { "Arkaitz", "Erlantz", "Fran", "Cristian",
	 * "Leire" , "Mikel", "Josu", "Alberto", "Jon", "Arantza", "Naiara", "Lander",
	 * "Yeray", "German" };
	 * 
	 */
	private String nombre;

	public TocaLeer(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public static void main(String[] args) {
	
		Participante alumnos[]=new Participante[15];
		
		alumnos[0]=new Participante("Arkaitz","sdfs");
		alumnos[1]=new Participante("Erlantz1","sdfsdf");
		alumnos[2]=new Participante("Fran","sdsgfd");
		alumnos[3]=new Participante("Cristian","hfhghf");
		alumnos[4]=new Participante("Erlantz2","fkhlgjkhldj");
		alumnos[5]=new Participante("Leire","dfgjdfgjk");
		alumnos[6]=new Participante("Mikel","dgkgjkh");
		alumnos[7]=new Participante("Josu","irtuith");
		alumnos[8]=new Participante("Alberto","etjkn");
		alumnos[9]=new Participante("Jon","sfdjkld");
		alumnos[10]=new Participante("Arantza","sdfsdfasdas");
		alumnos[11]=new Participante("Naiara","qoweywg");
		alumnos[12]=new Participante("Lander","oiuewrk");
		alumnos[13]=new Participante("Yeray","asdg");
		alumnos[14]=new Participante("German","qpwournv");
		
		
		int numAleatorio = generarNumeroAleatorio(alumnos.length );					
		
		System.out.println("El afortunad@ es:" + alumnos[numAleatorio].getNombre());
		
	}

	/**
	 * genera numero aleatorio entre 0 y <code>max</code>
	 * 
	 * @param max
	 *            int numero maximo que puede generar la funci�n
	 * @return int aleatorio
	 */
	public static int generarNumeroAleatorio(int max) {
		int resul = -1;

		resul = (int) (Math.random() * max);

		return resul;
	}

}
