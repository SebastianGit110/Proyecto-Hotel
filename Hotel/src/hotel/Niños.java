package hotel;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Niños extends Persona{
    
    //Hashtable para niños
    Hashtable<Integer, Object> niñosReserva = new Hashtable<>();
    Hashtable<Integer, Object> niñosCheckin = new Hashtable<>();
    
    //Constructor vacio
    public Niños(){
    }
    
    public Niños(boolean i){
    }
    
    //Constructor para Reserva Niños
    public Niños(int i){
        this.nombres = JOptionPane.showInputDialog("Nombres del Niño: ");
        String Edad = JOptionPane.showInputDialog("Edad del Niño: ");
        this.edad = Integer.parseInt(Edad);
    }
    
    //Constructor para checkin Niños
//    public Niños(String i){
//        this.id = JOptionPane.showInputDialog("Numero de identificacion del Niño: ");
//    }   
    
    //Metodo que llena los datos de la reserva
    @Override
    public void llenarDatosReserva(int ConNi){
        niñosReserva.put(ConNi, new Niños(1));
    }
    
    //Metodo que llena los datos del check in
    @Override
    public void llenarDatosCheckin(int ConNi){
        niñosCheckin.put(ConNi, this.id = JOptionPane.showInputDialog("Numero de identificacion del Niño: "));
    }
    
    //Metodo que muestra datos de la reserva
    @Override
    public void getDatosReserva(int i){
        Niños objectNiRes = (Niños) niñosReserva.get(i);
        System.out.println(objectNiRes.getNombres());
    }
    
    //Metodo que muestra datos del checkin
    @Override
    public void getDatosCheckin(){
        Enumeration recorrer = niñosCheckin.elements();
        while(recorrer.hasMoreElements()){
            System.out.println("Valor: " + recorrer.nextElement());
        }
    }
}
