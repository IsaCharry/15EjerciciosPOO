package vehiculo;

class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(String marca, String modelo, int anioFabricacion, int velocidadMaxima, double capacidadCarga) {
        super(marca, modelo, anioFabricacion, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    
    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Capacidad de Carga: " + capacidadCarga + " toneladas");
    }

    @Override
    public double calcularConsumoCombustible() {
        return 5.0; 
    }
}
