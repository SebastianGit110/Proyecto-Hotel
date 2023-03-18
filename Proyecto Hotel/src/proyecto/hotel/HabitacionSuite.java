package proyecto.hotel;

import javax.swing.JOptionPane;

public class HabitacionSuite extends Habitacion{

    public HabitacionSuite(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño, int valor) {
        super(numeroCamasDobles, numeroCamasIndividuales, cantidadHabitaciones, tamañoBaño, valor);
    }
    
    //Metodo que muestra info de la habitacion
    @Override
    public void mostrarHabitacion(){
         String Aux = "";
        
        Aux= "\nLa habitacion suite cuenta con: \n" + getNumeroCamasDobles() + " camas dobles, "
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor de: " + getValor();
        
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Suite", JOptionPane.INFORMATION_MESSAGE);
    }
}
