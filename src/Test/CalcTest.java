package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import calc.Calc;

public class CalcTest {
	
	

	@Test
	public void shouldReturnJuniorMoney(){
		assertEquals(30, Calc.payToJunior(3));
	}
	@Test
	public void shouldAddBonusMoneyToJunior(){
		assertEquals(370, Calc.payToJunior(22));
	}
	@Test
	public void shouldAddOverHourMoneyToJunior(){
		assertEquals(120, Calc.payToJunior(10));
	}
	@Test
	public void shoultReturnSeniorMoney(){
		assertEquals(605, Calc.payToSenior(3));
	}
	@Test
	public void shouldAddBonusMoneyToSenior(){
		assertEquals(560, Calc.payToSenior(22));
	}
	@Test
	public void shouldAddOverHourMoneyToSenior(){
		assertEquals(180, Calc.payToSenior(10));
	}
	@Test
	public void shouldReturnSpecialistMoney(){
		assertEquals(66, Calc.payToSpecialist(3));
	}
	@Test
	public void shouldAddBonusMoneyToSpecialist(){
		assertEquals(1086, Calc.payToSpecialist(22));
	}
	@Test
	public void shouldAddOverHourMoneyToSpecialist(){
		assertEquals(264, Calc.payToSpecialist(10));
	}
}
