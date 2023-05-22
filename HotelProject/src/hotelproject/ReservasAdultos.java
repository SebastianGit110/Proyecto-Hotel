package hotelproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReservasAdultos extends Reservas{
    
    //ArrayList para adultos
    public ArrayList<Reservas> reservaAdulto = new ArrayList<>();
    public int indiceAdu = -1; //Se inicializa con -1 para saber si el objeto no existe
    protected String primerNom = "", Aux = ""; //Variable para guardar el nombre de la primera posicion
    
    //Constructor vacio
    public ReservasAdultos(){
    }
    
    //Constructor reservas adultos
    public ReservasAdultos(int i){
        try{
            this.nombres = JOptionPane.showInputDialog("Nombres del Adulto: ");
            String Edad = JOptionPane.showInputDialog("Edad del Adulto: ");
            this.edad = Integer.parseInt(Edad);      
            this.celular = JOptionPane.showInputDialog("Numero de contacto: ");
        }catch(Exception e){
            System.out.println("No ingreso el tipo de dato correcto ");
        }
    }
    //Metodo para llenar datos de reservas
    @Override
    public void llenarReserva(){
        reservaAdulto.add(new ReservasAdultos(1));
    }
    
    //Metodo para mostrar los datos de cada usuario
    @Override
    public String mostrarReserva(int j){
        Reservas adulto = reservaAdulto.get(j);
        return "\rNombre: " + adulto.getNombres() + " " + "\r\nEdad: " + adulto.getEdad() + "\r";
    }
    
    //Muestra el nombre de los adultos
    @Override
    public void mostrarDatos(){
        for(Reservas i : reservaAdulto){
            System.out.println(i.getNombres());
        }
    }
    
    //Metodo para eliminar usuarios
    @Override
    public void eliminarReserva(String queAdu){ 
        for(int i=0;i<reservaAdulto.size();i++){
            Reservas adulto = reservaAdulto.get(i);
           
            if(adulto.getNombres().equals(queAdu)){ //Compara las posiciones del ArrayList hasta encontrar cual tiene el nombre
                indiceAdu = reservaAdulto.indexOf(adulto); //Almacena el indice donde encontro la coincidencia
                reservaAdulto.remove(indiceAdu); //Elimina el objeto en esa posicion
            }
           
        }
    }
    
    //Metodo para obtener el primer nombre de adultos
    public String primerNom(){
        for(int i=0;i<1;i++){
            Reservas adulto = reservaAdulto.get(i);
            primerNom = adulto.getNombres();
        }
    return primerNom;
    }
    
    //Tamaño del ArrayList reservaAdulto
    public int getTamañoAdu(){
        return reservaAdulto.size();
    }
    
    protected int getIndiceAdu(){
        return indiceAdu;
    }
}
