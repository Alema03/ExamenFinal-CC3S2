

import org.example.Temperatura;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturaTest {
    @Test
    void testEsAlta() {
        Temperatura temp = new Temperatura(35.0);
        assertTrue(temp.esAlta());
        assertFalse(temp.esModerada());
        assertFalse(temp.esBaja());
    }

    @Test
    void testEsModerada() {
        Temperatura temp = new Temperatura(20.0);
        assertTrue(temp.esModerada());
        assertFalse(temp.esAlta());
        assertFalse(temp.esBaja());
    }

    @Test
    void testEsBaja() {
        Temperatura temp = new Temperatura(5.0);
        assertTrue(temp.esBaja());
        assertFalse(temp.esModerada());
        assertFalse(temp.esAlta());
    }
}
