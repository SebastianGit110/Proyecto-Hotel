package hotel;

import javax.swing.JOptionPane;

public class HabMatrimonial extends Habitaciones{

    public HabMatrimonial(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño, int valor) {
        super(numeroCamasDobles, numeroCamasIndividuales, cantidadHabitaciones, tamañoBaño, valor);
    }
    
    @Override
    public void mostrarHabitacion(){
        String Aux = "";
        
        Aux= "\nLa habitacion matrimonial cuenta con: \n" + getNumeroCamasDobles() + " camas dobles, "
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor de: " + getValor();
        
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Matrimonial", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
