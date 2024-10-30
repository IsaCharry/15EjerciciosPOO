
package material;
class Revista extends Material {
    private int numeroEdicion;
    private String frecuenciaPublicacion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion, String frecuenciaPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.frecuenciaPublicacion = frecuenciaPublicacion;
    }


    public int getNumeroEdicion() { return numeroEdicion; }
    public void setNumeroEdicion(int numeroEdicion) { this.numeroEdicion = numeroEdicion; }

    public String getFrecuenciaPublicacion() { return frecuenciaPublicacion; }
    public void setFrecuenciaPublicacion(String frecuenciaPublicacion) { this.frecuenciaPublicacion = frecuenciaPublicacion; }

 
    @Override
    public void consultarMaterial() {
        mostrarInformacion();
        System.out.println("Numero de Edición: " + numeroEdicion);
        System.out.println("Frecuencia de Publicacion: " + frecuenciaPublicacion);
    }
}
