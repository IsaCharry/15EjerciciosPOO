package videojuego;

/*Queremos desarrollar un sistema para una tienda de videojuegos. El sistema debe permitir gestionar videojuegos, clientes y pedidos. Debería incluir las siguientes funcionalidades:

Videojuegos: Cada videojuego debe tener un nombre, una categoría (acción, aventura, estrategia, etc.), un precio y un stock. Debe ser posible añadir o quitar stock.

Clientes: Cada cliente debe tener un nombre, una dirección y un saldo. Los clientes pueden realizar pedidos y deben poder ver su saldo.

Pedidos: Un pedido está compuesto por varios videojuegos y debe estar asociado a un cliente. Se debe calcular el total del pedido y descontar el saldo del cliente si tiene suficiente.

Interfaz de Usuario: Proporcionar métodos para añadir videojuegos, registrar clientes y realizar pedidos.
*/

//Isabella Charry Moreno - 20241220186

public class Videojuego implements Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Videojuego(String nombre, String categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void agregarStock(int cantidad) {
        stock += cantidad;
    }

    public boolean quitarStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Videojuego: " + nombre + " | Categoría: " + categoria + " | Precio: " + precio + " | Stock: " + stock;
    }
}
