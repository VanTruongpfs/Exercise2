package exercise22;

public class Performances {
	private double priceOfTicket;
	private double costsIncurred;
	private double serviceCharge;
/**
 * this is a constructor of Performances
 * @param priceOfTicket
 * @param costsIncurred
 * @param serviceCharge
 * example:
 * 	new Performances(5, 20, 0.5);
 * 	new Performances(5, 20, 0.5);
 * 	new Performances(5, 20, 0.5);
 */
	public Performances(double priceOfTicket,  double costsIncurred, double serviceCharge) {
		this.priceOfTicket = priceOfTicket;
		this.costsIncurred = costsIncurred;
		this.serviceCharge = serviceCharge;
	}
/**
 * this is a method
 * @return
 * example:
 *  Performances mt1 = new Performances(5, 20, 0.5);
 *  Performances mt2 = new Performances(5, 20, 0.5);
 * 	Performances mt3 = new Performances(5, 20, 0.5);
 * this is a method totalProfit
 * 		assertEquals(mt1.totalProfit(40),160);
 * 		assertEquals(mt2.totalProfit(50),205);
 * 		assertEquals(mt3.totalProfit(60),250);
 */
	public double totalProfit(int numberOfAttendes) {
		return (this.priceOfTicket*numberOfAttendes)-(numberOfAttendes*this.serviceCharge)-this.costsIncurred;
	}

}
