package exercise26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class quadraticEquationTest {
/**
 * this is testing constructor of class quadraticEquation
 */

	@Test
	void testConstructor() {
		 new quadraticEquation(0,2,3);
		 new quadraticEquation(1,3,3);
		 new quadraticEquation(1,-8,16);
		 new quadraticEquation(2,-7,3);
	}
/**
* this is testing for method computeDelta()
*/
	@Test
	void testComputeDelta() {
		quadraticEquation e2 = new quadraticEquation(1,3,3);
		quadraticEquation e3 = new quadraticEquation(1,-8,16);
		quadraticEquation e4 = new quadraticEquation(2,-7,3);
		assertEquals(e2.computeDelta(),-3);
		assertEquals(e3.computeDelta(),0);
		assertEquals(e4.computeDelta(),25);
	}
/**
 * this is testing for method whatKind()
 */
	@Test
	void testWhatkKind() {
		quadraticEquation e1 = new quadraticEquation(0,2,3);
		quadraticEquation e2 = new quadraticEquation(1,3,3);
		quadraticEquation e3 = new quadraticEquation(1,-8,16);
		quadraticEquation e4 = new quadraticEquation(2,-7,3);
		assertEquals(e1.whatKind(),"degenerate");
		assertEquals(e2.whatKind(),"none");
		assertEquals(e3.whatKind(),"4.0");
		assertEquals(e4.whatKind(),"3.0 & 0.5");
		
	}
}
