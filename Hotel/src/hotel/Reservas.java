package hotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Reservas{
    public String nombres;
    public int edad;
    public String celular;
    
    //ArrayList para niños y adultos
    ArrayList<Reservas> reservaAdulto = new ArrayList<>();
    ArrayList<Reservas> reservaNiño = new ArrayList<>();
    
    //Constructor vacio
    public Reservas(){
    }
    
    //Constructor reservas adultos
    public Reservas(int i){
        this.nombres = JOptionPane.showInputDialog("Nombres del Adulto: ");
        String Edad = JOptionPane.showInputDialog("Edad del Adulto: ");
        this.edad = Integer.parseInt(Edad);      
        this.celular = JOptionPane.showInputDialog("Numero de contacto: ");
    }
    
    //Constructor reservas niños
    public Reservas(String i){
        this.nombres = JOptionPane.showInputDialog("Nombres del Niño: ");
        String Edad = JOptionPane.showInputDialog("Edad del Niño: ");
        this.edad = Integer.parseInt(Edad);
    }
    
    //Metodos para llenar datos de reservas
    public void llenarReservaAdulto(){
        reservaAdulto.add(new Reservas(1));
    }
    
    public void llenarReservaNiño(){
        reservaNiño.add(new Reservas("1"));
    }
    
    //Metodos para mostrar los datos de cada usuario
    public void mostrarReservaAdulto(){
        for(Reservas i : reservaAdulto){
            System.out.println("Nombre " + i.getNombres() + "\nEdad " + i.getEdad());
        }
    }
    
    public void mostrarReservaNiño(){
        for(Reservas i : reservaNiño){
            System.out.println("Nombre " + i.getNombres() + "\nEdad " + i.getEdad());
        }
    }
    
    //Getters
    public String getNombres(){
        return nombres;
    }

    public int getEdad() {
        return edad;
    }

    public String getCelular() {
        return celular;
    }
    
}
