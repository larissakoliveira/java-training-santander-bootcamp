package verify_account_number.exercise;
import java.util.Scanner;

public class AccountNumberVerifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter your account number:");
            String accountNumber = scanner.nextLine();

            // Call the method that verifies if the account number is valid
            if (verifyAccountNumber(accountNumber)) {
                // If no exception is thrown, print the success message.
                System.out.println("Valid account number.");
            }
        } catch (IllegalArgumentException e) {
            // Inform that the account number is invalid and display the error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    }

    private static boolean verifyAccountNumber(String accountNumber) {
        if (accountNumber.length() != 8) {
            // Throw an IllegalArgumentException with the specified message
            throw new IllegalArgumentException("Invalid account number. Please enter exactly 8 digits.");
        } else {
            return true;
        }
    }
}
