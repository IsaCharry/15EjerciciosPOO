package perfume;

public abstract class Perfume {

    private String nombre;
    private double precio;
    private String fragancia;

    public Perfume(String nombre, double precio, String fragancia) {
        this.nombre = nombre;
        this.precio = precio;
        this.fragancia = fragancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    public abstract void mostrarInfo();
}
