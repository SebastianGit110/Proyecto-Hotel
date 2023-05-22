package hotelproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Niños extends Persona implements PersonaInt{
    
    public ArrayList<Niños> checkinNiños = new ArrayList<>();
    
    //Constructor vacio
    public Niños(){
    }

    //Constructor para checkin Niños
    public Niños(String i){
        this.id = JOptionPane.showInputDialog("Numero de identificacion del Niño: ");
    }   
    
    //Metodo que llena los datos del check in
    @Override
    public void llenarDatosCheckin(){    
        checkinNiños.add(new Niños("1"));
    }
   
    @Override
    public String getDatosCheckin(int j){
        Niños niño = checkinNiños.get(j);
        return "Identificacion " + niño.getId();
    }

    @Override
    public void eliminarUser(int i){
        checkinNiños.remove(i);
    }
}