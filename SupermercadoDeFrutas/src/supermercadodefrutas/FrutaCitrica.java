package supermercadodefrutas;


public class FrutaCitrica extends Fruta {

    public FrutaCitrica(String nombre, double precioPorKilo) {
        super(nombre, precioPorKilo);
    }

    @Override
    public double calcularPrecio(double kilos) {
        return getPrecioPorKilo() * kilos;
    }
}
