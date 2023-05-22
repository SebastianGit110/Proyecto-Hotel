package hotelproject;
public abstract class Reservas{
    protected String nombres;
    protected int edad;
    protected String celular;
   
    //Constructor vacio
    public Reservas(){
    }
    
    abstract void llenarReserva();
    abstract String mostrarReserva(int j);
    abstract void mostrarDatos();
    abstract void eliminarReserva(String queReserva);
   
    //Getters
    protected String getNombres(){
        return nombres;
    }

    protected int getEdad() {
        return edad;
    }

    protected String getCelular() {
        return celular;
    }
}