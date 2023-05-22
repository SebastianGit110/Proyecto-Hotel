package hotelproject;

public interface CheckoutIn {
    final int COSTOMAT=250000;
    final int COSTOFAM=350000;
    final int COSTOSUI=400000;
    
    //Metodo que muestran total por habitaciones
    abstract void generarTotal(int i, int j, int k, int h);
    
    //Metodo que muestra total por servicios adicionales
    abstract void generarTotal(int i, int j, int k);
    
    abstract String mostrarFactura(String i, String j, String l);
    abstract void metodoDePago(String l);
}