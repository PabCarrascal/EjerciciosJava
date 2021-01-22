package actividadesIntermedias;

import java.util.Scanner;

/**
 * 27.- Escribir un programa en lenguaje java en el que se introduzcan por teclado los valores de tres variables, horas,
 * minutos y segundos, todas ellas comprobadas con los valores correctos (las horas entre 0 y 23, ambos inclusive, y los
 * minutos y los segundos entre 0 y 59, ambos inclusive), y me muestre por pantalla la hora UN SEGUNDO más tarde de
 * la hora introducida. Tener en cuenta que si la hora es 23:59:59 la hora un segundo más tarde es 00:00:00
 */
public class Main27 {
    /**
     * Explicación:
     *
     * En este ejercicio tenemos que componer una hora con la cifra de horas, minutos y segundos que nos introducen
     * por teclado. Tenemos que obligar mediante un bucle DO-WHILE a que los valores estén entre 0 y 23 para horas,
     * y entre 0 y 59 para minutos y segundos.
     *
     * Una vez que tenemos la hora establecida, aumentar una unidad los segundos y hacer las comprobaciones necesarias
     * para no pasarnos del límite que tiene cada cifra.
     *
     * Por último, imprimir por consola el resultado.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int horas, minutos, segundos;

        /*
        Pedimos al usuario que introduzca la cifra de las horas.
        Usamos un bucle DO-WHILE para obligar a tener una cifra entre
        0 y 23.
         */
        do {
            System.out.print("Introduce la cifra de las horas (emtre 0 y 23): ");
            horas = scanner.nextInt();
        } while (horas < 0 || horas > 23);

        /*
        Pedimos al usuario que introduzca la cifra de los minutos.
        Usamos un bucle DO-WHILE para obligar a tener una cifra entre
        0 y 59.
         */
        do {
            System.out.print("Introduce la cifra de los minutos (emtre 0 y 59): ");
            minutos = scanner.nextInt();
        } while (minutos < 0 || minutos > 59);

        /*
        Pedimos al usuario que introduzca la cifra de los segundos.
        Usamos un bucle DO-WHILE para obligar a tener una cifra entre
        0 y 59.
         */
        do {
            System.out.print("Introduce la cifra de los segundos (emtre 0 y 59): ");
            segundos = scanner.nextInt();
        } while (segundos < 0 || segundos > 59);

        // Aumentamos el contador de segundos
        segundos++;

        // Realizamos comprobaciones de fecha correcta
        // Comprobamos los segundos
        if (segundos > 59) {
            /*
            Si han pasado más de 59 segundos, los modificamos
            a 0 y aumentamos en una unidad los minutos
             */
            segundos = 0;
            minutos++;
            // Comprobamos los minutos
            if (minutos > 59) {
                /*
                Si han pasado más de 59 minutos, los modificamos
                a 0 y aumentamos en una unidad las horas
                 */
                minutos = 0;
                horas++;
                // Comprobamos las horas
                if (horas > 23) {
                    horas = 0;
                }
            }
        }

        // Mostramos la información de la hora por consola
        System.out.println("La hora introducida es:   " + horas + ":" + minutos + ":" + segundos);
    }
}
