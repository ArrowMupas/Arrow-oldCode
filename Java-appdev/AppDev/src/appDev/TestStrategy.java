package appDev;

public class TestStrategy {

	public static void main(String[] args) {


		Cart cart = new Cart(1512.75);
		cart.pay(new Online("mark.reyes@gmail.com","Wasd8456!"));
		
		cart = new Cart(375.25);
		cart.pay(new Mobile("09472528158",4321));

	}
}
