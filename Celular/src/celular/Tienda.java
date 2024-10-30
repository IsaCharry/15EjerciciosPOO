package celular;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Proveedor> proveedores;

    public Tienda() {
        this.proveedores = new ArrayList<>();
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void mostrarInventario() {
        for (Proveedor proveedor : proveedores) {
            proveedor.mostrarCelulares();
        }
    }

    public double calcularPrecioTotalConDescuento() {
        double total = 0;
        for (Proveedor proveedor : proveedores) {
            for (Celular celular : proveedor.getCelulares()) {
                total += celular.getPrecio();
            }
        }
        return total;
    }
}
