
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private int id;
    private String telefono;
    private List<vestido> vestidosAlquilados;

    public Cliente(String nombre, int id, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.vestidosAlquilados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<vestido> getVestidosAlquilados() {
        return vestidosAlquilados;
    }

    public boolean alquilarVestido(vestido vestido) {
        if (vestido.alquilar()) {
            vestidosAlquilados.add(vestido);
            return true;
        }
        return false;
    }

    public boolean devolverVestido(vestido vestido) {
        if (vestidosAlquilados.contains(vestido) && vestido.devolver()) {
            vestidosAlquilados.remove(vestido);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre: " + nombre + ", ID: " + id + ", Teléfono: " + telefono + ", Vestidos Alquilados: " + vestidosAlquilados + "]";
    }
}
