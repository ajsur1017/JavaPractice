import java.util.Arrays;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What should we assign to integer X?");
        System.out.print("int x = ");
        int x = scanner.nextInt();
//        System.out.println("What should we assign to integer Y?");
//        System.out.print("int y = ");
//        int y = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("you entered one.");
                break;
            case 2:
                System.out.println("you entered two");
                break;
            default:
                System.out.println("you can only enter one or two");
        }

    }
}
