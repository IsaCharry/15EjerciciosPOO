
public class Main {

    public static void main(String[] args) {
        Reposteria reposteria = new Reposteria();

        Pastel pastelChocolate = new Pastel("Pastel de Chocolate", "México", 80000, "chocolate", 3.0);
        Galleta galletaVainilla = new Galleta("Galleta de Vainilla", "Francia", 20000, "redonda");

        reposteria.agregarPostre(pastelChocolate);
        reposteria.agregarPostre(galletaVainilla);

        reposteria.mostrarRecetas();
    }
}
