import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("=================================");
        System.out.println("      NUMBER GUESSING GAME       ");
        System.out.println("=================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        while (attempts < maxAttempts) {

            System.out.print("Enter your guess: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }

            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                hasWon = true;
                System.out.println("\nCongratulations! You guessed the number correctly.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (!hasWon) {
            System.out.println("\nGame Over!");
            System.out.println("The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
