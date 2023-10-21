package exercise22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PerformancesTest {
/**
 * this is a constructor test of MovieTheater
 * 
 */
	@Test
	void testConstructor() {
		new Performances(5, 20, 0.5);
		new Performances(5, 20, 0.5);
		new Performances(5, 20, 0.5);
	}
/**
 * this is test for method totalProfit
 */
	@Test
	void testTotalProfit() {
		Performances mt1 = new Performances(5, 20, 0.5);
		Performances mt2 = new Performances(5, 20, 0.5);
		Performances mt3 = new Performances(5, 20, 0.5);
		assertEquals(mt1.totalProfit(40),160);
		assertEquals(mt2.totalProfit(50),205);
		assertEquals(mt3.totalProfit(60),250);
	}
}
