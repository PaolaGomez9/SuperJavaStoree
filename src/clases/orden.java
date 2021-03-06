package clases;
import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.list;
public class orden {
   int IDProducto;
   String NombreProducto;
   String DescripcionProducto;
   int CantidadProducto;
   int  PrecioProducto;
   
   MembresiaCliente clienteVip;
   MembresiaCliente ClienteN;
   List<CarritoDeCompra>Compra;

    public orden(int IDProducto, String NombreProducto, String DescripcionProducto, int CantidadProducto, int PrecioProducto) {
        this.IDProducto = IDProducto;
        this.NombreProducto = NombreProducto;
        this.DescripcionProducto = DescripcionProducto;
        this.CantidadProducto = CantidadProducto;
        this.PrecioProducto = PrecioProducto;
        this.Compra = new ArrayList<CarritoDeCompra>();
    }
   
  public  void matefacil(int CP,int precio){
     int mateamate= 0;
     double descuentoVip = 0.20;
     double impto = 0.15;
     double total = 0;
     
     
  /*Aqui se desarrollaran las operaciones matematicas */
  
     mateamate = CP*precio;
     total = mateamate - descuentoVip + impto;
      System.out.println(mateamate);
      
      
  }
    
}
