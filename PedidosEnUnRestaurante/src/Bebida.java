
public class Bebida extends Producto {

    private boolean esAlcoholica;

    public Bebida(String nombre, double precio, boolean esAlcoholica) {
        super(nombre, precio);
        this.esAlcoholica = esAlcoholica;
    }

    public boolean isEsAlcoholica() {
        return esAlcoholica;
    }

    public void setEsAlcoholica(boolean esAlcoholica) {
        this.esAlcoholica = esAlcoholica;
    }

    @Override
    public double calcularPrecio() {
      
        return esAlcoholica ? getPrecio() * 1.10 : getPrecio();
    }
}
