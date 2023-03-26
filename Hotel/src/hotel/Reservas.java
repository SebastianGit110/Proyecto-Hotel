package hotel;

import java.util.ArrayList;
import java.util.Hashtable;

public class Reservas {
    
    Hashtable<Integer, Persona> reserva = new Hashtable<>();
    Hashtable<Integer, Persona> checkin = new Hashtable<>();
    
    //Constructor vacio
    public Reservas(){
    }
    
    public void llenarReserva(Persona personareserva, int i){
        this.reserva.put(i,personareserva);
    }
    
    public void llenarCheckIn(Persona personacheckin, int i){
        this.checkin.put(i, personacheckin);
    }
    
    public void mostrarReserva(int numPerso){
        for(int i=0;i<numPerso;i++){
            Persona objectRes = (Persona) reserva.get(i);
            System.out.println(objectRes.getNombre() + " " + objectRes.getEdad() );
        }
    }
    
    public void mostrarCheckIn(int numPerso){
        for(int i=0;i<numPerso;i++){
            Persona objectChe = (Persona) checkin.get(i);
            System.out.println(objectChe.getId() + " " + objectChe.getDireccion() );
        }
    }
    
    public void mostrarInfoReserva(int numPerso){
        for(int i=0;i<numPerso;i++){
            Persona objectRes = (Persona) reserva.get(i);
            Persona objectChe = (Persona) checkin.get(i);
             System.out.println(objectRes.getNombre() + " " + objectRes.getEdad() + " " + objectChe.getId() + " " + objectChe.getDireccion() );
        }
    }
    
}
