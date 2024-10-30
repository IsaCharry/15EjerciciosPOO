package perfume;

public class PerfumeFemenino extends Perfume {

    private String notasFlorales;

    public PerfumeFemenino(String nombre, double precio, String fragancia, String notasFlorales) {
        super(nombre, precio, fragancia);
        this.notasFlorales = notasFlorales;
    }

    public String getNotasFlorales() {
        return notasFlorales;
    }

    public void setNotasFlorales(String notasFlorales) {
        this.notasFlorales = notasFlorales;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Perfume Femenino: " + getNombre() + " - Precio: " + getPrecio() + " - Fragancia: " + getFragancia() + " - Notas Florales: " + notasFlorales);
    }

    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * porcentaje / 100);
    }

}
