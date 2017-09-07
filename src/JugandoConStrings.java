import org.omg.CORBA.portable.ValueOutputStream;

public class JugandoConStrings {

	public static void main(String[] args) {
		String manolo="Manolo kabezabolo";
		
		//convertir a minusculas
		System.out.println(manolo.toLowerCase());
		
		//convertir a mayusculas
		System.out.println(manolo.toUpperCase());
		
		//mostrar numero de caracteres
		System.out.println("Longitud de manolo "+manolo.length());
		
		//mostrar posicion de la letra "K"
		System.out.println("Posicion de la letra 'k' "+manolo.indexOf("k"));
		
		
		//separar en dos variables el nombre y apellido con substring
		String nombre= manolo.substring(0, 6); //Manolo
		String apellido= manolo.substring(7); //kabezabolo
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		
		/* Comparando */
		
		String c1="casa";
		String c2="Casa";
		
		//comparar c1 y c2 con equals y equalIgnoreCase
		System.out.println("Equals "+c1.equals(c2));
		System.out.println("EqualsignoreCase "+c1.equalsIgnoreCase(c2));
		
		
		/*Limpiando entradas de datos */
		String c3="perro";
		String c4="    perro    ";
		System.out.println("Limpiando entrada de datos "+c3.equalsIgnoreCase(c3.trim()));
		//las dos variables deben ser iguales (trim)
		
		
		String lorem="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet tempor dui. Sed in metus eu metus vehicula porta in sit amet nulla. Cras mollis aliquet magna et iaculis. Fusce vitae odio quis ligula dictum imperdiet. Proin tempus, ex in efficitur imperdiet, felis quam ultricies lectus, quis pellentesque tellus nulla vitae elit. Sed eget magna id ante scelerisque dignissim et vitae ipsum. Donec a augue ac nisl hendrerit sollicitudin eget eu libero.";
		//mostrar longitud
		System.out.println("Longitud del lorem "+lorem.length());
		
		//contar todas las palabras
		System.out.println("Numero de palabras en lorem: "+lorem.split(" ").length+" palabras ");
		
		
		//contar todas las vocales
		int contador=0;
		char [] aVocales= lorem.toLowerCase().toCharArray();
		char vocal='a';
		char [] vocales= {'a','e','i','o','u'};
		for(int i=0; i<aVocales.length;i++) {
			vocal=aVocales[i];
			
			for(int j=0;j<vocales.length;j++) {
				if(vocales[j]==vocal) {
					contador++;
					break;
				}
			}
		}
		System.out.println("Numero de vocales en lorem: "+contador);
		
		
		//indicar el numero de veces que aparece 'at'
		
		
		char [] aFrase= lorem.toCharArray();
		
		int contadorAT=0;
		for(int i=0;i<aFrase.length;i++) {
			if(aFrase[i]=='i'&&aFrase[i+1]=='t') {
				contadorAT++;
			}
		}
		System.out.println(contadorAT);
		
		
		
		
		
		
		
		
		
		
	}

}
