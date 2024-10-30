package floristeria;

public abstract class Cliente implements Descuento {

    private String nombre;
    private String tipo;

    public Cliente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double aplicarDescuento(double total);
}
