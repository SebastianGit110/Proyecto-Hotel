package hotelproject;

public abstract class Persona{
    protected String nombres;
    protected int edad;
    protected String celular;
    protected String id;   
    protected String direccion;     
    
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