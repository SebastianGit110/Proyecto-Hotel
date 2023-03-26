package hotel;

import javax.swing.JOptionPane;

public class HabFamiliar extends Habitaciones{

    public HabFamiliar(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño, int valor) {
        super(numeroCamasDobles, numeroCamasIndividuales, cantidadHabitaciones, tamañoBaño, valor);
    }
    
    public void mostrarHabitacion(){
        String Aux = "";
        
        Aux= "\nLa habitacion familiar cuenta con: \n" + getNumeroCamasDobles() + " camas dobles, "
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor de: " + getValor();
        
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Matrimonial", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
