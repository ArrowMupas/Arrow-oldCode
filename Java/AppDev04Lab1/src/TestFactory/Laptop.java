package TestFactory;

public abstract class Laptop {

	public abstract int getRAM();
	public abstract int getSSD();
	public abstract String getCPU();

	public String toString() {
		return "RAM="+this.getRAM()+"GB, SSD="+this.getSSD()+", CPU="+this.getCPU();
	}	
}
