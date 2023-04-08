package hotel;

import javax.swing.JOptionPane;

public class HabFamiliar extends Habitaciones{

    //Variables para contar servicios
    public boolean salaJuegos = false, cunas = false, piscina = false;
    public boolean guarderia = false, cine = false, miniClub = false;
    public int roomService = 0, lavanderia = 0, elecSer = 0;
    
    //Constructores
    public HabFamiliar(){
        
    }
    
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
    public void elegirServicios(){
        for(int i=0;i<11;i++){
            String ElecSer = JOptionPane.showInputDialog("Eleccion de servicios \n1. Room service \n2. Sala de juegos \n3. Cunas \n4. Piscina "
                + "\n5. Guarderia \n6. Cine \n7. Mini club \n8. Lavanderia \n9. Volver");
            elecSer = Integer.parseInt(ElecSer);
            switch(elecSer){
            case 1:
                roomService += 1;
                break;
            case 2:
                salaJuegos = true;
                break;
            case 3:
                cunas = true;
                break;
            case 4:
                piscina = true;
                break;
            case 5:
                guarderia = true;
                break;
            case 6:
                cine = true;
                break;
            case 7:
                miniClub = true;
                break;
            case 8:
                lavanderia += 1;
                break;
            case 9:
                //System.out.println("No seleccionaste ningun servicio");
                i=11;
                break;
            default:
                System.out.println("Opcion incorrecta");
                i--;
            }
        }
        
    }
    
}
