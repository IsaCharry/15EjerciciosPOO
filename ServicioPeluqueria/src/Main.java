import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        SalonDeBelleza salon = new SalonDeBelleza();

        Servicio corte = new CorteDeCabello("Corte", 20.0, "Corte en capas");
        Servicio manicure = new Manicure("Manicure", 15.0, "Frances");

        Empleado empleado1 = new Empleado("Ana", "Estilista");
        Empleado empleado2 = new Empleado("Luis", "Manicurista");

        Cliente cliente1 = new Cliente("Pedro", "123456789");
        Cliente cliente2 = new Cliente("Maria", "987654321");

        salon.agregarCliente(cliente1);
        salon.agregarCliente(cliente2);
        salon.agregarEmpleado(empleado1);
        salon.agregarEmpleado(empleado2);

        salon.hacerCita(cliente1, empleado1, corte, LocalDateTime.of(2024, 10, 26, 10, 0));
        salon.hacerCita(cliente2, empleado2, manicure, LocalDateTime.of(2024, 10, 26, 11, 0));

        System.out.println("\nCitas agendadas:");
        for (Cita cita : salon.obtenerCitas()) {
            System.out.println(cita);
        }
    }
}
