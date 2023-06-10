import javax.swing.*;
import java.util.Scanner;
public class Atm {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Please Enter you UserId");
        String UserId = scanner.nextLine();
        System.out.println("Please Enter yoy UserPin");
        String UserPin = scanner.nextLine();
        System.out.println("You have entered your details successfully");
        System.out.println("Enter the task you want to do");
        System.out.println("1 to  Check balance");
        System.out.println("2 to  Withdraw money");
        System.out.println("3 to  Deposit money");
        System.out.println("4 to  Transfer money");
        System.out.println("5 to  Quit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                checkbalance();
                break;
            case 2:
                withdrawmoney();
                break;
            case 3:
                depositmoney();
                break;
            case 4:
                transfermoney();
                break;
            case 5:
                System.out.println("Thank for using Atm");
                return;
            default:
                System.out.println("Invalid choice Please try again");
                break;
        }
    }

    private static void checkbalance()
    {
        System.out.println("Your Balance is Rs " + getbalance());
    }
    private static void withdrawmoney()
    {
        System.out.println("Enter the amount you want to withdraw");
        int amount= scanner.nextInt();
        if(amount > getbalance())
        {
            System.out.println("Insufficient funds.");
        }
        else {
            withdraw(amount);
        }
    }
    private static void depositmoney() {
        System.out.print("How much would you like to deposit? ");
        int amount = scanner.nextInt();
        deposit(amount);
    }
    private static void transfermoney() {
        System.out.print("To which account would you like to transfer money? ");
        String accountNumber = scanner.nextLine();
        System.out.print("How much would you like to transfer? ");
        int amount = scanner.nextInt();
        if (amount > getbalance()) {
            System.out.println("Insufficient funds.");
        } else {
            transfer(accountNumber, amount);
        }
    }
    private static boolean isValidID(String UserId) {

        return true;
    }

    private static boolean isValidPIN(String UserPin)
    {
        return true;
    }

    private static int getbalance() {

        return 1000;
    }

    private static void withdraw(int amount) {
        System.out.println("Withdrawal successful.");
    }

    private static void deposit(int amount) {
        System.out.println("Deposit successful.");
    }

    private static void transfer(String accountNumber, int amount) {
        System.out.println("Transfer successful.");
    }
}


