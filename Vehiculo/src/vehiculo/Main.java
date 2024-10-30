package vehiculo;

public class Main {

    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Automovil("Chevrolet", "Corolla", 2020, 180, 4),
            new Camion("Colombina", "TH", 2018, 140, 15),
            new Motocicleta("Yamaha", "R1", 2021, 270, "Deportivo")
        };

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarCaracteristicas();
            System.out.println("Consumo de Combustible: " + vehiculo.calcularConsumoCombustible() + " km/l");
            System.out.println("-------------");
        }
    }
}
