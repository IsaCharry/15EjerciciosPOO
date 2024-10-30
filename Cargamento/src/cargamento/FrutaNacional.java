package cargamento;

public class FrutaNacional extends Cargamento implements DescuentoAplicable {

    public FrutaNacional(String nombre, String procedencia, double kilos, double precioCostePorKilo, double precioVentaPorKilo) {
        super(nombre, procedencia, kilos, precioCostePorKilo, precioVentaPorKilo);
    }

    @Override
    public double calcularPrecioVenta(double cantidadKilos) {
        return cantidadKilos * getPrecioVentaPorKilo();
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
