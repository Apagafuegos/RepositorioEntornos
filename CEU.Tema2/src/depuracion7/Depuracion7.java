package depuracion7;

import java.util.Scanner;

public class Depuracion7 {

	private static Scanner lectura;

	public static void imprime(String mensaje) {
		int i = 0;
		System.out.println();
		i = mensaje.length() - 1;
		while (i >= 0) {
			System.out.println(mensaje.charAt(i));
			i--;
		}
		i = 0;
		System.out.println();
		while (i < mensaje.length()) {
			System.out.println(mensaje.charAt(i));
			i++;
		}
	}

	public static void main(String[] args) {

		String Contenido = "OpenJDK MOLA-15";

		int num1, num2, num3;

		lectura = new Scanner(System.in);
		System.out.println("Introduce un numero racional:");
		num1 = lectura.nextInt();
		System.out.println("Introduce un segundo racional:");
		num2 = lectura.nextInt();

		System.out.println("Primer numero introducido: " + num1);
		System.out.println("Segundo numero introducido " + num2);
		if (num1 <= num2) {
			num3 = num2 % num1;
			System.out.println("El resto de la división del mayor entre el menor es " + num3);
		} else {
			num3 = num1 % num2;
			System.out.println("El resto de la división del mayor entre el menor es " + num3);
		}
		imprime(Contenido);

	}
}
