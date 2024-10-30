






package cargamento;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private double beneficioTotal;
    private List<Cargamento> cargamentos;

    public Almacen() {
        this.beneficioTotal = 0;
        this.cargamentos = new ArrayList<>();
    }

    public void agregarCargamento(Cargamento cargamento) {
        cargamentos.add(cargamento);
    }

    public double calcularBeneficio() {
        return beneficioTotal;
    }

    public void registrarBeneficio(double beneficio) {
        beneficioTotal += beneficio;
    }

    public void mostrarInformacionCargamentos() {
        for (Cargamento cargamento : cargamentos) {
            System.out.println(cargamento.obtenerInformacion());
        }
    }
}
