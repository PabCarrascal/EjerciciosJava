import java.util.Scanner;

/**
 * 19.- Construir un programa en java para un algoritmo que introduzca por teclado una serie de
 * números positivos (comprobar y obligar que lo sean), que finalizará con el número 0, que no se
 * considerará. Se desea visualizar el mayor de todos los números de la serie introducida, la media
 * de los números que eran pares y la media de los números divisibles por tres.
 */
public class Main19 {
    /**
     * Explicación:
     *
     * En este ejercicio tendremos que introducir por teclado una serie de números positivos (comprobando con un bucle
     * DO-WHILE que cada número introducido sea correcto) hasta que se introduzca un cero, y luego realizar operaciones
     * matemáticas con los números que hemos introducido.
     *
     * Para ello vamos a contar con un bucle DO-WHILE que se ejecuta hasta que el número introducido sea cero.
     * Mientras tanto, por cada iteración del bucle vamos a pedir (y comprobar) que el usuario meta número enteros.
     * Cada número se comprobará si es par, si es divisible entre 3 o si es el mayor que se ha introducido (actualizando
     * en cada iteración la variable en caso de encontrar un nuevo mayor).
     *
     * Por último, se realizan las operaciones matemáticas necesarias para las medias y mostramos la información.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables
        int numeroPorTeclado = -1, numeroMayor = 0;
        int contadorPares = 0, sumatorioPares = 0, mediaNumerosPares = 0;
        int contadorDivisilesPor3 = 0, sumatorioDivisiblesPor3 = 0, mediaNumerosEntre3 = 0;

        // Creamos un bucle DO-WHILE que se ejecuta hasta que recibimos un cero
        do {
            /*
            Hacemos un bucle DO-WHILE para obligar al usuario a introducir un número positivo
             */
            do {
                System.out.print("Introduce un número mayor que 0: ");
                numeroPorTeclado = scanner.nextInt();
            } while (numeroPorTeclado < 0);

            // Comprobamos si el número introducido es el nuevo mayor
            if (numeroPorTeclado > numeroMayor) {
                numeroMayor = numeroPorTeclado;
            }
            // Comprobamos si el número es par
            if (numeroPorTeclado % 2 == 0) {
                contadorPares++;
                sumatorioPares+= numeroPorTeclado;
            }
            // Comprobamos si el número es divisible por 3
            if (numeroPorTeclado % 3 == 0) {
                contadorDivisilesPor3++;
                sumatorioDivisiblesPor3 += numeroPorTeclado;
            }

        } while (numeroPorTeclado != 0);

        // Calculamos las medias
        if (contadorPares > 0) {
            mediaNumerosPares = sumatorioPares / contadorPares;
        }

        if (contadorDivisilesPor3 > 0) {
            mediaNumerosEntre3 = sumatorioDivisiblesPor3 / contadorDivisilesPor3;
        }

        // Mostramos la información de los números
        System.out.println("El mayor número de todos es: " + numeroMayor);
        System.out.println("La media de los números pares es: " + mediaNumerosPares);
        System.out.println("La media de los números divisibles entre tres es: " + mediaNumerosEntre3);
    }
}
