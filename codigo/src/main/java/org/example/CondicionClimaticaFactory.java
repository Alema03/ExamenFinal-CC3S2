package org.example;

public class CondicionClimaticaFactory {

    public static CondicionClimatica crearCondicion(String tipo, double valor) {
        switch (tipo) {
            case "Temperatura":
                return new Temperatura(valor);
            case "Lluvia":
                return new Lluvia(valor);
            case "Viento":
                return new Viento(valor);
            default:
                throw new IllegalArgumentException("Tipo de condición climática desconocido: " + tipo);
        }
    }
}
