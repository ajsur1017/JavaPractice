import java.util.Scanner;

public class LapTime {
    public static void main(String[] args) {
        lapTime();
        forEach();
        section81();
        section82();
        section83();
        section84();

    }
    public static void forEach() {
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

        for (String e : planets ) {
            System.out.println(e);
        }
    }
    public static void lapTime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of laps: ");
        int numberOfLaps = scanner.nextInt();

        double[] lapTimes = new double[numberOfLaps];

        for (int i = 0; i < numberOfLaps; i++) {
            System.out.println("Lap time: ");
            lapTimes[i] = scanner.nextDouble();
        }

        double fastestTime = lapTimes[0];
        for (int i = 1; i < lapTimes.length ; i++) {
            if (lapTimes[i] < fastestTime) {
                fastestTime = lapTimes[i];
            }
        }

        System.out.println("Fastest time: " + fastestTime);
    }
    public static void section81() {
        int[] intArr = new int[10];
        intArr[0] = 45;
        intArr[1] = 865;
        intArr[2] = 23;
        intArr[3] = 6;
        intArr[4] = 368;
        intArr[5] = 9032;
        intArr[6] = 557;
        intArr[7] = 226;
        intArr[8] = 834564;
        intArr[9] = 34001;

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
    public static void section82() {
        int[] intArr = new int[20];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }
    }
    public static void section83() {
        double[] intArr = new double[5];
        intArr[0] = 12.397;
        intArr[1] = 5346.3;
        intArr[2] = 90;
        intArr[3] = 6.58;
        intArr[4] = 368.11;

        double sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        double mean = sum / intArr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);

    }
    public static void section84() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your top five favourite foods.\n");

        String[] foods = new String[3];
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("No more memory available.\n");

        System.out.println("Your favourite foods are: ");
        for (int i = 0; i < foods.length; i++) {
            System.out.println(" - " + foods[i]);
        }
    }
}
