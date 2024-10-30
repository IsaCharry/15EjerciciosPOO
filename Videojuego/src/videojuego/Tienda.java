package videojuego;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Videojuego> videojuegos;
    private List<Cliente> clientes;

    public Tienda() {
        videojuegos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void agregarVideojuego(Videojuego videojuego) {
        videojuegos.add(videojuego);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarPedido(Cliente cliente, Videojuego videojuego, int cantidad) {
        Pedido pedido = new Pedido(cliente);
        pedido.agregarVideojuego(videojuego, cantidad);
        if (pedido.realizarPago()) {
            System.out.println("Pedido realizado: " + pedido);
        }
    }
}
