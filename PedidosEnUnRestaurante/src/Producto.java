
/**
 * Escribe un programa en Java para gestionar los pedidos de un restaurante. El programa debe poder gestionar diferentes tipos de productos, como comidas y bebidas, que tienen precios y descripciones. También, se debe permitir realizar pedidos que incluyan varios productos, calcular el total del pedido y aplicar descuentos según el tipo de cliente.
 */
//Isabella Charry Moreno - 20241220186
public abstract class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public abstract double calcularPrecio();
}
