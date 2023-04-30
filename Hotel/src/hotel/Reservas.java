package hotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Reservas{
    public String nombres;
    public int edad;
    public String celular;
   
    //Variable para guardar el nombre de la primera posicion
    public String primerNom = "";
    int indiceAdu = -1, indiceNi = -1; //Se inicializa con -1 para saber si el objeto no existe
   
    //ArrayList para niños y adultos
    ArrayList<Reservas> reservaAdulto = new ArrayList<>();
    ArrayList<Reservas> reservaNiño = new ArrayList<>();
   
    //Constructor vacio
    public Reservas(){
    }
   
    //Constructor reservas adultos
    public Reservas(int i){
        try{
            this.nombres = JOptionPane.showInputDialog("Nombres del Adulto: ");
            String Edad = JOptionPane.showInputDialog("Edad del Adulto: ");
            this.edad = Integer.parseInt(Edad);      
            this.celular = JOptionPane.showInputDialog("Numero de contacto: ");
        }catch(Exception e){
            System.out.println("No ingreso el tipo de dato correcto ");
        }
    }
   
    //Constructor reservas niños
    public Reservas(String i){
        try{
            this.nombres = JOptionPane.showInputDialog("Nombres del Niño: ");
            String Edad = JOptionPane.showInputDialog("Edad del Niño: ");
            this.edad = Integer.parseInt(Edad);
        }catch(Exception e){
            System.out.println("No ingreso el tipo de dato correcto ");
        }
    }
   
    //Metodos para llenar datos de reservas
    public void llenarReservaAdulto(){
        reservaAdulto.add(new Reservas(1));
    }
   
    public void llenarReservaNiño(){
        reservaNiño.add(new Reservas("1"));
    }
   
    //Metodos para mostrar los datos de cada usuario
    public void mostrarReservaAdulto(int j){
        Reservas adulto = reservaAdulto.get(j);
        System.out.println("Nombre " + adulto.getNombres() + "\nEdad " + adulto.getEdad());
    }
   
    public void mostrarReservaNiño(int j){
        Reservas niño = reservaNiño.get(j);
        System.out.println("Nombre " + niño.getNombres() + "\nEdad " + niño.getEdad());
    }
   
    public void mostrarDatos(){
        for(Reservas i : reservaAdulto){
            System.out.println(i.getNombres());
        }
        for(Reservas i : reservaNiño){
            System.out.println(i.getNombres());
        }
    }
   
    //Metodos para eliminar usuarios
    public void eliminarAdulto(String queAdu){
        for(int i=0;i<reservaAdulto.size();i++){
            Reservas adulto = reservaAdulto.get(i);
           
            if(adulto.getNombres().equals(queAdu)){ //Compara las posiciones del ArrayList hasta encontrar cual tiene el nombre
                indiceAdu = reservaAdulto.indexOf(adulto); //Almacena el indice donde encontro la coincidencia
                reservaAdulto.remove(indiceAdu); //Elimina el objeto en esa posicion
            }
           
        }
    }
   
    public void eliminarNiño(String queNi){
        for(int i=0;i<reservaNiño.size();i++){
            Reservas niño = reservaNiño.get(i);
           
            if(niño.getNombres().equals(queNi)){ //Compara las posiciones del ArrayList hasta encontrar cual tiene el nombre
                indiceNi = reservaNiño.indexOf(niño); //Almacena el indice donde encontro la coincidencia
                reservaNiño.remove(indiceNi); //Elimina el objeto en esa posicion
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
   
    public int getIndiceAdu(){
        return indiceAdu;
    }
   
    public int getIndiceNi(){
        return indiceNi;
    }
    
    public int getTamañoAdu(){
        return reservaAdulto.size();
    }
    
    public int getTamañoNi(){
        return reservaNiño.size();
    }
}
