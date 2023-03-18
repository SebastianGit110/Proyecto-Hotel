package proyecto.hotel;

import java.util.Hashtable;
import java.util.Scanner;

public class ProyectoHotel {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Mensaje Bienvenida
        System.out.println("Le damos la bienvenida al hotel UMB");
        
        //Estructura hashtable para guardar los adultos
        Hashtable<Integer, Object> adultos = new Hashtable<>();
        Hashtable<Integer, Object> niños = new Hashtable<>();
        
        int NumClientes;
        int NumAdu = 0, NumNi = 0;
        
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
            adultos.put(NumAdu, new Adultos());
        }
        
        for(int i=0;i<2;i++){
            if(NumAdu == NumClientes){
                break;
            }
            else{
                //Verifica que la cantidad de niños sea igual a la cantidad de clientes
                for(int l=0;l<5;l++){
                    //Cantidad Niños
                    System.out.println("Cuantos son niños");
                    NumNi = in.nextInt();       
                    if((NumNi+NumAdu)!=NumClientes){
                        System.out.println("No coinciden los datos con las personas que se van a hospedar");
                        i--;
                        continue;
                    }
                    else{                        
                        break;
                    }
                }
                if(NumNi==NumClientes){
                    System.out.println("Se necesita un mayor de edad para continuar con el proceso");
                    break;                 
                }    
                else{
                    //Llena niños llamando al hashtable de la clase
                    for(int j=0;j<NumNi;j++){
                        niños.put(NumNi, new Niños());
                    }
                    break;
                }
            }          
        }
               
//        //Verifica que la cantidad de niños sea igual a la cantidad de clientes
//        for(int i=0;i<5;i++){
//            //Cantidad Niños
//            System.out.println("Cuantos son niños");
//            NumNi = in.nextInt();       
//            if((NumNi+NumAdu)!=NumClientes){
//                System.out.println("No coinciden los datos con las personas que se van a hospedar");
//                i--;
//                continue;
//            }
//            else{
//                break;
//            }
//        }
//          
//        //Llena niños llamando al hashtable de la clase
//        for(int i=0;i<NumNi;i++){
//            niños.put(NumNi, new Niños());
//        }
        
        
    }
    
}