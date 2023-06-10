import java.util.Scanner;

public class StrobogrammaticNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scanner.next();

        boolean isStrobogrammatic = true;
        for (int i = 0; i < number.length() / 2; i++) {
            char ch1 = number.charAt(i);
            char ch2 = number.charAt(number.length() - 1 - i);

            switch (ch1) {
                case '0':
                case '1':
                case '8':
                    break;
                case '6':
                    if (ch2 != '9') {
                        isStrobogrammatic = false;
                        break;
                    }
                    break;
                case '9':
                    if (ch2 != '6') {
                        isStrobogrammatic = false;
                        break;
                    }
                    break;
                default:
                    isStrobogrammatic = false;
                    break;
            }
        }

        if (isStrobogrammatic) {
            System.out.println("The number is strobogrammatic.");
        } else {
            System.out.println("The number is not strobogrammatic.");
        }
    }
}
