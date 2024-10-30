package fiesta;

public class Menor extends Invitado {

    private Alimento comidaPreferida;

    public Menor(String nombre, int edad, Alimento comidaPreferida) {
        super(nombre, edad);
        this.comidaPreferida = comidaPreferida;
    }

    @Override
    public void mostrarPreferencias() {
        System.out.println("Soy " + getNombre() + " y prefiero comer " + comidaPreferida.getNombre());
    }
}
