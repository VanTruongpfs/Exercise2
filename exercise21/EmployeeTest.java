package exercise21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {
/**
 * this is a constructor test for Employee
 */

	@Test
	void testConstructor() {
		Employee a1 = new Employee("Nam",20);
		Employee a2 = new Employee("Mai",30);
		Employee a3 = new Employee("Minh",102);
		
	}
/**
 * this is a test for method getWage()
 */
	@Test
	void testWage() {
		Employee a1 = new Employee("Nam",20);
		Employee a2 = new Employee("Mai",30);
		Employee a3 = new Employee("Minh",102);
		assertEquals(a1.wage(12),240); 
		assertEquals(a2.wage(12),360); 
		assertEquals(a3.wage(12),1224);
}
/**
 * this is test for method getTax() 
 */
	@Test
	void testTax() {
		Employee a1 = new Employee("Nam",20);
		Employee a2 = new Employee("Mai",30);
		Employee a3 = new Employee("Minh",102);
		assertEquals(a1.getTax(12,0.15),36,0.001);
		assertEquals(a2.getTax(12,0.15),54,0.001);
		assertEquals(a3.getTax(12,0.15),183.6,0.001);
	}
 /**
  * this is a test for method netPay()
  */
	@Test
	void testNetPay() {
		Employee a1 = new Employee("Nam",20);
		Employee a2 = new Employee("Mai",30);
		Employee a3 = new Employee("Minh",102);
		assertEquals(a1.netPay(12,0.15),204);
		assertEquals(a2.netPay(12,0.15),306);
		assertEquals(a3.netPay(12,0.15),1040.4);
	}
/**
* this is a test for method raiseWage()
*/
	@Test
	void testRaiseWage() {
		Employee a1 = new Employee("Nam",20);
		Employee a2 = new Employee("Mai",30);
		Employee a3 = new Employee("Minh",102);
		assertEquals(a1.raiseWage(12,0.15,14),218);
		assertEquals(a2.raiseWage(12,0.15,14),320);
		assertEquals(a3.raiseWage(12,0.15,14),1054.4);
	}
/**
* this is a test for method IsOverTime()
*/
	@Test
	void testIsOverTime() {
		Employee a1 = new Employee("Nam",20);
		Employee a2 = new Employee("Mai",30);
		Employee a3 = new Employee("Minh",102);
		assertFalse(a1.isOverTime(100));
		assertFalse(a2.isOverTime(100));
		assertTrue(a3.isOverTime(100));
	}
/**
* this is a test for method taxWithRate()
*/
	@Test
	void testTaxWithRate() {
		Employee a1 = new Employee("Nam",20);
		Employee a2 = new Employee("Mai",30);
		Employee a3 = new Employee("Minh",102);
		assertEquals(a1.taxWithRate(12),0.0,0.001);
		assertEquals(a2.taxWithRate(12),54,0.001);
		assertEquals(a3.taxWithRate(12),342.72,0.001);
	}
/**
* this is a test for method netPayWithRate()
*/
	@Test
	void testNetPayWithRate() {
		Employee a1 = new Employee("Nam",20);
		Employee a2 = new Employee("Mai",30);
		Employee a3 = new Employee("Minh",102);
		assertEquals(a1.netPayWithRate(12),240);
		assertEquals(a2.netPayWithRate(12),306);
		assertEquals(a3.netPayWithRate(12),881.28);
	}
	
}