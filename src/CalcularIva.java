import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		String respuesta;
		
		boolean repetir=true;
		System.out.println("Calculadora IVA 21%");
		System.out.println("--------------------------");
		
		
		//do {
			
			System.out.println("Por favor dame el importe en euros: ");
		
		
		Scanner sc= new Scanner(System.in);
		float importe=sc.nextFloat();
		
		System.out.println("IVA repercutido: "+importe*0.21);
		System.out.println("Deseas volver a insertar cantidad: S o N?");
		
		respuesta=sc.nextLine();
		System.out.println(respuesta);
		if(respuesta=="si") {
			repetir=true;
		}else if(respuesta=="no"){
			repetir=false;
		}else {
			
		}
		
		
		//}while(repetir==true);
		System.out.println("Terminado el proceso...");
		}

}
