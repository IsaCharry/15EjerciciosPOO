package perfume;

import java.util.ArrayList;
import java.util.List;

public class Marca {

    private String nombre;
    private List<Perfume> perfumes;

    public Marca(String nombre) {
        this.nombre = nombre;
        this.perfumes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPerfume(Perfume perfume) {
        perfumes.add(perfume);
    }

    public void mostrarCatalogo() {
        System.out.println("Marca: " + nombre);
        for (Perfume perfume : perfumes) {
            perfume.mostrarInfo();
        }
    }
}
