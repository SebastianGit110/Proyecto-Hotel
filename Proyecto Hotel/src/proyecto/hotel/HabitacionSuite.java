package proyecto.hotel;

public class HabitacionSuite extends Habitacion{

    public HabitacionSuite(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño) {
        super(numeroCamasDobles, numeroCamasIndividuales, cantidadHabitaciones, tamañoBaño);
    }
    
    //Metodo que muestra info de la habitacion
    @Override
    public void mostrarHabitacion(){
        System.out.println("\nLa habitacion matrimonial cuenta con: " + getNumeroCamasDobles() + " camas dobles, "
                + "\n" + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos");
    }
}
