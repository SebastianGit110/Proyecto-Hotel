package hotel;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Niños extends Persona{
    
    //Hashtable para niños
    Hashtable<Integer, Object> niños = new Hashtable<>();
    
    //Constructor vacio
    public Niños(){
    }
    
    //Constructor para Reserva Niños
    public Niños(int i){
        this.nombres = JOptionPane.showInputDialog("Nombres del Niño: ");
        String Edad = JOptionPane.showInputDialog("Edad del Niño: ");
        this.edad = Integer.parseInt(Edad);
    }
    
    //Constructor para checkin Niños
    public Niños(String i){
        this.id = JOptionPane.showInputDialog("Numero de identificacion del Niño: ");
    }   
    
    //Metodo que muestra datos de la reserva
    @Override
    public void llenarDatosReserva(int ConNi){
        niños.put(ConNi, new Niños(1));
    }
    
    //Metodo que muestra datos del check in
    @Override
    public void llenarDatosCheckin(){
    
    }
    
    //Metodo para mostrar datos
    @Override
    public void getDatos(int i){
        Niños objectNi = (Niños) niños.get(i);
        System.out.println(objectNi.getNombres());
    }
    
}
