package hotel;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Adultos extends Persona{

    //Hashtable para llenar Adultos
    Hashtable<Integer, Object> adultosReserva = new Hashtable<>();
    Hashtable<Integer, String> adultosCheckin = new Hashtable<>();
    
    //Constructor vacio
    public Adultos(){
    }
    public Adultos(boolean i){
    }
    
    //Constructor para Reserva Adultos
    public Adultos(int i){    
        this.nombres = JOptionPane.showInputDialog("Nombres del Adulto: ");
        String Edad = JOptionPane.showInputDialog("Edad del Adulto: ");
        this.edad = Integer.parseInt(Edad);      
        this.celular = JOptionPane.showInputDialog("Numero de contacto: ");
    }
    
    //Constructor para checkin Adultos
//    public Adultos(String i){//Lo podemos trabajar como <Integer, String>
//        this.id = JOptionPane.showInputDialog("Numero de identificacion Adulto: ");
//        this.direccion = JOptionPane.showInputDialog("Direccion del Adulto: ");
//    }
    
    //Metodo que llena los datos de la reserva
    @Override
    public void llenarDatosReserva(int ConAdu){
        adultosReserva.put(ConAdu, new Adultos(1));
    }
    
    //Metodo que llena los datos del check in
    @Override
    public void llenarDatosCheckin(){
        adultosCheckin.put(0, this.id = JOptionPane.showInputDialog("Numero de identificacion Adulto: "));
        adultosCheckin.put(1, this.direccion = JOptionPane.showInputDialog("Direccion del Adulto: "));
    }
    
    //Metodo que muestra datos de la reserva
    @Override
    public void getDatosReserva(int i){
        Adultos objectAduRes = (Adultos) adultosReserva.get(i);
        System.out.println(objectAduRes.getNombres());
    }
    
    //Metodo que muestra datos del checkin
    @Override
    public void getDatosCheckin(){       
        Enumeration recorrer = adultosCheckin.elements();
        while(recorrer.hasMoreElements()){
            System.out.println("Valores: " + recorrer.nextElement());
        }
    }

}

