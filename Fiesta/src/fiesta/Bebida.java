package fiesta;

public class Bebida implements Consumible {

    private String nombre;
    private int cantidad;
    private boolean esAlcoholica;

    public Bebida(String nombre, int cantidad, boolean esAlcoholica) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.esAlcoholica = esAlcoholica;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void consumir(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("Cantidad insuficiente de " + nombre);
        }
    }

    public boolean isAlcoholica() {
        return esAlcoholica;
    }
}
