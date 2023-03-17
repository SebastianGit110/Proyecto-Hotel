package proyecto.hotel;

public abstract class Habitacion {
    protected int numeroCamasDobles;
    protected int numeroCamasIndividuales;
    protected int cantidadHabitaciones;
    protected String tamañoBaño;

    public Habitacion(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño) {
        this.numeroCamasDobles = numeroCamasDobles;
        this.numeroCamasIndividuales = numeroCamasIndividuales;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.tamañoBaño = tamañoBaño;
    }    
    
    //Metodos abstractos
    abstract void mostrarHabitacion();

    //Getters y Setters
    public int getNumeroCamasDobles() {
        return numeroCamasDobles;
    }

    public void setNumeroCamasDobles(int numeroCamasDobles) {
        this.numeroCamasDobles = numeroCamasDobles;
    }

    public int getNumeroCamasIndividuales() {
        return numeroCamasIndividuales;
    }

    public void setNumeroCamasIndividuales(int numeroCamasIndividuales) {
        this.numeroCamasIndividuales = numeroCamasIndividuales;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public String getTamañoBaño() {
        return tamañoBaño;
    }

    public void setTamañoBaño(String tamañoBaño) {
        this.tamañoBaño = tamañoBaño;
    }
    
    
}
