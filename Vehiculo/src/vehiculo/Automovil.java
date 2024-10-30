/*
Se esta desarrollando un sistema para gestionar vehículos en una flota de transporte. En esta flota existen tres tipos principales de vehículos: automóviles, camiones y motocicletas. Todos los vehículos tienen características generales como la marca, modelo, año de fabricación y velocidad máxima. Además, pueden mostrar sus características y calcular el consumo de combustible según el tipo de vehículo.

Cada tipo de vehículo tiene características adicionales:

Automóvil: Tiene el número de puertas.
Camión: Tiene la capacidad de carga en toneladas.
Motocicleta: Tiene el tipo de manillar (e.g., deportivo o clásico).
Requerimientos:
Crea una clase abstracta llamada Vehiculo que contenga los métodos y atributos comunes a todos los vehículos.
Implementa el método abstracto calcularConsumoCombustible(), que calcule el consumo de combustible de manera específica para cada tipo de vehículo. Por ejemplo:
Para Automóviles: Consumo = 12 km/l
Para Camiones: Consumo = 5 km/l
Para Motocicletas: Consumo = 20 km/l
Usa herencia para definir las clases específicas de Automóvil, Camión y Motocicleta.
Usa polimorfismo para mostrar las características y el consumo de combustible de cada vehículo.
*/

//Isabella Charry Moreno - 20241220186

package vehiculo;

class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil(String marca, String modelo, int anioFabricacion, int velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, anioFabricacion, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    
    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Número de Puertas: " + numeroPuertas);
    }

    @Override
    public double calcularConsumoCombustible() {
        return 12.0; 
    }
}
