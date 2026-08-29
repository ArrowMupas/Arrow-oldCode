import java.util.Scanner;

public class PartTimeEmployee extends Employee {
	private double ratePerHour;
	private int hoursWorked;
	private double wage;
	
	public void setWage(double ratePerHour, int hoursWorked) {
		this.wage = ratePerHour * hoursWorked;
	}
	
	public double getWage() {
		return wage;
	}
	
	public void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rate per hour and no. of hours worked separated by a space.");
		System.out.println("Sample: 107.50 13");
		double a = sc.nextDouble();
		int b = sc.nextInt();
		setWage(a, b);
	}
	
	public void writeOutput() {
		System.out.printf("Wage: %.2f", getWage());
	}
}