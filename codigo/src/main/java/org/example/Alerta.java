package org.example;

public class Alerta implements Observador {

    private String mensaje;

    @Override
    public void actualizar(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return "Alerta: " + mensaje;
    }
}

