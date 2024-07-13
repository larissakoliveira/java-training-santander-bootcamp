package withdrawal_control.exercise;

import java.util.Scanner;

public class WithdrawalControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the daily withdrawal limit
        System.out.print("Enter the daily withdrawal limit: ");
        double dailyLimit = scanner.nextDouble();

        // Loop for iterating over withdrawals
        for (int i = 1; ; i++) {
            // Prompt user to enter the withdrawal amount
            System.out.print("Enter the withdrawal amount #" + i + ": ");
            double withdrawalAmount = scanner.nextDouble();

            if (withdrawalAmount == 0) {
                System.out.println("Transactions ended.");
                break; // Exit the loop
            } else if (withdrawalAmount > dailyLimit) {
                System.out.println("Daily withdrawal limit exceeded. Transactions ended.");
                break; // Exit the loop
            } else {
                // Update the daily limit after successful withdrawal
                dailyLimit -= withdrawalAmount;

                // Print message for successful withdrawal
                System.out.println("Withdrawal successful. Remaining daily limit: " + dailyLimit);

                // Check if the daily limit has been fully utilized
                if (dailyLimit <= 0) {
                    System.out.println("Daily withdrawal limit reached. Transactions ended.");
                    break; // Exit the loop
                }
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
