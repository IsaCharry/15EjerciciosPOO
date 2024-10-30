/*
Crea una clase abstracta Curso con los atributos:

String nombre
double[] notas (array que tendrá 5 elementos, representando las 5 evaluaciones del curso).
El constructor solo recibe el nombre y genera un array notas inicializado con ceros.
Implementa los siguientes métodos abstractos en Curso:
double calcularPromedio(): Calcula y devuelve el promedio de las notas del curso.
String obtenerTipo(): Devuelve un string que indica si es un curso de teoría o de práctica.
Crea dos clases concretas, CursoTeoria y CursoPractica, que heredan de Curso. Cada una debe implementar los métodos abstractos de la clase Curso de manera diferente:
CursoTeoria: Calcula el promedio de todas las notas.
CursoPractica: Calcula el promedio solo de las tres mejores notas.
Crea una interfaz llamada Aprobable que tenga dos métodos:
boolean estaAprobado(): Verifica si el curso está aprobado (promedio >= 6).
double notaFinal(): Devuelve la nota final del curso.
Haz que la clase CursoTeoria implemente la interfaz Aprobable.
Crea una clase Estudiante con los atributos:
String nombre
Curso curso (asociación: cada estudiante está inscrito en un curso).
Implementa métodos en Estudiante para:
void asignarNota(int evaluacion, double nota): Asigna una nota en una evaluación específica.
void mostrarInformacion(): Muestra el nombre del estudiante, el tipo de curso y el promedio.
Sobrecarga el método mostrarInformacion() para que también acepte un parámetro booleano que indique si se debe mostrar la nota final o solo la información básica.
Crea una clase Main para probar el sistema.
*/

package curso;

abstract class Curso {

    protected String nombre;
    protected double[] notas;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.notas = new double[5]; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularPromedio();

    public abstract String obtenerTipo();
}
