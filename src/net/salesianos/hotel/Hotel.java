package net.salesianos.hotel;

public class Hotel {

    private String nombre;
    private String ciudad;
    private int estrellas;
    private double precioPorNoche;
    private int puntuacion;

   
    public Hotel(String nombre, String ciudad, int estrellas,
            double precioPorNoche, int puntuacion) {

        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estrellas = estrellas;
        this.precioPorNoche = precioPorNoche;
        this.puntuacion = puntuacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

  
    @Override
    public String toString() {

        return "Nombre: " + nombre
                + " Ciudad: " + ciudad
                + " Estrellas: " + estrellas
                + " Precio: " + precioPorNoche
                + " Puntuación: " + puntuacion;
    }
}
    

