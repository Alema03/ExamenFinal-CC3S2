package org.example;

public class Main {
    public static void main(String[] args) {
        SistemaClimatico sistema = new SistemaClimatico();

        // Agregar observador de alertas (ejemplo)
        Alerta alerta = new Alerta();
        sistema.agregarObservador(alerta);

        // Crear condiciones climáticas
        CondicionClimatica temperatura = new Temperatura(35.0);
        CondicionClimatica lluvia = new Lluvia(25.0);
        CondicionClimatica viento = new Viento(55.0);

        // Agregar condiciones al sistema
        sistema.agregarCondicion(temperatura);
        sistema.agregarCondicion(lluvia);
        sistema.agregarCondicion(viento);

        // Evaluar condiciones y notificar observadores
        sistema.evaluarCondiciones();
    }
}
