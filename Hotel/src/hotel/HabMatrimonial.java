package hotel;

import javax.swing.JOptionPane;

public class HabMatrimonial extends Habitaciones{

    //Variables para contar servicios
    public boolean secador = false, jacuzzi = false, escritorio = false, tv = false, telefonos = false;
    public int roomService = 0, zapatillas = 0, albornoces = 0, productosHigiene = 0, elecSer = 0;
    
    //Constructores
    public HabMatrimonial(){
        
    }
    
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
    public void elegirServicios(){
        for(int i=0;i<12;i++){
            String ElecSer = JOptionPane.showInputDialog("Eleccion de servicios \n1. Room service \n2. Secador \n3. Zapatillas \n4. Albornoces \n5. Jacuzzi "
                + "\n6. Escritorio \n7. Television \n8. Telefonos \n9. Productos para higiene \n10. Volver");
            elecSer = Integer.parseInt(ElecSer);
            switch(elecSer){
                case 1:
                    roomService += 1;
                    break;
                case 2:
                    secador = true;
                    break;
                case 3:
                    zapatillas += 1;
                    break;
                case 4:
                    albornoces += 1;
                    break;
                case 5:
                    jacuzzi = true;
                    break;
                case 6:
                    escritorio = true;
                    break;
                case 7:
                    tv = true;
                    break;
                case 8:
                    telefonos  = true;
                    break;
                case 9:
                    productosHigiene += 1;
                    break;
                case 10:
                    //System.out.println("No seleccionaste ningun servicio");
                    i=12;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    i--;
            }
        }
    }
    
}
