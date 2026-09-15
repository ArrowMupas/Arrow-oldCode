import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack basket = new Stack();

        System.out.println("Catch and eat any of these fruits:('apple', 'orange', 'mango', 'guava')");
        System.out.print("How many fruits would you like to catch? ");
        int count = sc.nextInt();
        System.out.println("Choose a fruit to catch. Press A, O, M, or G.");

        int num = 1;
        while (num <= count) {
            System.out.print("Fruit " + num + " of " + count + ": ");
            String choice = sc.next().toUpperCase();
            num++;

            switch (choice) {
                case "A":
                    basket.push("apple");
                    break;
                case "O":
                    basket.push("orange");
                    break;
                case "M":
                    basket.push("mango");
                    break;
                case "G":
                    basket.push("guava");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    return;
            }
        }
        System.out.println("Your basket now has: " + basket);
        while (true){
            System.out.print("Press E to eat a fruit. ");
            String eat = sc.next().toUpperCase();
            if (eat.equalsIgnoreCase("E")) {
                basket.pop();
                if (basket.isEmpty()) {
                    System.out.println("No more fruits.");
                    break;
                }
                System.out.println("Fruit(s) in the basket: " + basket);
            }
           
        }
    }
}