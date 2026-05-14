package net.salesianos.listahotel;

import java.util.ArrayList;

import net.salesianos.datos.Datos;
import net.salesianos.hotel.Hotel;

public class ListaHotel {

    private ArrayList<Hotel> hoteles;

    public ListaHotel() {

        hoteles = new ArrayList<>();
    }

    public void añadirHotel() {

        String nombre = Datos.pedirTexto(
                "Introduce el nombre:");

        String ciudad = Datos.pedirTexto(
                "Introduce la ciudad:");

        int estrellas;

        do {

            estrellas = Datos.pedirEntero(
                    "Introduce estrellas:");

            if (estrellas <= 0) {

                System.out.println(
                        "Las estrellas deben ser positivas.");
            }

        } while (estrellas <= 0);

        double precio;

        do {

            precio = Datos.pedirDouble(
                    "Introduce precio:");

            if (precio <= 0) {

                System.out.println(
                        "El precio debe ser positivo.");
            }

        } while (precio <= 0);

        int puntuacion;

        do {

            puntuacion = Datos.pedirEntero(
                    "Introduce puntuación (1-5):");

            if (puntuacion < 1 || puntuacion > 5) {

                System.out.println(
                        "La puntuación debe estar entre 1 y 5.");
            }

        } while (puntuacion < 1 || puntuacion > 5);

        Hotel hotel = new Hotel(
                nombre,
                ciudad,
                estrellas,
                precio,
                puntuacion);

        hoteles.add(hotel);

        System.out.println(
                "Hotel añadido correctamente.");
    }

    public void mostrarHoteles() {

        if (hoteles.isEmpty()) {

            System.out.println(
                    "No hay hoteles registrados.");

            return;
        }

        System.out.println(
                "\n RANKING DE LOS MEJORES HOTELES");

        for (int i = 0; i < hoteles.size(); i++) {

            System.out.println(
                    (i + 1) + ". " + hoteles.get(i));
        }
    }


    public void editarHotel() {

        if (hoteles.isEmpty()) {

            System.out.println(
                    "No hay hoteles para editar.");

            return;
        }

        mostrarHoteles();

        int indice = Datos.pedirEntero(
                "Selecciona hotel a editar:") - 1;

        if (indice < 0 || indice >= hoteles.size()) {

            System.out.println("Índice inválido.");

            return;
        }

        Hotel hotel = hoteles.get(indice);

        String nuevoNombre = Datos.pedirTexto(
                "Nuevo nombre:");

        String nuevaCiudad = Datos.pedirTexto(
                "Nueva ciudad:");

        int nuevasEstrellas;

        do {

            nuevasEstrellas = Datos.pedirEntero(
                    "Nuevas estrellas:");

            if (nuevasEstrellas <= 0) {

                System.out.println(
                        "Las estrellas deben ser positivas.");
            }

        } while (nuevasEstrellas <= 0);

        double nuevoPrecio;

        do {

            nuevoPrecio = Datos.pedirDouble(
                    "Nuevo precio:");

            if (nuevoPrecio <= 0) {

                System.out.println(
                        "El precio debe ser positivo.");
            }

        } while (nuevoPrecio <= 0);

        int nuevaPuntuacion;

        do {

            nuevaPuntuacion = Datos.pedirEntero(
                    "Nueva puntuación (1-5):");

            if (nuevaPuntuacion < 1
                    || nuevaPuntuacion > 5) {

                System.out.println(
                        "La puntuación debe estar entre 1 y 5.");
            }

        } while (nuevaPuntuacion < 1
                || nuevaPuntuacion > 5);

        hotel.setNombre(nuevoNombre);
        hotel.setCiudad(nuevaCiudad);
        hotel.setEstrellas(nuevasEstrellas);
        hotel.setPrecioPorNoche(nuevoPrecio);
        hotel.setPuntuacion(nuevaPuntuacion);

        System.out.println(
                "Hotel editado correctamente.");
    }

    public void eliminarHotel() {

        if (hoteles.isEmpty()) {

            System.out.println(
                    "No hay hoteles para eliminar.");

            return;
        }

        mostrarHoteles();

        int indice = Datos.pedirEntero(
                "Selecciona hotel a eliminar:") - 1;

        if (indice < 0 || indice >= hoteles.size()) {

            System.out.println("Índice inválido.");

            return;
        }

        hoteles.remove(indice);

        System.out.println(
                "Hotel eliminado correctamente.");
    }
    
}
