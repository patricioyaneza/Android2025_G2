import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumarResultadoCorrecto() {
		Calculadora c = new Calculadora();
		c.setValor1(1);
		c.setValor2(2);
		int resultado = c.sumar();
		assertEquals(3, resultado);
	}
	@Test
	void sumarResultadoInCorrecto() {
		Calculadora c = new Calculadora();
		c.setValor1(1);
		c.setValor2(1);
		int resultado = c.sumar();		
		assertNotEquals(3, resultado);
	}

	@Test
	void sumarResultadoNegativo() {
		Calculadora c = new Calculadora();
		c.setValor1(1);
		c.setValor2(-20);
		int resultado = c.sumar();
		assertTrue(resultado < 0, "El resultado NO es negativo");
	}
	@Test
	void sumarResultadoNegativoCuandoValoresSonNegativos() {
		Calculadora c = new Calculadora();
		c.setValor1(-2);
		c.setValor2(-2);
		int resultado = c.sumar();
		assertTrue(resultado == -4, "El resultado no es negativo si ambos numeros son negativos");
	}

	// Ejercicio 25:
	/*
	 * Crear 4 pruebas para multiplicar
	 * crear 4 pruebas para el metodo dividir
	 * 
	 */
    
    @Test
    public void restarNumerosPositivos() {
        Calculadora calc = new Calculadora(10, 5);
        int resultado = calc.restar();
        assertEquals(5, resultado, "La resta de 10 - 5 debe ser 5");
    }

    @Test
    public void restarNumerosNegativos() {
        Calculadora calc = new Calculadora(-3, -7);
        int resultado = calc.restar();
        assertEquals(4, resultado, "La resta de -3 - (-7) debe ser 4");
    }

    @Test
    public void restarConValor2Cero() {
        Calculadora calc = new Calculadora(8, 0);
        int resultado = calc.restar();
        assertEquals(8, resultado, "La resta de 8 - 0 debe ser 8");
    }

    @Test
    public void restarResultadoNegativo() {
        Calculadora calc = new Calculadora(2, 5);
        int resultado = calc.restar();
        assertEquals(-3, resultado, "La resta de 2 - 5 debe ser -3");
    }
    
    @Test
    void multiplicarResultadoCorrecto() {
	    Calculadora c = new Calculadora(4, 2);
	    int resultado = c.multiplicar();
	    assertEquals(8, resultado, "El producto entre 4 y 2 debe ser 8");
    }

    @Test
    void multiplicarResultadoInCorrecto() {
	    Calculadora c = new Calculadora(2, 1);
	    int resultado = c.multiplicar();
	    assertNotEquals(1, resultado, "El producto entre 2 y 1 debe ser 2");
    }

    @Test
    void multiplicarResultadoNegativo() {
	    Calculadora c = new Calculadora(-3, 3);
	    int resultado = c.multiplicar();
	    assertEquals(-9, resultado, "El producto entre -3 y 3 debe ser -9");
    }

    @Test
    void multiplicarResultadoPositivo() {
    Calculadora c = new Calculadora(-3, -3);
    int resultado = c.multiplicar();
    assertEquals(9, resultado, "El producto entre -3 y -3 debe ser 9");
    }

    @Test
    void multiplicarPorCero() {
    Calculadora c = new Calculadora(5, 0);
    int resultado = c.multiplicar();
    assertEquals(0, resultado, "El producto entre 5 y 0 debe ser 0");
    }
	

    @Test
    void dividirConDividendoCero() {
    	Calculadora calculadora = new Calculadora(0, 5);
        assertEquals(0, calculadora.dividir());
    }

    @Test
    void dividirNumerosPositivos() {
    	Calculadora calculadora = new Calculadora(10, 2);
        assertEquals(5, calculadora.dividir());
    }

    @Test
    void dividirResultadoNegativo() {
    	Calculadora calculadora = new Calculadora(10, -2);
        assertEquals(-5, calculadora.dividir());
    }

    @Test
    void dividirAmbosNegativos() {
    	Calculadora calculadora = new Calculadora(-10, -2);
        assertEquals(5, calculadora.dividir());
    }

    @Test
    void dividirEnterosSinDecimales() {
    	Calculadora calculadora = new Calculadora(7, 2);
        assertEquals(3, calculadora.dividir());
    }
}
