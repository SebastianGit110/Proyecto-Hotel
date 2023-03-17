package proyecto.hotel;

import java.util.Hashtable;
import java.util.Scanner;

public class ProyectoHotel {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Mensaje Bienvenida
        System.out.println("Le damos la bienvenida al hotel UMB");
        
        //Instancia de clase Adultos
        Adultos adulto = new Adultos();
        
        //Estructura hashtable para guardar los adultos
        Hashtable<Integer, Object> adultos = new Hashtable<>();
        
        int NumClientes;
        int NumAdu = 0, NumNi = 0;
        
        //Muestra tipos de habitaiones
        HabitacionMatrimonial habMat = new HabitacionMatrimonial(1, 0, 3, "2");
        habMat.mostrarHabitacion();
        
        HabitacionFamiliar habFam = new HabitacionFamiliar(2, 2, 4, "3");
        habFam.mostrarHabitacion();
        
        HabitacionSuite habSui = new HabitacionSuite(2, 0, 3, "2");
        habSui.mostrarHabitacion();
        
        //Cuantos Adultos y niños
        System.out.println("Cuantas personas van a hospedarse");
        NumClientes = in.nextInt();
        
        System.out.println("Cuantos son adultos");
        NumAdu = in.nextInt();
        
        //Llena adultos llamando al hashtable de la clase
        for(int i=0;i<NumAdu;i++){
            adultos.put(NumAdu, new Adultos());
            NumAdu++;
        }
        
        System.out.println("Cuantos son niños");
        NumNi = in.nextInt();
        
        //Llena niños llamando al hashtable de la clase
    }
    
}