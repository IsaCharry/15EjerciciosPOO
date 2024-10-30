package floristeria;

public class ClienteMinorista extends Cliente {

    public ClienteMinorista(String nombre) {
        super(nombre, "Minorista");
    }

    @Override
    public double aplicarDescuento(double total) {
        return total * 0.9; 
    }
}
