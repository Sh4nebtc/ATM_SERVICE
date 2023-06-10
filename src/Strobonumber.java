import java.util.Scanner;

public class Strobonumber {

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
                default:
                    isStrobogrammatic = false;
                    break;
            }

            if (ch1 == '6' && ch2 == '9' || ch1 == '9' && ch2 == '6') {
                isStrobogrammatic = false;
            }
        }

        if (isStrobogrammatic) {
            System.out.println("The number is strobogrammatic.");
        } else {
            System.out.println("The number is not strobogrammatic.");
        }
    }
}
