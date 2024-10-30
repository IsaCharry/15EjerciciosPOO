
public class Galleta extends PostreBase {

    private String forma;

    public Galleta(String nombre, String paisOrigen, double costoBase, String forma) {
        super(nombre, paisOrigen, costoBase);
        this.forma = forma;
    }

    @Override
    public void mostrarReceta() {
        System.out.println("Receta de " + getNombre() + " (" + getPaisOrigen() + "):");
        System.out.println("1. Mezclar los ingredientes y formar " + forma + " galletas.");
        System.out.println("2. Hornear a 200 grados hasta dorar.");
    }

}
