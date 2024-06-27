package bank_account.exercise;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the Account Number:");
    int number = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Please enter the Agency Number:");
    String agency = scanner.nextLine();

    System.out.println("Please enter your Name:");
    String name = scanner.nextLine();

    System.out.println("Please enter the initial balance:");
    double balance = scanner.nextDouble();

    String message = "Hello " + name + ", thank you for creating an account with our bank, " +
                          "your agency is " + agency + ", account " + number + " and your balance " +
                          balance + " is available for withdrawal.";

    // another way to format text
    // String mensagem = String.format("Hello %s, thank you for creating an account with our bank, " +
    //                       "your agency is %s, account %d and your balance %.2f is available for withdrawal.",
    //                       name, agency, number, balance);

    System.out.println(message);

    scanner.close();

    }
}
