package net.salesianos.datos;

import java.util.Scanner;

public class Datos {

    private static Scanner sc = new Scanner(System.in);

    public static String pedirTexto(String mensaje) {

        System.out.println(mensaje);

        return sc.nextLine();
    }

    public static int pedirEntero(String mensaje) {

        while (true) {

            try {

                System.out.println(mensaje);

                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Error: introduce un número entero válido.");
            }
        }
    }

    public static double pedirDouble(String mensaje) {

        while (true) {

            try {

                System.out.println(mensaje);

                return Double.parseDouble(sc.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Error: introduce un número decimal válido.");
            }
        }
    }
}
    

