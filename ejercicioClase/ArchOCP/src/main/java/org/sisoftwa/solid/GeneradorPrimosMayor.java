package org.sisoftwa.solid;

import java.util.ArrayList;
import java.util.List;

public class GeneradorPrimosMayor implements primo {



    public List<Integer> primos(int limit) {
        List<Integer> primos = new ArrayList<Integer>();
        for (int i = limit; i >= 2; i--) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }



    public boolean esPrimo(int candidato) {
        for (int i = 2; i < candidato; i++) {
            if (candidato % i == 0) {
                return false;
            }
        }
        return true;
    }
}



