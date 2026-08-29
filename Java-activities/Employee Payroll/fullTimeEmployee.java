import java.util.Scanner;

public class FullTimeEmployee extends Employee {
	private double monthlySalary;
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void readInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Monthly Salary:");
		double a = scan.nextDouble();
		setMonthlySalary(a);
	}
	
	public void writeOutput() {
		System.out.printf("Monthly Salary: %.2f", getMonthlySalary());
	}
}