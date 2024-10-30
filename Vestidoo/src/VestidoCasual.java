
public class VestidoCasual extends vestido {

    private String material;

    public VestidoCasual(int codigo, String talla, String color, String material) {
        super(codigo, "Casual", talla, color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
