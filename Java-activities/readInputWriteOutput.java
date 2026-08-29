import java.util.Scanner;

public class readInputwriteOutput {

    // Variables to store information about the item
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;

    // Setters
    public void setItemName(String newItemName) {
        this.itemName = newItemName;
    }

    public void setItemPrice(double price) {
        this.itemPrice = price;
    }

    public void setItemQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    // Calculates the total cost of the items
    public void setTotalCost(int quantity, double price) {
        this.amountDue = quantity * price;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getTotalCost() {
        return amountDue;
    }

    // Gets the item information from the user
    public void readInput() {

        Scanner s = new Scanner(System.in);

        // Ask the user for the item name
        System.out.println("Enter the name of the item you are purchasing.");
        String itemName = s.nextLine();
        setItemName(itemName);

        // Ask the user for quantity and price
        System.out.println("Enter the quantity and price separated by a space.");
        setItemQuantity(s.nextInt());
        setItemPrice(s.nextDouble());

        // Calculate the total amount due
        setTotalCost(getItemQuantity(), getItemPrice());
    }

    // Displays the purchase information
    public void writeOutput() {

        System.out.println(
            "You are purchasing " + getItemQuantity() + " "
            + getItemName() + "(s) at $" + getItemPrice() + " each"
        );

        // Display the total cost with exactly two decimal places
        System.out.printf("Amount due is %.2f%n", getTotalCost());
    }

    // Main method
    public static void main(String[] args) {

        // Create an object of the readInputwriteOutput class
        readInputwriteOutput adm = new readInputwriteOutput();

        adm.readInput();
        adm.writeOutput();
    }
}
