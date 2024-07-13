package customer_age_verifier.exercise;

import java.util.Scanner;

public class AccountEligibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if the client's age is >= 18
            if (age >= 18) {
                // If >= 18, print "You are eligible to open a bank account."
                System.out.println("You are eligible to open a bank account.");
            } else {
                // Otherwise, print "You are not eligible to open a bank account."
                System.out.println("You are not eligible to open a bank account.");
            }
        } catch (Exception e) {
            // Inform that the input is invalid
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    }
}
