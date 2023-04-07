package hotel;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hotel {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        //Mensaje Bienvenida
        System.out.println("Le damos la bienvenida al hotel UMB");

        //Instacias de las clases con constructor vacio
        Adultos adulto = new Adultos();
        Niños niño = new Niños();
        Reservas reservas = new Reservas();

        //Keys de los hashtable
        int ConAdu = 0, ConNi = 0;

        //Variable contadora de personas
        int NumClientes = 0, NumAdu = 0, NumNi = 0;

        //Variable que cuentan dias de estadia
        int canDias = 0;

        //Variables que cuentan cuantas habitaciones
        String TipoHab = "";
        int NumHab = 0, ConMat = 0, ConFam = 0, ConSui = 0;

        //Menu para elegir el servicio 
        //Variables que verifican la opcion
        boolean reserva = false, checkin = false, checkout = false;

        for (int j = 0; j < 8; j++) {
            String Opcion = JOptionPane.showInputDialog(null, "1. Realizar reserva \n2. Realizar check-in "
                    + "\n3. Mostrar tipo de habitacion \n4. Realizar check-out \n5. Salir");
            int opcion = Integer.parseInt(Opcion);

            switch (opcion) {
                case 1:
                    reserva = true;
                    System.out.println("\nRealizar reserva");
                    System.out.println("Cuantas personas van a hospedarse");
                    NumClientes = in.nextInt();

                    //
                    for (int i = 0; i < 5; i++) {
                        //Cantidad Adultos
                        System.out.println("Cuantos son adultos");
                        NumAdu = in.nextInt();
                        if (NumAdu > NumClientes) {
                            System.out.println("Ha ingresado un numero mayor que el numero de clientes");
                            i--;
                            continue;
                        } else {
                            break;
                        }
                    }

                    //Llena adultos llamando al hashtable de la clase
                    for (int i = 0; i < NumAdu; i++) {
                        reservas.llenarReservaAdulto();
                    }
                    for (int i = 0; i < 2; i++) {
                        if (NumAdu == NumClientes) {
                            break;
                        } else {
                            for (int l = 0; l < 5; l++) {
                                //Cantidad Niños
                                System.out.println("Cuantos son niños");
                                NumNi = in.nextInt();
                                if ((NumNi + NumAdu) != NumClientes) { //Verifica que la cantidad de niños y adultos sea igual a la cantidad de clientes
                                    System.out.println("No coinciden los datos con las personas que se van a hospedar");
                                    l--;//
                                    continue;
                                } else {
                                    break;
                                }
                            }
                            if (NumNi == NumClientes) { //Verifica que hayan adultos
                                System.out.println("Se necesita un mayor de edad para continuar con el proceso");
                                break;
                            } else {
                                //Llena niños llamando al hashtable de la clase
                                for (int l = 0; l < NumNi; l++) {
                                    reservas.llenarReservaNiño();
                                }
                                break;
                            }
                        }
                    }
                    //
                    
                    //Numero de habitaciones
                    for(int m=0;m<5;m++){
                        String numHab = JOptionPane.showInputDialog("Cuantas habitaciones necesitan ");
                        NumHab = Integer.parseInt(numHab);
                        
                        //Comprueba que el numero que ingrese sea >0
                        if(NumHab <= 0){
                            System.out.println("Tiene que elegir al menos una habitacion");
                            continue;
                        }
                        
                        //Tipo de habitaciones
                        for (int i = 0; i < NumHab; i++) {
                            TipoHab = JOptionPane.showInputDialog("Cual es la " + (i + 1) + " habitacion");

                            if (TipoHab.equals("Matrimonial") || TipoHab.equals("matrimonial")) {
                                ConMat++;
                            } else if (TipoHab.equals("Familiar") || TipoHab.equals("familiar")) {
                                ConFam++;
                            } else if (TipoHab.equals("Suite") || TipoHab.equals("suite")) {
                                ConSui++;
                            }
                        }
                        break;
                    }
                    

                    //Dias para reservar
                    String CanDias = JOptionPane.showInputDialog("Por cuantos dias quieren hacer la reserva ");
                    canDias = Integer.parseInt(CanDias);

                    break;
                case 2:
                    if (reserva == false) {
                        System.out.println("Primero tienes que realizar la reserva");
                        j--;
                        continue;
                    }
                    checkin = true;
                    System.out.println("Realizar check in");
                    
                    //Llena los datos del check in
                    for (int l = 0; l < NumAdu; l++) {
                        adulto.llenarDatosCheckin();
                    }

                    for (int l = 0; l < NumNi; l++) {
                        niño.llenarDatosCheckin();
                    }
                    
                    //Pregunta si quiere eliminar usuarios
                    String delUser = JOptionPane.showInputDialog("Desea eliminar algun usuario");                   
                    
                    if(delUser.equals("Si") || delUser.equals("si")){
                        for(int i=0;i<6;i++){
                            reservas.mostrarDatos();
                            String queUSer = JOptionPane.showInputDialog("1. Adulto \n2. Niño \n3. Volver");
                            int queUser = Integer.parseInt(queUSer);
                            switch(queUser){
                                case 1:
                                    System.out.println("Ingresa el nombre del adulto a eliminar");
                                    String queAdu = in2.nextLine(); //Variable que lee el nombre del usuario a eliminar
                                    //Elimina el usuario en las reservas y en el check in
                                    try{
                                        reservas.eliminarAdulto(queAdu);
                                        
                                        int indiceAdu = reservas.getIndiceAdu(); //Variable que almacena el indice del adulto en la clase reserva
                                        adulto.eliminarUser(indiceAdu); //Manda ese indice para eliminar el check in tambien
                                        
                                    }catch(Exception e){
                                        System.out.println("Ha ocurrido un error");
                                    }
                                    
                                    break;
                                case 2:
                                    System.out.println("Ingresa el numero del niño a eliminar");
                                    String queNi = in2.nextLine(); //Variable que lee el nombre del usuario a eliminar
                                    //Elimina el usuario en las reservas y en el check in
                                    try{
                                        reservas.eliminarNiño(queNi);
                                        
                                        int indiceNi = reservas.getIndiceNi(); //Variable que almacena el indice del niño en la clase reserva
                                        niño.eliminarUser(indiceNi); //Manda ese indice para eliminar el check in tambien
                                        
                                    }catch(Exception e){
                                        System.out.println("Ha ocurrido un error");
                                    }
                                    break;
                                case 3:
                                    i=6;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida");
                                    i--;
                            }
                        }
                    }
                    
                    //Pedir servicios
                    
                    
                    break;
                case 3:
                    //Muestra las habitaciones
                    HabMatrimonial habmatrimonial = new HabMatrimonial(1, 0, 3, "2", 250.001);
                    habmatrimonial.mostrarHabitacion();

                    HabFamiliar habfamiliar = new HabFamiliar(2, 2, 4, "3", 350.001);
                    habfamiliar.mostrarHabitacion();

                    HabSuite habsuite = new HabSuite(2, 0, 3, "2", 400.001);
                    habsuite.mostrarHabitacion();
                    break;
                case 4:
                    checkout = true;
                    System.out.println("Realizar check out");
                    if (reserva == false) {
                        System.out.println("Primero tienes que realizar la reserva");
                        j--;
                        continue;
                    }
                    break;
                case 5:
                    System.out.println("Salir");
                    j = 8;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }   

        //Muestra datos
        reservas.mostrarReservaAdulto();
        adulto.getDatosCheckin();
        
        reservas.mostrarReservaNiño();      
        niño.getDatosCheckin();
        
    }
}
