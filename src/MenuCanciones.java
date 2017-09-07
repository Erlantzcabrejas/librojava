import java.util.ArrayList;
import java.util.Scanner;

public class MenuCanciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int opcion;
		Scanner sc = new Scanner(System.in);

		
		Canciones c1 = new Canciones("Ace of Spades", "Motorhead", 2.57);
		Canciones c2 = new Canciones("Painkiller", "Judas Priest", 6.09);
		Canciones c3 = new Canciones("Domination", "Pantera", 5.11);
		Canciones c4 = new Canciones("Faint", "Linkin Park", 2.48);
		Canciones c5 = new Canciones("Only for the weak", "In Flames", 3.48);
		Canciones c6 = new Canciones("Horizons", "Parkway Drive", 4.20);
		Canciones c7 = new Canciones("Lift you up", "Gotthard", 2.50);
		Canciones c8 = new Canciones("Pacto entre caballeros", "Joaquin Sabina", 3.42);
		Canciones c9 = new Canciones("Master of Puppets", "Metallica", 5.59);
		Canciones c10 = new Canciones("Man in the box", "Alice in Chains", 3.21);

		ArrayList canciones = new ArrayList();
		canciones.add(c1);
		canciones.add(c2);
		canciones.add(c3);
		canciones.add(c4);
		canciones.add(c5);
		canciones.add(c6);
		canciones.add(c7);
		canciones.add(c8);
		canciones.add(c9);
		canciones.add(c10);

		do {
			
			int quitar;
			int seleccionar;
			
			System.out.println("Elija una opcion: ");
			System.out.println("---------------------------");
			System.out.println("1. Ver lista de canciones");
			System.out.println("2. Eliminar una cancion de la lista");
			System.out.println("3. Añadir una cancion a la lista");
			System.out.println("4. Ver detalles de una cancion");
			System.out.println("5. Salir de la aplicacion");
			System.out.println("---------------------------");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				for (int i = 0; i < canciones.size(); i++) {
					System.out.println(canciones.get(i));
				}
				break;

			case 2:
				sc = new Scanner(System.in);
				System.out.println("Elija cancion a eliminar de la lista:");
				quitar = sc.nextInt();
				Canciones c = (Canciones) canciones.get(quitar);
				System.out.println("Se ha eliminado la cancion " + c.getNombre());
				canciones.remove(quitar);

				break;
			/*
			 * if(canciones(quitar)) {
			 * System.out.println("Se ha eliminado la cancion "+canciones(quitar)); }
			 * 
			 */
			case 3:
				System.out.println("Elija una cancion que quieras añadir: ");
				
				break;
			case 4:
				System.out.println("Elije la cancion que quieras escuchar: ");
				seleccionar=sc.nextInt();
				Canciones ca = (Canciones) canciones.get(seleccionar);
				System.out.println("Has seleccionado "+ca.getNombre());
				System.out.println(ca);
				System.out.println("Reproduciendo.........");
				
				break;
			case 5:
				System.out.println("Hasta otra!");
				break;
			default:

			}

		} while (opcion != 5);

	}
}
