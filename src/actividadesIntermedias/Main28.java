package actividadesIntermedias;

import java.util.Scanner;

/**
 * 28.- Construir un programa en lenguaje java en el que se introduzcan por teclado los coeficientes reales A, B y C de
 * una ecuación de segundo grado, y calcule y muestre sus soluciones, en el caso de que las hubiera, tras el estudio del
 * discriminante: b2 – 4*a*c . Utilizar java.math para hacer la raíz cuadrada.
 */
public class Main28 {
    /**
     * Explicación:
     *
     * En este ejercico tendremos que representar la fórmula de una ecuación de segundo grado.
     * Para ello, obtendremos del usuario tres valores números (A, B y C) y
     * calcularemos el discriminante (b^2 - 4*a*c).
     *
     * En función del discriminante podremos obtener dos soluciones reales distintas, iguales
     * o dos soluciones complejas.
     *
     * Por último, imprimiremos por consola el resultado de nuestra ecuación.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables
        int a, b, c;
        double solucionMas, solucionMenos;

        // Pedimos al usuario que introduzca los valores
        System.out.print("Introduce el valor de A: ");
        a = scanner.nextInt();
        System.out.print("Introduce el valor de B: ");
        b = scanner.nextInt();
        System.out.print("Introduce el valor de C: ");
        c = scanner.nextInt();

        /**
         * La fórmula para una ecuación de segundo grado es:
         *
         * -b +- raíz cuadrada (b^2 - 4ac)
         * ------------------------------------------
         *                  2a
         */
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        /*
        Se llama discriminante, Δ, a la fórmula b^2 - 4ac

        El signo de Δ nos permite conocer el tipo de soluciones de la ecuación:
        - Si Δ > 0, hay dos soluciones reales distintas.
        - Si Δ = 0, hay dos soluciones reales iguales.
        - Si Δ < 0, no hay soluciones reales (hay dos soluciones complejas distintas).

        Con lo cuál, tenemos que comprobar el valor del discriminante y mostrar un mensaje u otro
         */

        if (discriminante >= 0) {
            // Calculamos las dos opciones, la del más y la del menos
            solucionMas = ((b * -1) + Math.sqrt(discriminante)) / 2 * a;
            solucionMenos = ((b * -1) - Math.sqrt(discriminante)) / 2 * a;

            System.out.println("Las posibles soluciones de la ecuación, para los valores {" + a + ", " + b + ", " + c + "} son: " + solucionMas + " y " + solucionMenos);
        } else {
            System.out.println("Las posibles soluciones de la ecuación, para los valores {" + a + ", " + b + ", " + c + "} son soluciones complejas y no se pueden calcular.");
        }
    }
}
