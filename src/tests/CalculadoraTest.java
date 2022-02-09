package tests;

import org.junit.Test;
import tests.models.Calculadora;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumeros() throws Exception {
        int valorA = 1;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();

       assertEquals(3, calculadora.somar(valorA, valorB));
    }

}
