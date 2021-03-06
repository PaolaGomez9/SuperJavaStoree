package clases;
import clases.ListaUNO;
import java.util.ArrayList;
import java.util.List;
public class MembresiaCliente {
   String NombreCliente;
   String ApellidoCliente;
   int NumeroMembresia;
   char Genero;
   boolean VIP;
   
List<ListaUNO> Lista;   
public MembresiaCliente(String NombreCliente, String ApellidoCliente, int NumeroMembresia, char Genero) {
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.NumeroMembresia = NumeroMembresia;
        this.Genero = Genero;
        this.Lista = new ArrayList<ListaUNO>();
        this.VIP = false;
    }
    
 
    
       public void correrMembresia (){
System.out.println("El cliente " + NombreCliente +" " + ApellidoCliente + " con numero de membresía " + NumeroMembresia + " de género " + Genero + " es un cliente "+ VIP);
} 
}


