package appDev;

public class Cart {
	
	private double amount;

	public Cart(double amount) {
		super();
		this.amount = amount;
	}
	
	public void pay(Payment mode) {
		mode.pay(amount);
	}

}
