import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        System.out.println("I'm Thinking of a number between 1 and 5. Try to guess it.");
        System.out.print("Your Guess: ");
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("Correct! Your Lucky!");
        } else {
            System.out.println("Wrong! Have another go.");
            System.out.print("Your Guess: ");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct! About time.");
            } else {
                System.out.println("Wrong again! Maybe next time. The random number was: " + randomNumber + ".");
            }
        }
    }
}
