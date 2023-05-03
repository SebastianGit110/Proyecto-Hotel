package hotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adultos extends Persona{
    
    ArrayList<Adultos> checkinAdulto = new ArrayList<>();
    
    //Constructor vacio
    public Adultos(){
    }

    //Constructor para checkin Adultos
    public Adultos(String i){
        this.id = JOptionPane.showInputDialog("Numero de identificacion Adulto: ");
        this.direccion = JOptionPane.showInputDialog("Direccion del Adulto: ");
    }
    
    //Metodo que llena los datos del check in
    @Override
    public void llenarDatosCheckin(){
        checkinAdulto.add(new Adultos("1"));
    }

    @Override
    public void getDatosCheckin(int j){
        Adultos adulto = checkinAdulto.get(j);
        System.out.println("Identificacion " + adulto.getId());
    }
    
    @Override
    public void eliminarUser(int i){
        checkinAdulto.remove(i);
    }
}

