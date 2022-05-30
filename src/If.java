import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What should we assign to X?");
        int x = scanner.nextInt();
        System.out.println("What should we assign to Y?");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("X is greater than Y by " + (x - y));
        } else if (y > x) {
            System.out.println("Y is greater than X by " + (y - x));
        } else {
            System.out.println("X and Y have the same value");
        }

    }
}
