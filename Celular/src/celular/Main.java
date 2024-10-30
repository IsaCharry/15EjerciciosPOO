package celular;

public class Main {

    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S24 Ultra", 6000000, "Android");
        FeaturePhone featurePhone = new FeaturePhone("Nokia", "3310", 50, 24);

        Proveedor proveedor = new Proveedor("Exito", "Calle 8");
        proveedor.agregarCelular(smartphone);
        proveedor.agregarCelular(featurePhone);

        Tienda tienda = new Tienda();
        tienda.agregarProveedor(proveedor);

        tienda.mostrarInventario();
        System.out.println("Precio total: " + tienda.calcularPrecioTotalConDescuento());
    }
}
