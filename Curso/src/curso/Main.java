package curso;

public class Main {

    public static void main(String[] args) {
        Curso cursoTeoria = new CursoTeoria("Introducción a la tecnologia");
        Curso cursoPractica = new CursoPractica("Laboratorio de Física");

        Estudiante estudiante1 = new Estudiante("Sofia Vega", cursoTeoria);
        Estudiante estudiante2 = new Estudiante("Daniela perez", cursoPractica);

        
        estudiante1.asignarNota(1, 8.0);
        estudiante1.asignarNota(2, 7.5);
        estudiante1.asignarNota(3, 9.0);
        estudiante1.asignarNota(4, 6.5);
        estudiante1.asignarNota(5, 8.0);

        estudiante2.asignarNota(1, 6.0);
        estudiante2.asignarNota(2, 8.0);
        estudiante2.asignarNota(3, 7.5);
        estudiante2.asignarNota(4, 9.0);
        estudiante2.asignarNota(5, 6.5);

      
        estudiante1.mostrarInformacion(true);
        estudiante2.mostrarInformacion();
    }
}
