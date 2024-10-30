/*
Un supermercado vende distintas frutas. Cada fruta tiene un nombre, precio por kilogramo y un método para calcular el precio de una cantidad específica de kilos. Algunas frutas son importadas, y el cálculo de su precio puede incluir un costo adicional de importación. Existen frutas de diferentes categorías: cítricos, frutas tropicales y frutas del bosque, cada una con ciertas características propias.

Queremos implementar un programa que permita al usuario seleccionar frutas de diferentes categorías, mostrar la información de cada fruta, y calcular el costo de compra para una cantidad dada de kilos de esa fruta.
 */
//Isabella Charry Moreno - 20241220186
package supermercadodefrutas;

public abstract class Fruta {

    private String nombre;
    private double precioPorKilo;

    public Fruta(String nombre, double precioPorKilo) {
        this.nombre = nombre;
        this.precioPorKilo = precioPorKilo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public abstract double calcularPrecio(double kilos);

    public void mostrarInfo() {
        System.out.println("Fruta: " + nombre);
        System.out.println("Precio por kilo: $" + precioPorKilo);
    }
}
