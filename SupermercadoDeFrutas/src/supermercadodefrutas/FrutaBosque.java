package supermercadodefrutas;

public class FrutaBosque extends Fruta {

    public FrutaBosque(String nombre, double precioPorKilo) {
        super(nombre, precioPorKilo);
    }

    @Override
    public double calcularPrecio(double kilos) {
        return getPrecioPorKilo() * kilos;
    }
}
