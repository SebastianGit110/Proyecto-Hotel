package hotelproject;

import javax.swing.JOptionPane;

public class HabSuite extends Habitaciones<Integer,Integer,String,Double>{

    //Variables para contar servicios
    public int cafeteria = 0, electrodomesticos = 0, miniBar = 0, jacuzzi = 0;
    public int aireAcon = 0, wiFi = 0, cajaFuerte = 0;
    public int roomService = 0, productosHigiene = 0, elecSer = 0, total = 0;
   
    //Constructores
    public HabSuite(){
    }
   
    public HabSuite(int numeroCamasDobles, int cantidadHabitaciones, String tamañoBaño, double valor) {
        super(numeroCamasDobles, cantidadHabitaciones, tamañoBaño, valor);
    }
   
    @Override
    public void mostrarHabitacion(){
        String Aux = "";
       
        Aux= "\nLa habitacion suite cuenta con: \n" + getNumeroCamasDobles() + " camas dobles, "
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor por dia de: " + getValor() + "\n"
                + " \nOfrece los siguientes servicios: \nRoom Service \nCafeteria \nElectrodomesticos \nMini bar \nJacuzzi "
                + " \nAire acondicionado \nWiFi \nCaja fuerte \nProductos higiene";
       
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Suite", JOptionPane.INFORMATION_MESSAGE);
    }
   
    @Override
    public void elegirServicios(){
        for(int i=0;i<12;i++){
            String ElecSer = JOptionPane.showInputDialog("Eleccion de servicios \n1. Room Service = 50.000 \n2. Cafeteria = 25.000 \n3. Electrodomesticos = 30.000 "
                    + "\n4. Mini bar = 80.000 \n5. Jacuzzi = 90.000 \n6. Aire acondicionado = 25.000 \n7. WiFi = 30.000 \n8. Caja fuerte = 15.000 "
                    + "\n9. Productos higiene = 20.000 \n10. Volver");
            elecSer = Integer.parseInt(ElecSer);
            switch(elecSer){
                case 1:
                    roomService += 1;
                    break;
                case 2:
                    cafeteria += 1;
                    break;
                case 3:
                    electrodomesticos += 1;
                    break;
                case 4:
                    miniBar += 1;
                    break;
                case 5:
                    jacuzzi += 1;
                    break;
                case 6:
                    aireAcon += 1;
                    break;
                case 7:
                    wiFi += 1;
                    break;
                case 8:
                    cajaFuerte += 1;
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
   
    @Override
    public int muestraServicios(){
        roomService = roomService*50000;
        cafeteria = cafeteria*25000;
        electrodomesticos = electrodomesticos*30000;
        miniBar = miniBar*80000;
        jacuzzi = jacuzzi*90000;
        aireAcon = aireAcon*25000;
        wiFi = wiFi*30000;
        cajaFuerte = cajaFuerte*15000;
        productosHigiene = productosHigiene*20000;
        //System.out.println("Total");
       
        return roomService+cafeteria+electrodomesticos+miniBar+jacuzzi+aireAcon+wiFi+cajaFuerte+productosHigiene;
    }
    
    public void llenarHab(int ConSui){
        //canHab
        for(int j=0;j<ConSui;j++){
            canHab[j]=1;
        }
        
        System.out.println();
        for(int i=0;i<canHab.length;i++){
            System.out.print(canHab[i] + " ");
        }
    }
}