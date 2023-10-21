package exercise25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JetFuelTest {
/**
 * this is testing for constructor of class JetFuel
 */
	@Test
	void testConstructor() {
		new JetFuel(42000,"JetA1",4);
		new JetFuel(70000,"JetA1",4);
		new JetFuel(150000,"JetA1",4);
	}
/**
 * this is testing for method temporaryPrice()
 */
	@Test
	void testTemporaryPrice() {
		JetFuel f1 = new JetFuel(42000,"JetA1",4);
		JetFuel f2 = new JetFuel(70000,"JetA1",4);
		JetFuel f3 = new JetFuel(150000,"JetA1",4);
		assertEquals(f1.temporaryPrice(),168000);
		assertEquals(f2.temporaryPrice(),280000);
		assertEquals(f3.temporaryPrice(),600000);
	}
/**
 * this is testing for method discount()
 * 
 */
	@Test 
	void testDiscount() {
		JetFuel f1 = new JetFuel(42000,"JetA1",4);
		JetFuel f2 = new JetFuel(70000,"JetA1",4);
		JetFuel f3 = new JetFuel(150000,"JetA1",4);
		 assertEquals(f1.discount(),0.0);
		 assertEquals(f2.discount(),0.0);
		 assertEquals(f3.discount(),0.1);
	}
/**
 * this is testing for method totalPrice()
 */
	@Test
	void testTotalPrice() {
		JetFuel f1 = new JetFuel(42000,"JetA1",4);
		JetFuel f2 = new JetFuel(70000,"JetA1",4);
		JetFuel f3 = new JetFuel(150000,"JetA1",4);
		 assertEquals(f1.totalPrice(),168000);
		 assertEquals(f2.totalPrice(),280000);
		 assertEquals(f3.totalPrice(),540000);
	}
}
