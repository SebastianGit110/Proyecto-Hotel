package proyecto.hotel;

import java.util.Hashtable;
import java.util.Scanner;

public class ProyectoHotel {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner in2 = new Scanner (System.in);
        
        //Mensaje Bienvenida
        System.out.println("Le damos la bienvenida al hotel UMB");
        
        //Estructura hashtable para guardar los adultos
        Hashtable<Integer, Adultos> adultos = new Hashtable<>(); //Podemos poner Object para especificar que es objeto el valor
        Hashtable<Integer, Niños> niños = new Hashtable<>();
        
        //Variables que van a contar info de la reserva
        int NumAdu = 0, NumNi = 0, NumClientes = 0, NumHab = 0;
        String TipoHab = "";
        int ConMat = 0, ConFam = 0, ConSui = 0;
        //Keys de los hashtable
        int ConAdu = 0, ConNi = 0;
        
        //Muestra tipos de habitaiones
        HabitacionMatrimonial habMat = new HabitacionMatrimonial(1, 0, 3, "2", 250000);
        habMat.mostrarHabitacion();
        
        HabitacionFamiliar habFam = new HabitacionFamiliar(2, 2, 4, "3", 350000);
        habFam.mostrarHabitacion();
        
        HabitacionSuite habSui = new HabitacionSuite(2, 0, 3, "2", 280000);
        habSui.mostrarHabitacion();
        
        //Cuantos Adultos y niños
        System.out.println("\nCuantas personas van a hospedarse");
        NumClientes = in.nextInt();
        
        //Cantidad Adultos
        System.out.println("Cuantos son adultos");
        NumAdu = in.nextInt();
        
        //Llena adultos llamando al hashtable de la clase
        for(int i=0;i<NumAdu;i++){
            adultos.put(ConAdu, new Adultos());
            ConAdu++;
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
                    for(int j=0;j<NumNi;j++){
                        niños.put(ConNi, new Niños());
                        ConNi++;
                    }
                    break;
                }
            }          
        }
        
        //Numero de habitaciones
        System.out.println("Cuantas habitaciones necesitan");
        NumHab = in.nextInt();
        
        //Tipo de habitaciones
        for(int i=0;i<NumHab;i++){
            System.out.println("Cual es la " + (i+1) + " habitacion");
            TipoHab = in2.nextLine();
            
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
        
        System.out.println("Muestra datos");
        for(int i=0;i<NumAdu;i++){
            Adultos adult = (Adultos) adultos.get(i);
            adult.getDatos();            
        }
        
        for(int i=0;i<NumNi;i++){
            Object objeto = niños.get(i);
            ((Niños)objeto).getDatos();
        }

        System.out.println("Haz eligido:\n" + ConMat + " habitaciones matrimonial\n" 
                + ConFam + " habitaciones familiar\n" + ConSui + " habitaciones suite\n");
    }
}