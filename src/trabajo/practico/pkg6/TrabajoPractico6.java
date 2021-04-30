
package trabajo.practico.pkg6;

public class TrabajoPractico6 {

    public static void main(String[] args) {
        Registro r1 = new Registro ();
        Contacto c1 = new Contacto ("Ezequiel","Acevedo","M12 M30 C15","La Punta","41710461");
        Contacto c2 = new Contacto ("Jonatan","Salas","M12 M35 C24","La Toma","40156452");
        Contacto c3 = new Contacto ("Agustin","Fernandez","M5 M12 C14","La Punta","36487149");
        Contacto c4 = new Contacto ("Roberto","Salas","M3 M15 C22","Capital","42487918");
        Contacto c5 = new Contacto ("Aldana","Acevedo","M14 M12 C42","La toma","48475465");    
        
        r1.agregarCliente(2664151015l, c1);
        r1.agregarCliente(2664791227l, c2);
        r1.agregarCliente(2664251101l, c3);
        r1.agregarCliente(2664487916l, c4);
        r1.agregarCliente(2664986532l, c5);
        
        
        System.out.println(r1.buscarCliente(2664151015l));
        
        System.out.println(r1.buscarTelefono("Salas"));
        
        System.out.println(r1.buscarClientes("La Punta"));
        
        System.out.println(r1.borrarCliente("48475465"));
        
       
        
    }
    
}
