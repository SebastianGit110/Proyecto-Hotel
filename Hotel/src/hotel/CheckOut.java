package hotel;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CheckOut implements CheckoutIn{
    public int totalMat = 0, totalFam = 0, totalSui = 0;
    public int totalHab = 0, totalSer = 0;
    Scanner in = new Scanner(System.in);
    
    @Override
    public void generarTotal(int i, int j, int k, int h){
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
    
    //Sobre carga de generarTotal
    @Override
    public void generarTotal(int i, int j, int k){
        totalSer = i+j+k;
    }
    
    @Override
    public void mostrarFactura(String DiaEnt, String DiaSal){
        String Aux = "Fecha de entrada " +  DiaEnt + "\nFecha de salida " + DiaSal
                + "\nEl costo total de las habitaciones son: " + totalHab + " pesos"
                + "\nEl total por los servicios adicionales son: " + totalSer + " pesos"
                + "\nPor un total de: " + (totalHab+totalSer) + " pesos";
        JOptionPane.showMessageDialog(null, Aux,
                "Factura de servicios", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void metodoDePago(){
        String metodoPago = JOptionPane.showInputDialog("Quiere pagar en efectivo o tarjeta");
        metodoPago.toLowerCase();
        if(metodoPago.equals("efectivo")){
            System.out.println("Su pago ha sido aceptado ");
        } else if(metodoPago.equals("tarjeta")){
            System.out.println("A cuantas cuotas");
            int cuotas = in.nextInt();
            
            int valorCuota = (totalHab+totalSer)/cuotas;
            System.out.println("El valor mensual de la cuota es de " + valorCuota);
            System.out.println("Fue un gusto ayudarle");
        }
    }
    
}
