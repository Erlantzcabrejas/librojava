import java.util.InputMismatchException;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {

		int vidas = 3;
		int numIntroducido = 0;
		boolean acierto = false;
		boolean numeroBien = false;
		String repetir = "";
		boolean siNo = false;
		boolean reinicio = true;

		Scanner sc = new Scanner(System.in);

		// COMPROBAR NUMERO

		while (reinicio = true) {
			double numAleatorio = Math.random() * 10;
			do {

				numAleatorio = (int) numAleatorio;
				do {
					try {
						sc = new Scanner(System.in);
						System.out.println("Introduzca un numero");
						numIntroducido = sc.nextInt();
						numeroBien = true;
					} catch (InputMismatchException e) {
						System.out.println("Introduce un numero entre el 0 y el 10 porfavor");
						numeroBien = false;
					}

				} while (!numeroBien);

				if (numIntroducido == numAleatorio) {
					System.out.println("Has acertado, eres un campeon!");
					acierto = true;
				} else {
					vidas--;
					System.out.println("Has fallado, tienes " + vidas + " vidas");
				}

			} while (acierto == false && vidas != 0);

			// VICTORIA O DERROTA
			if (acierto) {
				System.out.println("Victoriaa!");
			} else {
				System.out.println("El numero correcto era " + numAleatorio);
				System.out.println("Game Over..");
			}

			// REPETIR JUGAR
			do {
				try {
					System.out.println("Jugar de nuevo??");
					repetir = sc.next();
					if ("si".equalsIgnoreCase(repetir)) {
						System.out.println("Ese es el espiritu!");
						vidas = 3;
						acierto = false;
						siNo = true;
					} else if ("no".equalsIgnoreCase(repetir)) {
						System.out.println("Menudo Loser...");
						vidas=3;
						siNo = true;
						reinicio = false;
						numeroBien = true;
						acierto = true;
					}

				} catch (InputMismatchException e) {

					System.out.println("Introduce si o no porfavor");
				}
			} while (!siNo);
		}
	}
}