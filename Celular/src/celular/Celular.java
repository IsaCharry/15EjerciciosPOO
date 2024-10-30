/*
Una tienda de celulares quiere desarrollar un sistema para administrar su inventario y vender celulares. La tienda maneja diferentes tipos de celulares, como teléfonos inteligentes ("Smartphones") y teléfonos básicos ("Feature phones"). Cada tipo de celular tiene propiedades generales, como marca, modelo y precio, y algunas propiedades específicas, como el sistema operativo para los smartphones y la duración de batería para los feature phones.

Además, la tienda tiene varios proveedores que suministran los celulares, y cada proveedor tiene su nombre, dirección y lista de productos que ofrece. El sistema también debe permitir calcular el precio final de un celular con un descuento específico y manejar promociones específicas para ciertos tipos de teléfonos.
*/
//Isabella Charry Moreno - 20241220186

package celular;

public abstract class Celular {

    private String marca;
    private String modelo;
    private double precio;

    public Celular(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void mostrarDetalles();

    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}
