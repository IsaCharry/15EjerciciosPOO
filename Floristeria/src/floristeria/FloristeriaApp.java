/*
Supongamos que una floristería al por mayor gestiona diferentes tipos de flores que vende a sus clientes. Cada flor tiene un precio y una cantidad en stock. La floristería maneja distintos tipos de clientes (minoristas y mayoristas) y ofrece descuentos especiales dependiendo del tipo de cliente. Además, se requiere un sistema para manejar las órdenes de compra, donde cada orden puede contener varias flores y el sistema calcula el total a pagar dependiendo del cliente.
*/
//Isabella Charry Moreno - 20241220186

package floristeria;

public class FloristeriaApp {

    public static void main(String[] args) {

        Flor rosa = new Flor("Rosa", 1.5, 100);
        Flor tulipan = new Flor("Tulipán", 2.0, 80);

        Cliente clienteMinorista = new ClienteMinorista("Juana Chavarro");
        Cliente clienteMayorista = new ClienteMayorista("Laura Charry");

        Orden ordenMinorista = new Orden(clienteMinorista);
        ordenMinorista.agregarFlor(rosa, 10);
        ordenMinorista.agregarFlor(tulipan, 5);

        System.out.println("Orden para cliente minorista:");
        ordenMinorista.mostrarDetalleOrden();

        Orden ordenMayorista = new Orden(clienteMayorista);
        ordenMayorista.agregarFlor(rosa, 50);
        ordenMayorista.agregarFlor(tulipan, 20);

        System.out.println("\nOrden para cliente mayorista:");
        ordenMayorista.mostrarDetalleOrden();
    }
}
