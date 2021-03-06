package clases;
public class HistorialDeCompras {
    int NumerodeOrden;
    String NombreCliente;
    int MembresiaCliente;

    public HistorialDeCompras(int NumerodeOrden, String NombreCliente, int MembresiaCliente ) {
        this.NumerodeOrden = NumerodeOrden;
        this.NombreCliente = NombreCliente;
        this.MembresiaCliente = MembresiaCliente;
    }
    
    public void factura (int Cantidad , int precio , String NombreProducto){
         /*public  void matefacil(int CP,int precio){*/
     int mateamate= 0;
     double descuentoVip = 0.20;
     double impto = 0.15;
     double total = 0;
     
     
      mateamate = Cantidad*precio;
     total = mateamate - descuentoVip + impto;
      System.out.println(mateamate);
        System.out.println("Su producto es: "+ NombreProducto + " y pagará " + mateamate);
    }
    
      public void correrHistorial (){
System.out.println( "El numero de orden " + NumerodeOrden + " fue adquirido por  " + NombreCliente + " con numero de membresía  " + MembresiaCliente );
}
}
