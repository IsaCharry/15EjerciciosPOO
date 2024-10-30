package vehiculo;

class Motocicleta extends Vehiculo {

    private String tipoManillar;

    public Motocicleta(String marca, String modelo, int anioFabricacion, int velocidadMaxima, String tipoManillar) {
        super(marca, modelo, anioFabricacion, velocidadMaxima);
        this.tipoManillar = tipoManillar;
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    
    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Tipo de Manillar: " + tipoManillar);
    }

    @Override
    public double calcularConsumoCombustible() {
        return 20.0; 
    }
}
