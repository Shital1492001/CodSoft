import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 10;
        int roundNumber = 1;
        int totalAttempts = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You need to guess a random number between 1 and 100.");

        while (true) {
            System.out.println("\nRound " + roundNumber);
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            while (attempts < attemptsLimit) {
                System.out.print("Enter your guess: ");
                int userGuess;
                try {
                    userGuess = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    continue;
                }
                
                attempts++;
                totalAttempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number (" + targetNumber + ") in " + attempts + " attempts.");
                    roundsWon++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts == attemptsLimit) {
                System.out.println("\nOut of attempts. The number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = input.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            roundNumber++;
        }

        System.out.println("\nGame Over!");
        System.out.println("Total rounds played: " + roundNumber);
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Rounds won: " + roundsWon);

        input.close();
    }
}
