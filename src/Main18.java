import java.util.Scanner;

/**
 * 18.- Construir un programa en java para un algoritmo que introduzca dos números positivos por
 * teclado, comprobando que lo sean. Imprimir los números que hay entre ellos comenzando por el
 * más pequeño. Contar y mostrar al final cuántos de ellos son pares (divisibles entre 2) y calcular la
 * suma de los mismos.
 */
public class Main18 {
    /**
     * Explicación:
     *
     * En este programa vamos a recibir dos números positivos por teclado y vamos a comprobar cuál es
     * más grande de los dos (tenemos que usar bucles DO-WHILE para asegurar que los números sean positivos).
     *
     * Después, vamos a realizar un bucle FOR que comienza en el menor número introducido y avanza de uno en
     * uno hasta el mayor número introducido. Por cada número que vamos obteniendo tenemos que comprobar
     * si es par, y realizar operaciones matemáticas con ellos.
     *
     * Por último, mostramos por consola la información de las operaciones matemáticas.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables
        int num1, num2, numMayor, numMenor, contadorPares = 0, sumatorioPares = 0;

        /*
         Pedimos el primer número al usuario, comprobando que sea positivo.
         Para ello, creamos un bucle DO-WHILE que se ejecutará hasta que el
         número introducido sea positivo
         */
        do {
            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextInt();
        } while (num1 <= 0);

        // Pedimos el segundo número al usuario; igual que el primer número
        do {
            System.out.print("Introduce el segundo número: ");
            num2 = scanner.nextInt();
        } while (num2 <= 0);

        // Asignamos valor para saber cuál es mayor y cuál menor
        numMayor = num1 > num2 ? num1 : num2;
        numMenor = num1 < num2 ? num1 : num2;
        /*
         Estas dos instrucciones de arriba se pueden cambiar por lo siguiente:
         Opcion a)
            numMayor = Math.max(num1, num2);
            numMenor = Math.min(num1, num2);

         Opcion b)
             if (num1 > num2) {
                numMayor = num1;
                numMenor = num2;
             } else {
                numMayor = num2;
                numMenor = num1;
             }
         */

        // Recorremos los números que hay entre el menor y el mayor,
        // imprimiendo por consola los números que nos encontramos
        System.out.println("Números entre " + numMenor + " y " + numMayor + ": ");
        for (int i = numMenor; i <= numMayor; i++) {
            System.out.print(i + "\t");
            // Comprobamos si el número 'i' es par
            if (i % 2 == 0) {
                contadorPares++;
                sumatorioPares += i;
            }
        }

        // Mostramos por consola la información de los números
        System.out.println(); // Espacio en blanco
        System.out.println("Números entre " + numMenor + " y " + numMayor + " que son pares: " + contadorPares);
        System.out.println("Sumatorio de los números pares entre " + numMenor + " y " + numMayor + ": " + sumatorioPares);
    }
}
