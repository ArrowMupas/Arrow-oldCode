package appDev;

public class Online implements Payment {
	
	private String email;
	private String password;
	
	public Online(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	

	@Override
	public void pay(double amount) {
		System.out.println("Paid using online account: " + amount);
	}
}
