package hotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Niños extends Persona{

    ArrayList<Niños> checkinNiños = new ArrayList<>();
    
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
    public void getDatosCheckin(){
        for(Niños i : checkinNiños){
            System.out.println("Identificacion " + i.getId());
        }
    }

    public ArrayList<Niños> getCheckinNiños() {
        return checkinNiños;
    }
    
}
