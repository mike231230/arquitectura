import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.sisoftware.solid.Idioma;
import org.sisoftware.solid.ProcesadorTexto;
import org.sisoftware.solid.correctivo;
public class TestProcesadorTexto {
	@Test
	public void test_simple() {
		ProcesadorTexto procesador = new ProcesadorTexto();
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma() {
		correctivo procesador = new correctivo();
		procesador.nueva("Tengo");
		procesador.nueva("hambre");
		assertEquals("Tengo hambre", procesador.texto());
		assertTrue(procesador.correcto(Idioma.ES));
	}
}
