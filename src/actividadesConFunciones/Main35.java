package actividadesConFunciones;

import java.util.Scanner;

/**
 * 35.- Realizar un programa en Java que disponga de una función llamada ES_BISIESTO que reciba un año y devuelva
 * cierto si es bisiesto y falso sino lo es. Comprobar su funcionamiento construyendo un programa que llame a la función.
 * Los años que sean divisibles por 4 serán bisiestos; aunque no serán bisiestos si son divisibles entre 100 (como los años
 * 1700, 1800, 1900, 2100) a no ser que sean divisibles por 400 (como los años 1600, 2000, 2400).
 */
public class Main35 {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a calcular si un año es bisiesto o no.
     *
     * Lo primero será pedir al usuario el año. Al ser un número positivo, usaremos un bucle DO-WHILE
     * para obligar a ello.
     *
     * Después crearemos una función ES_BISIESTO con un parámetro, que será el año a comprobar.
     * Tenemos que comprobar si el año es divisible por 4 para saber si es bisiesto.
     * Si lo es, endremos que calcular si no es divisible por 100 pero si por 400. Si lo es,
     * devolvemos verdadero. En cualquier otro caso el año no es bisiesto y devolvemos falso
     *
     * Por último, mostramos por consola la información.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int year;

        /*
         Pedimos al usuario el año como número positivo.
         Esto lo podemos obligar con un bucle DO-WHILE
         */
        do {
            System.out.print("Introduce un año para saber si es bisiesto: ");
            year = scanner.nextInt();
        } while (year <= 0);

        System.out.println("¿Es bisiesto el año " + year + "?: " + ES_BISIESTO(year));
    }

    /**
     * Calcular si un año es bisiesto o no
     *
     * @param year el año a comprobar
     * @return si es bisiesto o no
     */
    public static boolean ES_BISIESTO(int year) {
        boolean esBisiesto = false;
        // Si es divisible por 4, es bisiesto
        if (year % 4 == 0) {
            // Si no es divisible por 100 pero si por 400, es bisiesto
            esBisiesto = year % 100 != 0 || (year & 400) == 0;
        }
        return esBisiesto;
    }
}
