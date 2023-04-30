package hotel;

public interface CheckoutIn {
    final int costoMat=250000;
    final int costoFam=350000;
    final int costoSui=400000;
    
    //Metodo que muestran total por habitaciones
    abstract void generarTotalHab(int i, int j, int k, int h);
    
    //Metodo que muestra total por servicios adicionales
    abstract void generarTotalSer(int i, int j, int k);
    
    abstract void mostrarFactura();
    
}
