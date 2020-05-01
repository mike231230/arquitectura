import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.sisoftwa.solid.*;
import java.util.List;

class RecomendadorTest {
    Recomendador r;
    recomendacionesCSV rs;

    @BeforeEach
    void mySetUp() {
        r = new Recomendador();
        rs=new recomendacionesCSV();
    }

    @Test
    public void test() {
        List<Pelicula> recomenaciones = r.recomendaciones(BBDD.JUAN);
        assertFalse(recomenaciones.contains(BBDD.ET));
        //assertTrue(recomenaciones.contains(BBDD.ET));
    }

    @Test
    public void test_formato() {
        String csv = rs.recomendacionesCSV(BBDD.JUAN);
        System.out.println(csv);
        String esperado = "Salvar al soldado Ryan,Spielberg,belico";
        assertEquals(esperado, csv);
        //assertNotEquals(esperado, csv);
    }

}