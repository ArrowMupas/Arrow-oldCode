import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Birthmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter birth month " + i + ": ");
            group1.add(scanner.nextLine());
        }

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter birth month " + i + ": ");
            group2.add(scanner.nextLine());
        }

        // Display the groups
        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);

        // Prompt for user's own birth month
        System.out.print("Enter your birth month: ");
        self.add(scanner.nextLine());

        Set<String> union = new HashSet<>(group1);
        Set<String> inter = new HashSet<>(group1);
        Set<String> diff = new HashSet<>(group1);

        union.addAll(group2);
        inter.retainAll(group2);
        diff.removeAll(group2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
        System.out.println("Difference: " + diff);

        if (group1.containsAll(self) || group2.containsAll(self)) {
            System.out.println("You have the same birth month with one of your classmates.");
        } else {
            System.out.println("You do not have the same birth month with one of your classmates.");
        }

        scanner.close();
    }
}