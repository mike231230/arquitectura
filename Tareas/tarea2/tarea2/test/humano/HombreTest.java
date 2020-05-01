package humano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HombreTest {



    @Test
    void engordar() {
        int peso=humano.Hombre.engordar(15);
        assertEquals(20,peso);
    }


}