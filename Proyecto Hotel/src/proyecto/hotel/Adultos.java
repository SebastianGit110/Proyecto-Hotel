package proyecto.hotel;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Adultos extends Personas{
    
    //Constructores
    public Adultos() {
        this.nombre = JOptionPane.showInputDialog("Nombres del Adulto: ");
        String Edad = JOptionPane.showInputDialog("Edad del Adulto: ");
        this.edad = Integer.parseInt(Edad);
        String ID = JOptionPane.showInputDialog("Numero de identificacion del Adulto: ");
        this.id = Integer.parseInt(ID);
        this.numeroCelular = JOptionPane.showInputDialog("Numero de telefono del Adulto: ");
    }       
    
    @Override
    public void llenarPersona(){        
    }
}
