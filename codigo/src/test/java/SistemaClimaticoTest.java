import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SistemaClimaticoTest {

    @Test
    void testSistemaConStubs() {
        SistemaClimatico sistema = new SistemaClimatico();
        Alerta alerta = new Alerta(); // Usamos una implementación real para el observador
        sistema.agregarObservador(alerta);

        Temperatura stubTemp = new Temperatura(35.0);
        Lluvia stubLluvia = new Lluvia(25.0);
        Viento stubViento = new Viento(55.0);

        sistema.agregarCondicion(stubTemp);
        sistema.agregarCondicion(stubLluvia);
        sistema.agregarCondicion(stubViento);

        sistema.evaluarCondiciones();

        // Verificamos la salida esperada directamente con assertEquals
        assertEquals("Alerta: Alta Viento", alerta.getMensaje());
    }

    @Test
    void testSistemaConFake() {
        SistemaClimatico sistema = new SistemaClimatico();
        Alerta alerta = new Alerta(); // Usamos una implementación real para el observador
        sistema.agregarObservador(alerta);

        FakeCondicionesClimaticas fakeCondiciones = new FakeCondicionesClimaticas(25.0, 10.0, 40.0);

        sistema.agregarCondicion(fakeCondiciones.getTemperatura());
        sistema.agregarCondicion(fakeCondiciones.getLluvia());
        sistema.agregarCondicion(fakeCondiciones.getViento());

        sistema.evaluarCondiciones();

        // Verificamos la salida esperada directamente con assertEquals
        assertEquals("Alerta: Moderada Viento", alerta.getMensaje());
    }
}
