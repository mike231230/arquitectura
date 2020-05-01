import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.MatcherAssert;
import org.sisoftwa.solid.GeneradorPrimos;
import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;

class GeneradorPrimosTest {
    @Test
    public void test_orden_natural() {
        GeneradorPrimos generador = new GeneradorPrimos();
        List<Integer> expected = Arrays.asList(2,3,5,7,11,13);
        MatcherAssert.assertThat(generador.primos(15), is(expected));
    }

    @Test
    public void test_orden_inverso() {
        GeneradorPrimos generador = new GeneradorPrimos();
        List<Integer> expected = Arrays.asList(13,11,7,5,3,2);
        MatcherAssert.assertThat(generador.primos(15), is(expected));
    }
}