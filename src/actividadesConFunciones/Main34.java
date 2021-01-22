package actividadesConFunciones;

import java.util.Scanner;

/**
 * 34.- Realizar un programa en lenguaje Java que conste de función llamada “terminoFibonacci”. La función recibirá un
 * parámetro que será un número entero. Esta deberá devolver el término de la serie que corresponde al orden del
 * parámetro enviado. Si el parámetro fuera negativo, la función devolverá -1. Realizar una pequeña función principal para
 * comprobar que la función trabaja correctamente.
 * Por ejemplo, si a la función se le manda un 7, esta devolverá un 13, que es el séptimo término de la serie.
 */
public class Main34 {
    /**
     * Explicación:
     *
     * En este ejercicio tenemos que calcular el valor de la posición en la serie de Fibonacci.
     * Para ello, tenemos que pedir al usuario un número que será la posición en la que buscar,
     * y crear una función que ejcute la serie.
     *
     * Lo primero sería comprobar que el número introducido sea mayor de cero. Si es negativo,
     * devolvemos un -1.
     * Luego, tenemos que crear un bucle FOR que se ejecute tantas veces como la posición
     * menos una unidad. De esta forma, podemos calcular el número en la posición y
     * devolverlo para imprimirlo por consola.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca la posición de la seria de Fibonacci que quiere
        System.out.print("Introduce la posición en la serie de Fibonacci: ");
        int numero = scanner.nextInt();

        // Mostramos por consola la información
        System.out.println("El valor en la serie de Fibonacci para la posición " + numero + " es: " + terminoFibonacci(numero));
    }

    public static int terminoFibonacci(int posicion) {
        // Declaramos las variables
        int numeroEnPosicion = 0, primeraCifra = 0, segundaCifra = 1;
        // Comprobamos si el parámetro es negativo
        if (posicion < 0) {
            return -1;
        }
        /*
        Creamos un bucle FOR para buscar la posición que nos
        han pasado como parámetro. Cada término nuevo es la suma de los
        dos términos anteriores, con lo que tras calcular el nuevo
        tendremos que actualizar los anteriores.
         */
        for (int i = 1; i < posicion; i++) {
            numeroEnPosicion = primeraCifra + segundaCifra;
            primeraCifra = segundaCifra;
            segundaCifra = numeroEnPosicion;
        }
        return numeroEnPosicion;
    }
}
