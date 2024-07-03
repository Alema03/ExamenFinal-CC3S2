package org.example;


public class Temperatura extends CondicionClimatica {

    public Temperatura(double valor) {
        super("Temperatura", valor);
    }

    @Override
    public boolean esAlta() {
        return getValor() > 30.0; // Ejemplo de criterio para "alta temperatura"
    }

    @Override
    public boolean esModerada() {
        return getValor() >= 20.0 && getValor() <= 30.0; // Ejemplo de criterio para "moderada temperatura"
    }

    @Override
    public boolean esBaja() {
        return getValor() < 20.0; // Ejemplo de criterio para "baja temperatura"
    }
}
