package actividadesIniciales;

/**
 * 13.- Construir un algoritmo para calcular y escribir la suma de los 100 primeros números
 * naturales. Utiliza la estructura REPETIR.
 */
public class Main13 {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a recorrer los números del 1 al 100 y vamos a ir sumándolos
     * en una variable. Utilizamos un bucle FOR, que empieza en 1 y se ejecuta hasta que la
     * variable es 100, sumando de uno en uno.
     *
     * Para finalizar, mostramos por consola la información de los números.
     */
    public static void main(String[] args) {
        // Declaramos las variables
        int sumatorio = 0;

        // Usamos un bucle FOR para recorrer los números
        // del 1 al 100 (incluídos) y sumarlos
        for (int i = 1; i <= 100; i++) {
            sumatorio += i;
        }

        // Mostramos por consola el resultado del sumatorio
        System.out.println("La suma de los número del 1 al 100 es: " + sumatorio);
    }
}
