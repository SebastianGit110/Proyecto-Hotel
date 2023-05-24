package hotelproject;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ReservasNiños extends Reservas{
    
    //ArrayList para niños
    public ArrayList<ReservasNiños> reservaNiño = new ArrayList<>();
    public int indiceNi = -1; //Se inicializa con -1 para saber si el objeto no existe
    ImageIcon icon = new ImageIcon("src/imagenes/contento.png");
    
    //Constructor vacio
    public ReservasNiños(){
    }
    
    //Constructor reservas niños
    public ReservasNiños(String i){ //
        try{
            this.nombres = (String) JOptionPane.showInputDialog(null, "Nombres del Niño: ", "Niño ", JOptionPane.QUESTION_MESSAGE, icon, null, "");
            String Edad = (String) JOptionPane.showInputDialog(null, "Edad del Niño: ", "Niño ", JOptionPane.QUESTION_MESSAGE, icon, null, "");
            this.edad = Integer.parseInt(Edad);
        }catch(Exception e){
            System.out.println("No ingreso el tipo de dato correcto ");
        }
    }
    
    //Metodo para llenar datos de reservas
    @Override
    public void llenarReserva(){
        reservaNiño.add(new ReservasNiños("1"));
    }
    
    //Metodo para mostrar los datos de cada usuario
    @Override
    public String mostrarReserva(int j){
        Reservas niño = reservaNiño.get(j);
        return "\rNombre: " + niño.getNombres() + " " + "\r\nEdad: " + niño.getEdad() + "\r";
    }
    
    //Muestra el nombre de los niños
    @Override
    public void mostrarDatos(){ //En las dos clases
        for(Reservas i : reservaNiño){
            System.out.println(i.getNombres());
        }
    }
    
    //Metodo para eliminar usuarios
    @Override
    public void eliminarReserva(String queNi){
        for(int i=0;i<reservaNiño.size();i++){
            Reservas niño = reservaNiño.get(i);
           
            if(niño.getNombres().equals(queNi)){ //Compara las posiciones del ArrayList hasta encontrar cual tiene el nombre
                indiceNi = reservaNiño.indexOf(niño); //Almacena el indice donde encontro la coincidencia
                reservaNiño.remove(indiceNi); //Elimina el objeto en esa posicion
            }
           
        }
    }
    
    //Tamaño del ArrayList reservaNiño
    public int getTamañoNi(){
        return reservaNiño.size();
    }
    
    protected int getIndiceNi(){
        return indiceNi;
    }
}
