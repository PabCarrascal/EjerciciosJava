import java.util.Scanner;

/**
 * 22.- Construir un programa en lenguaje java que lea por teclado un número entero positivo comprendido entre 1 y 15
 * (debe controlarse este rango) indicativo del número de líneas que deben realizarse, y se impriman tantas líneas como
 * indique el número y de la forma que se detalla más adelante. Debe observarse que en cada línea se inicia con el número
 * que corresponde a la línea en la que nos encontramos y finaliza con el 1. Por ejemplo para 6 filas tendríamos:
 *
 *      *
 *      * *
 *      * * *
 *      * * * *
 *      * * * * *
 *      * * * * * *
 */
public class Main22 {
    /**
     * Explicación:
     *
     * En este ejercicio tenemos que imprimir por consola un número de líneas con unos digitos, colocados de forma descendente,
     * empezando por el número de fila y terminando en 1.
     *
     * Lo primero sería controlar que el número de líneas está entre 1 y 15 con un bucle DO-WHILE, para no continuar la ejecución
     * del programa hasta no tener un número válido.
     *
     * Después, recorremos con un bucle FOR los números del 1 al número de líneas seleccionado. Por cada iteración, tenemos
     * que crear otro bucle FOR para recorrer de forma descendiente los números desde el actual hasta 1, y pintarlos por consola.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int numeroLineas = -1;

        // Pedimos el número de líneas al usuario con un bucle DO-WHILE
        do {
            System.out.print("Introduce un número entre 1 y 15: ");
            numeroLineas = scanner.nextInt();
            /*
            La condición de parada de este bucle es la obtención de un número
            entre 1 y 15. Cualquier número menor de 1 o mayor de 15 nos hace
            repetir el bucle.
             */
        } while (numeroLineas < 1 || numeroLineas > 15);

        /*
        Creamos un bucle FOR para recorrer los números entre 1 y el
        número de líneas, sumando una unidad en cada iteración
         */
        for (int i = 1; i <= numeroLineas; i++) {
            // Pintamos una línea nueva
            System.out.println();
            /*
             Por cada iteración, creamos un bucle decreciente que va desde el
             número que estamos tratando hasta 1, restando una unidad en cada
             pasada
             */
            for (int j = i; j >= 1; j--) {
                // Pintamos los números con un tabulador (para dejarlo más bonito)
                System.out.print(j + "\t");
            }
        }
    }
}
