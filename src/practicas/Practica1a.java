package practicas;

import java.util.Scanner;

public class Practica1a {
    /**
     * Explicación:
     *
     * En este ejercicio tenemos que calcular un número de la suerte basado en los dígitos
     * de una fecha.
     * Lo primero que tendremos que hacer será recoger la información del año, el mes y el día
     * por separado. Para cada uno podemos usar un bucle DO-WHILE para obligar al usuario a que
     * los valores estén en unos rangos que establecemos.
     *
     * Para introducir el día, tendremos que comprobar si el mes en cuestión tiene 28, 30 o 31 días.
     * Incluso, tendremos que calcular si el año es bisiesto para poder comprobar contra 29 días.
     *
     * Esto se realiza en dos separadas; la primera nos calcula los días máximos de un mes con un
     * SWITCH donde los casos se agrupan en función del número de días.
     * Por otro lado, si el mes es Febrero, la segunda función nos comprueba si es bisiesto. Un
     * año es bisiesto si es divisible por 4, y si no lo es de 100 lo tiene que ser de 400.
     *
     * Una vez que tenemos la cifra completa de la fecha sumando año + mes + día tenemos que sacar
     * cada cifra y sumarlas entre sí. Para obtener cada cifra crearemos un bucle WHILE donde, en cada
     * iteración, sacamos el resto del número actual (numero % 10) y luego reducimos el número entre 10.
     * Por ejemplo, si el número es 932, el cálculo 932 & 10 = 2; luego 932 / 10 = 93.
     * De esta forma sacamos cada cifra.
     *
     * Por último, mostramos por consola la información.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int day, month, year, fecha, numeroDeLaSuerte = 0;

        /*
         Pedimos al usuario el año obligando a que sea
         positivo con un bucle DO-WHILE
         */
        do {
            System.out.print("Introduce el año de tu nacimiento: ");
            year = scanner.nextInt();
        } while (year <= 0);

        /*
        Pedimos al usuario el mes obligando a que sea
        positivo con un bucle DO-WHILE
         */
        do {
            System.out.print("Introduce el mes de tu nacimiento: ");
            month = scanner.nextInt();
        } while (month < 1 || month > 12);

        /*
        Pedimos al usuario un día obligando a que sea
        positivo con un bucle DO-WHILE.
        La expresión de control varía en función del mes
        escogido
         */
        do {
            System.out.print("Introduce el día de tu nacimiento: ");
            day = scanner.nextInt();
        } while (day < 1 || day > obtenerDiasMaximosMes(month, year));

        // Sumamos las cifras de año, mes y dia
        fecha = year + month + day;

        /*
        Creamos un bucle WHILE para sacar cada
        cifra de la variable y añadirla en un
        sumatorio.
         */
        while (fecha > 0) {
         numeroDeLaSuerte += fecha % 10;
         fecha /= 10;
        }

        // Mostramos por consola la información
        System.out.println("El número de la suerte es el " + numeroDeLaSuerte + ".");

    }

    /**
     * Calcula el máximo de días de un mes en base a un mes
     * y un año dados.
     *
     * @param mes el mes a comprobar
     * @param year el año a comprobar
     * @return el número de días
     */
    private static int obtenerDiasMaximosMes(int mes, int year) {
        int diasMaximos = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                // Agrupamos todos los casos de 31
                diasMaximos = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                // Agrupamos todos los casos de 30
                diasMaximos = 30;
                break;
            case 2:
                // Comprobamos si el año es bisiesto
                if(esBisiesto(year)){
                    diasMaximos = 29;
                } else {
                    diasMaximos = 28;
                }
                break;
        }
        return diasMaximos;
    }

    /**
     * Calcula si un año es bisiesto o no en base
     * a un año dado
     *
     * @param year el año a comprobar
     * @return verdadero si es bisiesto o falso en caso contrario
     */
    private static boolean esBisiesto(int year) {
        // Comprobamos si es divisible por 4
        if (year % 4 == 0) {
            // Si el año no es divisible por 100 pero si por 400, es bisiesto
            return year % 100 != 0 || year % 400 == 0;
        }
        return false;
    }
}
