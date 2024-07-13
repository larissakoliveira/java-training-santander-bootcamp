package overdraft_checker.exercise;

import java.util.Scanner;

public class OverdraftCheck {

    // Define the overdraft limit as a constant
    private static final double OVERDRAFT_LIMIT = 500;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter current account balance
        System.out.print("Enter the current account balance: ");
        double balance = scanner.nextDouble();
        
        // Calculate the maximum amount that can be withdrawn
        double maxWithdrawal = balance + OVERDRAFT_LIMIT;

        // Display account information
        System.out.println("Account Information:");
        System.out.println("Balance: $" + String.format("%.0f", balance));
        System.out.println("Overdraft Limit: $" + String.format("%.0f", OVERDRAFT_LIMIT));
        System.out.println("Max Withdrawal Amount: $" + String.format("%.0f", maxWithdrawal));

        // Prompt user to enter the withdrawal amount
        System.out.print("Enter the withdrawal amount: ");
        double withdrawal = scanner.nextDouble();

        // Check if the withdrawal exceeds the available balance and overdraft limit
        if (withdrawal <= balance) {
            // If the withdrawal does not exceed the balance, print success message
            System.out.println("Transaction completed successfully.");
            System.out.println("Updated Balance: $" + String.format("%.0f", (balance - withdrawal)));
        } else if (withdrawal <= maxWithdrawal) {
            // If the withdrawal does not exceed the total available (balance + overdraft limit), use overdraft
            System.out.println("Transaction completed successfully using overdraft.");
            System.out.println("Updated Balance: $" + String.format("%.0f", (balance - withdrawal)));
        } else {
            // If it exceeds both the balance and overdraft limit, print failure message
            System.out.println("Transaction not completed. Exceeded balance and overdraft limit.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
