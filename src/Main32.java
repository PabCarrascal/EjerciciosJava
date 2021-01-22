import java.util.Scanner;

/**
 * 31.- Realizar un programa en lenguaje Java que conste de una función llamada “mayor”. La función recibirá tres
 * parámetros que serán números enteros. Esta deberá devolver el mayor de todos. Realizar una pequeña función
 * principal para comprobar que la función trabaja correctamente.
 */
public class Main32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables y pedimos al usuario un valor
        System.out.print("Introduce el valor del número 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el valor del número 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el valor del número 3: ");
        int num3 = scanner.nextInt();

        // Mostramos por consola la información de la función
        System.out.println("EL número más alto entre " + num1 + ", " + num2 + " y " + num3 + " es: " + mayor(num1, num2, num3));
    }

    /**
     * Calcula qué numero es mayor de entre los dados
     *
     * @param a primer número
     * @param b segundo número
     * @param c tercer número
     * @return el mayor número de entre los dados
     */
    public static int mayor(int a, int b, int c) {
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }
}
