package hotel;

public abstract class Persona{
    public String nombres;
    public int edad;
    public String celular;
    //public int fechaIngreso, fechaSalida;
    public String id;   
    public String direccion;
//    public int canMenores = 0;
//    public int numeroHabitaciones;
//    public String cualHabitacion;        
    
    abstract void llenarDatosReserva(int i);
    abstract void llenarDatosCheckin();
    abstract void getDatosReserva(int i);
    abstract void getDatosCheckin();
    
    //Getters

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}