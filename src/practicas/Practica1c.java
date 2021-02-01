package practicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practica1c {
    /**
     * Explicación:
     *
     * En este ejercicio vamos a simular la venta de libros de una librería, gestionando el stock
     * de los mismos.
     *
     * Para ello, dividiremos el ejercicio en cinco puntos. Lo primero de todo será
     * declarar un contenedor de objetos de tipo HashMap para insertar como clave el ISBN
     * de los libros y como valor el número de ejemplares.
     *
     * En el punto 1, tenemos que solicitar al usuario cuántos libros máximos puede contener
     * la librería. Usaremos un bucle DO-WHILE para obligar a que la cifra sea mayor de 0.
     * Una vez que tenemos el límite máximo, pasamos al siguiente punto.
     *
     * En el punto 2, tenemos que insertar el ISBN de cada uno de los libros. Para ello,
     * vamos a crear un bucle FOR desde 1 hasta el límite máximo aumentamos de 1 en 1.
     * Dentro, en cada iteración, tendremos que pedir al usuario un ISBN nuevo cada vez.
     * Crearemos un bucle DO-WHILE para controlar si el ISBN que nos pasan ya fue introducido.
     * Dentro, en cada iteración, comprobaremos si el ISBN es nuevo o no y mostraremos
     * diferente mensajes en función del resultado.
     * Si tras comprobaciones el ISBN es realmente nuevo, lo insertamos en el conjunto Hashmap
     * poniendo a 0 sus unidades.
     *
     * En el punto 3, tenemos que insertar los ejemplares de cada libro. De nuevo, crearemos
     * un bucle FOREACH para recorrer el conjunto de libros. Como estamos usando un Hashmap,
     * podemos recorrer las entradas insertadas (con los pares de valores) o únicamente
     * el listado de claves.
     * Por cada iteración del bucle tendremos que pedir un número positivo para cada
     * ISBN guardado. Esto
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int librosMaximos, numeroEjemplares = 0;
        String isbn, nuevaVenta;
        Map<String, Integer> libros = new HashMap<>();

        // Punto 1
        do {
            System.out.print("Introduce el tamaño máximo de la librería: ");
            librosMaximos = scanner.nextInt();
        } while (librosMaximos <= 0);

        // Punto 2
        for (int i = 1; i <= librosMaximos; i++) {
            boolean isbnYaIntroducido;
            do {
                System.out.print("Introduce un ISBN nuevo: ");
                isbn = scanner.next();
                if (libros.containsKey(isbn)) {
                    isbnYaIntroducido = true;
                    System.out.println("\tEl ISBN " + isbn + " ya existe.");
                } else {
                    isbnYaIntroducido = false;
                    System.out.println("\tLibro guardado");
                }
            } while (isbnYaIntroducido);
            libros.put(isbn, numeroEjemplares);
        }

        // Punto 3
        for (Map.Entry<String, Integer> libro : libros.entrySet()) {
            do {
                System.out.print("Introduce el número de ejemplares del libro con ISBN " + libro.getKey() + ": ");
                numeroEjemplares = scanner.nextInt();
                if (numeroEjemplares < 0) {
                    System.out.println("\tIntroduce un número positivo.");
                }
            } while (numeroEjemplares < 0);
            libros.put(libro.getKey(), numeroEjemplares);
        }

        // Punto 4
        do {
            System.out.print("Introduce el ISBN del libro a comprar: ");
            isbn = scanner.next();
            if (libros.containsKey(isbn)) {
                do {
                    System.out.print("Introduce cuantos ejemplares compras del libro " + isbn + ": ");
                    numeroEjemplares = scanner.nextInt();
                } while (numeroEjemplares <= 0);
                if (libros.get(isbn) - numeroEjemplares >= 0) {
                    libros.put(isbn, libros.get(isbn) - numeroEjemplares);
                    System.out.println("\tCompra realizada.");
                } else {
                    System.out.println("\tSolo hay " + libros.get(isbn) + " ejemplares del libro " + isbn);
                }
            } else {
                System.out.println("\tEl ISBN introducido no existe.");
            }
            do {
                System.out.print("¿Quieres realizar otra compra?(SI/NO): ");
                nuevaVenta = scanner.next();
            } while (!nuevaVenta.equals("SI") && !nuevaVenta.equals("NO"));
        } while (nuevaVenta.equals("SI"));


        // Punto 5
        System.out.println("Libros en la libreria:");
        for (Map.Entry<String, Integer> libro : libros.entrySet()) {
            System.out.println("ISBN: " + libro.getKey() + "\tCantidad: " + libro.getValue());
        }
    }
}
