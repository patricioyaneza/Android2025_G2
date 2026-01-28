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
	
	// Ejercicio 25:
	/*
	 * Crear 2 pruebas para restar, multiplicar
	 * crear 3 pruebas para el metodo dividir
	 * 
	 */
}
