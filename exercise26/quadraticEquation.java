package exercise26;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class quadraticEquation {
	private int a;
	private int b;
	private int c;
/**
 * this is a constructor of class quadraticEquation
 * quadratic Equation have form a*x*x+b*x+c = 0
 * 
 * @param a
 * @param b
 * @param c
 * example
 *  new quadraticEquation(0,2,3);
 *  new quadraticEquation(1,3,3);
 *  new quadraticEquation(1,-8,16);
 *  new quadraticEquation(2,-7,3);
 * 
 */
	public quadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	private double delta;
/**
 * this are methods of class quadraticEquation
 * @return
 * example
 * 	new quadraticEquation(0,2,3);
 *  new quadraticEquation(1,3,3);
 *  new quadraticEquation(1,-8,16);
 *  new quadraticEquation(2,-7,3);
 *  	quadraticEquation e1 = new quadraticEquation(0,2,3);
 *  	quadraticEquation e2 = new quadraticEquation(1,3,3);
 * 	 	quadraticEquation e3 = new quadraticEquation(1,-8,16);
 *   	quadraticEquation e4 = new quadraticEquation(2,-7,3);
 *  
 *  this is example of method computeDelta
 *   	e1 not quadratic equation;
 *  	assertEquals(e2.computeDelta(),-3);
 * 	 	assertEquals(e3.computeDelta(),0);
 *  	assertEquals(e4.computeDelta(),25);
 *  
 *	this is example of method whatKind()
 *  	assertEquals(e1.whatKind(),"degenerate");
 *  	assertEquals(e2.whatKind(),"none");
 *  	assertEquals(e3.whatKind(),"4.0");
 *  	assertEquals(e4.whatKind(),"3.0 && 0.5");
 *   
 */
//  method compute value of delta
public double computeDelta() {
		return this.delta = this.b*this.b - 4*this.a*this.c;
	 }
// method determines what kind of quadratic equation
 public String whatKind() {
	 double delta = this.computeDelta();
	 if(this.a == 0) {
		 return "degenerate";
	 }
	 else if(this.delta < 0) {
		 return "none";
	 }
	 else if(this.delta == 0) {
// exchange x from double to String
		 double n = (-this.b)/(2*this.a);
		 String x = String.valueOf(n);
		 return  x ;	 
		 }
	 else {
// exchange x1 and x2 from double to String
		 double n1 = (-this.b+Math.sqrt(delta))/(2*a);
		 String x1 = String.valueOf(n1);
		 double n2 = (-this.b-Math.sqrt(delta))/(2*a);
		 String x2 = String.valueOf(n2);
		 return x1+ " & " +x2;
		 
		 
		 
	 }
	 
 }
 
}
