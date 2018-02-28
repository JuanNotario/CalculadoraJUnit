package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculadoraTestDivisionParam.class, CalculadoraTestMultParam.class, CalculadoraTestParam.class,
		CalculadoraTestRestaParm.class })
public class AllTests {

}
