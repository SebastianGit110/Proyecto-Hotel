package hotelproject;

public abstract class Habitaciones<I,L,S,D> {
    protected int numeroCamasDobles;
    protected int cantidadHabitaciones;
    protected String tamañoBaño;
    protected double valor;
    protected int canHab[] = {0, 0, 0, 0, 0};
   
    public Habitaciones(){
    }

    public Habitaciones(int numeroCamasDobles, int cantidadHabitaciones, String tamañoBaño, double valor) {
        this.numeroCamasDobles = numeroCamasDobles;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.tamañoBaño = tamañoBaño;
        this.valor = valor;
    }
   
    abstract void mostrarHabitacion();
    abstract void elegirServicios();
    abstract int muestraServicios();
    abstract void llenarHab(int i);

    public int getNumeroCamasDobles() {
        return numeroCamasDobles;
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