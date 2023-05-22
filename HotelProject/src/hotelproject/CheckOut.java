package hotelproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CheckOut implements CheckoutIn{
    public int totalMat = 0, totalFam = 0, totalSui = 0;
    public int totalHab = 0, totalSer = 0;
    Scanner in = new Scanner(System.in);
    
    @Override
    public void generarTotal(int i, int j, int k, int h){
        if(i!=0){
            totalMat=COSTOMAT*i;
        }
        if(j!=0){
            totalFam=COSTOFAM*j;
        }
        if(k!=0){
            totalSui=COSTOSUI*k;
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
    public String mostrarFactura(String DiaEnt, String DiaSal, String primerNombre){
        String Aux = "Factura reserva de: " + primerNombre 
                + "\r\nFecha de entrada huespedes: " +  DiaEnt + "\r\nFecha de salida huespedes: " + DiaSal
                + "\r\nEl costo total de las habitaciones son: $" + totalHab + " pesos"
                + "\r\nEl total por los servicios adicionales son: $" + totalSer + " pesos"
                + "\r\nPor un total de: $" + (totalHab+totalSer) + " pesos";
        JOptionPane.showMessageDialog(null, Aux,
                "Factura de servicios", JOptionPane.INFORMATION_MESSAGE);
        return Aux;
    }
    
    @Override
    public void metodoDePago(String primerNombre){
        String metodoPago = JOptionPane.showInputDialog("Quiere pagar en efectivo o tarjeta");
        metodoPago.toLowerCase();
        if(metodoPago.equals("efectivo")){
            System.out.println("El pago en efectivo realizado por: " + primerNombre + " ha sido efectuado");
        } else if(metodoPago.equals("tarjeta")){
            System.out.println("A cuantas cuotas");
            int cuotas = in.nextInt();
            
            int valorCuota = (totalHab+totalSer)/cuotas;
            System.out.println("El valor mensual de la cuota es de " + valorCuota);
            System.out.println("Fue un gusto ayudarle");
        }
    }
}