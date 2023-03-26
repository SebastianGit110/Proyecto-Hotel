package hotel;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hotel {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        Scanner in2 = new Scanner (System.in);
        
        //Mensaje Bienvenida
        System.out.println("Le damos la bienvenida al hotel UMB");
        
        Persona cliente = new Persona();
        Reservas reservas = new Reservas();
        
        //Muestra las habitaciones
        HabMatrimonial habmatrimonial = new HabMatrimonial(1, 0, 3, "2", 250000);
        habmatrimonial.mostrarHabitacion();
        
        HabFamiliar habfamiliar = new HabFamiliar(2, 2, 4, "3", 350000);
        habfamiliar.mostrarHabitacion();
        
        HabSuite habsuite = new HabSuite(2, 0, 3, "2", 400000);
        habsuite.mostrarHabitacion();
        
        //Menu para elegir el servicio 
        
        //Variables que verifican la opcion
        boolean reserva = false, checkin = false, checkout = false;
        
        //Variable contadora de personas
        int numPerso = 0;
        
        for(int i=0;i<6;i++){
            String Opcion = JOptionPane.showInputDialog(null,"1. Realizar reserva \n2. Realizar check-in \n3. Realizar check-out \n4. Salir");              
            int opcion = Integer.parseInt(Opcion);            

            switch(opcion){
                case 1:
                    reserva = true;
                    System.out.println("\nRealizar reserva");
                    System.out.println("Cuantas personas quiere ingresar");
                    numPerso = in.nextInt();
                    
                    for(int j=0;j<numPerso;j++){
                        reservas.llenarReserva(new Persona("2"), j);
                    }                    
                    break;
                    
                case 2:
                    if(reserva==false){
                        System.out.println("Primero tienes que realizar la reserva");
                        i--;
                        continue;
                    }
                    checkin = true;
                    System.out.println("Realizar check in");
                    for(int j=0;j<numPerso;j++){
                        reservas.llenarCheckIn(new Persona(numPerso), j);
                    }                                                          
                    break;                    
                case 3: 
                    checkout = true;
                    System.out.println("Realizar check out");
                    if(reserva==false){
                        System.out.println("Primero tienes que realizar la reserva");
                        i--;
                        continue;
                    }
                    break;                    
                case 4:
                    System.out.println("Salir");
                    i = 6;
                    break;
            }
        } 
        
        //reservas.mostrarReserva(numPerso);
        //reservas.mostrarCheckIn(numPerso);
        reservas.mostrarInfoReserva(numPerso);
    }
}
