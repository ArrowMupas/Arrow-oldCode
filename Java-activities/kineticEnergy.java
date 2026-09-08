import java.util.Scanner;

public class KineticEnergy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double KE;

        System.out.print("Enter mass in kilograms: ");
        double m = scan.nextDouble();
        System.out.print("Enter velocity in meters per second: ");
        double v = scan.nextDouble();

        KE = formula(m, v);
        System.out.printf("The object's kinetic energy is: %.2f J", KE);
    }

    public static double formula(double x, double y) {
        double J;
        J = (0.5) * x * (y * y);
        return J;
    }
}