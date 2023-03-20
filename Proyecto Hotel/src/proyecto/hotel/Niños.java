package proyecto.hotel;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Niños extends Personas{
    
    //Hashtable
    Hashtable<Integer, Niños> niños = new Hashtable<>();
    
    //Constructores
    
    //Constructor vacio para instanciarlo y llamar los metodos
    public Niños(int i){        
    }
    
    //Constructor que nos sirve para llenar el valor del hashtable
    public Niños(){
        this.nombre = JOptionPane.showInputDialog("Nombres del niño: ");
        String Edad = JOptionPane.showInputDialog("Edad del niño: ");
        this.edad = Integer.parseInt(Edad);
        String ID = JOptionPane.showInputDialog("Numero de identificacion del niño: ");
        this.id = Integer.parseInt(ID);
    }
    
    @Override
    public void llenarPersona(int i){
        niños.put(i, new Niños());
    }
    
    @Override
    public void getDatos(int j){
        Niños objeto = (Niños) niños.get(j);
        System.out.println(objeto.getNombre() + " " + objeto.getEdad() + " " + objeto.getId());
    }
        
}
