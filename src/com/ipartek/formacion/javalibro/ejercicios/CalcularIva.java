package com.ipartek.formacion.javalibro.ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		String respuesta;
		boolean repetir = true;
		Scanner sc = new Scanner(System.in);
		float importe = 0;
		boolean importeCorrecto = false;
		boolean respuestaCorrecta = false;
		System.out.println("Calculadora IVA 21%");
		System.out.println("--------------------------");

		do {

			System.out.println("Por favor dame el importe en euros: ");

			// COMPROBAR QUE SEA UN NUMERO
			do {
				try {

					// HACER LO QUE QUERAIS PERO QUE PASE POR LAS OTRAS EXCEPTION

					// CORRECTO
					sc = new Scanner(System.in);
					importe = sc.nextFloat();
					importeCorrecto = true;

					// NULLPointerException
					// sc=null;
					// sc.next();

					// EXCEPTION
					// importe=9/0;

				} catch (NullPointerException e) {
					System.out.println("Ya me diras como has metido un Null...");
				} catch (InputMismatchException e) {
					System.out.println("Valor incorrecto, introduce un valor correcto, por ejemplo: 123.33");
				} catch (Exception e) {
					System.out.println("¿Que has hecho retrasado?");
				}
			} while (!importeCorrecto);

			// CALCULO DEL IVA
			System.out.println("IVA repercutido: " + importe * 0.21);
			System.out.println("Deseas volver a insertar cantidad: S o N?");

			respuesta = sc.next();
			System.out.println(respuesta);

			// REPETIR CALCULO DE IVA O NO

			do {
				try {

					if ("si".equalsIgnoreCase(respuesta)) {
						System.out.println("Vamos otra vez..");
						respuestaCorrecta = true;
					} else if ("no".equals(respuesta) || "NO".equals(respuesta) || "No".equals(respuesta)) {
						System.out.println("No gracias, no me apetece...");
						repetir = false;
						respuestaCorrecta = true;

					}
				} catch (Exception e) {
					System.out.println("Introduzca respuesta valida: Si o No..");
				}
			} while (!respuestaCorrecta);

		} while (repetir == true);

		System.out.println("Terminado el proceso...");
		sc.close();
	}

}
