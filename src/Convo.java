import java.util.Scanner;

public class Convo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String userName = scanner.next();
//        System.out.println(userName + " is a nice name... My name is BEEP...BOOP...");
//
//        System.out.println("\nHow old are you " + userName + "?");
//        int userAge = scanner.nextInt();
//        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");
//        System.out.println("My name is BEEP...BOOP... and I am 1 year old!");
//
//        System.out.println("\n" + userName + ", how tall are you in inches?");
//        double userHeight = scanner.nextDouble();
//        System.out.println("It is very nice to meet you " + userName + ". You are " + userAge + " years old and you are " + userHeight + " inches tall!" );
//        System.out.println("I am BEEP...BOOP.... I am 1 year old and I am 15 inches tall!");
//
//        double averageMaleHeightDifference = userHeight - 69.10;
//        double averageFemaleHeightDifference = userHeight - 64;
//        System.out.println("\nThe difference between your height and the average is: ");
//        System.out.format("%.1f inches if you are male...\n", averageMaleHeightDifference );
//        System.out.format("%.1f inches if you are female...", averageFemaleHeightDifference);
//        System.out.println("\nI wonder how tall the average program is?");

        System.out.println("What is your name?");
        String name = scanner.nextLine(); // takes multiple statements not just one like .next()
        System.out.println("Your name is " + name);


    }
}
