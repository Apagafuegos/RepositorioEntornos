package ejercicioBien;

import java.util.Random;
import java.util.Scanner;

public class julianmaricong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] palabras = { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado", "terremoto",
				"culinario", "teclado", "primavera" };

		int indicePalabra = new Random().nextInt(palabras.length);
		String palabra = palabras[indicePalabra];

		String palabraSecreta = palabras[new Random().nextInt(palabras.length)];

		String palabraCorrecta[] = palabraSecreta.split("");

		String[] letrasOculta = palabraSecreta.split("");
		for (int i = 1; i < letrasOculta.length; i++) {
			letrasOculta[i] = ("_");
		}
		boolean check = false;
		Boolean noTerminado = true;
		Integer contador = 0;
		Integer intentosFallidos = 0;

		System.out.println("Adivina la palabra:");
		do {

			for (int i = 0; i < letrasOculta.length; i++) {
				System.out.print(letrasOculta[i] + " ");
			}
			System.out.println("\nIntroduce una letra:");
			String letra = sc.nextLine();
			for (int i = 0; i < palabraCorrecta.length; i++) {

				if (palabraCorrecta[i].equals(letra)) {
					letrasOculta[i] = letra;
					check = true;
				}
			}

			if (check == false) {
				intentosFallidos++;
			}

			for (int i = 0; i < letrasOculta.length; i++) {
				if (palabraCorrecta[i].equals(letrasOculta[i])) {
					contador++;
				}
			}

			if (contador == letrasOculta.length) {
				noTerminado = false;
			}

		} while (intentosFallidos < 10 && noTerminado);

		if (intentosFallidos == 10) {
			System.out.println("GAME OVER");
		} else {
			System.out.println("¡Enhorabuena! Has ganado.");
		}

	}
}
