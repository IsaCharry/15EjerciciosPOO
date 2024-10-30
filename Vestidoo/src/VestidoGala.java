
public class VestidoGala extends vestido {

    private String decoraciones;

    public VestidoGala(int codigo, String talla, String color, String decoraciones) {
        super(codigo, "Gala", talla, color);
        this.decoraciones = decoraciones;
    }

    public String getDecoraciones() {
        return decoraciones;
    }

    public void setDecoraciones(String decoraciones) {
        this.decoraciones = decoraciones;
    }

    @Override
    public String toString() {
        return super.toString() + ", Decoraciones: " + decoraciones;
    }
}
