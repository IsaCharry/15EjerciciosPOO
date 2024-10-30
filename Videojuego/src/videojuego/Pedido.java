package videojuego;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Videojuego> videojuegos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.videojuegos = new ArrayList<>();
    }

    public void agregarVideojuego(Videojuego videojuego, int cantidad) {
        if (videojuego.quitarStock(cantidad)) {
            for (int i = 0; i < cantidad; i++) {
                videojuegos.add(videojuego);
            }
        } else {
            System.out.println("No hay suficiente stock de " + videojuego.getNombre());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Videojuego videojuego : videojuegos) {
            total += videojuego.obtenerPrecio();
        }
        return total;
    }

    public boolean realizarPago() {
        double total = calcularTotal();
        if (cliente.descontarSaldo(total)) {
            System.out.println("Pago realizado con éxito.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar el pedido.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pedido de: " + cliente.getNombre() + " | Total: " + calcularTotal();
    }
}