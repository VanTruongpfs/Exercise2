package exercise23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImageTest {
/**
 * this is a constructor test for class Image
 */
	@Test
	void testConstructor() {
		Image i1 = new Image(5, 10, "small.gif", "low");
		Image i2 = new Image(200, 120, "med.gif", "low");
		Image i3 = new Image(1000, 1200, "large.gif", "high");
		
	}
/**
 * this is a test for method isPortrait()
 */
	@Test
	void testIsPortrait() {
		Image i1 = new Image(5, 10, "small.gif", "low");
		Image i2 = new Image(200, 120, "med.gif", "low");
		Image i3 = new Image(1000, 1200, "large.gif", "high");
		assertTrue(i1.isPortrait());
		assertFalse(i2.isPortrait());
		assertTrue(i3.isPortrait());
	}
/**
 * this is test for method size()
 */
	@Test
	void testSize() {
		Image i1 = new Image(5, 10, "small.gif", "low");
		Image i2 = new Image(200, 120, "med.gif", "low");
		Image i3 = new Image(1000, 1200, "large.gif", "high");
		assertEquals(i1.size(),50);
		assertEquals(i2.size(),24000);
		assertEquals(i3.size(),1200000);
}
/**
 * this is test for method isLarger()
 */
	@Test
	void testIsLarger() {
		Image i1 = new Image(5, 10, "small.gif", "low");
		Image i2 = new Image(200, 120, "med.gif", "low");
		Image i3 = new Image(1000, 1200, "large.gif", "high");
		assertFalse(i1.isLarger(i2));
		assertTrue(i3.isLarger(i2));
		assertTrue(i3.isLarger(i1));
		
	}
/**
* this is test for method same()
*/
	@Test
	void testSame() {
		Image i1 = new Image(5, 10, "small.gif", "low");
		Image i2 = new Image(200, 120, "med.gif", "low");
		Image i3 = new Image(1000, 1200, "large.gif", "high");
		assertFalse(i1.same(i2));
		assertFalse(i1.same(i3));
		assertFalse(i3.same(i2));
	}
}