package cargamento;

public class FrutaImportada extends Cargamento implements DescuentoAplicable {

    private static final double TARIFA_IMPORTACION = 1.15;

    public FrutaImportada(String nombre, String procedencia, double kilos, double precioCostePorKilo, double precioVentaPorKilo) {
        super(nombre, procedencia, kilos, precioCostePorKilo, precioVentaPorKilo);
    }

    @Override
    public double calcularPrecioVenta(double cantidadKilos) {
        return cantidadKilos * getPrecioVentaPorKilo() * TARIFA_IMPORTACION;
    }

    @Override
    public void aplicarDescuento(double cantidadDescuento) {
        if (getPrecioVentaPorKilo() - cantidadDescuento >= getPrecioCostePorKilo()) {
            setPrecioVentaPorKilo(getPrecioVentaPorKilo() - cantidadDescuento);
        } else {
            System.out.println("No se puede rebajar más allá del precio de coste.");
        }
    }
}
