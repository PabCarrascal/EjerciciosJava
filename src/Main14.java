/**
 * 14.- Construir un algoritmo para sumar independientemente los números pares y los impares
 * comprendidos entre 1 y 100. Visualizar los resultados. Utilizar la estructura MIENTRAS.
 */
public class Main14 {
    /**
     * Explicación:
     *
     * En este ejercicio tenemos que recorrer con un bucle WHILE los números entre 1 y 100 (
     * esa es la condición de parada).
     * Por cada iteración del bucle, tendremos que comprobar si el número es par o impar y
     * sumarlo a la variable correspondiente.
     *
     * Para finalizar, mostramos la información de los números.
     */
    public static void main(String[] args) {
        // Declaramos un contador que usaremos como variable de control
        int numero = 1;
        // Declaramos el sumatorio de numeros pares y el de impares
        int sumatorioPares = 0, sumatorioImpares = 0;

        /*
         Recorremos los números del 1 al 100 (incluídos)
         y añadimos cada número al sumatorio correspondiente.

         Hacemos que se ejecute el código del bucle mientras
         la comprobación sea verdadera
         */
        while (numero <= 100) {
            /*
             Usamos el operador de módulo '%' para calcular el resto de una operación.
             Dicho de otra forma, podemos saber si un número es divisible entre otro si
             el resto de la operación es cero
             */
            if (numero % 2 == 0) {
                sumatorioPares += numero;
            } else {
                sumatorioImpares += numero;
            }

            // Aumentamos el contador
            numero++;
        }

        System.out.println("El sumatorio de los números pares del 1 al 100 es: " + sumatorioPares);
        System.out.println("El sumatorio de los números impares del 1 al 100 es: " + sumatorioImpares);
    }
}
