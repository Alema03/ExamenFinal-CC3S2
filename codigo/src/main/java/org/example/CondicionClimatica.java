package org.example;
public abstract class CondicionClimatica {
    private String tipo;
    private double valor;

    public CondicionClimatica(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    // Métodos abstractos que cada subclase debe implementar
    public abstract boolean esAlta();
    public abstract boolean esModerada();
    public abstract boolean esBaja();
}
