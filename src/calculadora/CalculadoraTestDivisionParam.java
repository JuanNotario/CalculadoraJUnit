package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestDivisionParam {
	
	private Integer num1, num2, resultado;

	public CalculadoraTestDivisionParam(Integer num1, Integer num2, Integer resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}

	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] { { 20, 2, 10}, 
											  { 5, 2, 2.5 }, 
											  { 60, 3, 20 } 					  
		});
	}

	@Test
	public void testDivision2() {
		Calculadora calcu = new Calculadora(num1, num2);
		int resultadoReal = calcu.suma();
		assertEquals(resultado, resultadoReal);
	}

}
