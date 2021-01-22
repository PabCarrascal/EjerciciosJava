package actividadesIntermedias;

import java.util.Scanner;

/**
 * 26.- Escribe un programa en lenguaje java que lea un entero positivo menor de 100.000 y muestre la suma de sus
 * dígitos. Por ejemplo, si el entero es 932, la suma de sus dígitos es 14 (9 + 3 + 2).
 * Pista para la realización del ejercicio: 932 % 10 = 2 y 932 / 10 = 93
 */
public class Main26 {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a obtener un número positivo menor de 100.000 por teclado, y vamos a sumar sus digitos.
     * Para ello, usaremos un bucle DO-WHILE para obligar a que la cifra esté en ese rango.
     *
     * Crearemos un bucle WHILE para calcular cada cifra del dígito. En cada iteración, obtendremos uno de los dígitos
     * al calcular el módulo del número obtenido entre 10.
     * Después, tenemos que actualizar el número dividiendo entre 10 para poder acceder a la siguiente cifra en la
     * siguiente iteración.
     *
     * Por ejemplo, si tenemos un número 932 y calculamos su módulo a 10, nos devuelve el dígito 2. Después,
     * tendremos que reducir el número dividiendo entre 10 para acceder al siguiente dígito.
     * Saldremos el bucle cuando, en la última división se produzca que el número es menor de 0.
     *
     * Para finalizar, mostraremos por pantalla la suma de los dígitos de una cifra.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int numero, cifra, resultado = 0;

        // Pedimos al usuario el número entre 1 y 100.000 con un bucle DO-WHILE
        do {
            System.out.print("Introduce un número entre 1 y 100.000: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 100000); // Obligamos a que el número esté dentro del rango

        /*
        Creamos un bucle WHILE para calcular cada cifra, donde iremos
        actualizando el número y sacando todos los dígitos
         */
        while (numero > 0) {
            // Calculamos la cifra
            cifra = numero % 10;
            // Sumamos a la variable la cifra calculada
            resultado += cifra;
            // Actualizamos el número
            numero /= 10;
        }

        // Mostramos por consola la suma de las cifras
        System.out.println("La suma de las cifras es: " + resultado);
    }
}
