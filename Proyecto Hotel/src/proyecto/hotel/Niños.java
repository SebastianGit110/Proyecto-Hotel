package proyecto.hotel;

import javax.swing.JOptionPane;

public class Niños extends Personas{
    
    public Niños(){
        this.nombre = JOptionPane.showInputDialog("Nombres del niño: ");
        String Edad = JOptionPane.showInputDialog("Edad del niño: ");
        this.edad = Integer.parseInt(Edad);
        String ID = JOptionPane.showInputDialog("Numero de identificacion del niño: ");
        this.id = Integer.parseInt(ID);
    }
    
    public void getDatos(){
        System.out.println(getNombre());
    }
    
    @Override
    public void llenarPersona(){
        
    }
}
