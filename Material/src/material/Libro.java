package material;

class Libro extends Material implements Prestamo {

    private int numeroPaginas;
    private String genero;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas, String genero) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void prestar() {
        System.out.println("Libro '" + getTitulo() + "' ha sido prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("Libro '" + getTitulo() + "' ha sido devuelto.");
    }

    @Override
    public void consultarMaterial() {
        mostrarInformacion();
        System.out.println("Numero de Paginas: " + numeroPaginas);
        System.out.println("Genero: " + genero);
    }
}
