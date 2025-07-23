package TestFactory;

public class TestFactory {

	public static void main(String[] args) {
		
		Laptop min = LaptopFactory.getSpecs("min", 8, 256, "i5-12450Hz");
		Laptop reco = LaptopFactory.getSpecs("min", 16, 512, "i7-12700Hz");

		System.out.println("Minimum Specs: \n" + min);
		System.out.println("Recommended Specs: \n" + reco);
	}
}
