import java.util.Scanner;

/**
 * 16.- Construir un algoritmo para visualizar los N primeros múltiplos de 4, donde N es un número
 * que se lee por teclado.
 */
public class Main16 {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a calcular los N primeros múltiplos de 4, sienod N un número que
     * viene de teclado.
     *
     * Para ello, tendremos que crear un bucle WHILE donde la condición de parada sea que el contador
     * de múltiplos sea menor o igual que 4. Empezaremos con el número 1 y continuaremos hasta alcanzar
     * los N múltiplos.
     *
     * En cada iteración del bucle, tendremos que comprobar si ese número es múltiplo y de serlo,
     * imprimir la información y aumentar el contador/variable de control de los múltiplos.
     * También tendremos que pasar al siguiente número antes de finalizar la iteración.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables que vamos a usar
        int contador = 1, numero = 1;

        /*
        Ejecutamos el código del bucle mientras que no hayamos encontrado los cuatro
        primeros múltiplos de 4.
        Comenzamos a contar desde el 1 y vamos aumentando una unidad en cada iteración
        del bucle (cada vez que se ejecuta).
        Cuando conseguimos los 4 múltiplos, se rompe el bucle y salimos.
         */
        while (contador <= 4) {
            if (numero % 4 == 0) {
                System.out.println("El número " + numero + " es múltiplo de 4.");
                contador++;
            }
            numero++;
        }
    }
}
