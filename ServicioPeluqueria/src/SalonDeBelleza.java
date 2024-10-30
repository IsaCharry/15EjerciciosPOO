
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SalonDeBelleza {

    private List<Cliente> clientes;
    private List<Empleado> empleados;
    private List<Cita> citas;

    public SalonDeBelleza() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        citas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void hacerCita(Cliente cliente, Empleado empleado, Servicio servicio, LocalDateTime fechaHora) {
        Cita cita = new Cita(cliente, empleado, servicio, fechaHora);
        citas.add(cita);
        System.out.println("Cita agendada: " + cita);
    }

    public List<Cita> obtenerCitas() {
        return citas;
    }
}
