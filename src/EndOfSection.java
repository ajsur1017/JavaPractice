import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EndOfSection {
    public static void main(String[] args) {
        section101();
        section102();
        section103();
        section104();
    }
//    You have been tasked with writing a program for a school which produces some statistics on students’ exam results.
//    The users are teachers who will input each student’s score, and any other necessary data. Store the scores in an array.
//    The program should output:
//    Each student’s score and percentage for the exam
//    The mean (average) score and percentage of the exam
    public static void section101() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum score possible to score for this exam: ");
        int maxScore = scanner.nextInt();

        System.out.print("Enter the number of students taking the exam: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];

        System.out.println("\nEnter each student's score.");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        System.out.println("\n--- Statistics ---");

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            double studentScore = scores[i];
            double studentPrecentage = ((double)scores[i] / maxScore) * 100;
            System.out.println("Student " + (i + 1) + ": " + studentScore + "/" + maxScore + " (" + studentPrecentage + "%)");
            sum += studentScore;
        }

        double mean = (double)sum / scores.length;
        double meanPercentage = (mean / maxScore) * 100;
        System.out.println("Mean: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");
    }
    public static void section102() {
    // Write a quiz program with five true-or-false questions. Display a question to the user, and ask the user to enter either true or false,
    // then move on to the next question. At the end of the quiz display the user’s score.
    // Use three arrays, a String array for holding the questions, a boolean array for the answers, and another boolean array for the user’s answers.public static void section102() {
        String[] questions = new String[] {
                "The moon is further away from the earth than the sun is",
                "Goldfish only have a three second memory",
                "Microwaves have a longer wavelength than ultraviolet",
                "Antibiotics are used to treat viral infections",
                "Octopuses have three hearts"
        };

        boolean[] answers = new boolean[] {
                false,
                false,
                true,
                false,
                true
        };

        boolean[] userAnswers = new boolean[5];

        int finalScore = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("\nQuestion " + (i+1) + ": " + questions[i] + ". True or False?");
            System.out.print("Your answer: ");
            userAnswers[i] = scanner.nextBoolean();

            if (userAnswers[i] == answers[i]) {
                System.out.println("Correct!");
                finalScore++;
            }
            else {
                System.out.println("Wrong. It's " + answers[i] + ".");
            }

        }

        System.out.println("\nYour final score is " + finalScore + " out of 5.");
    }
    public static void section103() {
        System.out.println("\n### Guess My Number Game ###\n");

        System.out.println("--- Rules ---");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;

        while (true) {
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("\nI guess " + randomNumber + ".");
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = randomNumber + 1;
            } else if (input.equals("lower")) {
                max = randomNumber - 1;
            } else if (input.equals("correct")) {
                System.out.println("\n" + randomNumber + ", eh? I knew I'd get it eventually.");
                break;
            }

            // This if statement checks to see if it's still possible to win
            // Example: The program guesses 28, you enter "higher", then the program guesses 29, you enter "lower"
            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
            }
        }
    }
    public static void section104() {


    }

}
