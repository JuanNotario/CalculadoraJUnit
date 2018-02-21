package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calcu;

	@Before
	public void creaCalculadora() {
		calcu = new Calculadora(20, 30);
		//System.out.println("Inicio prueba");
	}
	
	@After
	public void borraCalculadora() {
		calcu = null;
		//System.out.println("Fin Prueba");
	}
	
	public void testSuma() {
		//Calculadora calcu = new Calculadora(20, 30);
		int resultado = calcu.suma();
		assertEquals(50, resultado);
	}

	@Test
	public void testResta() {
		//Calculadora calcu = new Calculadora(20, 30);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}
	
	@Test
	public void testNum1EsMayor() {
		//Calculadora calcu = new Calculadora(20, 30);
		boolean resultado = calcu.num1EsMayor();
		//assertTrue("No es verdadero", resultado);
		assertFalse(resultado);
	}

	@Test
	public void testMultiplicacion() {
		//Calculadora calcu = new Calculadora(5, 5);
		int resultado = calcu.multiplicacion();
		assertEquals("Fallo en la multiplicación", 600, resultado);
	}

	@Test
	public void testDivision() {
		//Calculadora calcu = new Calculadora(20, 30);
		int resultado = calcu.division();
		assertEquals(0, resultado);
	}
	
	@Test
	public void testDivisionPorCero() {
		try {
			//Calculadora calcu = new Calculadora(8,0);
			int resultado = calcu.division();
		} catch (ArithmeticException e) {
			//Prueba satisfactoria
			fail("FALLO");
		}
	}
	
	@Test
	public void testDivision2() {
		//Calculadora calcu = new Calculadora(20, 0);
		Integer resultado = calcu.division2();
		assertNotNull(resultado);
	}
	
	/*@Test(expected = java.lang.ArithmeticException.class)
	public void testDivision3() {
		//Calculadora calcu = new Calculadora(20, 0);
		int resultado = calcu.division3();
	}*/
}
