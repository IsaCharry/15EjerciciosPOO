package fiesta;

public class Main {

    public static void main(String[] args) {

        Fiesta fiesta = new Fiesta();

        Bebida cerveza = new Bebida("Cerveza", 50, true);
        Bebida jugo = new Bebida("Jugo de naranja", 30, false);
        Alimento pizza = new Alimento("Pizza", 20, false);
        Alimento ensalada = new Alimento("Ensalada", 15, true);

        fiesta.agregarConsumible(cerveza);
        fiesta.agregarConsumible(jugo);
        fiesta.agregarConsumible(pizza);
        fiesta.agregarConsumible(ensalada);

        Adulto invitadoAdulto = new Adulto("Juan", 25, cerveza);
        Menor invitadoMenor = new Menor("Sofía", 12, pizza);

        fiesta.agregarInvitado(invitadoAdulto);
        fiesta.agregarInvitado(invitadoMenor);
        fiesta.mostrarPreferencias();
    }
}
