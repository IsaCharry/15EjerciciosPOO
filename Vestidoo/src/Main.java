
public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Laura Pérez", 1001, "3173948");
        Cliente cliente2 = new Cliente("Carlos Gómez", 1002, "31620378");

        VestidoGala vestidoGala = new VestidoGala(1, "M", "Rojo", "Encaje");
        VestidoCasual vestidoCasual = new VestidoCasual(2, "S", "Rosado", "Algodón");

        System.out.println(vestidoGala);
        System.out.println(vestidoCasual);

        System.out.println("Alquiler vestido de gala para cliente 1: " + cliente1.alquilarVestido(vestidoGala));
        System.out.println("Alquiler vestido casual para cliente 2: " + cliente2.alquilarVestido(vestidoCasual));

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("Devolución vestido de gala para cliente 1: " + cliente1.devolverVestido(vestidoGala));
        System.out.println("Devolución vestido casual para cliente 2: " + cliente2.devolverVestido(vestidoCasual));

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
