import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        nums();
        foobar();

    }
    public static void nums() {
        int[] nums = {22, 25, 16, 27, 4124, 109, 995, 74, 54, 798, 32, 23, 21, 119, 2319};

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        for (int i = nums.length - 1; i >= 0 ; i--) {
//            System.out.println(nums[i]);
//        }
        int count = 0;
        int sumOfNums = 0;

        for (int i = 0; i < nums.length ; i++) {
            // Count all numbers over 100
            if (nums[i] > 100) {
                count++;
            }
            // Add up all the numbers
            sumOfNums = sumOfNums = nums[i];

        }
        System.out.println("Number of values greater than 100: " + count);
        int mean = sumOfNums / nums.length;
        System.out.println("Mean: " + mean);
    }
    public static void foobar() {
        Scanner scanner = new Scanner(System.in);
        String[] predictions = new String[3];
        predictions[0] = "a pioneer";
        predictions[1] = "loved by many";
        predictions[2] = "very wealthy";

        System.out.println("I will predict your future. Choose 1, 2, or 3: ");
        int choice = scanner.nextInt();
        System.out.println("In your future you will be " + predictions[choice - 1]);
    }
    public static void waakaa() {
        Scanner scanner = new Scanner(System.in);

    }
}
