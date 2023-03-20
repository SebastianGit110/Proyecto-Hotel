package proyecto.hotel;

public abstract class Personas {
    protected String nombre;
    protected int edad;
    protected int id;
    protected String numeroCelular;
    
    //Metodos abstractos
    abstract void llenarPersona();
    abstract void getDatos();
    
    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    
    
}
