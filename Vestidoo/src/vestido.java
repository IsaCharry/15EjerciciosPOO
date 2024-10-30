
/**
 * Una tienda de alquiler de vestidos necesita un sistema para gestionar sus clientes, los vestidos disponibles, las rentas y el control de disponibilidad de los vestidos. Cada vestido tiene características como el tipo, la talla, el color y su disponibilidad para alquilar. Los clientes pueden alquilar vestidos y devolverlos al finalizar el alquiler.
 */
//Isabella Charry Moreno - 20241220186
public class vestido {

    private int codigo;
    private String tipo;
    private String talla;
    private String color;
    private boolean disponible;

    public vestido(int codigo, String tipo, String talla, String color) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.talla = talla;
        this.color = color;
        this.disponible = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public boolean alquilar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (!disponible) {
            disponible = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vestido [Código: " + codigo + ", Tipo: " + tipo + ", Talla: " + talla + ", Color: " + color + ", Disponible: " + disponible + "]";
    }
}
