package hospital;

public class Main {

    public static void main(String[] args) {

        HospitalGeneral hospitalGeneral = new HospitalGeneral(1, "Hospital Medilaser", "Calle Principal 8", "555-1234", 100, "Medicina General");
        HospitalEspecializado hospitalEspecializado = new HospitalEspecializado(2, "Hospital Kenedy", "Avenida Chapinero", "555-5678", 50, "Cardiología");

        Paciente paciente1 = new Paciente("Juan Pérez", 1001, 45, hospitalGeneral);
        Paciente paciente2 = new Paciente("Ana Gómez", 1002, 30, hospitalEspecializado);

        System.out.println(hospitalGeneral);
        System.out.println(hospitalEspecializado);

        System.out.println("Ingreso paciente 1 en Hospital General: " + hospitalGeneral.ingreso());
        System.out.println("Ingreso paciente 2 en Hospital Especializado: " + hospitalEspecializado.ingreso());

        System.out.println(paciente1);
        System.out.println(paciente2);

        System.out.println("Alta de paciente en Hospital Especializado: " + hospitalEspecializado.alta());

        System.out.println(hospitalGeneral);
        System.out.println(hospitalEspecializado);
    }
}
