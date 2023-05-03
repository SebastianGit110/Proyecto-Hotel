package hotel;

import javax.swing.JOptionPane;

public class HabFamiliar extends Habitaciones{

    //Variables para contar servicios
    public int salaJuegos = 0, cunas = 0, piscina = 0;
    public int guarderia = 0, cine = 0, miniClub = 0;
    public int roomService = 0, lavanderia = 0, elecSer = 0, total = 0;
   
    //Array para guardar las habitaciones disponibles
    public int canHab[] = {0, 0, 0, 0, 0};
   
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
                + getCantidadHabitaciones() + " habitaciones y " + getTamañoBaño() + " banos.\nPor un valor por dia de: " + getValor() + "\n"
                + "\nOfrece los siguientes servicios: \nRoom service \nSala de juegos \nCunas \nPiscina \nGuarderia \nCine \nMini club \nLavanderia";
       
        JOptionPane.showMessageDialog(null, Aux,
                "Datos de habitacion Familiar", JOptionPane.INFORMATION_MESSAGE);
    }
   
    @Override
    public void elegirServicios(){
        for(int i=0;i<11;i++){
            String ElecSer = JOptionPane.showInputDialog("Eleccion de servicios \n1. Room service = 50.000 \n2. Sala de juegos = 25.000 \n3. Cunas = 30.000 "
                    + "\n4. Piscina = 100.000 \n5. Guarderia = 20.000 \n6. Cine = 40.000 \n7. Mini club = 55.000 \n8. Lavanderia = 15.000 \n9. Volver");
            elecSer = Integer.parseInt(ElecSer);
            switch(elecSer){
            case 1:
                roomService += 1;
                break;
            case 2:
                salaJuegos += 1;
                break;
            case 3:
                cunas += 1;
                break;
            case 4:
                piscina += 1;
                break;
            case 5:
                guarderia += 1;
                break;
            case 6:
                cine += 1;
                break;
            case 7:
                miniClub += 1;
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
   
    @Override
    public int muestraServicios(){
        roomService = roomService*50000;
        salaJuegos = salaJuegos*25000;
        cunas = cunas*30000;
        piscina = piscina*100000;
        guarderia = guarderia*20000;
        cine = cine*40000;
        miniClub = miniClub*55000;
        lavanderia = lavanderia*15000;
        //System.out.println("Total");
       
        return roomService+salaJuegos+cunas+piscina+guarderia+cine+miniClub+lavanderia;
    }
    
    public void llenarHab(int ConFam){
        //canHab
        for(int j=0;j<ConFam;j++){
            canHab[j]=1;
        }
        
        System.out.println();
        for(int i=0;i<canHab.length;i++){
            System.out.print(canHab[i] + " ");
        }
    }
   
}
