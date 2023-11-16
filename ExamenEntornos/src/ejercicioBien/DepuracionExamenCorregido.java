package ejercicioBien;

import java.util.Scanner;

public class DepuracionExamenCorregido {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt(); //Número del cual se va a ver si los dos siguientes son múltiplos ¡¡No es error!!

        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 <= numero2 || numero1 <= numero3) { // Código erróneo = (numero1 <= numero2 || numero2 <= numero3). Se ha de comparar numero1 con n2 y n3, no n1 con n2 y n2 con n3, por tanto, cambio numero2 <= numero3 a numero1 <= numero3
            System.out.println("El primer número no puede ser menor que los otros.");
        } else {
            if (numero1 % numero2 == 0) { // Código erróneo = (numero1 % numero2 == 1). Si un número1 es múltiplo de otro numero2, el resto al dividirlo ha de ser 0. Hay que cambiar (n1 % n2 == 1) a (n1 % n2 == 0). Esto en ambos lugares.
                System.out.println(numero2 +" es multiplo de: " +numero1); // Código erróneo = System.out.println(numero1 +" es multiplo de: " +numero2); Aquí debería de decir n2 es multiplo de n1, no al reves
            }
            if (numero1 % numero3 == 0) { 
            	System.out.println(numero3 +" es multiplo de: " +numero1); // Código erróneo = System.out.println(numero1 +" es multiplo de: " +numero2); Mismo error que en el anterior, solo que en vez de poner n2 al principio, he de poner n3.
            }
        }

        scanner.close();
    }

}
