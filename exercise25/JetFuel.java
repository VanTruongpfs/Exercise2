package exercise25;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JetFuel {
	private int quantitySold;
	private String qualityLevel ;
	private int basePrice; 
/**
 * this is a constructor of class JetFuel
 * 
 * @param quantitySold
 * @param qualityLevel
 * @param basePrice
 * example:
 * 	new JetFuel(42000,"JetA1",4);
 * 	new JetFuel(70000,"JetA1",4);
 * 	new JetFuel(150000,"JetA1",4);
 * 	
 */
	public JetFuel(int quantitySold, String qualityLevel, int basePrice) {
		this.quantitySold = quantitySold;
		this.qualityLevel = qualityLevel;
		this.basePrice = basePrice;
	}
/**
 * this are methods of class JetFuel()
 * @return
 * example:
 * 	JetFuel f1 = new JetFuel(42000,"JetA1",4);
 * 	JetFuel f2 = new JetFuel(70000,"JetA1",4);
 * 	JetFuel f3 = new JetFuel(150000,"JetA1",4);
 * 
 * this is example of method temporaryPrice()
 * 	assertEquals(f1.temporaryPrice(),168000);
 * 	assertEquals(f2.temporaryPrice(),280000);
 * 	assertEquals(f3.temporary(),600000);
 * 
 * this is example of method discount()
 *  assertEquals(f1.discount(),0.0);
 *  assertEquals(f2.discount(),0.0);
 *  assertEquals(f3.discount(),0.1);
 *  
 * this is example of method totalPrice()
 *  assertEquals(f1.totalPrice(),168000);
 *  assertEquals(f2.totalPrice(),280000);
 *  assertEquals(f3.totalPrice(),540000);
 */
//method determines value temporary price
 public double temporaryPrice() {
	 return this.quantitySold*this.basePrice;
 }
//method determines value discount
 public double discount() {
	 if(this.quantitySold>100000) {
		 return 0.1;
	 }
	 else {
		 return 0.0;
	 }
 }
//method determines value toltal price
 public double totalPrice() {
	 return this.temporaryPrice()-this.temporaryPrice()*this.discount();
 }
 }

