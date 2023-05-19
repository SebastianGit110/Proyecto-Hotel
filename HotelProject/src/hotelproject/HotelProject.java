package hotelproject;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HotelProject {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        //Mensaje Bienvenida
        System.out.println("Le damos la bienvenida al hotel UMB");

        //Instacias de las clases con constructor vacio
        Adultos adulto = new Adultos();
        Niños niño = new Niños();
        Reservas reservas = new Reservas();
        CheckOut checkOut = new CheckOut();
       
        HabMatrimonial habMat = new HabMatrimonial();
        HabFamiliar habFam = new HabFamiliar();
        HabSuite habSui = new HabSuite();
       
        //Keys de los hashtable
        int ConAdu = 0, ConNi = 0;

        //Variable contadora de personas
        int NumClientes = 0, NumAdu = 0, NumNi = 0;
        int tamañoAdu = 0, tamañoNi = 0;
       
        //Variable para compara con el nombre del huesped
        String nomHues = "";

        //Variable que cuentan dias de estadia
        int canDias = 0;
        String DiaEnt = "", DiaSal = "";

        //Variables que cuentan cuantas habitaciones
        String TipoHab = "", delHab = "";
        int NumHab = 0, ConMat = 0, ConFam = 0, ConSui = 0;
        int serMat = 0, serFam = 0, serSui = 0;

        //Menu para elegir el servicio
        //Variables que verifican la opcion
        boolean reserva = false, checkin = false, checkout = false;
        
        //Creacion del Directorio
        try{
            File crearDirectorio = new File("c:\\ProyectoHotel");
            if(crearDirectorio.mkdir()){
                System.out.println("El directorio se creo");
            }
            else{
                System.out.println("El directorio ya existe");
            }
            
            //Creacion del Archivo
            
            File crearArchivo = new File("c:\\ProyectoHotel\\DatosHotel.txt");
            if(crearArchivo.createNewFile()){
                System.out.println("Se creo el archivo");
            }
            else{
                System.out.println("El archivo ya existe");
            }
        }
        catch(Exception e){
            System.out.println("Ocurrio un error en la creacion de los archivos");
        }
        
        //Empezamos a escribir en el archivo desde el principio para que le variable que escribe pueda invocarse en cualquier parte 
        //de la logica del codigo
        
        try{
            FileWriter escribir = new FileWriter("c:\\ProyectoHotel\\DatosHotel.txt", false);
            System.out.println("Escribiendo...");
            //escribir.write("Inicia el archivo \r\n");
            for (int j = 0; j < 8; j++) {
                String Opcion = JOptionPane.showInputDialog(null, "1. Realizar reserva \n2. Escoger servicios \n3. Realizar check-in "
                        + "\n4. Mostrar tipo de habitacion \n5. Realizar check-out \n6. Salir");
                int opcion = Integer.parseInt(Opcion);

                switch (opcion) {
                    case 1:
                        reserva = true;
                        System.out.println("\nRealizar reserva");
                        System.out.println("Cuantas personas van a hospedarse");
                        NumClientes = in.nextInt();
                        escribir.write("Numero de clientes "+NumClientes + "\r\n");
                        
                        //Logica para clasificar cantidad de huespedes
                        for (int i = 0; i < 5; i++) {
                            //Cantidad Adultos
                            System.out.println("Cuantos son adultos");
                            NumAdu = in.nextInt();
                            if (NumAdu > NumClientes) {
                                System.out.println("Ha ingresado un numero mayor que el numero de clientes");
                                i--;
                                //continue;
                            } else {
                                break;
                            }
                        }

                        //Llena adultos llamando al metodo correspondiente de la clase
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
                                        //continue;
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
                                TipoHab = JOptionPane.showInputDialog("Cual es la " + (i + 1) + " habitacion \nMatrimonial \nFamiliar \nSuite");

                                if (TipoHab.toLowerCase().equals("matrimonial")) {
                                    ConMat++;
                                } else if (TipoHab.toLowerCase().equals("familiar")) {
                                    ConFam++;
                                } else if (TipoHab.toLowerCase().equals("suite")) {
                                    ConSui++;
                                }
                            }

                            //Pregunta si quiere eliminar alguna habitacion
                            for(int i=0;i<6;i++){
                                delHab = JOptionPane.showInputDialog("¿Quiere eliminar alguna de las habitaciones seleccionadas?");
                                if(delHab.toLowerCase().equals("si")){
                                    String cualHab = JOptionPane.showInputDialog("Que habitacion");

                                    switch(cualHab.toLowerCase()){
                                        case "matrimonial":
                                            if(ConMat>0){
                                                System.out.println("Cuantas habitaciones Matrimonial quiere eliminar");
                                                int habMatDel = in.nextInt();
                                                ConMat-=habMatDel;
                                            }else{
                                                System.out.println("No tiene habitaciones Matrimonial");
                                            }
                                            break;

                                        case "familiar":
                                            if(ConFam>0){
                                                System.out.println("Cuantas habitaciones Familiar quiere eliminar");
                                                int habFamDel = in.nextInt();
                                                ConFam-=habFamDel;
                                            }else{
                                                System.out.println("No tiene habitaciones Familiar");
                                            }
                                            break;

                                        case "suite":
                                            if(ConSui>0){
                                                System.out.println("Cuantas habitaciones Suite quiere eliminar");
                                                int habSuiDel = in.nextInt();
                                                ConSui-=habSuiDel;
                                            }else{
                                                System.out.println("No tiene habitaciones Suite");
                                            }
                                            break;
                                    }
                                }else{
                                    i=6;
                                }
                            }
                            
                            habMat.llenarHab(ConMat);
                            habFam.llenarHab(ConFam);
                            habSui.llenarHab(ConSui);

                            break;
                        }

                        //Dias para reservar
                        String CanDias = JOptionPane.showInputDialog("Por cuantos dias quieren hacer la reserva ");
                        canDias = Integer.parseInt(CanDias);
                        DiaEnt = JOptionPane.showInputDialog("Fecha de llegada ");
                        DiaSal = JOptionPane.showInputDialog("Fecha de salida ");
                        break;
                    
                    case 2:
                        //Pedir servicios
                        //Llama al metodo que elige los servicios con la referencia del objeto declarada anteriormente
                        System.out.println("\nDe las habitaciones seleccionadas, elija alguno de los servicios\n");
                        if(ConMat>0){
                            habMat.elegirServicios(); //Elige servicios
                        }
                        if(ConFam>0){
                            habFam.elegirServicios(); //Elige servicios
                        }
                        if(ConSui>0){
                            habSui.elegirServicios(); //Elige servicios
                        }
                        break;
                        
                    case 3:
                        if (reserva == false) {
                            System.out.println("Primero tienes que realizar la reserva");
                            j--;
                            continue;
                        }
                        checkin = true;
                        System.out.println("\n \nRealizar check in\n");
                        
                        reservas.mostrarDatos(); //Muestra los nombres para ingresar al check in por el primer nombre
                        
                        for(int i=0;i<1;i++){ //Solo se comprueba una vez el primer nombre
                            System.out.println("\nIngrese el nombre del primer huesped para confirmar check in");
                            nomHues = in2.nextLine();

                            if(reservas.primerNom().equals(nomHues)){
                                System.out.println("Datos de usuarios ingresados:\n");
                                for(int k=0;k<NumAdu;k++){
                                    System.out.println(reservas.mostrarReservaAdulto(k));
                                    escribir.write(reservas.mostrarReservaAdulto(k) + "\r\n");
                                }
                                for(int k=0;k<NumNi;k++){
                                    System.out.println(reservas.mostrarReservaNiño(k));
                                }
                            }
                            else{
                                i--;
                            }
                        }  
                        
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
                                        System.out.println("Ingresa el nombre del niño a eliminar");
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
                        break;
                    case 4:
                        //Muestra las habitaciones
                        HabMatrimonial habmatrimonial = new HabMatrimonial(1, 0, 2, "1", 250.001);
                        habmatrimonial.mostrarHabitacion();

                        HabFamiliar habfamiliar = new HabFamiliar(2, 2, 3, "3", 350.001);
                        habfamiliar.mostrarHabitacion();

                        HabSuite habsuite = new HabSuite(2, 0, 1, "1", 400.001);
                        habsuite.mostrarHabitacion();
                        break;
                    case 5:
                        checkout = true;
                        if (reserva == false || checkin == false) {
                            System.out.println("Primero tienes que realizar la reserva y check in");
                            j--;
                            continue;
                        }
                        
                        System.out.println("Realizar check out\n");
                        
                        //Se les asigna el valor total de servicios adicionales
                        serMat = habMat.muestraServicios();
                        serFam = habFam.muestraServicios();
                        serSui = habSui.muestraServicios();

                        //Polimorfismo por sobrecarga
                        checkOut.generarTotal(ConMat, ConFam, ConSui, canDias); 
                        checkOut.generarTotal(serMat, serFam, serSui);

                        //Asigna el tamaño de los ArrayList
                        tamañoAdu = reservas.getTamañoAdu();
                        tamañoNi = reservas.getTamañoNi();
                        
                        //Muestra datos de los adultos en reserva y check in
                        for(int i=0;i<tamañoAdu;i++){
                            System.out.println(reservas.mostrarReservaAdulto(i));;
                            adulto.getDatosCheckin(i);
                            System.out.println(); //Salto de linea
                        }

                        //Muestra datos de los niños en reserva y check in
                        if(tamañoNi!=0){
                            for(int i=0;i<tamañoNi;i++){
                                System.out.println(reservas.mostrarReservaNiño(i));;      
                                niño.getDatosCheckin(i);
                                System.out.println(); //Salto de linea
                            }   
                        }
                        
                        //Muestra la factura
                        checkOut.mostrarFactura(DiaEnt, DiaSal);
                        //Pide el metodo de pago
                        checkOut.metodoDePago();
                        break;
                    case 6:
                        System.out.println("Salir");
                        j = 8;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            }
            escribir.close(); //Deja de escribir en el archivo
        }catch(Exception e){ //Excepcion al escribir en el archivo o durante el registro
            System.out.println("Ocurrio un error escribiendo");
        }    
    }
}