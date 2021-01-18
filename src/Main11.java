import java.util.Scanner;

/**
 * 11.- Construir un algoritmo que tome como dato de entrada un número que corresponde a la
 * longitud de un radio y nos calcula y escribe la longitud de la circunferencia, el área del círculo y
 * el volumen de la esfera.
 * l=2*pi*r
 * a=pi*r2
 * v=4/3*pi*r3
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables que vamos a usar
        int radio = 0;
        double longitud = 0, area = 0, volumen = 0;

        // Pedimos al usuario un número
        System.out.print("Introduce un número: ");
        // Recogemos el número
        radio = scanner.nextInt();

        // Calculamos la longitud
        longitud = 2 * Math.PI * radio;
        // Calculamos el area
        area = Math.PI * Math.pow(radio, 2);
        // Calculamos el volumen
        volumen = (Math.PI * Math.pow(radio, 3)) * 4 / 3;

        // Mostramos por consola la información calculada
        System.out.println("Radio introducido: " + radio);
        System.out.println("Longitud: " + longitud);
        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
    }
}
