package perfume;

public class Main {

    public static void main(String[] args) {

        Perfume femenino1 = new PerfumeFemenino("Rosa Fresca", 50.0, "Floral", "Rosas y jazmín");
        Perfume masculino1 = new PerfumeMasculino("Madera Fina", 60.0, "Amaderado", "Cedro y pino");

        Marca marcaA = new Marca("Essence");
        marcaA.agregarPerfume(femenino1);
        marcaA.agregarPerfume(masculino1);

        Tienda tienda = new Tienda("Perfumería Estilo");
        tienda.agregarMarca(marcaA);

        tienda.mostrarCatalogo();
    }
}
