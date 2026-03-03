package PACKAGE_NAME;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class pallindrome {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("==============================================");
            System.out.println("   UC7: Deque-Based Palindrome Checker      ");
            System.out.println("==============================================");

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("Result: \"" + input + "\" is a palindrome.");
            } else {
                System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
            }

            scanner.close();
        }

        public static boolean isPalindrome(String input) {
            // Step 1: Clean the input (lowercase and alphanumeric only)
            String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Step 2: Initialize the Deque
            Deque<Character> deque = new ArrayDeque<>();

            // Step 3: Insert all characters into the deque
            for (char ch : cleanInput.toCharArray()) {
                deque.addLast(ch);
            }

            // Step 4: Compare front and rear elements
            // We continue as long as there is more than 1 character to compare
            while (deque.size() > 1) {
                char first = deque.removeFirst();
                char last = deque.removeLast();

                if (first != last) {
                    return false; // Not a palindrome
                }
            }

            return true; // If we finish, it's a palindrome
        }
    }
