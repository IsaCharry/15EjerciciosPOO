package curso;

class CursoPractica extends Curso {

    public CursoPractica(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPromedio() {
       
        double[] notasOrdenadas = notas.clone();
        java.util.Arrays.sort(notasOrdenadas);
        return (notasOrdenadas[4] + notasOrdenadas[3] + notasOrdenadas[2]) / 3;
    }

    @Override
    public String obtenerTipo() {
        return "Práctica";
    }
}
