
import java.time.LocalDateTime;

public class Cita {

    private Cliente cliente;
    private Empleado empleado;
    private Servicio servicio;
    private LocalDateTime fechaHora;

    public Cita(Cliente cliente, Empleado empleado, Servicio servicio, LocalDateTime fechaHora) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.servicio = servicio;
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Cita: " + cliente.getNombre() + " con " + empleado.getNombre() + " para " + servicio.descripcionServicio() + " el " + fechaHora;
    }
}
