package exercise27;

public class Transaction {
	private String customerName;
	private double depositAmount;
	private int maturity;
/**
 * this is constructor of class Transaction
 * 
 * @param customerName : customer name
 * @param depositAmount: deposit amount
 * @param maturity: maturity
 * example:
 * 	new Transaction("Truong", 6000, 2);
 * 	new Transaction("Long", 2500, 1);
 * 	new Transaction("Anh", 1500, 2);
 * 	new Transaction("Huy", 500, 2);
 */
	public Transaction(String customerName, double depositAmount, int maturity) {
		this.customerName = customerName;
		this.depositAmount = depositAmount;
		this.maturity = maturity;
	}
/**
 * this are methods of class Transaction
 * @return
 * example:
 * 	new Transaction("Truong", 6000, 2);
 * 	new Transaction("Long", 2500, 1);
 * 	new Transaction("Anh", 1500, 2);
 * 	new Transaction("Huy", 500, 2);
 * 	 Transaction t1 = new Transaction("Truong", 6000, 2);
 * 	 Transaction t2 = new Transaction("Long", 2500, 1);
 * 	 Transaction t3 = new Transaction("Anh", 1500, 2);
 * 	 Transaction t4 = new Transaction("Huy", 500, 2);
 * 
 * this is example of method interest()
 * 	 assertEquals(t1.interest(),300,0.001);
 * 	 assertEquals(t2.interest(),112.5,0.001);
 * 	 assertEquals(t3.interest(),67.5,0.001);
 * 	 assertEquals(t4.interest(),20,0.001);
 * 
 * this is example of method payBack()
 *   assertEquals(t1.payBack(),48.75,0.001);
 *   assertEquals(t2.payBack(),13.75,0.001);
 *   assertEquals(t3.payBack(),6.25,0.001);
 *   assertEquals(t4.payBack(),1.25,0.001);
 */ 
// method determines interest
	public double interest() {
		if ( this.depositAmount <= 1000) {
			return this.depositAmount * 0.04;
		}else if(this.depositAmount <= 5000) {
			return this.depositAmount * 0.045 ;
		}else {
			return this.depositAmount * 0.05 ;
		}
	
	}
// method which consumes a charge amount and computes the corresponding pay-back amount.
	double payBack() {
		if (this.depositAmount <= 500) {
			return this.depositAmount * 0.0025;
		}else if (this.depositAmount <= 1500) {
			return 500 * 0.0025 + (this.depositAmount - 500)* 0.005 ;
		}else if (this.depositAmount <= 2500 ) {
			return 500 * 0.0025 + 1000 * 0.005 + (this.depositAmount -1500)* 0.0075;
		}else {
			return 500 * 0.0025 + 1000 * 0.005 + 1000 * 0.0075 + (this.depositAmount - 2500)* 0.01;
		}
}
}