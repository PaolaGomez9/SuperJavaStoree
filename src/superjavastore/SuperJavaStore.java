package superjavastore;
import clases.MembresiaCliente;
import clases.HistorialDeCompras;
import clases.CarritoDeCompra;
import clases.AsistentedeVenta;
import clases.orden;
import java.util.Scanner;
public class SuperJavaStore {
    public static void main(String[] args) {
     int menu=0;   
     MembresiaCliente mmcc = new MembresiaCliente("Jovanny","Rubio",12345,'M');  
        mmcc.correrMembresia();
        orden ord = new orden(1234,"coca","refresco",5,50);
        ord.matefacil(5, 50);
       
     Scanner entrada = new Scanner(System.in);
        do{
           System.out.println("Bienvenidos al supermercado x");
           System.out.println("           Menu            ");  
           System.out.println("1. Membresia VIP");
           System.out.println("2.Sin Membresia VIP");
           System.out.println("3.Salir");
            menu= entrada.nextInt(); 
        switch(menu){
            case 1: 
                System.out.println("Usted es cliente VIP");
                break;
            case 2:
                System.out.println("Bienvenido");
                break;
            case 3: 
                System.out.println("Usted ha salido del sistema ");
                break;
            default: System.out.println("No escogio ninguna opcion ");    
        }
       
        }while(menu!=3);       
   }
}
