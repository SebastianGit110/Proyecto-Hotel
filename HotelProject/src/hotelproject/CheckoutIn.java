package hotelproject;

public interface CheckoutIn {
    final int costoMat=250000;
    final int costoFam=350000;
    final int costoSui=400000;
    
    //Metodo que muestran total por habitaciones
    abstract void generarTotal(int i, int j, int k, int h);
    
    //Metodo que muestra total por servicios adicionales
    abstract void generarTotal(int i, int j, int k);
    
    abstract String mostrarFactura(String i, String j, String l);
    abstract void metodoDePago(String l);
}