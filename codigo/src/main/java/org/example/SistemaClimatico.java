package org.example;

import java.util.ArrayList;
import java.util.List;


public class SistemaClimatico {
    private List<CondicionClimatica> condiciones;
    private List<Observador> observadores;

    public SistemaClimatico() {
        this.condiciones = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public void agregarCondicion(CondicionClimatica condicion) {
        System.out.println(condicion.getTipo());
        condiciones.add(condicion);
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void evaluarCondiciones() {
        for (CondicionClimatica condicion : condiciones) {
            if (condicion.esAlta()) {
                notificar("Alta " + condicion.getTipo());
            } else if (condicion.esModerada()) {
                notificar("Moderada " + condicion.getTipo());
            } else if (condicion.esBaja()) {
                notificar("Baja " + condicion.getTipo());
            }
        }
    }

    private void notificar(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
