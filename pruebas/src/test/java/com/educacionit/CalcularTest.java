package com.educacionit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularTest {

    @Test
void testSumar(){
    Calcular calc=new Calcular();
assertEquals(4,calc.sumar(2,2),"2+2 tiene que dar 4");
}
    
}