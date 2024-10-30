package material;

/**
 * Desarrollando un sistema para una biblioteca digital que administra varios
 * tipos de materiales de lectura, como libros y revistas. La biblioteca permite
 * que los usuarios busquen materiales, consulten su información y realicen
 * acciones sobre estos materiales.
 *
 * Cada material tiene información básica como el título, autor y año de
 * publicación. Sin embargo, existen diferencias entre los tipos de materiales:
 *
 * Libros: Tienen un número de páginas y pueden ser de varios géneros. Revistas:
 * Tienen un número de edición y una frecuencia de publicación. Además, se
 * requieren las siguientes funcionalidades:
 *
 * Definir una clase abstracta Material que sirva como base para Libro y
 * Revista, que contenga métodos abstractos como consultarMaterial().
 * Implementar una interface Prestamo para aquellos materiales que se pueden
 * prestar a los usuarios. La biblioteca también debe poder agrupar materiales y
 * buscar materiales. Incluir sobrecarga de métodos para mostrar información en
 * distintos formatos. Demostrar el uso de polimorfismo para realizar acciones
 * en cualquier tipo de Material.
 */
//Isabella Charry Moreno - 20241220186
abstract class Material {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Material(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public abstract void consultarMaterial();

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + anioPublicacion);
    }

    public void mostrarInformacion(String titulo) {
        System.out.println("Titulo: " + titulo);
    }

}
