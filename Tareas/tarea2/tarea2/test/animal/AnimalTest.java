package animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void alimentarse() {

        String mensajetest;
        String mensaje="estoy comiendo";
        Animal animal=new Animal();
        mensajetest=animal.alimentarse();
        assertEquals(mensaje,mensajetest);
    }

    @Test
    void desplazarse() {
    String arrayTest;
    Animal animal=new Animal();
    arrayTest=animal.desplazarse(4,3);
    String test="estoy aqui; 4 3";
    assertEquals(test,arrayTest);



    }

    @Test
    void dormir() {
    }
}