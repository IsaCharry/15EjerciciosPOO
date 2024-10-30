package cargamento;
/*
En un almacén se guarda fruta para su posterior venta. Por cada cargamento se tiene la siguiente
información: nombre de la fruta, procedencia, número de kilos, precio coste por kilo y precio venta por
kilo. Codificar una clase para manejar esta información de forma que contenga las siguientes
operaciones:
• Constructor
• Método que devuelva la información de cada cargamento de fruta.
• Método “rebajar” que rebaja el precio de venta en una cantidad pasada
como parámetro, (el precio de venta nunca puede ser menor que el precio
de coste).
• Método “vender”: se le pasa el número de kilos a vender y si hay suficiente
cantidad, se decrementa el número de kilos y se devuelve el importe de la
venta, sino da error.
• Método que nos diga si dos cargamentos de fruta tienen la misma
procedencia.
• Llevar en todo momento el beneficio obtenido por el almacén.
Para probar dicha clase hacer un main que:
• Dé de alta 3 cargamentos y muestre su información.
• Diga si los dos primeros tienen la misma procedencia.
• Rebaje el precio del tercero.
• Realice ventas de los tres cargamentos.
• Muestre el beneficio obtenido por el almacén.
*/

//Isabella Charry Moreno - 20241220186

public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        FrutaNacional frutaNacional = new FrutaNacional("Manzanas", "Chile", 100, 2.0, 3.0);
        FrutaImportada frutaImportada1 = new FrutaImportada("Peras", "Argentina", 150, 1.5, 2.5);
        FrutaImportada frutaImportada2 = new FrutaImportada("Bananas", "Ecuador", 200, 1.2, 1.8);

        almacen.agregarCargamento(frutaNacional);
        almacen.agregarCargamento(frutaImportada1);
        almacen.agregarCargamento(frutaImportada2);

        almacen.mostrarInformacionCargamentos();

        System.out.println("¿Cargamento 1 y 2 tienen la misma procedencia? "
                + (frutaNacional.mismaProcedencia(frutaImportada1) ? "Sí" : "No"));

        frutaNacional.aplicarDescuento(0.5);
        frutaImportada1.aplicarDescuento(0.3);

        double venta1 = frutaNacional.calcularPrecioVenta(30);
        almacen.registrarBeneficio(venta1 - (30 * frutaNacional.getPrecioCostePorKilo()));

        double venta2 = frutaImportada1.calcularPrecioVenta(50);
        almacen.registrarBeneficio(venta2 - (50 * frutaImportada1.getPrecioCostePorKilo()));

        double venta3 = frutaImportada2.calcularPrecioVenta(100);
        almacen.registrarBeneficio(venta3 - (100 * frutaImportada2.getPrecioCostePorKilo()));

        System.out.println("Beneficio total del almacén: $" + almacen.calcularBeneficio());
    }
}
