package fiesta;

public class Alimento implements Consumible {

    private String nombre;
    private int cantidad;
    private boolean esVegetariano;

    public Alimento(String nombre, int cantidad, boolean esVegetariano) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.esVegetariano = esVegetariano;
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

    public boolean isVegetariano() {
        return esVegetariano;
    }
}
