package floristeria;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private Cliente cliente;
    private List<Flor> flores;

    public Orden(Cliente cliente) {
        this.cliente = cliente;
        this.flores = new ArrayList<>();
    }

    public void agregarFlor(Flor flor, int cantidad) {
        if (flor.getStock() >= cantidad) {
            flor.setStock(flor.getStock() - cantidad); 

            Flor florOrden = new Flor(flor.getNombre(), flor.getPrecio(), cantidad);
            flores.add(florOrden);
        } else {
            System.out.println("Stock insuficiente para " + flor.getNombre());
        }
    }

    private double calcularTotalSinDescuento() {
        double total = 0;
        for (Flor flor : flores) {
            total += flor.getPrecio() * flor.getStock();
        }
        return total;
    }

    public double calcularTotalConDescuento() {
        double totalSinDescuento = calcularTotalSinDescuento();
        return cliente.aplicarDescuento(totalSinDescuento);
    }

    public void mostrarDetalleOrden() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tipo de Cliente: " + cliente.getTipo());
        System.out.println("Flores en la orden:");
        for (Flor flor : flores) {
            System.out.println("- " + flor.getNombre() + ": " + flor.getStock() + " unidades a $" + flor.getPrecio() + " cada una");
        }
        System.out.println("Total sin descuento: $" + calcularTotalSinDescuento());
        System.out.println("Total con descuento: $" + calcularTotalConDescuento());
    }
}
