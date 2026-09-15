import java.util.regex.Pattern;
public class regex {
    public static String productName(String name) {
        if (!Pattern.matches("^[a-zA-Z]+$", name)) {
            throw new IllegalArgumentException("Invalid product name");
        }
        return name;
    }

    public static int quantity(String qty) {
        if (!Pattern.matches("^[0-9]+$", qty)) {
            throw new IllegalArgumentException("Invalid quantity");
        }
        return Integer.parseInt(qty);
    }

    public static double sellingPrice(String price) {
        if (!Pattern.matches("^(\\d*\\.)?\\d+$", price)) {
            throw new IllegalArgumentException("Invalid selling price");
        }
        return Double.parseDouble(price);
    }

    public static void main(String[] args) {
        System.out.println(productName("Laptop"));
        System.out.println(quantity("12"));
        System.out.println(sellingPrice("299.99"));
    }
}