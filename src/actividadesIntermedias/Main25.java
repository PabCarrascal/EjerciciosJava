package actividadesIntermedias;

import java.util.Scanner;

/**
 * 25.- Hacer un programa en lenguaje java para calcular cuantas cifras (dígitos) tiene un número entero positivo que se
 * introduce por teclado, que obligatoriamente debe estar comprendido entre 1 y 1.000.000.
 */
public class Main25 {
    /**
     * Explicación:
     *
     * En este ejercicio tenemos que calcular la longitud de un número que introducen por teclado, el cuál
     * estará comprendido entre 1 y un millón.
     *
     * Para ello, obtendremos con un bucle DO-WHILE el número en ese rango y luego convertiremos el número a
     * cadena de caracteres (String). De esta forma, podremos saber la longitud de la cadena y así sabremos
     * el número de cifras que tiene.
     *
     * Para convertir de número entero a cadena utilizaremos la clase "String" y su método "valueOf()",
     * pasando como parámetro la cifra. Este método convierte un número 123 en una cadena "123".
     * Por último, usaremos el método "length()" de la variable String para acceder a su longitud.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int cifra = 0;
        String cadena = "";

        // Pedimos por teclado al usuario un número con un bucle DO_WHILE
        do {
            System.out.print("Introduce un número entre 1 y 1.000.000: ");
            cifra = scanner.nextInt();
        } while (cifra < 1 || cifra > 1000000);

        // Convertimos el número en cadena de caracteres
        cadena = String.valueOf(cifra);

        // Mostramos por consola la longitud de la cadena (el número de cifras)
        System.out.println("El número de cifras del número " + cifra + " es de: " + cadena.length());
    }
}
