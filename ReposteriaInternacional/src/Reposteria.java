
import java.util.ArrayList;

public class Reposteria {

    private ArrayList<Postre> postres;

    public Reposteria() {
        postres = new ArrayList<>();
    }

    public void agregarPostre(Postre postre) {
        postres.add(postre);
    }

    public void mostrarRecetas() {
        for (Postre postre : postres) {
            postre.mostrarReceta();
            System.out.println("Costo: $" + postre.calcularCosto() + "\n");
        }
    }
}
