package supermercadodefrutas;

public class Main {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        supermercado.agregarFruta(new FrutaCitrica("Naranja", 600));
        supermercado.agregarFruta(new FrutaTropical("Mango", 300));
        supermercado.agregarFruta(new FrutaBosque("Fresa", 400));
        supermercado.agregarFruta(new FrutaImportada("Kiwi", 200, 800));

        supermercado.mostrarInventario();

        String nombreFruta = "Mango";
        double kilos = 2;
        double costo = supermercado.calcularCostoFruta(nombreFruta, kilos);
        System.out.println("Costo de " + kilos + " kg de " + nombreFruta + ": $" + costo);

        double costoConDescuento = supermercado.aplicarDescuento(costo, 10);
        System.out.println("Costo con descuento: $" + costoConDescuento);
    }
}
