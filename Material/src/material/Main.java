package material;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 500, "Novela");
        Revista revista1 = new Revista("Semana", "Felipe lopez", 1946, 2505, "Semanal");

        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);

        biblioteca.mostrarMateriales();

        Material encontrado = biblioteca.buscarMaterial("Cien Años de Soledad");
        if (encontrado != null && encontrado instanceof Prestamo) {
            ((Prestamo) encontrado).prestar();
            ((Prestamo) encontrado).devolver();
        }
    }
}
