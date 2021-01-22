package actividadesIniciales;

import java.util.Scanner;

/**
 * 15.- Construir un algoritmo que leídos tres números introducidos por teclado me visualice el
 * mayor.
 */
public class Main15 {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a tener tres números introducidos por teclado, y tendremos que
     * comprobar entre ellos cuál es el mayor.
     *
     * Para finalizar, imprimimos la información de los números.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos los tres números que vamos a analizar, y el mayor
        int num1, num2, num3, numMayor;

        // Pedimos al usuario el valor del número 1
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt();
        // Pedimos al usuario el valor del número 2
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextInt();
        // Pedimos al usuario el valor del número 3
        System.out.print("Introduce el tercer número: ");
        num3 = scanner.nextInt();

        // Comparamos los números y comprobamos cuál es mayor
        if (num1 >= num2 && num1 >= num3) {
            numMayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            numMayor = num2;
        } else {
            numMayor = num3;
        }

        // Mostramos por consola qué número es el mayor
        System.out.println("El número mayor es: " + numMayor);
    }
}
