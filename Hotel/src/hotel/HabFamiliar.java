package hotel;

import javax.swing.JOptionPane;

public class HabFamiliar extends Habitaciones{

    //Variables booleanas para contar servicios
    public boolean salaJuegos = false, cunas = false, piscina = false;
    public boolean guarderia = false, audiovisual = false, miniClub = false, lavanderia = false;
    public int roomService = 0;
    
    public HabFamiliar(int numeroCamasDobles, int numeroCamasIndividuales, int cantidadHabitaciones, String tamañoBaño, double valor) {
        super(numeroCamasDobles, numeroCamasIndividuales, cantidadHabitaciones, tamañoBaño, valor);
    }
    
    @Override
    public void mostrarHabitacion(){
        String Aux = "";
        
        Aux= "\nLa habitacion familiar cuenta con: \n" + getNumeroCamasDobles() + " camas dobles, "
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor de: " + getValor() + "\n"
                + "\nOfrece los siguientes servicios: \nRoom service \nSala de juegos \nCunas \nPiscina \nGuarderia \nCine \nMini club \nLavanderia";
        
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Familiar", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void mostrarServicios(){
        
    }
    
}
