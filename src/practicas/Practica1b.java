package practicas;

import java.util.Scanner;

public class Practica1b {

    private static final int LONGITUD_MAX = 8;

    /**
     * Explicación:
     *
     * En este ejercicio tenemos que calcular un NIF, en base a un DNI + una letra.
     *
     * Para ello, tendremos que pedir al usuario un DNI de máximo ocho caracteres.
     * Usaremos un bucle DO-WHILE para obligar a que esté en rango.
     *
     * Creamos un método para comprobar la longitud del DNI. Dentro, crearemos
     * un bucle WHILE para contar el número de cifras del DNI. En cada iteración
     * calcularemos la siguiente cifra calculando el módulo de la cantidad actual por 10,
     * y luego reduciendo la cantidad en 10.
     *
     * Para calcular la letra, tenemos que calcular el resto de la operación de
     * dividir el DNI por 23. El número restante (entre 0 y 22) corresponde
     * con una letra - caso del flujo de control SWITCH.
     *
     * Por último mostramos por consola la información.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int dni;
        String letra;

        /*
        Pedimos al usuario que introduzca su DNI.
        Usamos un bucle DO-WHILE para obligar a que tenga
        entre 1 y 8 cifras
         */
        do {
            System.out.print("Introduce tu DNI sin letra: ");
            dni = scanner.nextInt();
        } while (!comprobarLongitudDNI(dni));

        /*
         Calculamos la letra que corresponde al DNI,
         pasando como parámetro el resto de la operación
         del DNI por 23
         */
        letra = calcularLetra(dni % 23);

        // Mostramos la información por consola
        System.out.println("NIF completo: " + dni + letra);
    }

    /**
     * Método para comprobar si el DNI supera
     * la longitud máxima
     *
     * @param dni el dni a comprobar
     * @return verdadero si la longitud es correcta o falso
     * en caso contrario
     */
    private static boolean comprobarLongitudDNI(int dni) {
        if (dni <= 0) {
            return false;
        }
        int numeroCifras = 0;
        /*
        Creamos un bucle WHILE para sacar cada cifra
        y comprobar el número de cifras
         */
        while (dni > 0) {
            dni /= 10;
            numeroCifras++;
        }
        return numeroCifras <= LONGITUD_MAX;
    }

    /**
     * Método que calcula la letra en base al DNI
     *
     * @param resto resto del DNI
     * @return la letra correspondiente
     */
    private static String calcularLetra(int resto) {
        switch (resto) {
            case 0: return "T";
            case 1: return "R";
            case 2: return "W";
            case 3: return "A";
            case 4: return "G";
            case 5: return "M";
            case 6: return "Y";
            case 7: return "F";
            case 8: return "P";
            case 9: return "D";
            case 10: return "X";
            case 11: return "B";
            case 12: return "N";
            case 13: return "J";
            case 14: return "Z";
            case 15: return "S";
            case 16: return "Q";
            case 17: return "V";
            case 18: return "H";
            case 19: return "L";
            case 20: return "C";
            case 21: return "K";
            case 22: return "E";
        }
        return null;
    }
}
