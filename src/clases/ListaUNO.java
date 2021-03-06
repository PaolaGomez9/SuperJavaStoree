
package clases;
class ListaUNO {
   String NombreCliente;
   String ApellidoCliente;
   int NumeroMembresia;
   char Genero;
   
   MembresiaCliente Milista;

    public ListaUNO(String NombreCliente, String ApellidoCliente, int NumeroMembresia, char Genero, MembresiaCliente Milista) {
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.NumeroMembresia = NumeroMembresia;
        this.Genero = Genero;
        this.Milista = Milista;
    }
   
   public void sjs(MembresiaCliente Milista){
   this.Milista=Milista;
   }
   
}
