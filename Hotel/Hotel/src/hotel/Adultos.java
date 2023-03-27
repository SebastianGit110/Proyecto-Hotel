package hotel;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Adultos extends Persona{

    //Hashtable para llenar Adultos
    Hashtable<Integer, Object> adultos = new Hashtable<>();
    
    //Constructor vacio
    public Adultos(){
    }
    
    //Constructor para Reserva Adultos
    public Adultos(int i){    
        this.nombres = JOptionPane.showInputDialog("Nombres del Adulto: ");
        String Edad = JOptionPane.showInputDialog("Edad del Adulto: ");
        this.edad = Integer.parseInt(Edad);      
        this.celular = JOptionPane.showInputDialog("Numero de contacto: ");
    }
    
    //Constructor para checkin Adultos
    public Adultos(String i){
        this.id = JOptionPane.showInputDialog("Numero de identificacion Adulto: ");
        this.direccion = JOptionPane.showInputDialog("Direccion del Adulto: ");
    }
    
    //Metodo que muestra datos de la reserva
    @Override
    public void llenarDatosReserva(int ConAdu){
        adultos.put(ConAdu, new Adultos(1));
    }
    
    //Metodo que muestra datos del check in
    @Override
    public void llenarDatosCheckin(){
    
    }
    
    //Metodo que muestra datos
    @Override
    public void getDatos(int i){
        Adultos objectAdu = (Adultos) adultos.get(i);
        System.out.println(objectAdu.getNombres());
    }

}

