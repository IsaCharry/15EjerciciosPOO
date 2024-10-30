package celular;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {

    private String nombre;
    private String direccion;
    private List<Celular> celulares;

    public Proveedor(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.celulares = new ArrayList<>();
    }

    public void agregarCelular(Celular celular) {
        celulares.add(celular);
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public void mostrarCelulares() {
        System.out.println("Proveedor: " + nombre + ", Dirección: " + direccion);
        for (Celular celular : celulares) {
            celular.mostrarDetalles();
        }
    }
}
