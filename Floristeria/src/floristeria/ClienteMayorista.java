package floristeria;

public class ClienteMayorista extends Cliente {

    public ClienteMayorista(String nombre) {
        super(nombre, "Mayorista");
    }

    public double aplicarDescuento(double total) {
        return total * 0.8;
    }
}
