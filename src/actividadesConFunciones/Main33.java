package actividadesConFunciones;

import java.util.Scanner;

/**
 * 33.- Realizar un programa en lenguaje Java que conste de una función llamada “visualizarEntre”. La función recibirá
 * dos parámetros que serán números enteros. Esta deberá mostrar los números comprendidos entre ambos ordenados
 * de mayor a menor. Realizar una pequeña función principal para comprobar que la función trabaja correctamente.
 */
public class Main33 {
    /**
     * Explicación:
     *
     * En este ejercicio tenemos que crear una función que imprima por consola los números comprendidos
     * entre dos dados por el usuario.
     * Para ello, primero obtendremos por teclado la cota inferior y la cota superior.
     * Tendremos que comprobar si ambos números son correctos o tendríamos que intercambiarlos.
     *
     * Después, llamamos a la función donde pasaremos dos parámetros. Crearemos un bucle WHILE
     * donde ejecutaremos el código (imprimir por teclado un número) mientras que la cota inferior
     * sea menor que la cota superior menos una unidad.
     * En cada iteración aumentaremos la cota inferior. También tendremos que controlar si
     * ambos números son iguales o no.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número más bajo: ");
        int numeroInferior = scanner.nextInt();
        System.out.print("Introduce el número más alto: ");
        int numeroSuperior = scanner.nextInt();

        /*
        Comprobamos que el número 1 es el número más bajo,
        y el número 2 el más alto.
        Si esto no es cierto, los intercambiamos
         */
        if (numeroInferior > numeroSuperior) {
            int aux = numeroSuperior;
            numeroSuperior = numeroInferior;
            numeroInferior = aux;
        }

        // Mostramos por consola la información de la función
        System.out.print("Los números entre " + numeroInferior + " y " + numeroSuperior + " son:");
        visualizarEntre(numeroInferior, numeroSuperior);
    }

    /**
     * Visualizar los números entre dos cifras dadas
     *
     * @param a número inferior
     * @param b número superior
     */
    public static void visualizarEntre(int a, int b) {
        // Si los números son iguales, mostramos mensaje
        if (a == b) {
            System.out.print("\tlos números son iguales");
        }
        /*
        Creamos un bucle WHILE desde el número más bajo
        hasta el número más alto menos una unidad (para no
        imprimir los límites)
         */
        while (a < b -1) {
            a++;
            System.out.print("\t" + a);
        }
    }
}
