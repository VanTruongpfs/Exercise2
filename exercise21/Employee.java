package exercise21;

public class Employee {
	private String name;
	private int numberOfHours;
/**
 * this is a constructor of Employee
 * 
 * @param name
 * @param numberOfHours 
 * @param wage
 * ex:
 * 	new Employee("Nam",20);
 * 	new Employee("Mai",30);
 * 	new Employee("Minh",102);
 */
	public Employee(String name, int numberOfHours) {
		this.name = name;
		this.numberOfHours = numberOfHours;
	}
/**
 * this is a method of class Employee
 * 
 * example:
 *  Employee a1 = new Employee("Nam",20);
 *  Employee a2 = new Employee("Mai",30);
 *  Employee a3 = new Employee("Minh",102);
 *  
 *  this is example of method wage():
 *  	assertEquals(a1.wage(12),240); 
 *  	assertEquals(a2.wage(12),360); 
 *  	assertEquals(a3.wage(12),1224);
 *  
 *  this is example of method tax():
 *  	assertEquals(a1.getTax(12,0.15),36,0.001);
 *  	assertEquals(a2.getTax(12,0.15),54,0.001);
 *  	assertEquals(a3.getTax(12,0.15),183.6,0.001);
 *  
 *  this is example of method netPay():
 *  	assertEquals(a1.netPay(12,0.15),204);
 *  	assertEquals(a2.netPay(12,0.15),306);
 *  	assertEquals(a3.netPay(12,0.15),1040.4);
 *  
 *  this is example of method raiseWage():
 *  	assertEquals(a1.raiseWage(12,0.15,14),218);
 *  	assertEquals(a2.raiseWage(12,0.15,14),320);
 *  	assertEquals(a3.raiseWage(12,0.15,14),1054.4);
 *  
 *  this is example of method isOverTime():
 *  	assertFalse(a1.isOverTime(100));
 *  	assertFalse(a2.isOverTime(100));
 *  	assertTrue(a3.isOverTime(100));
 *  
 *  this is example of method taxWithRate():
 * 		assertEquals(a1.taxWithRate(12),0.0,0.001);
 * 		assertEquals(a2.taxWithRate(12),54,0.001);
 * 		assertEquals(a3.taxWithRate(12),342.72,0.001);
 * 
 *  this is example of method netPayWithRate():
 *  	assertEquals(a1.netPayWithRate(12),240);
 *  	assertEquals(a2.netPayWithRate(12),306);
 *  	assertEquals(a3.netPayWithRate(12),881.28);
 */
//	Determines the wage of an employee from the number of hours of work. Suppose 12 dollars per hour.
	public double wage(double salaryPerHour) {
		return this.numberOfHours*salaryPerHour;
	}
//	Utopia's tax accountants always use programs that compute income taxes even though the tax rate is a solid, 
//	never-changing 15%. Determine the tax on the gross pay.
	public double getTax(double salaryPerHour,double tax) {
		return this.wage(salaryPerHour)*tax;
	}
//	Also determine netpay of an employee from the number of hours worked base on gross pay and tax .	
	public double netPay(double salaryPerHour,double tax) {
		return this.wage( salaryPerHour)-this.getTax(salaryPerHour, tax);
	}
//	Determine the raised wage to $14 for everyone 
	public double raiseWage(double salaryPerHour,double tax,int bonus) {
		return this.netPay(salaryPerHour, tax)+bonus;
	}
// 	Determines whether the number of hours of work exceeds 100
	public boolean isOverTime(int limitTime) {
		return this.numberOfHours > limitTime;
	}
//	Develop the method tax, which consumes the gross pay and produces the amount of tax owed.
	public double taxWithRate(double salaryPerHour) {
		double grossPay = this.wage(salaryPerHour);
		if(grossPay <= 240) {
			return 0.0;}
		else if(grossPay >240 && grossPay<= 480) {
			return grossPay*0.15;}
		else {
			return grossPay*0.28;
		}
		
	}
//	The method determines the net pay of an employee from the number of hours worked.
	public double netPayWithRate(double salaryPerHour) {
		return this.wage(salaryPerHour)-this.taxWithRate(salaryPerHour);
	}
}


