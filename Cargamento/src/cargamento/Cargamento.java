package cargamento;

public abstract class Cargamento {

    private String nombre;
    private String procedencia;
    private double kilos;
    private double precioCostePorKilo;
    private double precioVentaPorKilo;

    public Cargamento(String nombre, String procedencia, double kilos, double precioCostePorKilo, double precioVentaPorKilo) {
        this.nombre = nombre;
        this.procedencia = procedencia;
        this.kilos = kilos;
        this.precioCostePorKilo = precioCostePorKilo;
        this.precioVentaPorKilo = precioVentaPorKilo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public double getKilos() {
        return kilos;
    }

    public double getPrecioCostePorKilo() {
        return precioCostePorKilo;
    }

    public double getPrecioVentaPorKilo() {
        return precioVentaPorKilo;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public void setPrecioVentaPorKilo(double precioVentaPorKilo) {
        this.precioVentaPorKilo = precioVentaPorKilo;
    }

    public abstract double calcularPrecioVenta(double cantidadKilos);

    public boolean mismaProcedencia(Cargamento otroCargamento) {
        return this.procedencia.equalsIgnoreCase(otroCargamento.getProcedencia());
    }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Procedencia: " + procedencia + ", Kilos: " + kilos
                + ", Precio Coste/kilo: " + precioCostePorKilo + ", Precio Venta/kilo: " + precioVentaPorKilo;
    }
}
