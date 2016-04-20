package ar.edu.tw1tm.unlam.www;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void test() {
		Cuadrado nuevoCuadrado = new Cuadrado();
		Double expected = 16.00;
		Double result = nuevoCuadrado.resultadoPerimetro(4.00);
		
		//assert.assertEquals(expected, result);
		assert.assertTrue(expected == result);
	}

}
