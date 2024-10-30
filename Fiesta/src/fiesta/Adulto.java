package fiesta;

public class Adulto extends Invitado {

    private Bebida bebidaPreferida;

    public Adulto(String nombre, int edad, Bebida bebidaPreferida) {
        super(nombre, edad);
        this.bebidaPreferida = bebidaPreferida;
    }

    @Override
    public void mostrarPreferencias() {
        System.out.println("Soy " + getNombre() + " y prefiero beber " + bebidaPreferida.getNombre());
    }
}
