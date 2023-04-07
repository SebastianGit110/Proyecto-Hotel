package hotel;

import javax.swing.JOptionPane;

public class HabMatrimonial extends Habitaciones{

    //Variables booleanas para contar servicios
    public boolean secador = false, zapatillas = false, albornoces = false, jacuzzi = false;
    public boolean escritorio = false, tv = false, telefonos = false, productosHigiene = false;
    public int roomService = 0;
    
    public HabMatrimonial(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño, double valor) {
        super(numeroCamasDobles, numeroCamasIndividuales, cantidadHabitaciones, tamañoBaño, valor);
    }
    
    @Override
    public void mostrarHabitacion(){
        String Aux = "";
        
        Aux= "\nLa habitacion matrimonial cuenta con: \n" + getNumeroCamasDobles() + " camas dobles, "
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor de: " + getValor() + "\n"
                + " \nOfrece los siguientes servicios: \nRoom service \nSecador \nZapatillas \nAlbornoces \nJacuzzi \nEscritorio \nTelevision \nTelefonos"
                + "\nProductos para higiene";
        
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Matrimonial", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void mostrarServicios(){
        
    }
    
}
