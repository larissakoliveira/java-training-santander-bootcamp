# Bank Account Terminal Application

Welcome to the **Bank Account Terminal Application** project! This project demonstrates a simple console-based application that captures and displays bank account information. Users input their account details through the terminal, and the program then provides a summary of their account.

## Project Overview

The `BankAccount` project is designed to simulate a basic interaction with a bank’s system via a terminal interface. Users can input their account details, such as account number, agency code, client name, and balance. The system will then output a formatted message summarizing their account information.

### Project Structure

The project consists of a single class, `AccountTerminal.java`, responsible for handling user input and displaying the account information.

## Attributes and Data Types

The application captures the following details about a bank account:

| Attribute      | Type    | Example   |
|--------------- |---------|-----------|
| Account Number | Integer | 1021      |
| Agency Code    | Text    | 067-8     |
| Client Name    | Text    | JOHN DOE  |
| Balance        | Decimal | 237.48    |

## How It Works

1. **Input Handling**:
   - The application uses the `Scanner` class to read user input from the terminal.
   - It prompts the user to enter their account number, agency code, client name, and balance.

2. **Data Storage**:
   - The input data is stored in appropriate variables corresponding to their data types.

3. **Output Message**:
   - After all the data is entered, the application concatenates these details into a summary message.
   - The output message is formatted to greet the user and display their account information.

## Example Interaction

Here’s an example of how the interaction works:

Program: "Please enter your account number!"
User: 1021

Program: "Please enter your agency code!"
User: 067-8

Program: "Please enter your name!"
User: JOHN DOE

Program: "Please enter your balance!"
User: 237.48

Output: "Hello JOHN DOE, thank you for creating an account at our bank. Your agency is 067-8, account 1021, and your balance 237.48 is now available for withdrawal."


## Getting Started

### Prerequisites

- Ensure you have the Java Development Kit (JDK) installed.
- Basic knowledge of Java and terminal operations is helpful.

### Running the Application

1. **Compile `AccountTerminal.java`**:
    ```bash
    javac AccountTerminal.java
    ```
2. **Run the compiled class**:
    ```bash
    java AccountTerminal
    ```

## Detailed Steps

1. **Clone or Download the Repository**:
   - Clone the repository or download the source files to your local machine.

2. **Open a Terminal**:
   - Navigate to the directory containing `AccountTerminal.java`.

3. **Compile the Java File**:
   - Use the `javac` command to compile the source file:
     ```bash
     javac AccountTerminal.java
     ```

4. **Execute the Program**:
   - Run the compiled class with the `java` command:
     ```bash
     java AccountTerminal
     ```

5. **Follow the Prompts**:
   - Enter the required information as prompted by the program.

6. **View the Summary**:
   - After entering all information, the program will display the summary message.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Thank you for using the Bank Account Terminal Application! Feel free to contribute or report issues in the repository.
