
public abstract class PostreBase implements Postre {

    private String nombre;
    private String paisOrigen;
    protected double costoBase;

    public PostreBase(String nombre, String paisOrigen, double costoBase) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.costoBase = costoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public abstract void mostrarReceta();

    public double calcularCosto() {
        return costoBase;
    }
}
