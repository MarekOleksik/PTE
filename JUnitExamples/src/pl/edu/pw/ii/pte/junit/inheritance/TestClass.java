package pl.edu.pw.ii.pte.junit.inheritance;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

	
	@Test
	public void czyZgadzaSieNazwisko() {
		
		Manager boss = new Manager("Carl Cracker", 0, 1987, 12, 15);
		
		
		Assert.assertEquals("Carl Cracker", boss.getName());
	}
	
	@Test
	public void czyZgadzaSieWynagrodzenie(){
		Manager boss = new Manager("Carl Cracker", 10, 1987, 12, 15);
		
		Assert.assertEquals(10, boss.getSalary(),0);
		
	}
	
	@Test
	public void czyZgadzaSieDataZatrudnienia(){
		Manager boss = new Manager("Carl Cracker", 10, 1990, 03, 15);
		
		Assert.assertEquals("Thu Mar 15 00:00:00 CET 1990", boss.getHireDay().toString());
		
	}
	
	@Test
	public void czyZgadzaSieWynagrodzeniePoPodwy┐ce(){
		Manager boss = new Manager("Carl Cracker", 100, 1990, 03, 15);
		boss.raiseSalary(50);
		
		Assert.assertEquals(150, boss.getSalary(),0);
		
	}
	
	@Test
	public void czyZgadzaSieWynagrodzenieZBonusem(){
		Manager boss = new Manager("Carl Cracker", 100, 1990, 03, 15);
		boss.setBonus(500);
		
		Assert.assertEquals(600, boss.getSalary(),0);
		
	}
}
