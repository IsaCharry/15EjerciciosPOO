package fiesta;

public abstract class Invitado {

    private String nombre;
    private int edad;

    public Invitado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void mostrarPreferencias();
}
