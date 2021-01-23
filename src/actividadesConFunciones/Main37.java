package actividadesConFunciones;

import java.util.Scanner;

/**
 * 37.- Construir un programa en lenguaje java para un proceso que introduzca por teclado un número entero mayor de 3
 * y menor de 3000 (se debe comprobar que se encuentre en este rango de valores) y nos muestre los números primos
 * que sean menores que dicho número. Para la realización de este algoritmo se debe crear una función es_primo, que se
 * le envíe un número entero como parámetro formal y devuelva un 1 si el número enviado es primo y un 0 en el caso de
 * que no lo sea, o bien devuelva true o false.
 */
public class Main37 {
    /**
     * Explicación:
     *
     * En este ejercico tendremos que calcular una serie de números primos inferiores a un número que nos da el
     * usuario, entre 3 y 3000. Tendremos que crear un bucle DO-WHILE para obligar a que esté en ese rango.
     *
     * Luego, crearemos un bucle WHILE que ejecutará el código mientras el número actual sea mayor de 3.
     * Así, llamaremos a un método que comprueba si el número es primo o no y restaremos una unidad a la variable númerica.
     *
     * Este método es un bucle que comprueba si es primo o no, analizando si el número que le pasamos como
     * parámetro es divisible contando desde 2 hasta el propio número introducido.
     *
     * Por último, mostraremos por consola la información.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int numero, contador;

        /*
        Pedimos un número al usuario que esté entre 3 y 3000.
        Para ello, usamos un bucle DO-WHILE para obligar a
        que esté en ese rango
         */
        do {
            System.out.print("Introduce un número entre 3 y 3000: ");
            numero = scanner.nextInt();
            contador = numero;
        } while (numero < 3 || numero > 3000);

        System.out.print("Estos son los números primos menores de " + numero + ":");

        while (contador >= 3) {
            if (es_primo(contador)) {
                System.out.print("\t" + contador);
            }
            contador--;
        }
    }

    public static boolean es_primo(int numero) {
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
