import java.util.Scanner;

public class Guess
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = getRandomNumber(1, 100);
        int attempts = 10;
        while (attempts > 0)
        {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Game over! The number was " + randomNumber);
        }

        System.out.println("Would you like to play again? (Y/N)");
        String answer = scanner.next();

        if (answer.equals("Y")) {
            main(args);
        }
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
