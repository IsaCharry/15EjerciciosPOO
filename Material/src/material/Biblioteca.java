package material;

import java.util.ArrayList;

class Biblioteca {

    private ArrayList<Material> materiales = new ArrayList<>();

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    public void mostrarMateriales() {
        for (Material material : materiales) {
            material.consultarMaterial();
            System.out.println("----------------");
        }
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }
}
