package videojuego;


public class Cliente {

    private String nombre;
    private String direccion;
    private double saldo;

    public Cliente(String nombre, String direccion, double saldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean agregarSaldo(double cantidad) {
        saldo += cantidad;
        return true;
    }

    public boolean descontarSaldo(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
