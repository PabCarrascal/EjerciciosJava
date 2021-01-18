import java.util.Scanner;

/**
 * 21.- Hacer un programa en java para introducir dos números inferiores a 50 por teclado. Al menor, aumentarlo de 5
 * en 5, y al mayor disminuirlo de 2 en 2. Imprimir ambas series de números hasta que el menor supere al mayor
 */
public class Main21 {
    /**
     * Explicación:
     *
     * En este ejercicio tendremos que pedir al usuario que introduzca dos números menores de 50, comprobando con bucles DO-WHILE
     * que los números son correctos. Una vez que tenemos ambos números, tenemos que comprobar cuál es mayor de los dos.
     *
     * Tras la comprobación, creamos un bucle WHILE donde, en cada iteración, sumamos/restamos unidades e imprimimos sus nuevos valores
     * por consola. El bucle se rompe cuando su condición sea verdadera; que el menor número sea más grande que el mayor.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int numero1, numero2, numeroMayor, numeroMenor;

        // Pedimos al usuario un número menor de 50
        do {
            System.out.print("Introduce el primer número menor de 50: ");
            numero1 = scanner.nextInt();
        } while (numero1 >= 50);

        // Pedimos al usuario un número menor de 50
        do {
            System.out.println("Introduce el segundo número menor de 50: ");
            numero2 = scanner.nextInt();
        } while (numero2 >= 50);

        // Comprobamos cuál es mayor y cuál es menor
        numeroMayor = Math.max(numero1, numero2);
        numeroMenor = Math.min(numero1, numero2);

        // Imprimimos las cabeceras de los números
        System.out.println("Menor\tMayor");
        System.out.println(numeroMenor + "\t" + numeroMayor);

        /*
         Creamos un bucle WHILE donde vamos a modificar los números iniciales,
         hasta que el menor sea más grande que el mayor
         */
        while (numeroMenor < numeroMayor) {
            numeroMenor+= 5;
            numeroMayor-= 2;
            System.out.println(numeroMenor +"\t" + numeroMayor);
        }
    }
}
