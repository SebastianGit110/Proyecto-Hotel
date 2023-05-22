package hotelproject;

public class Persona{
    protected String nombres;
    protected int edad;
    protected String celular;
    protected String id;   
    protected String direccion;     
    
    //Getters
    protected String getNombres() {
        return nombres;
    }

    protected int getEdad() {
        return edad;
    }

    protected String getId() {
        return id;
    }

    protected String getCelular() {
        return celular;
    }

    protected String getDireccion() {
        return direccion;
    }
}