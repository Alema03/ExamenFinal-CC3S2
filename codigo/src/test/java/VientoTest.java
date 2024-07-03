

import org.example.Viento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VientoTest {
    @Test
    void testEsFuerte() {
        Viento viento = new Viento(55.0);
        assertTrue(viento.esAlta());
        assertFalse(viento.esModerada());
        assertFalse(viento.esBaja());
    }

    @Test
    void testEsModerado() {
        Viento viento = new Viento(30.0);
        assertTrue(viento.esModerada());
        assertFalse(viento.esAlta());
        assertFalse(viento.esBaja());
    }

    @Test
    void testEsDebil() {
        Viento viento = new Viento(10.0);
        assertTrue(viento.esBaja());
        assertFalse(viento.esModerada());
        assertFalse(viento.esAlta());
    }
}
