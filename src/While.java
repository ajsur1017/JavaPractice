import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        forWhile();
        doWhile();
        section71();
        section72();
        section73();
        section74();
        section75();
        section76();

    }
    public static void forWhile () {
        for (int i = 1; i < 11; i++) {
            System.out.println("test number: " + i);
        }
        System.out.println();

        int i = 0;

        while (i < 10) {
            System.out.println("Test");
            i++;
        }
    }
    public static void doWhile () {
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("You rolled a " + num + ".");
            System.out.print("Roll again? y/n: ");
            again = scanner.next();
        } while (again.equals("y"));
    }
    public static void section71 () {
        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }
    }
    public static void section72 () {
        int count = 1;

        for (int i = 1; i <= 40; i++) {

            System.out.println(i);

            if (count == 3) {
                System.out.println("Quack.");
                count = 0;
            }

            count++;

        }

    }
    public static void section73 () {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter Password: ");
            input = scanner.next();
        } while (!input.equals("shark50"));

        System.out.println("ACCESS APPROVED");

    }
    public static void section74 () {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\b\b.");

    }
    public static void section75 () {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER.");
            }
            else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
            }

        } while (guess != randomNumber);

    }
    public static void section76 () {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int guessCount = 0;

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER.");
            }
            else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
                System.out.println("You got it in " + guessCount + " guesses!");
            }

        } while (guess != randomNumber);
    }
}
