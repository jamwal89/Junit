import static org.junit.Assert.*;

import org.junit.Test;




public class TestUnit {
	Calculator C = new Calculator();
	@Test
	
	
	public void additionTest() {	
		int result = C.addition(9, 3);
		assertTrue(result==12);
	
	}
	@Test
	public void multiplicationTest() {
		int result =C.multiplication(5, 6);
		assertTrue(result==30);
	}
	
	@Test
	public void divisionTest() {
		int  result = C.division(10, 5);
		assertTrue(result==2);
	}
}




