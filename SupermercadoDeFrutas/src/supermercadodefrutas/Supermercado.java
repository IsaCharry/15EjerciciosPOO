package supermercadodefrutas;

import java.util.ArrayList;
import java.util.List;

public class Supermercado implements Descuento {

    private List<Fruta> frutasDisponibles;

    public Supermercado() {
        frutasDisponibles = new ArrayList<>();
    }

    public void agregarFruta(Fruta fruta) {
        frutasDisponibles.add(fruta);
    }

    public void mostrarInventario() {
        for (Fruta fruta : frutasDisponibles) {
            fruta.mostrarInfo();
            System.out.println("------------------");
        }
    }

    public double calcularCostoFruta(String nombre, double kilos) {
        for (Fruta fruta : frutasDisponibles) {
            if (fruta.getNombre().equalsIgnoreCase(nombre)) {
                return fruta.calcularPrecio(kilos);
            }
        }
        return -1;
    }

    @Override
    public double aplicarDescuento(double cantidad, double porcentaje) {
        return cantidad - (cantidad * (porcentaje / 100));
    }
}
