package org.sisoftwa.solid;
import org.sisoftwa.solid.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class recomendacionesCSV {



   /* public List<Pelicula> recomendaciones(Cliente cliente) {
        List<Pelicula> recomendadas = new ArrayList<>();
        for (Pelicula favorita: cliente.getFavoritas()) {
            if (recomendadas.isEmpty()) {
                recomendadas.addAll(BBDD.PELIS_POR_DIRECTOR.get(favorita.getDirector()));
            }else if (recomendadas.contains(BBDD.ET)){
                recomendadas.add(BBDD.SOLDADO_RYAN);
            }
            recomendadas.removeAll(cliente.getFavoritas());
        }
        return recomendadas;

    }*/
   Recomendador recomendador=new Recomendador();


    public String recomendacionesCSV(Cliente cliente) {
        return recomendador.recomendaciones(cliente).stream()
                .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
                .collect(Collectors.joining("\n"));
    }

}
