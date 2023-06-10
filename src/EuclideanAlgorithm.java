import java.util.Scanner;

public class EuclideanAlgorithm {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Find the greatest common divisor of a and b using Euclid's algorithm
        int gcd = euclid(a, b);

        // Print the greatest common divisor
        System.out.println("The greatest common divisor of " + a + " and " + b + " is " + gcd);
    }

    private static int euclid(int a, int b) {
        // Base case
        if (b == 0) {
            return a;
        }

        // Recursive case
        return euclid(b, a % b);
    }
}
