package hotelproject;

import javax.swing.JOptionPane;

public class HabMatrimonial extends Habitaciones{
   
    //Variables para contar servicios
    public int secador = 0, jacuzzi = 0, escritorio = 0, tv = 0, telefonos = 0;
    public int roomService = 0, zapatillas = 0, albornoces = 0, productosHigiene = 0, elecSer = 0, total = 0;
   
    //Array para guardar las habitaciones disponibles
    public int canHab[] = {0, 0, 0, 0, 0};
   
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
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor por dia de: " + getValor() + "\n"
                + " \nOfrece los siguientes servicios: \nRoom service \nSecador \nZapatillas \nAlbornoces \nJacuzzi \nEscritorio \nTelevision \nTelefonos"
                + "\nProductos para higiene";
       
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Matrimonial", JOptionPane.INFORMATION_MESSAGE);
    }
   
    @Override
    public void elegirServicios(){
        for(int i=0;i<12;i++){
            String ElecSer = JOptionPane.showInputDialog("Eleccion de servicios \n1. Room service = 50.000 \n2. Secador = 20.000 \n3. Zapatillas = 15.000 "
                    + "\n4. Albornoces = 35.000 \n5. Jacuzzi = 90.000 \n6. Escritorio = 30.000 \n7. Television = 40.000 \n8. Telefonos = 35.000 "
                    + "\n9. Productos para higiene = 20.000 \n10. Volver");
            elecSer = Integer.parseInt(ElecSer);
            switch(elecSer){
                case 1:
                    roomService += 1;
                    break;
                case 2:
                    secador += 1;
                    break;
                case 3:
                    zapatillas += 1;
                    break;
                case 4:
                    albornoces += 1;
                    break;
                case 5:
                    jacuzzi += 1;
                    break;
                case 6:
                    escritorio += 1;
                    break;
                case 7:
                    tv += 1;
                    break;
                case 8:
                    telefonos += 1;
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
        secador = secador*20000;
        zapatillas = zapatillas*15000;
        albornoces = albornoces*35000;
        jacuzzi = jacuzzi*90000;
        escritorio = escritorio*30000;
        tv = tv*40000;
        telefonos = telefonos*35000;
        productosHigiene = productosHigiene*20000;
        //System.out.println("Total");
       
        return total = roomService+secador+zapatillas+albornoces+jacuzzi+escritorio+tv+telefonos+productosHigiene;
    }
    
    @Override
    public void llenarHab(int ConMat){
        //canHab
        for(int j=0;j<ConMat;j++){
            canHab[j]=1;
        }
        
        System.out.println();
        for(int i=0;i<canHab.length;i++){
            System.out.print(canHab[i] + " ");
        }
    }
}