
import java.util.ArrayList;
import java.util.List;

public class Pedido implements DescuentoAplicable {

    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarProducto(String nombre, double precio, boolean esVegetariana) {
        productos.add(new Comida(nombre, precio, esVegetariana));
    }

    public void agregarProducto(String tipo, String nombre, double precio, boolean esEspecial) {
        if (tipo.equalsIgnoreCase("Comida")) {
            productos.add(new Comida(nombre, precio, esEspecial));
        } else if (tipo.equalsIgnoreCase("Bebida")) {
            productos.add(new Bebida(nombre, precio, esEspecial));
        } else {
            System.out.println("Tipo de producto no válido.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }

    @Override
    public double aplicarDescuento(double monto) {

        return monto * 0.90;
    }

    public double calcularTotalConDescuento() {
        return aplicarDescuento(calcularTotal());
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
