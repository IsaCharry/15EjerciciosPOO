package curso;

class Estudiante {

    private String nombre;
    private Curso curso;

    public Estudiante(String nombre, Curso curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void asignarNota(int evaluacion, double nota) {
        if (evaluacion >= 1 && evaluacion <= 5) {
            curso.notas[evaluacion - 1] = nota;
        } else {
            System.out.println("Evaluacion no valida.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Curso: " + curso.obtenerTipo());
        System.out.println("Promedio: " + curso.calcularPromedio());
    }

  
    public void mostrarInformacion(boolean mostrarNotaFinal) {
        mostrarInformacion();
        if (mostrarNotaFinal && curso instanceof Aprobable) {
            System.out.println("Nota Final: " + ((Aprobable) curso).notaFinal());
        }
    }
}
