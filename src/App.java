import net.salesianos.datos.Datos;
import net.salesianos.listahotel.ListaHotel;


public class App {

    public static void main(String[] args) {

        ListaHotel lista = new ListaHotel();

        int opciones;

        do {

            System.out.println(
                    "\nRIPADBAISOR (empresa fictica... quizás)");

            System.out.println(
                    "1. Añadir hotel");

            System.out.println(
                    "2. Editar hotel");

            System.out.println(
                    "3. Mostrar hoteles");

            System.out.println(
                    "4. Eliminar hotel");

            System.out.println(
                    "5. Salir");

            opciones = Datos.pedirEntero(
                    "Selecciona una opción:");


            switch (opciones) {

                case 1:

                    lista.añadirHotel();

                    break;

                case 2:

                    lista.editarHotel();

                    break;

                case 3:

                    lista.mostrarHoteles();

                    break;

                case 4:

                    lista.eliminarHotel();

                    break;

                case 5:

                    System.out.println(
                            "Saliendo del programa...");

                    break;

                default:

                    System.out.println(
                            "Opción inválida.");
            }

        } while (opciones != 5);
    }
}