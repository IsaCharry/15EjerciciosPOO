package videojuego;


public class Main {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Videojuego videojuego1 = new Videojuego("The Last of Us", "Aventura", 49.99, 10);
        Videojuego videojuego2 = new Videojuego("Call of Duty", "Acción", 59.99, 5);

        tienda.agregarVideojuego(videojuego1);
        tienda.agregarVideojuego(videojuego2);

        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123", 100.00);
        tienda.registrarCliente(cliente1);

        tienda.realizarPedido(cliente1, videojuego1, 1);
        tienda.realizarPedido(cliente1, videojuego2, 1);

        System.out.println("Saldo restante de " + cliente1.getNombre() + ": " + cliente1.getSaldo());
    }
}
