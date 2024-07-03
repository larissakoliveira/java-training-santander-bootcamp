package flow_control.exercise;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter:");
        int parameterOne = terminal.nextInt();
        System.out.println("Enter the second parameter:");
        int parameterTwo = terminal.nextInt();
        
        try {
            // Calling the method containing the counting logic
            count(parameterOne, parameterTwo);
        
        } catch (InvalidsParametersException exception) {
            // Print the error message
            System.out.println(exception.getMessage());
        }
    }
    
    static void count(int parameterOne, int parameterTwo) throws InvalidsParametersException {
        // Validate if parameterOne is GREATER than parameterTwo and throw the exception
        if (parameterOne > parameterTwo) {
            throw new InvalidsParametersException("The second parameter must be greater than the first");
        }
        
        // Calculate the range to count
        int counting = parameterTwo - parameterOne;
        
        // Perform the for loop to print the numbers based on the counting variable
        for (int i = 1; i <= counting; i++) {
            System.out.println("Printing number " + i);
        }
    }
}

