/*
 Imagina que eres el encargado de organizar una fiesta y necesitas crear un sistema en Java para gestionar los invitados, las bebidas, los alimentos, el entretenimiento y otros aspectos clave de la organización de la fiesta. Debes crear una aplicación que permita:

Registrar invitados, cada uno con información básica (nombre, edad, tipo de invitado - adulto o menor - y preferencias de bebida y comida).
Administrar bebidas y alimentos: cada alimento y bebida tiene un nombre, tipo (bebida alcohólica o no alcohólica, vegetariano o no vegetariano, etc.) y cantidad disponible.
Planificar entretenimiento, como la música o actividades especiales.
 */
//Isabella Charry Moreno - 20241220186
package fiesta;

import java.util.ArrayList;
import java.util.List;

public class Fiesta {

    private List<Invitado> invitados;
    private List<Consumible> consumibles;

    public Fiesta() {
        this.invitados = new ArrayList<>();
        this.consumibles = new ArrayList<>();
    }

    public void agregarInvitado(Adulto adulto) {
        invitados.add(adulto);
        System.out.println("Invitado adulto agregado: " + adulto.getNombre());
    }

    public void agregarInvitado(Menor menor) {
        invitados.add(menor);
        System.out.println("Invitado menor agregado: " + menor.getNombre());
    }

    public void agregarConsumible(Consumible consumible) {
        consumibles.add(consumible);
        System.out.println("Consumible agregado: " + consumible.getNombre());
    }

    public void mostrarPreferencias() {
        for (Invitado invitado : invitados) {
            invitado.mostrarPreferencias();
        }
    }
}
