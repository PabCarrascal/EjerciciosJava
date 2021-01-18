import java.util.Scanner;

/**
 * 12.- Construir un algoritmo que leído un número por teclado nos diga si es positivo, negativo o
 * nulo.
 */
public class Main12 {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a recibir un número por teclado, y tenemos que comprobar
     * si es mayor que cero (positivo), menor que cero (negativo) o nulo (igual a 0).
     * Las comprobaciones se harán con IF y en cada caso mostraremos la información respectivamente.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int numero = 0;

        // Pedimos un número por teclado
        System.out.print("Introduce un número: ");
        numero = scanner.nextInt();

        // Comprobamos si es positivo, negativo o nulo
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0 ) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número " + numero + " es nulo.");
        }
    }
}
