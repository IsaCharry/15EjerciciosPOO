package curso;

class CursoTeoria extends Curso implements Aprobable {

    public CursoTeoria(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    @Override
    public String obtenerTipo() {
        return "Teoría";
    }

    @Override
    public boolean estaAprobado() {
        return calcularPromedio() >= 6;
    }

    @Override
    public double notaFinal() {
        return calcularPromedio();
    }
}
