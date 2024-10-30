package perfume;

public class PerfumeMasculino extends Perfume {

    private String notasAmaderadas;

    public PerfumeMasculino(String nombre, double precio, String fragancia, String notasAmaderadas) {
        super(nombre, precio, fragancia);
        this.notasAmaderadas = notasAmaderadas;
    }

    public String getNotasAmaderadas() {
        return notasAmaderadas;
    }

    public void setNotasAmaderadas(String notasAmaderadas) {
        this.notasAmaderadas = notasAmaderadas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Perfume Masculino: " + getNombre() + " - Precio: " + getPrecio() + " - Fragancia: " + getFragancia() + " - Notas Amaderadas: " + notasAmaderadas);
    }

    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * porcentaje / 100);
    }

}
