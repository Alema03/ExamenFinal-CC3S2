

import org.example.Lluvia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LluviaTest {
    @Test
    void testEsIntensa() {
        Lluvia lluvia = new Lluvia(25.0);
        assertTrue(lluvia.esAlta());
        assertFalse(lluvia.esModerada());
        assertFalse(lluvia.esBaja());
    }

    @Test
    void testEsModerada() {
        Lluvia lluvia = new Lluvia(15.0);
        assertTrue(lluvia.esModerada());
        assertFalse(lluvia.esAlta());
        assertFalse(lluvia.esBaja());
    }

    @Test
    void testEsBaja() {
        Lluvia lluvia = new Lluvia(3.0);
        assertTrue(lluvia.esBaja());
        assertFalse(lluvia.esModerada());
        assertFalse(lluvia.esAlta());
    }
}
