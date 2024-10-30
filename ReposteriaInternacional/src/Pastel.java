
public class Pastel extends PostreBase {

    private String sabor;
    private double costoAdicional;

    public Pastel(String nombre, String paisOrigen, double costoBase, String sabor, double costoAdicional) {
        super(nombre, paisOrigen, costoBase);
        this.sabor = sabor;
        this.costoAdicional = costoAdicional;
    }

    @Override
    public void mostrarReceta() {
        System.out.println("Receta de " + getNombre() + " (" + getPaisOrigen() + "):");
        System.out.println("1. Preparar la masa con sabor a " + sabor);
        System.out.println("2. Hornear a 180 grados.");
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + costoAdicional;
    }
}
