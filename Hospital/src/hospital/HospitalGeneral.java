package hospital;


public class HospitalGeneral extends Hospital {

    private String especialidadPrincipal;

    public HospitalGeneral(int codHospital, String nombreHospital, String direccion, String telefono, int habitacionesTotales, String especialidadPrincipal) {
        super(codHospital, nombreHospital, direccion, telefono, habitacionesTotales);
        this.especialidadPrincipal = especialidadPrincipal;
    }

    public String getEspecialidadPrincipal() {
        return especialidadPrincipal;
    }

    public void setEspecialidadPrincipal(String especialidadPrincipal) {
        this.especialidadPrincipal = especialidadPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidad Principal: " + especialidadPrincipal;
    }
}
