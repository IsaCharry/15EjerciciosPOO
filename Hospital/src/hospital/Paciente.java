package hospital;


public class Paciente {

    private String nombre;
    private int id;
    private int edad;
    private Hospital hospital;

   
    public Paciente(String nombre, int id, int edad, Hospital hospital) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.hospital = hospital;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Paciente [Nombre: " + nombre + ", ID: " + id + ", Edad: " + edad + ", Hospital: " + hospital.getNombreHospital() + "]";
    }
}
