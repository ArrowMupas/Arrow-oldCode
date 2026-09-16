import java.util.Stack;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a Palindrome: ");
        String word = sc.nextLine();
        StringBuilder check = new StringBuilder();
        Stack stack = new Stack();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            check.append(stack.pop());
        }

        System.out.println(word + " backward is " + check);

        if (word.equals(check.toString())) {
            System.out.print(word + " is a palindrome!");
        } else {
            System.out.print(word + " is not a palindrome!");
        }
    }
}