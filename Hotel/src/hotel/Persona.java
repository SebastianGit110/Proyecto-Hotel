package hotel;

import javax.swing.JOptionPane;

public class Persona extends Reservas{
    public String nombre;
    public int edad;
    public int fechaIngreso, fechaSalida;
    public int id;
    public String numeroCelular;
    public String direccion;
//    public int numeroHabitaciones;
//    public String cualHabitacion;
        
    //Constructor vacio
    
    public Persona(){
    }
    
    //Para reservas
    public Persona(String i){
        this.nombre = JOptionPane.showInputDialog("Nombres: ");
        String Edad = JOptionPane.showInputDialog("Edad: ");
        this.edad = Integer.parseInt(Edad);

        String FechaIngreso = JOptionPane.showInputDialog("Fecha de ingreso: ");
        this.fechaIngreso = Integer.parseInt(FechaIngreso);
        String FechaSalida = JOptionPane.showInputDialog("Fecha de salida: ");
        this.fechaSalida = Integer.parseInt(FechaSalida);
    }
    
    //Para Check in
    public Persona(int numPerso){       
        String ID = JOptionPane.showInputDialog("Numero de identificacion: ");
        this.id = Integer.parseInt(ID);
        for(int j=0;j<numPerso;j++){
            Persona objectRes = (Persona) reserva.get(j);
            if(objectRes.getEdad()>=18){
            this.numeroCelular = JOptionPane.showInputDialog("Numero de celular: ");
            this.direccion = JOptionPane.showInputDialog("Direccion: ");
            } 
        }
              
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", edad=" + edad + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public int getId() {
        return id;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
    
}
