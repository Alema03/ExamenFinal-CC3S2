package org.example;

public class Lluvia extends CondicionClimatica {

    public Lluvia(double valor) {
        super("Lluvia", valor);
    }
    @Override
    public boolean esAlta() {
        return getValor() > 50.0; // Ejemplo de criterio para "alta cantidad de lluvia"
    }
    @Override
    public boolean esModerada() {
        return getValor() >= 20.0 && getValor() <= 50.0; // Ejemplo de criterio para "moderada cantidad de lluvia"
    }
    @Override
    public boolean esBaja() {
        return getValor() < 20.0; // Ejemplo de criterio para "baja cantidad de lluvia"
    }
}
