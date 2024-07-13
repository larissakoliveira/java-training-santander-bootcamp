package bank_details.exercise;
import java.util.Scanner;

public class BankSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean continueLoop = true;

        while (continueLoop) {
            // Display the menu options to the user
            System.out.println("\nChoose an option:");
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Check Balance");
            System.out.println("0: Exit");

            // Read the user's choice
            int option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        // Handle deposit
                        System.out.print("Enter the amount to deposit: ");
                        String depositInput = scanner.next();
                        double deposit = parseAmount(depositInput);
                        balance += deposit;
                        System.out.printf("Current balance: %.1f%n", balance);
                        break;
                    case 2:
                        // Handle withdrawal
                        System.out.print("Enter the amount to withdraw: ");
                        String withdrawalInput = scanner.next();
                        double withdrawal = parseAmount(withdrawalInput);
                        if (withdrawal <= balance) {
                            balance -= withdrawal;
                            System.out.printf("Current balance: %.1f%n", balance);
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;
                    case 3:
                        // Handle balance inquiry
                        System.out.printf("Current balance: %.1f%n", balance);
                        break;
                    case 0:
                        // Handle program termination
                        System.out.println("Finishing this session.");
                        continueLoop = false;  // Exit the loop
                        break;
                    default:
                        // Handle invalid option
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InvalidAmountException error) {
                System.out.println(error.getMessage());
            }
        }
        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to parse amount and validate format
    private static double parseAmount(String input) throws InvalidAmountException {
        if (input.contains(",")) {
            throw new InvalidAmountException("Invalid input. Please use a period as the decimal separator.");
        }
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new InvalidAmountException("Invalid input. Please enter a valid number.");
        }
    }
}
