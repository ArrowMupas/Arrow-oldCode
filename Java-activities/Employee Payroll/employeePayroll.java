import java.util.Scanner;

public class EmployeePayroll {
	public static void main(String[] args) {
		PartTimeEmployee pte = new PartTimeEmployee();
		Employee e = new Employee();
		FullTimeEmployee fte = new FullTimeEmployee();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String fname = s.nextLine();
		e.setName(fname);
        
		System.out.println("Press F for Full time or P for Part time");
		String choice = s.nextLine();
		if (choice.equalsIgnoreCase("P")) {
			pte.readInput();
			System.out.println("Name: " + e.getName());
			pte.writeOutput();
		} else if (choice.equalsIgnoreCase("F")) {
			fte.readInput();
			System.out.println("Name: " + e.getName());
			fte.writeOutput();
		} else {
			System.out.println("Invalid Letter!");
		}
	}
}