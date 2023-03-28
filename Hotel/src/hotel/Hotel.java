package hotel;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hotel {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        Scanner in2 = new Scanner (System.in);
        
        //Mensaje Bienvenida
        System.out.println("Le damos la bienvenida al hotel UMB");
        
        //Instacias de las clases con constructor vacio
        Adultos adulto = new Adultos();
        Niños niño = new Niños();
        
        //Keys de los hashtable
        int ConAdu = 0, ConNi = 0;
        
        //Variable contadora de personas
        int NumClientes = 0, NumAdu = 0, NumNi = 0;
        
        //Variable que cuentan dias de estadia
        int canDias = 0;
        
        //Variables que cuentan cuantas habitaciones
        String TipoHab = "";
        int  NumHab = 0, ConMat = 0, ConFam = 0, ConSui = 0;
        
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
        
        for(int j=0;j<6;j++){
            String Opcion = JOptionPane.showInputDialog(null,"1. Realizar reserva \n2. Realizar check-in \n3. Realizar check-out \n4. Salir");              
            int opcion = Integer.parseInt(Opcion);            

            switch(opcion){
                case 1:
                    reserva = true;
                    System.out.println("\nRealizar reserva");
                    System.out.println("Cuantas personas van a hospedarse");
                    NumClientes = in.nextInt();
                    
                    //
                    for(int i=0;i<5;i++){
                        //Cantidad Adultos
                        System.out.println("Cuantos son adultos");
                        NumAdu = in.nextInt();
                        if(NumAdu>NumClientes){
                            System.out.println("Ha ingresado un numero mayor que el numero de clientes");
                            i--;
                            continue;
                        }
                        else{
                            break;
                        }
                    }

                    //Llena adultos llamando al hashtable de la clase
                    for(int i=0;i<NumAdu;i++){
                        adulto.llenarDatosReserva(ConAdu);
                        ConAdu++; //Llave del hashtable
                    }

                    for(int i=0;i<2;i++){
                        if(NumAdu == NumClientes){
                            break;
                        }
                        else{                
                            for(int l=0;l<5;l++){                                      
                                //Cantidad Niños
                                System.out.println("Cuantos son niños");
                                NumNi = in.nextInt();       
                                if((NumNi+NumAdu)!=NumClientes){ //Verifica que la cantidad de niños y adultos sea igual a la cantidad de clientes
                                    System.out.println("No coinciden los datos con las personas que se van a hospedar");
                                    l--;//
                                    continue;
                                }
                                else{                        
                                    break;
                                }
                            }
                            if(NumNi==NumClientes){ //Verifica que hayan adultos
                                System.out.println("Se necesita un mayor de edad para continuar con el proceso");
                                break;                 
                            }    
                            else{
                                //Llena niños llamando al hashtable de la clase
                                for(int l=0;l<NumNi;l++){
                                    niño.llenarDatosReserva(ConNi);
                                    ConNi++; //Llave del hashtable
                                }
                                break;
                            }
                        }          
                    }
                    //

                    //Numero de habitaciones
                    String numHab = JOptionPane.showInputDialog("Cuantas habitaciones necesitan ");
                    NumHab = Integer.parseInt(numHab);

                    //Tipo de habitaciones
                    for(int i=0;i<NumHab;i++){
                        TipoHab = JOptionPane.showInputDialog("Cual es la " + (i+1) + " habitacion");

                        if(TipoHab.equals("Matrimonial")){
                            ConMat++;
                        }
                        else if(TipoHab.equals("Familiar")){
                            ConFam++;
                        }
                        else if(TipoHab.equals("Suite")){
                            ConSui++;
                        }
                    }
                    
                    String CanDias = JOptionPane.showInputDialog("Por cuantos dias quieren hacer la reserva ");
                    canDias = Integer.parseInt(CanDias);
                    
                    break;     
                case 2:
                    if(reserva==false){
                        System.out.println("Primero tienes que realizar la reserva");
                        j--;
                        continue;
                    }
                    checkin = true;
                    System.out.println("Realizar check in");
                    
                    for(int l=0;l<NumAdu;l++){
                        adulto.llenarDatosCheckin(ConAdu);
                        ConAdu++; //Llave del hashtable
                    }
                    
                    for(int l=0;l<NumNi;l++){
                        niño.llenarDatosCheckin(ConNi);
                        ConNi++; //Llave del hashtable
                    }
                    
                    break;                    
                case 3: 
                    checkout = true;
                    System.out.println("Realizar check out");
                    if(reserva==false){
                        System.out.println("Primero tienes que realizar la reserva");
                        j--;
                        continue;
                    }
                    break;                    
                case 4:
                    System.out.println("Salir");
                    j = 6;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
        
        //Muestra datos de las reservas
        for(int i=0;i<NumAdu;i++){//Arreglar para que se vean por la cantidad de reservas
            adulto.getDatosReserva(i);
        }
        for(int i=0;i<NumNi;i++){//Arreglar para que se vean por la cantidad de reservas
            niño.getDatosReserva(i);
        }
        
        //Muestra datos de los check in
        for(int i=0;i<NumAdu;i++){
            adulto.getDatosCheckin();
        }
        for(int i=0;i<NumNi;i++){
            niño.getDatosCheckin();
        }
        
    }
}
