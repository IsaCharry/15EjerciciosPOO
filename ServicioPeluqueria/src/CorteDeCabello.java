
public class CorteDeCabello extends Servicio {

    private String estilo;

    public CorteDeCabello(String nombre, double precio, String estilo) {
        super(nombre, precio);
        this.estilo = estilo;
    }

    @Override
    public String descripcionServicio() {
        return "Corte de cabello: " + estilo + " | Precio: " + getPrecio();
    }
}
