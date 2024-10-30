package celular;

public class FeaturePhone extends Celular implements Descuento {

    private int duracionBateria;

    public FeaturePhone(String marca, String modelo, double precio, int duracionBateria) {
        super(marca, modelo, precio);
        this.duracionBateria = duracionBateria;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Feature Phone - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Precio: " + getPrecio() + ", Duración de batería: " + duracionBateria + " horas");
    }
}
