package dev.anto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcularImcTest {
    
    @Test
    public void testCalcularImc(){
        assertEquals(24.80, CalcularImc.calcularImc(70, 1.68),0.01);
        assertEquals(22.49, CalcularImc.calcularImc(65, 1.70), 0.01);
    
    }

    @Test
    public void testNivelPeso() {
        assertEquals("Delgadez severa", CalcularImc.nivelPeso(15));
        assertEquals("Obesidad mórbida", CalcularImc.nivelPeso(45));
        
    }
}
