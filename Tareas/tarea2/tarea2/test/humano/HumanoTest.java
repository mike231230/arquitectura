package humano;

import acciones.AccionesHumano;
import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanoTest {

    @Test
    void bailar() {
        String mensaje="estoy bailando";
        String mensajetest;
        Humano humano = new Humano("miguel",23,1.80);
        mensajetest=humano.bailar();
        assertEquals(mensaje,mensaje);
        System.out.println(mensajetest);

    }

    @Test
    void trabajar() {
        String mensaje="estoy trabajando";
        String mensajetest;
        Humano humano=new Humano("luis",24,1.81);
        mensajetest=humano.trabajar();
        assertEquals(mensaje,mensajetest);
        System.out.println(mensajetest);
    }

    @Test
    void alimentarse() {
        String mensajetest="comida chilanga";
        String mensaje;
        Humano human=new Humano("javiero",40,1.70);
        mensaje=human.alimentarse();

    }

    @Test
    void desplazarse() {
        String arrayTest;
        Humano humano=new Humano("jose",18,1.68);
        arrayTest=humano.desplazarse(4,3);
        String test="estoy aqui; 4 3";
        assertEquals(test,arrayTest);


    }

    @Test
    void dormir() {
       String mensajeTest;
        Humano humano=new Humano("karen",25,1.70);
        mensajeTest=humano.dormir();
        assertEquals("Zzzzzz",mensajeTest);
        System.out.println(mensajeTest);

    }

    @Test
    void getNombre() {
    }

    @Test
    void setNombre() {
    }

    @Test
    void getEdad() {
    }

    @Test
    void setEdad() {
    }

    @Test
    void getEstatura() {
    }

    @Test
    void setEstatura() {
    }
}