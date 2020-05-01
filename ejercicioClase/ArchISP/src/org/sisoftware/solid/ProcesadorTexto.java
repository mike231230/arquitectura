package org.sisoftware.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTexto implements basica {


	private List<String> texto = new ArrayList<>();

	public void nueva(String palabra) {
		texto.add(palabra);
	}

	public String texto() {
		return texto.stream().collect(Collectors.joining(" "));
	}

}
