package org.sisoftwa.solid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Recomendador {

	public List<Pelicula> recomendaciones (Cliente cliente) {
		List<Pelicula> recomendadas = new ArrayList<>();
		for (Pelicula favorita: cliente.getFavoritas()) {
			recomendadas.addAll(BBDD.PELIS_POR_DIRECTOR.get(favorita.getDirector()));
		}
		if (recomendadas.contains(BBDD.ET))
		recomendadas.remove(BBDD.ET);


		return recomendadas;
	}

	public String recomendacionesCSV (Cliente cliente) {

		return recomendaciones(cliente).stream()
				.map(p -> (p.getTitulo() + "," + p.getGenero() + "," + p.getDirector()))
				.collect(Collectors.joining("\n"));
	}
}