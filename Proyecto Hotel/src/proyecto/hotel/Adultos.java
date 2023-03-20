package proyecto.hotel;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Adultos extends Personas{
    
    //Hashtable
    Hashtable<Integer, Object> adultos = new Hashtable<>();//Podemos poner Object para especificar que el valor es objeto 
    
    //Constructores
    
    //Constructor vacio para instanciarlo y llamar los metodos
    public Adultos(int i){ //Le asignamos un int como parametro para diferenciarlo del otro constructor
    }
    
    //Constructor que nos sirve para llenar el valor del hashtable
    public Adultos() {
        this.nombre = JOptionPane.showInputDialog("Nombres del Adulto: ");
        String Edad = JOptionPane.showInputDialog("Edad del Adulto: ");
        this.edad = Integer.parseInt(Edad);
        String ID = JOptionPane.showInputDialog("Numero de identificacion del Adulto: ");
        this.id = Integer.parseInt(ID);
        this.numeroCelular = JOptionPane.showInputDialog("Numero de telefono del Adulto: ");
    }       
    
    @Override
    public void llenarPersona(int i){
        adultos.put(i, new Adultos());
    }
    
    @Override
    public void getDatos(int j){
        Adultos objeto = (Adultos) adultos.get(j);
        System.out.println(objeto.getNombre() + " " + objeto.getEdad() + " " + objeto.getId() + " " + objeto.getNumeroCelular());
    }
    
}
