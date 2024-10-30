
public class Manicure extends Servicio {

    private String tipo;

    public Manicure(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String descripcionServicio() {
        return "Manicure: " + tipo + " | Precio: " + getPrecio();
    }
}
