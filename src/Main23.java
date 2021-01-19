import java.util.Scanner;

/**
 * 23.- Crea un programa en lenguaje java con un bucle while que encuentre el menor número tal que su cuadrado sea
 * mayor que 12000.
 */
public class Main23 {
    /**
     * Explicación:
     *
     * En este ejercicio tenemos que buscar un número cuyo cuadrado sea mayor de 12000.
     *
     * Creamos un bucle WHILE que comience a analizar los números desde 1 en adelante en busca
     * del número correcto. Comenzará en 1 y comprobará si su cuadrado es mayor de 12000; en
     * caso contrario aumentará el número.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int numero = 1;
        double cuadrado = 0;

        while (cuadrado < 12000) {
            cuadrado = Math.pow(numero, 2);
            numero++;
        }

        // Mostramos por consola la información
        System.out.println("El cuadrado de " + numero + " vale " + cuadrado + " y es mayor de 12000.");
    }
}
