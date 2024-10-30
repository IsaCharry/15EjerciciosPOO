
public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.agregarProducto(new Comida("Pizza Margarita", 8.5, true));
        pedido.agregarProducto(new Bebida("Cerveza", 4.0, true));
        pedido.agregarProducto(new Comida("Hamburguesa", 12.0, false));
        pedido.agregarProducto("Ensalada César", 6.0, true);

        System.out.println("Total sin descuento: $" + pedido.calcularTotal());

        System.out.println("Total con descuento: $" + pedido.calcularTotalConDescuento());
    }
}
