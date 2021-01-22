package actividadesIntermedias;

/**
 *29.- Realizar un programa en lenguaje Java para resolver un proceso que calcule y muestre el valor de la siguiente
 * serie o suma:
 *           1        3       5       7         9       11      13
 * Suma=   _____ + ______ - _____ + ______ + _______ - _____ + _____ +……….
 *           2        4       8       16       32       64      128
 * El número de términos que utilizaremos en el cálculo de la suma será indeterminado. Se dejará de calcular términos
 * cuando el término calculado sea menor de 0,0001 .
 */
public class Main29 {
    /**
     * Explicación:
     *
     * En este ejercico vamos a calcular los números de una suma, donde los dividendos
     * se obtienen de una serie de números impares empezando en 1, y los divisores
     * se obtienen de una serie de potencias de 2 empezando con potencia de 1.
     *
     * Tendremos que crear un bucle WHILE para continuar buscando divisiones mientras que
     * el resultado de la división sea mayor de 0.0001.
     */
    public static void main(String[] args) {
        // Declaramos variables
        double calculoActual = 1, sumatorio = 0.0, termino = 0.0001;
        int dividendoActual = 0, divisorActual = 1;

        // Mostramos por pantalla el primer mensaje
        System.out.print("Suma:\t");

        // Mientras el calculo dividendo entre divisor sea mayor que 0.0001 continuamos
        while (calculoActual >= termino) {
            /*
             Calculamos el dividendo actual. Los dividendos que obtendremos
             corresponden con la serie de números impares desde el 1.

             Por tanto, tenemos que calcular el siguiente número impar
             */
            do {
                dividendoActual++;
            } while (dividendoActual % 2 == 0); // Mientras sea par, continuamos ejecutando el bucle

            /*
            Calculamos el divisor actual. Los divisores que obtendremos
            corresponden con la serie de potencias de 2, empezando desde 2^1.

            Por tanto, tenemos que multiplicar por 2 el anterior número divisor.
             */
            divisorActual *= 2;

            // Calculamos la operación actual -> dividendo / divisor
            calculoActual = (double) dividendoActual / divisorActual;
            // Acumulamos en el sumatorio
            sumatorio += calculoActual;

            // Comprobamos si hay que escribir la operación
            if (calculoActual >= termino) {
                System.out.print(dividendoActual + "/" + divisorActual + "\t+\t");
            }
        }
    }
}
