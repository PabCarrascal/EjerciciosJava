package actividadesIniciales;

import java.util.Scanner;

/**
 * 17.- Construir un algoritmo para introducir una serie de números, que finaliza al leer el número 0.
 * Una vez que ha finalizada la captura de números queremos saber cuántos había mayores, iguales
 * y menores que 50. Otra versión: pedir el número de referencia (50 en el ejemplo anterior) por
 * teclado también.
 */
public class Main17 {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a recibir una serie de números introducidos por teclado y vamos
     * a crear un bucle WHILE para ello, estableciendo como expresión de parada que el último número
     * introducido sea cero.
     *
     * Por cada iteración del bucle, tenemos que comprobar si el número introducido es mayor, menor o igual
     * que un número de referencia que establecemos (o que podemos pedir al principio del ejercicio, antes del
     * bucle WHILE).
     *
     * Para finalizar el ejercicio tendremos que mostar la información de los números por consola.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables de los sumatorios, el número de referencia y la variable de control
        int mayores = 0, iguales = 0, menores = 0, numeroReferencia = 0, variableControl = -1;

        // Pedimos al usuario por teclado el número de referencia
        System.out.print("Introduce el número de referencia: ");
        numeroReferencia = scanner.nextInt();

        /*
         Creamos un bucle para pedir números por teclado
         hasta encontrar un cero
         */
        while (variableControl != 0) {
            // Pedimos un número por teclado
            System.out.print("Introduce un número de la serie: ");
            variableControl = scanner.nextInt();
            if (variableControl > numeroReferencia) {
                mayores++;
            } else if (variableControl == numeroReferencia) {
                iguales++;
            } else if (variableControl < numeroReferencia) {
                menores++;
            }
        }

        // Mostramos la información de los números insertados
        System.out.println("Se han insertado " + mayores + " números mayores que " + numeroReferencia);
        System.out.println("Se han insertado " + menores + " números menores que " + numeroReferencia);
        System.out.println("Se han insertado " + iguales + " números iguales que " + numeroReferencia);
    }
}
