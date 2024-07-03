package org.example;

public class Viento extends CondicionClimatica {

    public Viento(double valor) {
        super("Viento", valor);
    }
    @Override
    public boolean esAlta() {
        return getValor() > 60.0; // Ejemplo de criterio para "alta velocidad de viento"
    }
    @Override
    public boolean esModerada() {
        return getValor() >= 30.0 && getValor() <= 60.0; // Ejemplo de criterio para "moderada velocidad de viento"
    }
    @Override
    public boolean esBaja() {
        return getValor() < 30.0; // Ejemplo de criterio para "baja velocidad de viento"
    }
}
