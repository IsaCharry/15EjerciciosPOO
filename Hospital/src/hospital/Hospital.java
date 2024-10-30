/*
Un hospital quiere desarrollar un sistema para gestionar sus instalaciones y pacientes. Cada hospital cuenta con información general como código, nombre, dirección, teléfono, número de habitaciones totales y número de habitaciones ocupadas. Además, el sistema debe permitir gestionar el ingreso y alta de pacientes en el hospital.
 */
//Isabella Charry Moreno - 20241220186
package hospital;

public class Hospital implements Administrable {

    private int codHospital;
    private String nombreHospital;
    private String direccion;
    private String telefono;
    private int habitacionesTotales;
    private int habitacionesOcupadas;

    public Hospital(int codHospital, String nombreHospital, String direccion, String telefono, int habitacionesTotales) {
        this.codHospital = codHospital;
        this.nombreHospital = nombreHospital;
        this.direccion = direccion;
        this.telefono = telefono;
        this.habitacionesTotales = habitacionesTotales;
        this.habitacionesOcupadas = 0;
    }

    public int getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(int codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getHabitacionesTotales() {
        return habitacionesTotales;
    }

    public void setHabitacionesTotales(int habitacionesTotales) {
        this.habitacionesTotales = habitacionesTotales;
    }

    public int getHabitacionesOcupadas() {
        return habitacionesOcupadas;
    }

    public void setHabitacionesOcupadas(int habitacionesOcupadas) {
        this.habitacionesOcupadas = habitacionesOcupadas;
    }

    @Override
    public boolean ingreso() {
        if (habitacionesOcupadas < habitacionesTotales) {
            habitacionesOcupadas++;
            return true;
        }
        return false;
    }

    @Override
    public boolean alta() {
        if (habitacionesOcupadas > 0) {
            habitacionesOcupadas--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hospital [Código: " + codHospital + ", Nombre: " + nombreHospital + ", Dirección: " + direccion
                + ", Teléfono: " + telefono + ", Habitaciones Totales: " + habitacionesTotales
                + ", Habitaciones Ocupadas: " + habitacionesOcupadas + "]";
    }
}
