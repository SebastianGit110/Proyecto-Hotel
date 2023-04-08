package hotel;

import javax.swing.JOptionPane;

public class HabSuite extends Habitaciones{

    //Variables para contar servicios
    public boolean cafeteria = false, electrodomesticos = false, miniBar = false, jacuzzi = false;
    public boolean aireAcon = false, wiFi = false, cajaFuerte = false;
    public int roomService = 0, productosHigiene = 0, elecSer = 0;
    
    //Constructores
    public HabSuite(){
        
    }
    
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
    public void elegirServicios(){
        for(int i=0;i<12;i++){
            String ElecSer = JOptionPane.showInputDialog("Eleccion de servicios \n1. Room Service \n2. Cafeteria \n3. Electrodomesticos \n4. Mini bar \n5. Jacuzzi "
                + " \n6. Aire acondicionado \n7. WiFi \n8. Caja fuerte \n9. Productos higiene \n10. Volver");
            elecSer = Integer.parseInt(ElecSer);
            switch(elecSer){
                case 1:
                    roomService += 1;
                    break;
                case 2:
                    cafeteria = true;
                    break;
                case 3:
                    electrodomesticos = true;
                    break;
                case 4:
                    miniBar = true;
                    break;
                case 5:
                    jacuzzi = true;
                    break;
                case 6:
                    aireAcon = true;
                    break;
                case 7:
                    wiFi = true;
                    break;
                case 8:
                    cajaFuerte = true;
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
