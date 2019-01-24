package pl.edu.pw.ii.pte.junit.money;

import static org.junit.Assert.*;
import org.junit.Test;

public class Money1Test {

	@Test
	public void testSimpleAdd() {
		Money1 m12CHF = new Money1(12, "CHF"); //
		Money1 m14CHF = new Money1(14, "CHF");
		Money1 expected = new Money1(25, "CHF");
		Money1 result = m12CHF.add(m14CHF); //
		assertTrue(expected.equals(result)); //
		}

	@Test
	public void testEquals() {
		Money1 m12CHF = new Money1(12, "CHF");
		Money1 m14CHF = new Money1(14, "CHF");

		assertTrue(!m12CHF.equals(null));
		assertEquals(m12CHF, m12CHF);
		assertEquals(m12CHF, new Money1(12, "CHF"));
		assertTrue(!m12CHF.equals(m14CHF));
		}
	
	@Test
	public void testMultiply() {
		Money1 m2PLZ= new Money1(2, "PLZ");
		int x = 4;
		Money1 expected= new Money1(8, "PLZ");
		Money1 result = m2PLZ.multiply(x);
		assertTrue (expected.equals(result));

		
	}

}