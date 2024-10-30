package hospital;


public class HospitalEspecializado extends Hospital {

    private String areaEspecializacion;

    public HospitalEspecializado(int codHospital, String nombreHospital, String direccion, String telefono, int habitacionesTotales, String areaEspecializacion) {
        super(codHospital, nombreHospital, direccion, telefono, habitacionesTotales);
        this.areaEspecializacion = areaEspecializacion;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Área de Especialización: " + areaEspecializacion;
    }
}
