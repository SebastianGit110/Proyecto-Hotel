package hotel;

public abstract class Habitaciones {
    protected int numeroCamasDobles;
    protected int numeroCamasIndividuales;
    protected int cantidadHabitaciones;
    protected String tamañoBaño;
    protected double valor;

    public Habitaciones(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño, double valor) {
        this.numeroCamasDobles = numeroCamasDobles;
        this.numeroCamasIndividuales = numeroCamasIndividuales;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.tamañoBaño = tamañoBaño;
        this.valor = valor;
    }
    
    abstract void mostrarHabitacion();
    abstract void mostrarServicios();

    public int getNumeroCamasDobles() {
        return numeroCamasDobles;
    }

    public int getNumeroCamasIndividuales() {
        return numeroCamasIndividuales;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public String getTamañoBaño() {
        return tamañoBaño;
    }

    public double getValor() {
        return valor;
    }
    
    
}
