package celular;


public class Smartphone extends Celular implements Descuento {

    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, double precio, String sistemaOperativo) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Smartphone - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Precio: " + getPrecio() + ", Sistema Operativo: " + sistemaOperativo);
    }
}
