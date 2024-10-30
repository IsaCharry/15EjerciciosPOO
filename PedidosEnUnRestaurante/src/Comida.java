
public class Comida extends Producto {

    private boolean esVegetariana;

    public Comida(String nombre, double precio, boolean esVegetariana) {
        super(nombre, precio);
        this.esVegetariana = esVegetariana;
    }

    public boolean isEsVegetariana() {
        return esVegetariana;
    }

    public void setEsVegetariana(boolean esVegetariana) {
        this.esVegetariana = esVegetariana;
    }

    @Override
    public double calcularPrecio() {

        return getPrecio();
    }
}
