package com.educacionit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testDivisionCorrecta() {
        Calculadora c = new Calculadora();
        assertEquals(5, c.dividir(10, 2));
    }

    @Test
    void testDivisionPorCero() {
        Calculadora c = new Calculadora();
        assertThrows(ArithmeticException.class, () -> c.dividir(10, 0));
    }
}