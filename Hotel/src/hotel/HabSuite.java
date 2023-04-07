package hotel;

import javax.swing.JOptionPane;

public class HabSuite extends Habitaciones{

    //Variables booleanas para contar servicios
    public boolean cafeteria = false, electrodomesticos = false, miniBar = false, jacuzzi = false;
    public boolean aireAcon = false, wiFi = false, cajaFuerte = false, productosHigiene = false;
    public int roomService = 0;
    
    public HabSuite(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño, double valor) {
        super(numeroCamasDobles, numeroCamasIndividuales, cantidadHabitaciones, tamañoBaño, valor);
    }
    
    @Override
    public void mostrarHabitacion(){
        String Aux = "";
        
        Aux= "\nLa habitacion suite cuenta con: \n" + getNumeroCamasDobles() + " camas dobles, "
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor de: " + getValor() + "\n"
                + " \nOfrece los siguientes servicios: \nRoom Service \nCafeteria \nElectrodomesticos \nMini bar \nJacuzzi "
                + " \nAire acondicionado \nWiFi \nCaja fuerte \nProductos higiene";
        
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Suite", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void mostrarServicios(){
        
    }
    
}
