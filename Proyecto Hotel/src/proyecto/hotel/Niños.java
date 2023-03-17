package proyecto.hotel;

import javax.swing.JOptionPane;

public class Niños extends Personas{
    
    public Niños(){
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre completo");
    }
    
    @Override
    public void llenarPersona(){
        
    }
}
