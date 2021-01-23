package actividadesConFunciones;

import java.util.Scanner;

/**
 * 36.- Realizar un programa en lenguaje Java que conste de función llamada “siguiente_primo” . La función recibirá un
 * parámetro que será un número entero. Esta deberá devolver el siguiente número primo que sea mayor al número que se
 * le ha enviado. En el caso de que el parámetro enviado fuera negativo o cero, deberá devolver un 1. Realizar una pequeña
 * función principal para comprobar que la función trabaja correctamente.
 */
public class Main36 {
    /**
     * Explicación:
     *
     * En este ejercicio tendremos que calcular el siguiente número primo en base a uno dado.
     *
     * Para ello, tendremos que pedir al usuario un número entero que analizaremos en la función siguiente_primo.
     * Lo primero a comprobar en la función es que el número que nos pasan como parámetro sea positivo.
     *
     * Luego, crearemos un bucle WHILE que ejecutará el código mientras no hayamos encontrado un número primo.
     * Así, por cada iteración del bucle aumentaremos una variable númerica en una unidad y llamaremos a un
     * método privado que comprueba si el número es primo o no.
     *
     * Este método privado es un bucle que comprueba si es primo o no, analizando si el número que le pasamos como
     * parámetro es divisible contando desde 2 hasta el propio número introducido.
     *
     * Por último, mostraremos por consola la información.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos un número al usuario
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Pedimos al usuario el número
        System.out.print("El siguiente número primo que sigue a " + numero + " es: " + siguiente_primo(numero));
    }

    public static int siguiente_primo(int numero) {
        boolean esPrimo = false;
        int siguientePrimo = numero;

        // Si es negativo o cero, devolvemos 1
        if (siguientePrimo <= 0) {
            return 1;
        }

        while (!esPrimo) {
            siguientePrimo++;
            esPrimo = esPrimo(siguientePrimo);
        }

        return siguientePrimo;
    }

    private static boolean esPrimo(int numero) {
        if (numero % 2 == 0) {
            return false;
        }
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }
}
