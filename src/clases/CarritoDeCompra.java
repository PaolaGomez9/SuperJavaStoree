package clases;

public class CarritoDeCompra {
   int IDProducto;
   String NombreProducto;
   String DescripcionProducto;
   int CantidadProducto;
   double PrecioProducto;

   orden ord;
    public CarritoDeCompra(int IDProducto, String NombreProducto, String DescripcionProducto, int CantidadProducto, double PrecioProducto) {
        this.IDProducto = IDProducto;
        this.NombreProducto = NombreProducto;
        this.DescripcionProducto = DescripcionProducto;
        this.CantidadProducto = CantidadProducto;
        this.PrecioProducto = PrecioProducto;
    }
   
   public void sjs2(orden ord){
   this.ord = ord;
   }
   
   
   
   public void correrCarrito (){
System.out.println( IDProducto + "  " + CantidadProducto + "  " + NombreProducto + "  " + DescripcionProducto + "  " + PrecioProducto );
}
}

/*suscripción VIP se le dará un descuento del .2.*/
