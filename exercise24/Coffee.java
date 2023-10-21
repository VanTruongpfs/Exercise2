package exercise24;

public class Coffee {
		private String kindOfCoffee ;
		private double unitPrice;
		private double totalAmount;
/**
 * this is a constructor of class Coffee
 * @param kindOfCoffee
 * @param unitPrice
 * @param totalAmount
 * example:
 *  new Coffee("Hawaiian Kona", 15.95, 100);
 *  new Coffee("Ethiopian", 8.00, 1000);
 *  new Coffee("Colombia Supreme", 9.50, 2500);
 */
	public Coffee(String kindOfCoffee, double unitPrice, double totalAmount) {
		this.kindOfCoffee = kindOfCoffee;
		this.unitPrice = unitPrice;
		this.totalAmount = totalAmount;
	}
/**
 * this are method of class BulkCoffe
 * @return
 * example:
 *  Coffee c1 = new Coffee("Hawaiian Kona", 15.95, 100);
 *  Coffee c2 = new Coffee("Ethiopian", 8.00, 1000);
 *  Coffee c3 =	new Coffee("Colombia Supreme", 9.50,2500);
 * this is example of method temporaryPrice()
 * 		assertEquals(c1.temporaryPrice(),1595);
 * 		assertEquals(c2.temporaryPrice(),8000);
 * 		assertEquals(c3.temporaryPrice(),23750);
 * 
 * this is example of method discount()
 * 		assertEquals(c1.discount(),0.0);
 * 		assertEquals(c2.discount(),0.1);
 * 		assertEquals(c3.discount(),0.25);
 * 
 * this is example of method totalPrice()
 * 		assertEquals(c1.totalPrice(),1595,0.001);
 * 		assertEquals(c2.totalPrice(),7200,0.001);
 * 		assertEquals(c3.totalPrice(),17812.5,0.001);
 */
//	method determines temporary price 
	public double temporaryPrice() {
		return this.unitPrice*this.totalAmount;
	}
// method determines value discount for client
	public double discount() {
		if(this.temporaryPrice()<5000) {
			return 0.0;
		}
		else if(this.temporaryPrice()>=5000 && this.temporaryPrice()<20000) {
			return 0.1;
		}
		else {
			return 0.25;
		}
	}
//	method determines total price client must pay
	public double totalPrice() {
		return this.temporaryPrice()-this.temporaryPrice()*this.discount();
	}
}

