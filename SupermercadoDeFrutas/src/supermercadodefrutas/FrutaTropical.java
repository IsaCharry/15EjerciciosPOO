package supermercadodefrutas;

public class FrutaTropical extends Fruta {

    public FrutaTropical(String nombre, double precioPorKilo) {
        super(nombre, precioPorKilo);
    }

    @Override
    public double calcularPrecio(double kilos) {
        return getPrecioPorKilo() * kilos * 1.05; // 5% extra por rareza
    }
}
