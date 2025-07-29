package TestFactory;

public class Recommended extends Laptop{
	private int ram;
	private int ssd;
	private String cpu;
	
	public Recommended(int ram, int ssd, String cpu) {
		super();
		this.ram = ram;
		this.ssd = ssd;
		this.cpu = cpu;
	}

	@Override
	public int getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}


	@Override
	public int getSSD() {
		// TODO Auto-generated method stub
		return this.ssd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}
}
