package supermercadodefrutas;

public class FrutaImportada extends Fruta {

    private double costoImportacion;

    public FrutaImportada(String nombre, double precioPorKilo, double costoImportacion) {
        super(nombre, precioPorKilo);
        this.costoImportacion = costoImportacion;
    }

    @Override
    public double calcularPrecio(double kilos) {
        return (getPrecioPorKilo() + costoImportacion) * kilos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Costo de importación: $" + costoImportacion);
    }
}
