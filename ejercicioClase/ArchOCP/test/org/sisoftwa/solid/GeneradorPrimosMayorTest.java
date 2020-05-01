package org.sisoftwa.solid;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class GeneradorPrimosMayorTest {

    @Test
    public void test_orden_inverso() {
        GeneradorPrimosMayor generador = new GeneradorPrimosMayor();
        List<Integer> expected = Arrays.asList(13,11,7,5,3,2);
        MatcherAssert.assertThat(generador.primos(15), is(expected));
    }

}