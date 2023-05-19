package hotelproject;

public abstract class Persona{
    protected String nombres;
    protected int edad;
    protected String celular;
    //public int fechaIngreso, fechaSalida;
    protected String id;   
    protected String direccion;
//    public int canMenores = 0;
//    public int numeroHabitaciones;
//    public String cualHabitacion;        
    
    abstract void llenarDatosCheckin();
    abstract void getDatosCheckin(int j);
    abstract void eliminarUser(int i);
    
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