package actividadesConFunciones;

import java.util.Scanner;

/**
 * 31.- Realizar un programa en lenguaje Java que conste de una función llamada “mayor”. La función recibirá dos
 * parámetros que serán números enteros. Esta deberá devolver el mayor de ambos. Realizar una pequeña función
 * principal para comprobar que la función trabaja correctamente.
 */
public class Main31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables y pedimos al usuario un valor
        System.out.print("Introduce el valor del número 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el valor del número 2: ");
        int num2 = scanner.nextInt();

        // Mostramos por consola la información de la función
        System.out.println("EL número más alto entre " + num1 + " y " + num2 + " es: " + mayor(num1, num2));
    }

    /**
     * Calcula qué numero es mayor de entre los dados
     *
     * @param a primer número
     * @param b segundo número
     * @return el mayor número de entre los dados
     */
    public static int mayor(int a, int b) {
        return a > b ? a : b;
    }
}
