package exercise24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeTest {
/**
 * this is a constructor test for class Coffee
 */
	@Test
	void testConstructor() {
		new Coffee("Hawaiian Kona", 15.95, 100);
		new Coffee("Ethiopian", 8.00, 1000);
		new Coffee("Colombia Supreme", 9.50, 2500);
	}
/**
 * this is a test for method temporaryPrice()
 */
	@Test
	void testTemporaryPrice() {
		Coffee c1 = new Coffee("Hawaiian Kona", 15.95, 100);
		Coffee c2 = new Coffee("Ethiopian", 8.00, 1000);
		Coffee c3 =	new Coffee("Colombia Supreme", 9.50,2500);
		assertEquals(c1.temporaryPrice(),1595);
		assertEquals(c2.temporaryPrice(),8000);
		assertEquals(c3.temporaryPrice(),23750);
	}
/**
 * this is a test for method discount()
 */
	@Test
	void testDiscount() {
		Coffee c1 = new Coffee("Hawaiian Kona", 15.95, 100);
		Coffee c2 = new Coffee("Ethiopian", 8.00, 1000);
		Coffee c3 =	new Coffee("Colombia Supreme", 9.50,2500);
		assertEquals(c1.discount(),0.0);
		assertEquals(c2.discount(),0.1);
		assertEquals(c3.discount(),0.25);
	}
/**
 * this is a test for method totalPrice()
 */
	@Test
	void testTotalPrice() {
		Coffee c1 = new Coffee("Hawaiian Kona", 15.95, 100);
		Coffee c2 = new Coffee("Ethiopian", 8.00, 1000);
		Coffee c3 =	new Coffee("Colombia Supreme", 9.50,2500);
		assertEquals(c1.totalPrice(),1595,0.001);
		assertEquals(c2.totalPrice(),7200,0.001);
		assertEquals(c3.totalPrice(),17812.5,0.001);
	}
			
}
