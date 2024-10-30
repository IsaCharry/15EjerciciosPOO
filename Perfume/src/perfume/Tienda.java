package perfume;


import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    private List<Marca> marcas;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.marcas = new ArrayList<>();
    }

    public void agregarMarca(Marca marca) {
        marcas.add(marca);
    }

    public void agregarPerfume(String nombreMarca, Perfume perfume) {
        for (Marca marca : marcas) {
            if (marca.getNombre().equalsIgnoreCase(nombreMarca)) {
                marca.agregarPerfume(perfume);
                return;
            }
        }
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de la tienda: " + nombre);
        for (Marca marca : marcas) {
            marca.mostrarCatalogo();
        }
    }
}
