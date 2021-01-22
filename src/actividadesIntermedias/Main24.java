package actividadesIntermedias;

import java.util.Scanner;

/**
 * 24.- Escribe un programa que pida un número entero obligatoriamente comprendido entre 1 y 9, y muestre un triángulo
 * como el siguiente:
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1 suponiendo que el usuario ha introducido un 5.
 */
public class Main24 {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a imprimir una serie de líneas por consola con números, que irán decreciendo
     * en tamaño.
     *
     * Tendremos que pedir al usuario que introduzca un número entre 1 y 9, obligando con un DO-WHILE.
     *
     * Crearemos un bucle WHILE que se ejecutará mientras queden líneas por imprimir. Luego,
     * en cada iteración, tenemos que crear un bucle FOR para pintar los números desde el 1 hasta
     * el número de línea que nos toque.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int numeroLineas = 0;

        // Pedimos al usuario que introduzca un número entre 1 y 9
        // Obligamos con un bucle DO-WHILE
        do {
            System.out.print("Introduce un número entre 1 y 9: ");
            numeroLineas = scanner.nextInt();
        } while (numeroLineas < 1 || numeroLineas > 9); // Obligamos a repetir el bucle si el número es menor de 1 o mayor de 9


        while (numeroLineas > 0) {
            for (int i = 1; i <= numeroLineas; i++) {
                System.out.print(i + "\t"); // Le concateno un tabulador para que quede bonito
            }
            /*
            Pintamos una línea nueva justo cuando acaba el bucle, para
            que pueda pintar en la siguiente iteración otra línea
             */
            System.out.println();
            numeroLineas--; // Reducimos en 1 unidad las líneas restantes
        }
    }
}
