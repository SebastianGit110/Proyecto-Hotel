package hotel;

import javax.swing.JOptionPane;

public class CheckOut implements CheckoutIn{
    public int totalMat = 0, totalFam = 0, totalSui = 0;
    public int totalHab = 0, totalSer = 0;
    
    //Instancias para mostrar la info de usuarios
    Adultos adulto = new Adultos();
    Niños niño = new Niños();
    Reservas reservas = new Reservas();
    
    @Override
    public void generarTotalHab(int i, int j, int k, int h){
        if(i!=0){
            totalMat=costoMat*i;
        }
        
        if(j!=0){
            totalFam=costoFam*j;
        }
        
        if(k!=0){
            totalSui=costoSui*k;
        }
        totalHab=totalMat+totalFam+totalSui;
        totalHab*=h;
    }
    
    @Override
    public void generarTotalSer(int i, int j, int k){
        totalSer = i+j+k;
    }
    
//    public void mostrarUsers(int tamañoAdu, int tamañoNi){
//        for(int i=0;i<tamañoAdu;i++){
//            reservas.mostrarReservaAdulto(i);
//            adulto.getDatosCheckin(i);
//        }
//        
//        if(tamañoNi!=0){
//            for(int i=0;i<tamañoNi;i++){
//            reservas.mostrarReservaNiño(i);      
//            niño.getDatosCheckin(i);
//            }   
//        }
//    }
    
    @Override
    public void mostrarFactura(){
        String Aux = "El costo total de las habitaciones son: " + totalHab + " pesos"
                + "\nEl total por los servicios adicionales son: " + totalSer + " pesos";
        JOptionPane.showMessageDialog(null, Aux,
                "Factura de servicios", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
