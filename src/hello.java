import java.util.Scanner;

public class hello {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Prompt the user for their ID and PIN
        System.out.println("Welcome to the ATM!");
        System.out.print("Please enter your ID: ");
        String id = scanner.nextLine();
        System.out.print("Please enter your PIN: ");
        String pin = scanner.nextLine();

        // Validate the user's ID and PIN
        if (!isValidID(id) || !isValidPIN(pin)) {
            System.out.println("Invalid ID or PIN.");
            return;
        }

        // Display the ATM menu
        System.out.println("What would you like to do?");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Transfer money");
        System.out.println("5. Quit");

        // Get the user's choice
        int choice = scanner.nextInt();

        // Perform the desired action
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                transferMoney();
                break;
            case 5:
                System.out.println("Thank you for using our ATM!");
                return;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is $" + getBalance());
    }

    private static void withdrawMoney() {
        System.out.print("How much would you like to withdraw? ");
        int amount = scanner.nextInt();
        if (amount > getBalance()) {
            System.out.println("Insufficient funds.");
        } else {
            withdraw(amount);
        }
    }

    private static void depositMoney() {
        System.out.print("How much would you like to deposit? ");
        int amount = scanner.nextInt();
        deposit(amount);
    }

    private static void transferMoney() {
        System.out.print("To which account would you like to transfer money? ");
        String accountNumber = scanner.nextLine();
        System.out.print("How much would you like to transfer? ");
        int amount = scanner.nextInt();
        if (amount > getBalance()) {
            System.out.println("Insufficient funds.");
        } else {
            transfer(accountNumber, amount);
        }
    }

    private static boolean isValidID(String id) {
        // TODO: Implement ID validation logic
        return true;
    }

    private static boolean isValidPIN(String pin) {
        // TODO: Implement PIN validation logic
        return true;
    }

    private static int getBalance() {
        // TODO: Implement balance retrieval logic
        return 1000;
    }

    private static void withdraw(int amount) {
        // TODO: Implement withdrawal logic
        System.out.println("Withdrawal successful.");
    }

    private static void deposit(int amount) {
        // TODO: Implement deposit logic
        System.out.println("Deposit successful.");
    }

    private static void transfer(String accountNumber, int amount) {
        // TODO: Implement transfer logic
        System.out.println("Transfer successful.");
    }
}
