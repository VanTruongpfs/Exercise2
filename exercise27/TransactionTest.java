package exercise27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransactionTest {
/**
 * this is testing for constructor
 */
	@Test
	void testConstructor() {
		new Transaction("Truong", 6000, 2);
		new Transaction("Long", 2500, 1);
		new Transaction("Anh", 1500, 2);
		new Transaction("Huy", 500, 2);
	}
/**
 * this is testing for method interest()
 */
	@Test
	void testInterest() {
		Transaction t1 = new Transaction("Truong", 6000, 2);
		Transaction t2 = new Transaction("Long", 2500, 1);
		Transaction t3 = new Transaction("Anh", 1500, 2);
		Transaction t4 = new Transaction("Huy", 500, 2);
		assertEquals(t1.interest(),300,0.001);
		assertEquals(t2.interest(),112.5,0.001);
		assertEquals(t3.interest(),67.5,0.001);
		assertEquals(t4.interest(),20,0.001);
	}
/**
 * this is testing for method payBack()
 */
	@Test
	void testPayBack() {
		Transaction t1 = new Transaction("Truong", 6000, 2);
		Transaction t2 = new Transaction("Long", 2500, 1);
		Transaction t3 = new Transaction("Anh", 1500, 2);
		Transaction t4 = new Transaction("Huy", 500, 2);
		assertEquals(t1.payBack(),48.75,0.001);
		assertEquals(t2.payBack(),13.75,0.001);
		assertEquals(t3.payBack(),6.25,0.001);
		assertEquals(t4.payBack(),1.25,0.001);
	}

}
